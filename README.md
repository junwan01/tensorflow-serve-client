

# Introduction

Google TensorFlow is a popular Machine Learning toolkit, which includes [TF Serving](https://github.com/tensorflow/serving) which can serve the saved ML models via a Docker image that exposes [RESTful](https://github.com/tensorflow/serving/blob/master/tensorflow_serving/g3doc/api_rest.md) and [gRPC API](https://github.com/tensorflow/serving/tree/master/tensorflow_serving/apis).

Here is a [introduction of gRPC](https://grpc.io/docs/guides/index.html). The TF Serving's gRPC APIs are defined inside protobuf files (for example [model serving](https://github.com/tensorflow/serving/blob/master/tensorflow_serving/apis/model_service.proto), among others), and provide slightly more functionalities than the RESTful API. With these .proto files, you can generate the necessary client source code for various languages, and integrate the model serving function into your own application. 

For people who just want a Java client library to use, you can simply download the jar file under lib/ and use it.
 
If you want to build it yourself, to use more recent .proto releases or for other reasons, then read on ...

# Build your own Java client

## Step 1. Get TensorFlow protobuf files

### Check out the tensorflow projects somewhere

```
$ export SRC=~/Documents/source_code/
$ mkdir -p $SRC

$ cd $SRC
$ git clone git@github.com:tensorflow/serving.git
$ cd serving
$ git checkout tags/1.13.0

# another repo
$ cd $SRC
$ git clone git@github.com:tensorflow/tensorflow.git
$ cd tensorflow
$ git checkout tags/v1.13.1
```

### Gather all the .proto files and organize them into a new Java project.

The libraries we checked out contain many files, but we only need some .proto files in order to compile our gRPC Java client. Let's make a project to host the source .proto files and future .java files.

Our end goal is to get all the .proto files required directly or indirectly by tensorflow_serving/apis/*_service.proto files. However, I am not aware of any tools that can start with a few .proto files and trace through the import statements and list all other .proto files required. So figuring out what files are needed is done by trying to compile the resulting Java classes till no 'no class def found' complaints. Alternatively one could simply include all .proto files from tensorflow_serving/ and tensorflow/, but it will result in much bigger Java package.

For the above mentioned tensorflow and tensorflow_serving releases, the .proto files from the following dirs are enough (still include some unnecessary ones):

```
$SRC/serving/tensorflow_serving/ 
$SRC/tensorflow/tensorflow/core/lib/core/
$SRC/tensorflow/tensorflow/core/framework/
$SRC/tensorflow/tensorflow/core/protobuf/
$SRC/tensorflow/tensorflow/core/example/
```

Let's try to pick out only .proto files, while still keep the directory structure, which is assumed by the import statements in these .proto files. Let's put .proto files into the new project's directories respectively, under `src/main/proto/`:
```
export PROJECT_ROOT=$SRC/tensorflow-serve-client
$PROJECT_ROOT/src/main/proto/tensorflow_serving/
$PROJECT_ROOT/src/main/proto/tensorflow/core/lib/core/
$PROJECT_ROOT/src/main/proto/tensorflow/core/framework/
$PROJECT_ROOT/src/main/proto/tensorflow/core/protobuf/
$PROJECT_ROOT/src/main/proto/tensorflow/core/example/
```
Note I peeled off one directory layer from the source. It is necessary to make the import statements work in those .proto files.

Here I use the rsync commands to copy files with particular extension and keep the directory structure.
```
$ mkdir -p $PROJECT_ROOT/src/main/proto/
$ rsync -arv  --prune-empty-dirs --include="*/" --include='*.proto' --exclude='*' $SRC/serving/tensorflow_serving  $PROJECT_ROOT/src/main/proto/
$ rsync -arv  --prune-empty-dirs --include="*/" --include="tensorflow/core/lib/core/*.proto" --include='tensorflow/core/framework/*.proto' --include="tensorflow/core/example/*.proto" --include="tensorflow/core/protobuf/*.proto" --exclude='*' $SRC/tensorflow/tensorflow  $PROJECT_ROOT/src/main/proto/
```

**Note**:
The .proto files in these directories can change between releases, new files can be added, and file content can also change. So it is possible that the above 4 directories will contain .proto files that require other .proto files from directories outside, and we have to expand the .proto files to include.

## Step 2. Generate the Java files

Now we have a project with only .proto files under `src/main/proto/`. Let's compile them into Java source files.

### Option 1 - build with maven

Build can be automated by using maven, the key dependencies declared in pom file are:
```
    <properties>
        <grpc.version>1.20.0</grpc.version>
    </properties>
    
    <dependencies>
        <!-- gRPC protobuf client -->
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-stub</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-netty-shaded</artifactId>
            <version>${grpc.version}</version>
        </dependency>
    </dependencies>
```

Additionally, use the `protobuf-maven-plugin` which will compile .proto files to .java files. It will also generate extra `*Grpc.java` service stub files for each *_service.proto files:

```
    <build>
        <extensions>
            <extension>
                <groupId>kr.motd.maven</groupId>
                <artifactId>os-maven-plugin</artifactId>
                <version>1.6.2</version>
            </extension>
        </extensions>
        <plugins>
            <plugin>
                <groupId>org.xolstice.maven.plugins</groupId>
                <artifactId>protobuf-maven-plugin</artifactId>
                <version>0.6.1</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>compile-custom</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <checkStaleness>true</checkStaleness>
                    <protocArtifact>com.google.protobuf:protoc:3.6.1:exe:${os.detected.classifier}</protocArtifact>
                    <pluginId>grpc-java</pluginId>
                    <pluginArtifact>io.grpc:protoc-gen-grpc-java:${grpc.version}:exe:${os.detected.classifier}</pluginArtifact>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

Here is the [documentation of this plugin](https://www.xolstice.org/protobuf-maven-plugin/), including the list of goals available. You can see it can compile the .proto files to Java, C++, C#, Javascript, or Python.

A few notes:
* The `compile-custom` goal in the above pom will generate the `*Grpc.java` files, which are essential for the Java client, so keep it in your goal list.
* The plugin includes pre-compiled `protoc` executable for Linux, and is compiled using glibc, so it may not run correctly in Linux systems without glibc, e.g. alpine linux. So don't use a build server based on alpine Linux. See [more details](https://github.com/xolstice/protobuf-maven-plugin/issues/23#issuecomment-266098369).
* The `os-maven-plugin` extension is used to provide `${os.detected.classifier}`, in order to pull the correct executable for the build server/OS. [Eclipse IDE may require some special handling](https://github.com/trustin/os-maven-plugin#issues-with-eclipse-m2e-or-other-ides).

### Option 2 - Compile manually

It takes extra steps to build manually. You may want to do this to keep the resulting .java files static, as part of your source code, instead of generating dynamically each time, in order to reduce the build complexity.

#### 1. Build the grpc-java plugin

Checkout the [grpc-java repo](https://github.com/grpc/grpc-java), and build the plugin (`protoc-gen-grpc-java`), which will be used later in `protoc` calls to generate Java implementation of gRPC client.

```
$ cd $SRC
$ git clone https://github.com/grpc/grpc-java.git
Cloning into 'grpc-java'...
remote: Enumerating objects: 166, done.
remote: Counting objects: 100% (166/166), done.
remote: Compressing objects: 100% (121/121), done.
remote: Total 84096 (delta 66), reused 92 (delta 25), pack-reused 83930
Receiving objects: 100% (84096/84096), 31.18 MiB | 23.14 MiB/s, done.
Resolving deltas: 100% (38843/38843), done.

$ cd grpc-java/compiler/
$ ../gradlew java_pluginExecutable
$ ls -l build/exe/java_plugin/protoc-gen-grpc-java
-rwxr-xr-x  1 jwan  staff  277424 Feb 27 09:01 build/exe/java_plugin/protoc-gen-grpc-java
```

#### 2. Install protobuf utilities to compile .proto files

For Mac, it is like this:
```
$ brew install protobuf
```
This will install the `protoc` executable for Mac OS.
 
#### 3. Generate Java Source files

We will start with the same source .proto files we copied into our new project. However, I hand picked the .proto files to compile, representing the minimum list of .proto files needed to make generated Java compile. The output Java files are put in src/main/java/, instead of target/ directory as did the plugin. You may commit the generated Java files as part of your source code.

```
$ cd $PROJECT_ROOT/src/main/proto/
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/example/*.proto

$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/model_management.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/predict.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/model.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/regression.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/classification.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/inference.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/get_model_metadata.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/input.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/get_model_status.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/config/model_server_config.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/config/logging_config.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/config/log_collector_config.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/util/status.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/sources/storage_path/file_system_storage_path_source.proto

$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/named_tensor.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/saver.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/meta_graph.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/config.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/debug.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/rewriter_config.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/cluster.proto

$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/lib/core/error_codes.proto

$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/allocation_description.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/tensor_description.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/cost_graph.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/graph.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/op_def.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/node_def.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/function.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/versions.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/tensor.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/tensor_shape.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/types.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/resource_handle.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/attr_value.proto
$ protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/step_stats.proto

# the following 3 cmds will generate extra *Grpc.java stub source files in addition to the regular protobuf Java source files.
# The output grpc-java files are put in the same directory as the regular java source files.
# note the --plugin option uses the grpc-java plugin file we created in step 1.
$ protoc --grpc-java_out $PROJECT_ROOT/src/main/java --java_out $PROJECT_ROOT/src/main/java --proto_path ./ tensorflow_serving/apis/prediction_service.proto --plugin=protoc-gen-grpc-java=$SRC/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java
$ protoc --grpc-java_out $PROJECT_ROOT/src/main/java --java_out $PROJECT_ROOT/src/main/java --proto_path ./ tensorflow_serving/apis/model_service.proto --plugin=protoc-gen-grpc-java=$SRC/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java
$ protoc --grpc-java_out $PROJECT_ROOT/src/main/java --java_out $PROJECT_ROOT/src/main/java --proto_path ./ tensorflow_serving/apis/session_service.proto --plugin=protoc-gen-grpc-java=$SRC/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java
```

Compiling it manually reduces the Java build complexity as you can treat the result .java files as source code, and start there, therefore completely ignore any .proto business going forward. However everytime you need to do any updates for any reason, you will need to repeat above steps. 

# Sample Java client code to make gRPC calls

```java
    String host = "localhost";
    int port = 8501;
    // the model's name. 
    String modelName = "cool_model";
    // model's version
    long modelVersion = 123456789;
    // assume this model takes input of free text, and make some sentiment prediction.
    String modelInput = "some text input to make prediction with";
    
    // create a channel
    ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
    PredictionServiceGrpc.PredictionServiceBlockingStub stub = PredictionServiceGrpc.newBlockingStub(channel);
    
    // create a modelspec
    Model.ModelSpec.Builder modelSpecBuilder = Model.ModelSpec.newBuilder();
    modelSpecBuilder.setName(modelName);
    modelSpecBuilder.setVersion(Int64Value.of(modelVersion));
    modelSpecBuilder.setSignatureName("serving_default");

    Predict.PredictRequest.Builder builder = Predict.PredictRequest.newBuilder();
    builder.setModelSpec(modelSpecBuilder);
    
    // create the TensorProto and request
    TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
    tensorProtoBuilder.setDtype(DataType.DT_STRING);
    TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
    tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(1));
    tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());
    tensorProtoBuilder.addStringVal(ByteString.copyFromUtf8(modelInput));
    TensorProto tp = tensorProtoBuilder.build();

    builder.putInputs("inputs", tp);
    
    Predict.PredictRequest request = builder.build();
    Predict.PredictResponse response = stub.predict(request);
```

Additional engineering considerations:

* Creating a channel is an expensive operation, should be cached.
* protobuf classes are dumb data holders, used for serialization and communication. You should build separate application specific object models that wraps around these protobuf classes, to provide additional behavior. Don't extend the protobuf classes for this purpose. See [Protobuf Java Tutorial](https://developers.google.com/protocol-buffers/docs/javatutorial).
