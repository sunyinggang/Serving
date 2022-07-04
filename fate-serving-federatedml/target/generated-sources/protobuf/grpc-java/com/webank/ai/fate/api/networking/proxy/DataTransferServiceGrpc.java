package com.webank.ai.fate.api.networking.proxy;

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
 * <pre>
 * data transfer service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: proxy.proto")
public final class DataTransferServiceGrpc {

  private DataTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "com.webank.ai.fate.api.networking.proxy.DataTransferService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.proxy.Proxy.Packet,
      com.webank.ai.fate.api.networking.proxy.Proxy.Packet> getUnaryCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryCall",
      requestType = com.webank.ai.fate.api.networking.proxy.Proxy.Packet.class,
      responseType = com.webank.ai.fate.api.networking.proxy.Proxy.Packet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.proxy.Proxy.Packet,
      com.webank.ai.fate.api.networking.proxy.Proxy.Packet> getUnaryCallMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.proxy.Proxy.Packet, com.webank.ai.fate.api.networking.proxy.Proxy.Packet> getUnaryCallMethod;
    if ((getUnaryCallMethod = DataTransferServiceGrpc.getUnaryCallMethod) == null) {
      synchronized (DataTransferServiceGrpc.class) {
        if ((getUnaryCallMethod = DataTransferServiceGrpc.getUnaryCallMethod) == null) {
          DataTransferServiceGrpc.getUnaryCallMethod = getUnaryCallMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.proxy.Proxy.Packet, com.webank.ai.fate.api.networking.proxy.Proxy.Packet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.proxy.Proxy.Packet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.proxy.Proxy.Packet.getDefaultInstance()))
              .setSchemaDescriptor(new DataTransferServiceMethodDescriptorSupplier("unaryCall"))
              .build();
        }
      }
    }
    return getUnaryCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataTransferServiceStub newStub(io.grpc.Channel channel) {
    return new DataTransferServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataTransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataTransferServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataTransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataTransferServiceFutureStub(channel);
  }

  /**
   * <pre>
   * data transfer service
   * </pre>
   */
  public static abstract class DataTransferServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void unaryCall(com.webank.ai.fate.api.networking.proxy.Proxy.Packet request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.proxy.Proxy.Packet> responseObserver) {
      asyncUnimplementedUnaryCall(getUnaryCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.proxy.Proxy.Packet,
                com.webank.ai.fate.api.networking.proxy.Proxy.Packet>(
                  this, METHODID_UNARY_CALL)))
          .build();
    }
  }

  /**
   * <pre>
   * data transfer service
   * </pre>
   */
  public static final class DataTransferServiceStub extends io.grpc.stub.AbstractStub<DataTransferServiceStub> {
    private DataTransferServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataTransferServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataTransferServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataTransferServiceStub(channel, callOptions);
    }

    /**
     */
    public void unaryCall(com.webank.ai.fate.api.networking.proxy.Proxy.Packet request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.proxy.Proxy.Packet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * data transfer service
   * </pre>
   */
  public static final class DataTransferServiceBlockingStub extends io.grpc.stub.AbstractStub<DataTransferServiceBlockingStub> {
    private DataTransferServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataTransferServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataTransferServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataTransferServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.proxy.Proxy.Packet unaryCall(com.webank.ai.fate.api.networking.proxy.Proxy.Packet request) {
      return blockingUnaryCall(
          getChannel(), getUnaryCallMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * data transfer service
   * </pre>
   */
  public static final class DataTransferServiceFutureStub extends io.grpc.stub.AbstractStub<DataTransferServiceFutureStub> {
    private DataTransferServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataTransferServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataTransferServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataTransferServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.proxy.Proxy.Packet> unaryCall(
        com.webank.ai.fate.api.networking.proxy.Proxy.Packet request) {
      return futureUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataTransferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataTransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_CALL:
          serviceImpl.unaryCall((com.webank.ai.fate.api.networking.proxy.Proxy.Packet) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.proxy.Proxy.Packet>) responseObserver);
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

  private static abstract class DataTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataTransferServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.webank.ai.fate.api.networking.proxy.Proxy.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataTransferService");
    }
  }

  private static final class DataTransferServiceFileDescriptorSupplier
      extends DataTransferServiceBaseDescriptorSupplier {
    DataTransferServiceFileDescriptorSupplier() {}
  }

  private static final class DataTransferServiceMethodDescriptorSupplier
      extends DataTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataTransferServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataTransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataTransferServiceFileDescriptorSupplier())
              .addMethod(getUnaryCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
