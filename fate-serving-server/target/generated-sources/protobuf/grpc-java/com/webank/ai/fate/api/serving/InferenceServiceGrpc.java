package com.webank.ai.fate.api.serving;

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
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: inference_service.proto")
public final class InferenceServiceGrpc {

  private InferenceServiceGrpc() {}

  public static final String SERVICE_NAME = "com.webank.ai.fate.api.serving.InferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage,
      com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> getBatchInferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchInference",
      requestType = com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.class,
      responseType = com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage,
      com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> getBatchInferenceMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage, com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> getBatchInferenceMethod;
    if ((getBatchInferenceMethod = InferenceServiceGrpc.getBatchInferenceMethod) == null) {
      synchronized (InferenceServiceGrpc.class) {
        if ((getBatchInferenceMethod = InferenceServiceGrpc.getBatchInferenceMethod) == null) {
          InferenceServiceGrpc.getBatchInferenceMethod = getBatchInferenceMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage, com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "batchInference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new InferenceServiceMethodDescriptorSupplier("batchInference"))
              .build();
        }
      }
    }
    return getBatchInferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage,
      com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> getInferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inference",
      requestType = com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.class,
      responseType = com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage,
      com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> getInferenceMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage, com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> getInferenceMethod;
    if ((getInferenceMethod = InferenceServiceGrpc.getInferenceMethod) == null) {
      synchronized (InferenceServiceGrpc.class) {
        if ((getInferenceMethod = InferenceServiceGrpc.getInferenceMethod) == null) {
          InferenceServiceGrpc.getInferenceMethod = getInferenceMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage, com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "inference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new InferenceServiceMethodDescriptorSupplier("inference"))
              .build();
        }
      }
    }
    return getInferenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InferenceServiceStub newStub(io.grpc.Channel channel) {
    return new InferenceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InferenceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InferenceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InferenceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void batchInference(com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchInferenceMethod(), responseObserver);
    }

    /**
     */
    public void inference(com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getInferenceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBatchInferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage,
                com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage>(
                  this, METHODID_BATCH_INFERENCE)))
          .addMethod(
            getInferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage,
                com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage>(
                  this, METHODID_INFERENCE)))
          .build();
    }
  }

  /**
   */
  public static final class InferenceServiceStub extends io.grpc.stub.AbstractStub<InferenceServiceStub> {
    private InferenceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InferenceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InferenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void batchInference(com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchInferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inference(com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInferenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InferenceServiceBlockingStub extends io.grpc.stub.AbstractStub<InferenceServiceBlockingStub> {
    private InferenceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InferenceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage batchInference(com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request) {
      return blockingUnaryCall(
          getChannel(), getBatchInferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage inference(com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request) {
      return blockingUnaryCall(
          getChannel(), getInferenceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InferenceServiceFutureStub extends io.grpc.stub.AbstractStub<InferenceServiceFutureStub> {
    private InferenceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InferenceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InferenceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> batchInference(
        com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchInferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage> inference(
        com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getInferenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_INFERENCE = 0;
  private static final int METHODID_INFERENCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InferenceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InferenceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_INFERENCE:
          serviceImpl.batchInference((com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage>) responseObserver);
          break;
        case METHODID_INFERENCE:
          serviceImpl.inference((com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.serving.InferenceServiceProto.InferenceMessage>) responseObserver);
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

  private static abstract class InferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InferenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.webank.ai.fate.api.serving.InferenceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InferenceService");
    }
  }

  private static final class InferenceServiceFileDescriptorSupplier
      extends InferenceServiceBaseDescriptorSupplier {
    InferenceServiceFileDescriptorSupplier() {}
  }

  private static final class InferenceServiceMethodDescriptorSupplier
      extends InferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InferenceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InferenceServiceFileDescriptorSupplier())
              .addMethod(getBatchInferenceMethod())
              .addMethod(getInferenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
