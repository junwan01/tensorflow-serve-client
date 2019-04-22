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
    comments = "Source: tensorflow/core/protobuf/worker_service.proto")
public final class WorkerServiceGrpc {

  private WorkerServiceGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.grpc.WorkerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.GetStatusRequest,
      org.tensorflow.distruntime.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = org.tensorflow.distruntime.GetStatusRequest.class,
      responseType = org.tensorflow.distruntime.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.GetStatusRequest,
      org.tensorflow.distruntime.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.GetStatusRequest, org.tensorflow.distruntime.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = WorkerServiceGrpc.getGetStatusMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getGetStatusMethod = WorkerServiceGrpc.getGetStatusMethod) == null) {
          WorkerServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.GetStatusRequest, org.tensorflow.distruntime.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.GetStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("GetStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CreateWorkerSessionRequest,
      org.tensorflow.distruntime.CreateWorkerSessionResponse> getCreateWorkerSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkerSession",
      requestType = org.tensorflow.distruntime.CreateWorkerSessionRequest.class,
      responseType = org.tensorflow.distruntime.CreateWorkerSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CreateWorkerSessionRequest,
      org.tensorflow.distruntime.CreateWorkerSessionResponse> getCreateWorkerSessionMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CreateWorkerSessionRequest, org.tensorflow.distruntime.CreateWorkerSessionResponse> getCreateWorkerSessionMethod;
    if ((getCreateWorkerSessionMethod = WorkerServiceGrpc.getCreateWorkerSessionMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getCreateWorkerSessionMethod = WorkerServiceGrpc.getCreateWorkerSessionMethod) == null) {
          WorkerServiceGrpc.getCreateWorkerSessionMethod = getCreateWorkerSessionMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CreateWorkerSessionRequest, org.tensorflow.distruntime.CreateWorkerSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "CreateWorkerSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CreateWorkerSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CreateWorkerSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("CreateWorkerSession"))
                  .build();
          }
        }
     }
     return getCreateWorkerSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.DeleteWorkerSessionRequest,
      org.tensorflow.distruntime.DeleteWorkerSessionResponse> getDeleteWorkerSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkerSession",
      requestType = org.tensorflow.distruntime.DeleteWorkerSessionRequest.class,
      responseType = org.tensorflow.distruntime.DeleteWorkerSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.DeleteWorkerSessionRequest,
      org.tensorflow.distruntime.DeleteWorkerSessionResponse> getDeleteWorkerSessionMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.DeleteWorkerSessionRequest, org.tensorflow.distruntime.DeleteWorkerSessionResponse> getDeleteWorkerSessionMethod;
    if ((getDeleteWorkerSessionMethod = WorkerServiceGrpc.getDeleteWorkerSessionMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getDeleteWorkerSessionMethod = WorkerServiceGrpc.getDeleteWorkerSessionMethod) == null) {
          WorkerServiceGrpc.getDeleteWorkerSessionMethod = getDeleteWorkerSessionMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.DeleteWorkerSessionRequest, org.tensorflow.distruntime.DeleteWorkerSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "DeleteWorkerSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.DeleteWorkerSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.DeleteWorkerSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("DeleteWorkerSession"))
                  .build();
          }
        }
     }
     return getDeleteWorkerSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.RegisterGraphRequest,
      org.tensorflow.distruntime.RegisterGraphResponse> getRegisterGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterGraph",
      requestType = org.tensorflow.distruntime.RegisterGraphRequest.class,
      responseType = org.tensorflow.distruntime.RegisterGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.RegisterGraphRequest,
      org.tensorflow.distruntime.RegisterGraphResponse> getRegisterGraphMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.RegisterGraphRequest, org.tensorflow.distruntime.RegisterGraphResponse> getRegisterGraphMethod;
    if ((getRegisterGraphMethod = WorkerServiceGrpc.getRegisterGraphMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getRegisterGraphMethod = WorkerServiceGrpc.getRegisterGraphMethod) == null) {
          WorkerServiceGrpc.getRegisterGraphMethod = getRegisterGraphMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.RegisterGraphRequest, org.tensorflow.distruntime.RegisterGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "RegisterGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RegisterGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RegisterGraphResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("RegisterGraph"))
                  .build();
          }
        }
     }
     return getRegisterGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.DeregisterGraphRequest,
      org.tensorflow.distruntime.DeregisterGraphResponse> getDeregisterGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeregisterGraph",
      requestType = org.tensorflow.distruntime.DeregisterGraphRequest.class,
      responseType = org.tensorflow.distruntime.DeregisterGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.DeregisterGraphRequest,
      org.tensorflow.distruntime.DeregisterGraphResponse> getDeregisterGraphMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.DeregisterGraphRequest, org.tensorflow.distruntime.DeregisterGraphResponse> getDeregisterGraphMethod;
    if ((getDeregisterGraphMethod = WorkerServiceGrpc.getDeregisterGraphMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getDeregisterGraphMethod = WorkerServiceGrpc.getDeregisterGraphMethod) == null) {
          WorkerServiceGrpc.getDeregisterGraphMethod = getDeregisterGraphMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.DeregisterGraphRequest, org.tensorflow.distruntime.DeregisterGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "DeregisterGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.DeregisterGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.DeregisterGraphResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("DeregisterGraph"))
                  .build();
          }
        }
     }
     return getDeregisterGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunGraphRequest,
      org.tensorflow.distruntime.RunGraphResponse> getRunGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunGraph",
      requestType = org.tensorflow.distruntime.RunGraphRequest.class,
      responseType = org.tensorflow.distruntime.RunGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunGraphRequest,
      org.tensorflow.distruntime.RunGraphResponse> getRunGraphMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.RunGraphRequest, org.tensorflow.distruntime.RunGraphResponse> getRunGraphMethod;
    if ((getRunGraphMethod = WorkerServiceGrpc.getRunGraphMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getRunGraphMethod = WorkerServiceGrpc.getRunGraphMethod) == null) {
          WorkerServiceGrpc.getRunGraphMethod = getRunGraphMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.RunGraphRequest, org.tensorflow.distruntime.RunGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "RunGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RunGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RunGraphResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("RunGraph"))
                  .build();
          }
        }
     }
     return getRunGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CleanupGraphRequest,
      org.tensorflow.distruntime.CleanupGraphResponse> getCleanupGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanupGraph",
      requestType = org.tensorflow.distruntime.CleanupGraphRequest.class,
      responseType = org.tensorflow.distruntime.CleanupGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CleanupGraphRequest,
      org.tensorflow.distruntime.CleanupGraphResponse> getCleanupGraphMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CleanupGraphRequest, org.tensorflow.distruntime.CleanupGraphResponse> getCleanupGraphMethod;
    if ((getCleanupGraphMethod = WorkerServiceGrpc.getCleanupGraphMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getCleanupGraphMethod = WorkerServiceGrpc.getCleanupGraphMethod) == null) {
          WorkerServiceGrpc.getCleanupGraphMethod = getCleanupGraphMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CleanupGraphRequest, org.tensorflow.distruntime.CleanupGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "CleanupGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CleanupGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CleanupGraphResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("CleanupGraph"))
                  .build();
          }
        }
     }
     return getCleanupGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CleanupAllRequest,
      org.tensorflow.distruntime.CleanupAllResponse> getCleanupAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanupAll",
      requestType = org.tensorflow.distruntime.CleanupAllRequest.class,
      responseType = org.tensorflow.distruntime.CleanupAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CleanupAllRequest,
      org.tensorflow.distruntime.CleanupAllResponse> getCleanupAllMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CleanupAllRequest, org.tensorflow.distruntime.CleanupAllResponse> getCleanupAllMethod;
    if ((getCleanupAllMethod = WorkerServiceGrpc.getCleanupAllMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getCleanupAllMethod = WorkerServiceGrpc.getCleanupAllMethod) == null) {
          WorkerServiceGrpc.getCleanupAllMethod = getCleanupAllMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CleanupAllRequest, org.tensorflow.distruntime.CleanupAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "CleanupAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CleanupAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CleanupAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("CleanupAll"))
                  .build();
          }
        }
     }
     return getCleanupAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.RecvTensorRequest,
      org.tensorflow.distruntime.RecvTensorResponse> getRecvTensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvTensor",
      requestType = org.tensorflow.distruntime.RecvTensorRequest.class,
      responseType = org.tensorflow.distruntime.RecvTensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.RecvTensorRequest,
      org.tensorflow.distruntime.RecvTensorResponse> getRecvTensorMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.RecvTensorRequest, org.tensorflow.distruntime.RecvTensorResponse> getRecvTensorMethod;
    if ((getRecvTensorMethod = WorkerServiceGrpc.getRecvTensorMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getRecvTensorMethod = WorkerServiceGrpc.getRecvTensorMethod) == null) {
          WorkerServiceGrpc.getRecvTensorMethod = getRecvTensorMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.RecvTensorRequest, org.tensorflow.distruntime.RecvTensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "RecvTensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RecvTensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RecvTensorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("RecvTensor"))
                  .build();
          }
        }
     }
     return getRecvTensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.LoggingRequest,
      org.tensorflow.distruntime.LoggingResponse> getLoggingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logging",
      requestType = org.tensorflow.distruntime.LoggingRequest.class,
      responseType = org.tensorflow.distruntime.LoggingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.LoggingRequest,
      org.tensorflow.distruntime.LoggingResponse> getLoggingMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.LoggingRequest, org.tensorflow.distruntime.LoggingResponse> getLoggingMethod;
    if ((getLoggingMethod = WorkerServiceGrpc.getLoggingMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getLoggingMethod = WorkerServiceGrpc.getLoggingMethod) == null) {
          WorkerServiceGrpc.getLoggingMethod = getLoggingMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.LoggingRequest, org.tensorflow.distruntime.LoggingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "Logging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.LoggingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.LoggingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("Logging"))
                  .build();
          }
        }
     }
     return getLoggingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.TracingRequest,
      org.tensorflow.distruntime.TracingResponse> getTracingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tracing",
      requestType = org.tensorflow.distruntime.TracingRequest.class,
      responseType = org.tensorflow.distruntime.TracingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.TracingRequest,
      org.tensorflow.distruntime.TracingResponse> getTracingMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.TracingRequest, org.tensorflow.distruntime.TracingResponse> getTracingMethod;
    if ((getTracingMethod = WorkerServiceGrpc.getTracingMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getTracingMethod = WorkerServiceGrpc.getTracingMethod) == null) {
          WorkerServiceGrpc.getTracingMethod = getTracingMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.TracingRequest, org.tensorflow.distruntime.TracingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "Tracing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.TracingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.TracingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("Tracing"))
                  .build();
          }
        }
     }
     return getTracingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.RecvBufRequest,
      org.tensorflow.distruntime.RecvBufResponse> getRecvBufMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvBuf",
      requestType = org.tensorflow.distruntime.RecvBufRequest.class,
      responseType = org.tensorflow.distruntime.RecvBufResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.RecvBufRequest,
      org.tensorflow.distruntime.RecvBufResponse> getRecvBufMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.RecvBufRequest, org.tensorflow.distruntime.RecvBufResponse> getRecvBufMethod;
    if ((getRecvBufMethod = WorkerServiceGrpc.getRecvBufMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getRecvBufMethod = WorkerServiceGrpc.getRecvBufMethod) == null) {
          WorkerServiceGrpc.getRecvBufMethod = getRecvBufMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.RecvBufRequest, org.tensorflow.distruntime.RecvBufResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "RecvBuf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RecvBufRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.RecvBufResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("RecvBuf"))
                  .build();
          }
        }
     }
     return getRecvBufMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.GetStepSequenceRequest,
      org.tensorflow.distruntime.GetStepSequenceResponse> getGetStepSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStepSequence",
      requestType = org.tensorflow.distruntime.GetStepSequenceRequest.class,
      responseType = org.tensorflow.distruntime.GetStepSequenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.GetStepSequenceRequest,
      org.tensorflow.distruntime.GetStepSequenceResponse> getGetStepSequenceMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.GetStepSequenceRequest, org.tensorflow.distruntime.GetStepSequenceResponse> getGetStepSequenceMethod;
    if ((getGetStepSequenceMethod = WorkerServiceGrpc.getGetStepSequenceMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getGetStepSequenceMethod = WorkerServiceGrpc.getGetStepSequenceMethod) == null) {
          WorkerServiceGrpc.getGetStepSequenceMethod = getGetStepSequenceMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.GetStepSequenceRequest, org.tensorflow.distruntime.GetStepSequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "GetStepSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.GetStepSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.GetStepSequenceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("GetStepSequence"))
                  .build();
          }
        }
     }
     return getGetStepSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CompleteGroupRequest,
      org.tensorflow.distruntime.CompleteGroupResponse> getCompleteGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteGroup",
      requestType = org.tensorflow.distruntime.CompleteGroupRequest.class,
      responseType = org.tensorflow.distruntime.CompleteGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CompleteGroupRequest,
      org.tensorflow.distruntime.CompleteGroupResponse> getCompleteGroupMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CompleteGroupRequest, org.tensorflow.distruntime.CompleteGroupResponse> getCompleteGroupMethod;
    if ((getCompleteGroupMethod = WorkerServiceGrpc.getCompleteGroupMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getCompleteGroupMethod = WorkerServiceGrpc.getCompleteGroupMethod) == null) {
          WorkerServiceGrpc.getCompleteGroupMethod = getCompleteGroupMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CompleteGroupRequest, org.tensorflow.distruntime.CompleteGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "CompleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CompleteGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CompleteGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("CompleteGroup"))
                  .build();
          }
        }
     }
     return getCompleteGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.distruntime.CompleteInstanceRequest,
      org.tensorflow.distruntime.CompleteInstanceResponse> getCompleteInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteInstance",
      requestType = org.tensorflow.distruntime.CompleteInstanceRequest.class,
      responseType = org.tensorflow.distruntime.CompleteInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.distruntime.CompleteInstanceRequest,
      org.tensorflow.distruntime.CompleteInstanceResponse> getCompleteInstanceMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.distruntime.CompleteInstanceRequest, org.tensorflow.distruntime.CompleteInstanceResponse> getCompleteInstanceMethod;
    if ((getCompleteInstanceMethod = WorkerServiceGrpc.getCompleteInstanceMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getCompleteInstanceMethod = WorkerServiceGrpc.getCompleteInstanceMethod) == null) {
          WorkerServiceGrpc.getCompleteInstanceMethod = getCompleteInstanceMethod = 
              io.grpc.MethodDescriptor.<org.tensorflow.distruntime.CompleteInstanceRequest, org.tensorflow.distruntime.CompleteInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.grpc.WorkerService", "CompleteInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CompleteInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.distruntime.CompleteInstanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("CompleteInstance"))
                  .build();
          }
        }
     }
     return getCompleteInstanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkerServiceStub newStub(io.grpc.Channel channel) {
    return new WorkerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WorkerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WorkerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WorkerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void getStatus(org.tensorflow.distruntime.GetStatusRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.GetStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void createWorkerSession(org.tensorflow.distruntime.CreateWorkerSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CreateWorkerSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWorkerSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void deleteWorkerSession(org.tensorflow.distruntime.DeleteWorkerSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.DeleteWorkerSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteWorkerSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void registerGraph(org.tensorflow.distruntime.RegisterGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RegisterGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void deregisterGraph(org.tensorflow.distruntime.DeregisterGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.DeregisterGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeregisterGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void runGraph(org.tensorflow.distruntime.RunGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRunGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void cleanupGraph(org.tensorflow.distruntime.CleanupGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CleanupGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCleanupGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void cleanupAll(org.tensorflow.distruntime.CleanupAllRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CleanupAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCleanupAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void recvTensor(org.tensorflow.distruntime.RecvTensorRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RecvTensorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecvTensorMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void logging(org.tensorflow.distruntime.LoggingRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.LoggingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoggingMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void tracing(org.tensorflow.distruntime.TracingRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.TracingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTracingMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void recvBuf(org.tensorflow.distruntime.RecvBufRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RecvBufResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecvBufMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void getStepSequence(org.tensorflow.distruntime.GetStepSequenceRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.GetStepSequenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStepSequenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void completeGroup(org.tensorflow.distruntime.CompleteGroupRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CompleteGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void completeInstance(org.tensorflow.distruntime.CompleteInstanceRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CompleteInstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteInstanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.GetStatusRequest,
                org.tensorflow.distruntime.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getCreateWorkerSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CreateWorkerSessionRequest,
                org.tensorflow.distruntime.CreateWorkerSessionResponse>(
                  this, METHODID_CREATE_WORKER_SESSION)))
          .addMethod(
            getDeleteWorkerSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.DeleteWorkerSessionRequest,
                org.tensorflow.distruntime.DeleteWorkerSessionResponse>(
                  this, METHODID_DELETE_WORKER_SESSION)))
          .addMethod(
            getRegisterGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.RegisterGraphRequest,
                org.tensorflow.distruntime.RegisterGraphResponse>(
                  this, METHODID_REGISTER_GRAPH)))
          .addMethod(
            getDeregisterGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.DeregisterGraphRequest,
                org.tensorflow.distruntime.DeregisterGraphResponse>(
                  this, METHODID_DEREGISTER_GRAPH)))
          .addMethod(
            getRunGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.RunGraphRequest,
                org.tensorflow.distruntime.RunGraphResponse>(
                  this, METHODID_RUN_GRAPH)))
          .addMethod(
            getCleanupGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CleanupGraphRequest,
                org.tensorflow.distruntime.CleanupGraphResponse>(
                  this, METHODID_CLEANUP_GRAPH)))
          .addMethod(
            getCleanupAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CleanupAllRequest,
                org.tensorflow.distruntime.CleanupAllResponse>(
                  this, METHODID_CLEANUP_ALL)))
          .addMethod(
            getRecvTensorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.RecvTensorRequest,
                org.tensorflow.distruntime.RecvTensorResponse>(
                  this, METHODID_RECV_TENSOR)))
          .addMethod(
            getLoggingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.LoggingRequest,
                org.tensorflow.distruntime.LoggingResponse>(
                  this, METHODID_LOGGING)))
          .addMethod(
            getTracingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.TracingRequest,
                org.tensorflow.distruntime.TracingResponse>(
                  this, METHODID_TRACING)))
          .addMethod(
            getRecvBufMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.RecvBufRequest,
                org.tensorflow.distruntime.RecvBufResponse>(
                  this, METHODID_RECV_BUF)))
          .addMethod(
            getGetStepSequenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.GetStepSequenceRequest,
                org.tensorflow.distruntime.GetStepSequenceResponse>(
                  this, METHODID_GET_STEP_SEQUENCE)))
          .addMethod(
            getCompleteGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CompleteGroupRequest,
                org.tensorflow.distruntime.CompleteGroupResponse>(
                  this, METHODID_COMPLETE_GROUP)))
          .addMethod(
            getCompleteInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.distruntime.CompleteInstanceRequest,
                org.tensorflow.distruntime.CompleteInstanceResponse>(
                  this, METHODID_COMPLETE_INSTANCE)))
          .build();
    }
  }

  /**
   */
  public static final class WorkerServiceStub extends io.grpc.stub.AbstractStub<WorkerServiceStub> {
    private WorkerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void getStatus(org.tensorflow.distruntime.GetStatusRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.GetStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void createWorkerSession(org.tensorflow.distruntime.CreateWorkerSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CreateWorkerSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWorkerSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void deleteWorkerSession(org.tensorflow.distruntime.DeleteWorkerSessionRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.DeleteWorkerSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteWorkerSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void registerGraph(org.tensorflow.distruntime.RegisterGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RegisterGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void deregisterGraph(org.tensorflow.distruntime.DeregisterGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.DeregisterGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeregisterGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void runGraph(org.tensorflow.distruntime.RunGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void cleanupGraph(org.tensorflow.distruntime.CleanupGraphRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CleanupGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCleanupGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void cleanupAll(org.tensorflow.distruntime.CleanupAllRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CleanupAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCleanupAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void recvTensor(org.tensorflow.distruntime.RecvTensorRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RecvTensorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecvTensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void logging(org.tensorflow.distruntime.LoggingRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.LoggingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoggingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void tracing(org.tensorflow.distruntime.TracingRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.TracingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTracingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void recvBuf(org.tensorflow.distruntime.RecvBufRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RecvBufResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecvBufMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void getStepSequence(org.tensorflow.distruntime.GetStepSequenceRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.GetStepSequenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStepSequenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void completeGroup(org.tensorflow.distruntime.CompleteGroupRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CompleteGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public void completeInstance(org.tensorflow.distruntime.CompleteInstanceRequest request,
        io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CompleteInstanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteInstanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WorkerServiceBlockingStub extends io.grpc.stub.AbstractStub<WorkerServiceBlockingStub> {
    private WorkerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.GetStatusResponse getStatus(org.tensorflow.distruntime.GetStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.CreateWorkerSessionResponse createWorkerSession(org.tensorflow.distruntime.CreateWorkerSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateWorkerSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.DeleteWorkerSessionResponse deleteWorkerSession(org.tensorflow.distruntime.DeleteWorkerSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteWorkerSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.RegisterGraphResponse registerGraph(org.tensorflow.distruntime.RegisterGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.DeregisterGraphResponse deregisterGraph(org.tensorflow.distruntime.DeregisterGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeregisterGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.RunGraphResponse runGraph(org.tensorflow.distruntime.RunGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.CleanupGraphResponse cleanupGraph(org.tensorflow.distruntime.CleanupGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getCleanupGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.CleanupAllResponse cleanupAll(org.tensorflow.distruntime.CleanupAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getCleanupAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.RecvTensorResponse recvTensor(org.tensorflow.distruntime.RecvTensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecvTensorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.LoggingResponse logging(org.tensorflow.distruntime.LoggingRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoggingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.TracingResponse tracing(org.tensorflow.distruntime.TracingRequest request) {
      return blockingUnaryCall(
          getChannel(), getTracingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.RecvBufResponse recvBuf(org.tensorflow.distruntime.RecvBufRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecvBufMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.GetStepSequenceResponse getStepSequence(org.tensorflow.distruntime.GetStepSequenceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStepSequenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.CompleteGroupResponse completeGroup(org.tensorflow.distruntime.CompleteGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompleteGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public org.tensorflow.distruntime.CompleteInstanceResponse completeInstance(org.tensorflow.distruntime.CompleteInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompleteInstanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WorkerServiceFutureStub extends io.grpc.stub.AbstractStub<WorkerServiceFutureStub> {
    private WorkerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.GetStatusResponse> getStatus(
        org.tensorflow.distruntime.GetStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CreateWorkerSessionResponse> createWorkerSession(
        org.tensorflow.distruntime.CreateWorkerSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWorkerSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.DeleteWorkerSessionResponse> deleteWorkerSession(
        org.tensorflow.distruntime.DeleteWorkerSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteWorkerSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.RegisterGraphResponse> registerGraph(
        org.tensorflow.distruntime.RegisterGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.DeregisterGraphResponse> deregisterGraph(
        org.tensorflow.distruntime.DeregisterGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeregisterGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.RunGraphResponse> runGraph(
        org.tensorflow.distruntime.RunGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CleanupGraphResponse> cleanupGraph(
        org.tensorflow.distruntime.CleanupGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCleanupGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CleanupAllResponse> cleanupAll(
        org.tensorflow.distruntime.CleanupAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCleanupAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.RecvTensorResponse> recvTensor(
        org.tensorflow.distruntime.RecvTensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecvTensorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.LoggingResponse> logging(
        org.tensorflow.distruntime.LoggingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoggingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.TracingResponse> tracing(
        org.tensorflow.distruntime.TracingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTracingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.RecvBufResponse> recvBuf(
        org.tensorflow.distruntime.RecvBufRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecvBufMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.GetStepSequenceResponse> getStepSequence(
        org.tensorflow.distruntime.GetStepSequenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStepSequenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CompleteGroupResponse> completeGroup(
        org.tensorflow.distruntime.CompleteGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * See worker.proto for details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tensorflow.distruntime.CompleteInstanceResponse> completeInstance(
        org.tensorflow.distruntime.CompleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteInstanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_CREATE_WORKER_SESSION = 1;
  private static final int METHODID_DELETE_WORKER_SESSION = 2;
  private static final int METHODID_REGISTER_GRAPH = 3;
  private static final int METHODID_DEREGISTER_GRAPH = 4;
  private static final int METHODID_RUN_GRAPH = 5;
  private static final int METHODID_CLEANUP_GRAPH = 6;
  private static final int METHODID_CLEANUP_ALL = 7;
  private static final int METHODID_RECV_TENSOR = 8;
  private static final int METHODID_LOGGING = 9;
  private static final int METHODID_TRACING = 10;
  private static final int METHODID_RECV_BUF = 11;
  private static final int METHODID_GET_STEP_SEQUENCE = 12;
  private static final int METHODID_COMPLETE_GROUP = 13;
  private static final int METHODID_COMPLETE_INSTANCE = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.tensorflow.distruntime.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.GetStatusResponse>) responseObserver);
          break;
        case METHODID_CREATE_WORKER_SESSION:
          serviceImpl.createWorkerSession((org.tensorflow.distruntime.CreateWorkerSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CreateWorkerSessionResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKER_SESSION:
          serviceImpl.deleteWorkerSession((org.tensorflow.distruntime.DeleteWorkerSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.DeleteWorkerSessionResponse>) responseObserver);
          break;
        case METHODID_REGISTER_GRAPH:
          serviceImpl.registerGraph((org.tensorflow.distruntime.RegisterGraphRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RegisterGraphResponse>) responseObserver);
          break;
        case METHODID_DEREGISTER_GRAPH:
          serviceImpl.deregisterGraph((org.tensorflow.distruntime.DeregisterGraphRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.DeregisterGraphResponse>) responseObserver);
          break;
        case METHODID_RUN_GRAPH:
          serviceImpl.runGraph((org.tensorflow.distruntime.RunGraphRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RunGraphResponse>) responseObserver);
          break;
        case METHODID_CLEANUP_GRAPH:
          serviceImpl.cleanupGraph((org.tensorflow.distruntime.CleanupGraphRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CleanupGraphResponse>) responseObserver);
          break;
        case METHODID_CLEANUP_ALL:
          serviceImpl.cleanupAll((org.tensorflow.distruntime.CleanupAllRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CleanupAllResponse>) responseObserver);
          break;
        case METHODID_RECV_TENSOR:
          serviceImpl.recvTensor((org.tensorflow.distruntime.RecvTensorRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RecvTensorResponse>) responseObserver);
          break;
        case METHODID_LOGGING:
          serviceImpl.logging((org.tensorflow.distruntime.LoggingRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.LoggingResponse>) responseObserver);
          break;
        case METHODID_TRACING:
          serviceImpl.tracing((org.tensorflow.distruntime.TracingRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.TracingResponse>) responseObserver);
          break;
        case METHODID_RECV_BUF:
          serviceImpl.recvBuf((org.tensorflow.distruntime.RecvBufRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.RecvBufResponse>) responseObserver);
          break;
        case METHODID_GET_STEP_SEQUENCE:
          serviceImpl.getStepSequence((org.tensorflow.distruntime.GetStepSequenceRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.GetStepSequenceResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_GROUP:
          serviceImpl.completeGroup((org.tensorflow.distruntime.CompleteGroupRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CompleteGroupResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_INSTANCE:
          serviceImpl.completeInstance((org.tensorflow.distruntime.CompleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<org.tensorflow.distruntime.CompleteInstanceResponse>) responseObserver);
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

  private static abstract class WorkerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tensorflow.distruntime.WorkerServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkerService");
    }
  }

  private static final class WorkerServiceFileDescriptorSupplier
      extends WorkerServiceBaseDescriptorSupplier {
    WorkerServiceFileDescriptorSupplier() {}
  }

  private static final class WorkerServiceMethodDescriptorSupplier
      extends WorkerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkerServiceFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .addMethod(getCreateWorkerSessionMethod())
              .addMethod(getDeleteWorkerSessionMethod())
              .addMethod(getRegisterGraphMethod())
              .addMethod(getDeregisterGraphMethod())
              .addMethod(getRunGraphMethod())
              .addMethod(getCleanupGraphMethod())
              .addMethod(getCleanupAllMethod())
              .addMethod(getRecvTensorMethod())
              .addMethod(getLoggingMethod())
              .addMethod(getTracingMethod())
              .addMethod(getRecvBufMethod())
              .addMethod(getGetStepSequenceMethod())
              .addMethod(getCompleteGroupMethod())
              .addMethod(getCompleteInstanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
