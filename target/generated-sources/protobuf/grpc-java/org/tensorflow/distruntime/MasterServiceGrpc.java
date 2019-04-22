package org.tensorflow.distruntime;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: tensorflow/core/protobuf/master_service.proto")
public final class MasterServiceGrpc {

  private MasterServiceGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.grpc.MasterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CreateSessionRequest,
      org.tensorflow.distruntime.CreateSessionResponse> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = org.tensorflow.distruntime.CreateSessionRequest.class,
      responseType = org.tensorflow.distruntime.CreateSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CreateSessionRequest,
      org.tensorflow.distruntime.CreateSessionResponse> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CreateSessionRequest, org.tensorflow.distruntime.CreateSessionResponse> getCreateSessionMethod;
    if ((getCreateSessionMethod = MasterServiceGrpc.getCreateSessionMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getCreateSessionMethod = MasterServiceGrpc.getCreateSessionMethod) == null) {
          MasterServiceGrpc.getCreateSessionMethod = getCreateSessionMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CreateSessionRequest, org.tensorflow.distruntime.CreateSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CreateSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CreateSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("CreateSession"))
                  .build();
          }
        }
     }
     return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.ExtendSessionRequest,
      org.tensorflow.distruntime.ExtendSessionResponse> getExtendSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExtendSession",
      requestType = org.tensorflow.distruntime.ExtendSessionRequest.class,
      responseType = org.tensorflow.distruntime.ExtendSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.ExtendSessionRequest,
      org.tensorflow.distruntime.ExtendSessionResponse> getExtendSessionMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.ExtendSessionRequest, org.tensorflow.distruntime.ExtendSessionResponse> getExtendSessionMethod;
    if ((getExtendSessionMethod = MasterServiceGrpc.getExtendSessionMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getExtendSessionMethod = MasterServiceGrpc.getExtendSessionMethod) == null) {
          MasterServiceGrpc.getExtendSessionMethod = getExtendSessionMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.ExtendSessionRequest, org.tensorflow.distruntime.ExtendSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "ExtendSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ExtendSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ExtendSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("ExtendSession"))
                  .build();
          }
        }
     }
     return getExtendSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.PartialRunSetupRequest,
      org.tensorflow.distruntime.PartialRunSetupResponse> getPartialRunSetupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PartialRunSetup",
      requestType = org.tensorflow.distruntime.PartialRunSetupRequest.class,
      responseType = org.tensorflow.distruntime.PartialRunSetupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.PartialRunSetupRequest,
      org.tensorflow.distruntime.PartialRunSetupResponse> getPartialRunSetupMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.PartialRunSetupRequest, org.tensorflow.distruntime.PartialRunSetupResponse> getPartialRunSetupMethod;
    if ((getPartialRunSetupMethod = MasterServiceGrpc.getPartialRunSetupMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getPartialRunSetupMethod = MasterServiceGrpc.getPartialRunSetupMethod) == null) {
          MasterServiceGrpc.getPartialRunSetupMethod = getPartialRunSetupMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.PartialRunSetupRequest, org.tensorflow.distruntime.PartialRunSetupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "PartialRunSetup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.PartialRunSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.PartialRunSetupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("PartialRunSetup"))
                  .build();
          }
        }
     }
     return getPartialRunSetupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunStepRequest,
      org.tensorflow.distruntime.RunStepResponse> getRunStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunStep",
      requestType = org.tensorflow.distruntime.RunStepRequest.class,
      responseType = org.tensorflow.distruntime.RunStepResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunStepRequest,
      org.tensorflow.distruntime.RunStepResponse> getRunStepMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunStepRequest, org.tensorflow.distruntime.RunStepResponse> getRunStepMethod;
    if ((getRunStepMethod = MasterServiceGrpc.getRunStepMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getRunStepMethod = MasterServiceGrpc.getRunStepMethod) == null) {
          MasterServiceGrpc.getRunStepMethod = getRunStepMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.RunStepRequest, org.tensorflow.distruntime.RunStepResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "RunStep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RunStepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RunStepResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("RunStep"))
                  .build();
          }
        }
     }
     return getRunStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CloseSessionRequest,
      org.tensorflow.distruntime.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = org.tensorflow.distruntime.CloseSessionRequest.class,
      responseType = org.tensorflow.distruntime.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CloseSessionRequest,
      org.tensorflow.distruntime.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CloseSessionRequest, org.tensorflow.distruntime.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = MasterServiceGrpc.getCloseSessionMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getCloseSessionMethod = MasterServiceGrpc.getCloseSessionMethod) == null) {
          MasterServiceGrpc.getCloseSessionMethod = getCloseSessionMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CloseSessionRequest, org.tensorflow.distruntime.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CloseSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("CloseSession"))
                  .build();
          }
        }
     }
     return getCloseSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.ListDevicesRequest,
      org.tensorflow.distruntime.ListDevicesResponse> getListDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevices",
      requestType = org.tensorflow.distruntime.ListDevicesRequest.class,
      responseType = org.tensorflow.distruntime.ListDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.ListDevicesRequest,
      org.tensorflow.distruntime.ListDevicesResponse> getListDevicesMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.ListDevicesRequest, org.tensorflow.distruntime.ListDevicesResponse> getListDevicesMethod;
    if ((getListDevicesMethod = MasterServiceGrpc.getListDevicesMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getListDevicesMethod = MasterServiceGrpc.getListDevicesMethod) == null) {
          MasterServiceGrpc.getListDevicesMethod = getListDevicesMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.ListDevicesRequest, org.tensorflow.distruntime.ListDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "ListDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ListDevicesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("ListDevices"))
                  .build();
          }
        }
     }
     return getListDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.ResetRequest,
      org.tensorflow.distruntime.ResetResponse> getResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reset",
      requestType = org.tensorflow.distruntime.ResetRequest.class,
      responseType = org.tensorflow.distruntime.ResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.ResetRequest,
      org.tensorflow.distruntime.ResetResponse> getResetMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.ResetRequest, org.tensorflow.distruntime.ResetResponse> getResetMethod;
    if ((getResetMethod = MasterServiceGrpc.getResetMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getResetMethod = MasterServiceGrpc.getResetMethod) == null) {
          MasterServiceGrpc.getResetMethod = getResetMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.ResetRequest, org.tensorflow.distruntime.ResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "Reset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ResetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("Reset"))
                  .build();
          }
        }
     }
     return getResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.MakeCallableRequest,
      org.tensorflow.distruntime.MakeCallableResponse> getMakeCallableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeCallable",
      requestType = org.tensorflow.distruntime.MakeCallableRequest.class,
      responseType = org.tensorflow.distruntime.MakeCallableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.MakeCallableRequest,
      org.tensorflow.distruntime.MakeCallableResponse> getMakeCallableMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.MakeCallableRequest, org.tensorflow.distruntime.MakeCallableResponse> getMakeCallableMethod;
    if ((getMakeCallableMethod = MasterServiceGrpc.getMakeCallableMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getMakeCallableMethod = MasterServiceGrpc.getMakeCallableMethod) == null) {
          MasterServiceGrpc.getMakeCallableMethod = getMakeCallableMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.MakeCallableRequest, org.tensorflow.distruntime.MakeCallableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "MakeCallable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.MakeCallableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.MakeCallableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("MakeCallable"))
                  .build();
          }
        }
     }
     return getMakeCallableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunCallableRequest,
      org.tensorflow.distruntime.RunCallableResponse> getRunCallableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunCallable",
      requestType = org.tensorflow.distruntime.RunCallableRequest.class,
      responseType = org.tensorflow.distruntime.RunCallableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunCallableRequest,
      org.tensorflow.distruntime.RunCallableResponse> getRunCallableMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunCallableRequest, org.tensorflow.distruntime.RunCallableResponse> getRunCallableMethod;
    if ((getRunCallableMethod = MasterServiceGrpc.getRunCallableMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getRunCallableMethod = MasterServiceGrpc.getRunCallableMethod) == null) {
          MasterServiceGrpc.getRunCallableMethod = getRunCallableMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.RunCallableRequest, org.tensorflow.distruntime.RunCallableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "RunCallable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RunCallableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RunCallableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("RunCallable"))
                  .build();
          }
        }
     }
     return getRunCallableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.ReleaseCallableRequest,
      org.tensorflow.distruntime.ReleaseCallableResponse> getReleaseCallableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseCallable",
      requestType = org.tensorflow.distruntime.ReleaseCallableRequest.class,
      responseType = org.tensorflow.distruntime.ReleaseCallableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.ReleaseCallableRequest,
      org.tensorflow.distruntime.ReleaseCallableResponse> getReleaseCallableMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.ReleaseCallableRequest, org.tensorflow.distruntime.ReleaseCallableResponse> getReleaseCallableMethod;
    if ((getReleaseCallableMethod = MasterServiceGrpc.getReleaseCallableMethod) == null) {
      synchronized (MasterServiceGrpc.class) {
        if ((getReleaseCallableMethod = MasterServiceGrpc.getReleaseCallableMethod) == null) {
          MasterServiceGrpc.getReleaseCallableMethod = getReleaseCallableMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.ReleaseCallableRequest, org.tensorflow.distruntime.ReleaseCallableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.MasterService", "ReleaseCallable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ReleaseCallableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.ReleaseCallableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MasterServiceMethodDescriptorSupplier("ReleaseCallable"))
                  .build();
          }
        }
     }
     return getReleaseCallableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MasterServiceStub newStub(io.grpc.Channel channel) {
    return new MasterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MasterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MasterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MasterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MasterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MasterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a session.
     * </pre>
     */
    public void createSession(org.tensorflow.distruntime.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CreateSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Extends a session.
     * </pre>
     */
    public void extendSession(org.tensorflow.distruntime.ExtendSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ExtendSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExtendSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Prepares future partial run calls.
     * </pre>
     */
    public void partialRunSetup(org.tensorflow.distruntime.PartialRunSetupRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.PartialRunSetupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPartialRunSetupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Drives the graph computation.
     * </pre>
     */
    public void runStep(org.tensorflow.distruntime.RunStepRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunStepResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRunStepMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes a session.
     * </pre>
     */
    public void closeSession(org.tensorflow.distruntime.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CloseSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the devices usable by the master.
     * </pre>
     */
    public void listDevices(org.tensorflow.distruntime.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ListDevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close and abandon all existing sessions.  Ongoing computations
     * will no longer affect fresh ones via the resources in containers listed in
     * the ResetRequest.  See ResetRequest for more details.
     * </pre>
     */
    public void reset(org.tensorflow.distruntime.ResetRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Registers a callable for execution with RunCallable.
     * </pre>
     */
    public void makeCallable(org.tensorflow.distruntime.MakeCallableRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.MakeCallableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeCallableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Executes a callable registered with MakeCallable.
     * </pre>
     */
    public void runCallable(org.tensorflow.distruntime.RunCallableRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunCallableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRunCallableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Frees resources associated with a callable registered with MakeCallable.
     * </pre>
     */
    public void releaseCallable(org.tensorflow.distruntime.ReleaseCallableRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ReleaseCallableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReleaseCallableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CreateSessionRequest,
                org.tensorflow.distruntime.CreateSessionResponse>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            getExtendSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.ExtendSessionRequest,
                org.tensorflow.distruntime.ExtendSessionResponse>(
                  this, METHODID_EXTEND_SESSION)))
          .addMethod(
            getPartialRunSetupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.PartialRunSetupRequest,
                org.tensorflow.distruntime.PartialRunSetupResponse>(
                  this, METHODID_PARTIAL_RUN_SETUP)))
          .addMethod(
            getRunStepMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.RunStepRequest,
                org.tensorflow.distruntime.RunStepResponse>(
                  this, METHODID_RUN_STEP)))
          .addMethod(
            getCloseSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CloseSessionRequest,
                org.tensorflow.distruntime.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .addMethod(
            getListDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.ListDevicesRequest,
                org.tensorflow.distruntime.ListDevicesResponse>(
                  this, METHODID_LIST_DEVICES)))
          .addMethod(
            getResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.ResetRequest,
                org.tensorflow.distruntime.ResetResponse>(
                  this, METHODID_RESET)))
          .addMethod(
            getMakeCallableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.MakeCallableRequest,
                org.tensorflow.distruntime.MakeCallableResponse>(
                  this, METHODID_MAKE_CALLABLE)))
          .addMethod(
            getRunCallableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.RunCallableRequest,
                org.tensorflow.distruntime.RunCallableResponse>(
                  this, METHODID_RUN_CALLABLE)))
          .addMethod(
            getReleaseCallableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.ReleaseCallableRequest,
                org.tensorflow.distruntime.ReleaseCallableResponse>(
                  this, METHODID_RELEASE_CALLABLE)))
          .build();
    }
  }

  /**
   */
  public static final class MasterServiceStub extends io.grpc.stub.AbstractStub<MasterServiceStub> {
    private MasterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a session.
     * </pre>
     */
    public void createSession(org.tensorflow.distruntime.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CreateSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Extends a session.
     * </pre>
     */
    public void extendSession(org.tensorflow.distruntime.ExtendSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ExtendSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExtendSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Prepares future partial run calls.
     * </pre>
     */
    public void partialRunSetup(org.tensorflow.distruntime.PartialRunSetupRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.PartialRunSetupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPartialRunSetupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Drives the graph computation.
     * </pre>
     */
    public void runStep(org.tensorflow.distruntime.RunStepRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunStepResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes a session.
     * </pre>
     */
    public void closeSession(org.tensorflow.distruntime.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CloseSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the devices usable by the master.
     * </pre>
     */
    public void listDevices(org.tensorflow.distruntime.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ListDevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close and abandon all existing sessions.  Ongoing computations
     * will no longer affect fresh ones via the resources in containers listed in
     * the ResetRequest.  See ResetRequest for more details.
     * </pre>
     */
    public void reset(org.tensorflow.distruntime.ResetRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Registers a callable for execution with RunCallable.
     * </pre>
     */
    public void makeCallable(org.tensorflow.distruntime.MakeCallableRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.MakeCallableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeCallableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes a callable registered with MakeCallable.
     * </pre>
     */
    public void runCallable(org.tensorflow.distruntime.RunCallableRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunCallableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunCallableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frees resources associated with a callable registered with MakeCallable.
     * </pre>
     */
    public void releaseCallable(org.tensorflow.distruntime.ReleaseCallableRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ReleaseCallableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReleaseCallableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MasterServiceBlockingStub extends io.grpc.stub.AbstractStub<MasterServiceBlockingStub> {
    private MasterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a session.
     * </pre>
     */
    public org.tensorflow.distruntime.CreateSessionResponse createSession(org.tensorflow.distruntime.CreateSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Extends a session.
     * </pre>
     */
    public org.tensorflow.distruntime.ExtendSessionResponse extendSession(org.tensorflow.distruntime.ExtendSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getExtendSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Prepares future partial run calls.
     * </pre>
     */
    public org.tensorflow.distruntime.PartialRunSetupResponse partialRunSetup(org.tensorflow.distruntime.PartialRunSetupRequest request) {
      return blockingUnaryCall(
          getChannel(), getPartialRunSetupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Drives the graph computation.
     * </pre>
     */
    public org.tensorflow.distruntime.RunStepResponse runStep(org.tensorflow.distruntime.RunStepRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes a session.
     * </pre>
     */
    public org.tensorflow.distruntime.CloseSessionResponse closeSession(org.tensorflow.distruntime.CloseSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the devices usable by the master.
     * </pre>
     */
    public org.tensorflow.distruntime.ListDevicesResponse listDevices(org.tensorflow.distruntime.ListDevicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close and abandon all existing sessions.  Ongoing computations
     * will no longer affect fresh ones via the resources in containers listed in
     * the ResetRequest.  See ResetRequest for more details.
     * </pre>
     */
    public org.tensorflow.distruntime.ResetResponse reset(org.tensorflow.distruntime.ResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers a callable for execution with RunCallable.
     * </pre>
     */
    public org.tensorflow.distruntime.MakeCallableResponse makeCallable(org.tensorflow.distruntime.MakeCallableRequest request) {
      return blockingUnaryCall(
          getChannel(), getMakeCallableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes a callable registered with MakeCallable.
     * </pre>
     */
    public org.tensorflow.distruntime.RunCallableResponse runCallable(org.tensorflow.distruntime.RunCallableRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunCallableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Frees resources associated with a callable registered with MakeCallable.
     * </pre>
     */
    public org.tensorflow.distruntime.ReleaseCallableResponse releaseCallable(org.tensorflow.distruntime.ReleaseCallableRequest request) {
      return blockingUnaryCall(
          getChannel(), getReleaseCallableMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MasterServiceFutureStub extends io.grpc.stub.AbstractStub<MasterServiceFutureStub> {
    private MasterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CreateSessionResponse> createSession(
        org.tensorflow.distruntime.CreateSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Extends a session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.ExtendSessionResponse> extendSession(
        org.tensorflow.distruntime.ExtendSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExtendSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Prepares future partial run calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.PartialRunSetupResponse> partialRunSetup(
        org.tensorflow.distruntime.PartialRunSetupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPartialRunSetupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Drives the graph computation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.RunStepResponse> runStep(
        org.tensorflow.distruntime.RunStepRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunStepMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes a session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CloseSessionResponse> closeSession(
        org.tensorflow.distruntime.CloseSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the devices usable by the master.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.ListDevicesResponse> listDevices(
        org.tensorflow.distruntime.ListDevicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close and abandon all existing sessions.  Ongoing computations
     * will no longer affect fresh ones via the resources in containers listed in
     * the ResetRequest.  See ResetRequest for more details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.ResetResponse> reset(
        org.tensorflow.distruntime.ResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Registers a callable for execution with RunCallable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.MakeCallableResponse> makeCallable(
        org.tensorflow.distruntime.MakeCallableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeCallableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes a callable registered with MakeCallable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.RunCallableResponse> runCallable(
        org.tensorflow.distruntime.RunCallableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunCallableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Frees resources associated with a callable registered with MakeCallable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.ReleaseCallableResponse> releaseCallable(
        org.tensorflow.distruntime.ReleaseCallableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReleaseCallableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION = 0;
  private static final int METHODID_EXTEND_SESSION = 1;
  private static final int METHODID_PARTIAL_RUN_SETUP = 2;
  private static final int METHODID_RUN_STEP = 3;
  private static final int METHODID_CLOSE_SESSION = 4;
  private static final int METHODID_LIST_DEVICES = 5;
  private static final int METHODID_RESET = 6;
  private static final int METHODID_MAKE_CALLABLE = 7;
  private static final int METHODID_RUN_CALLABLE = 8;
  private static final int METHODID_RELEASE_CALLABLE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MasterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MasterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((org.tensorflow.distruntime.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CreateSessionResponse>) responseObserver);
          break;
        case METHODID_EXTEND_SESSION:
          serviceImpl.extendSession((org.tensorflow.distruntime.ExtendSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ExtendSessionResponse>) responseObserver);
          break;
        case METHODID_PARTIAL_RUN_SETUP:
          serviceImpl.partialRunSetup((org.tensorflow.distruntime.PartialRunSetupRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.PartialRunSetupResponse>) responseObserver);
          break;
        case METHODID_RUN_STEP:
          serviceImpl.runStep((org.tensorflow.distruntime.RunStepRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunStepResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((org.tensorflow.distruntime.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CloseSessionResponse>) responseObserver);
          break;
        case METHODID_LIST_DEVICES:
          serviceImpl.listDevices((org.tensorflow.distruntime.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ListDevicesResponse>) responseObserver);
          break;
        case METHODID_RESET:
          serviceImpl.reset((org.tensorflow.distruntime.ResetRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ResetResponse>) responseObserver);
          break;
        case METHODID_MAKE_CALLABLE:
          serviceImpl.makeCallable((org.tensorflow.distruntime.MakeCallableRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.MakeCallableResponse>) responseObserver);
          break;
        case METHODID_RUN_CALLABLE:
          serviceImpl.runCallable((org.tensorflow.distruntime.RunCallableRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunCallableResponse>) responseObserver);
          break;
        case METHODID_RELEASE_CALLABLE:
          serviceImpl.releaseCallable((org.tensorflow.distruntime.ReleaseCallableRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.ReleaseCallableResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MasterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MasterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tensorflow.distruntime.MasterServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MasterService");
    }
  }

  private static final class MasterServiceFileDescriptorSupplier
      extends MasterServiceBaseDescriptorSupplier {
    MasterServiceFileDescriptorSupplier() {}
  }

  private static final class MasterServiceMethodDescriptorSupplier
      extends MasterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MasterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MasterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MasterServiceFileDescriptorSupplier())
              .addMethod(getCreateSessionMethod())
              .addMethod(getExtendSessionMethod())
              .addMethod(getPartialRunSetupMethod())
              .addMethod(getRunStepMethod())
              .addMethod(getCloseSessionMethod())
              .addMethod(getListDevicesMethod())
              .addMethod(getResetMethod())
              .addMethod(getMakeCallableMethod())
              .addMethod(getRunCallableMethod())
              .addMethod(getReleaseCallableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
