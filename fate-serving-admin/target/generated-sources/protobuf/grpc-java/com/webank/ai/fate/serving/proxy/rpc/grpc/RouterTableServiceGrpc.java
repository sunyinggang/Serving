package com.webank.ai.fate.serving.proxy.rpc.grpc;

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
    comments = "Source: router_service.proto")
public final class RouterTableServiceGrpc {

  private RouterTableServiceGrpc() {}

  public static final String SERVICE_NAME = "com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getQueryRouterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryRouter",
      requestType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.class,
      responseType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getQueryRouterMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getQueryRouterMethod;
    if ((getQueryRouterMethod = RouterTableServiceGrpc.getQueryRouterMethod) == null) {
      synchronized (RouterTableServiceGrpc.class) {
        if ((getQueryRouterMethod = RouterTableServiceGrpc.getQueryRouterMethod) == null) {
          RouterTableServiceGrpc.getQueryRouterMethod = getQueryRouterMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryRouter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterTableServiceMethodDescriptorSupplier("queryRouter"))
              .build();
        }
      }
    }
    return getQueryRouterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getAddRouterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRouter",
      requestType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.class,
      responseType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getAddRouterMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getAddRouterMethod;
    if ((getAddRouterMethod = RouterTableServiceGrpc.getAddRouterMethod) == null) {
      synchronized (RouterTableServiceGrpc.class) {
        if ((getAddRouterMethod = RouterTableServiceGrpc.getAddRouterMethod) == null) {
          RouterTableServiceGrpc.getAddRouterMethod = getAddRouterMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRouter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterTableServiceMethodDescriptorSupplier("addRouter"))
              .build();
        }
      }
    }
    return getAddRouterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getUpdateRouterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRouter",
      requestType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.class,
      responseType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getUpdateRouterMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getUpdateRouterMethod;
    if ((getUpdateRouterMethod = RouterTableServiceGrpc.getUpdateRouterMethod) == null) {
      synchronized (RouterTableServiceGrpc.class) {
        if ((getUpdateRouterMethod = RouterTableServiceGrpc.getUpdateRouterMethod) == null) {
          RouterTableServiceGrpc.getUpdateRouterMethod = getUpdateRouterMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateRouter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterTableServiceMethodDescriptorSupplier("updateRouter"))
              .build();
        }
      }
    }
    return getUpdateRouterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getDeleteRouterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRouter",
      requestType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.class,
      responseType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getDeleteRouterMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getDeleteRouterMethod;
    if ((getDeleteRouterMethod = RouterTableServiceGrpc.getDeleteRouterMethod) == null) {
      synchronized (RouterTableServiceGrpc.class) {
        if ((getDeleteRouterMethod = RouterTableServiceGrpc.getDeleteRouterMethod) == null) {
          RouterTableServiceGrpc.getDeleteRouterMethod = getDeleteRouterMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteRouter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterTableServiceMethodDescriptorSupplier("deleteRouter"))
              .build();
        }
      }
    }
    return getDeleteRouterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getSaveRouterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveRouter",
      requestType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.class,
      responseType = com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
      com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getSaveRouterMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> getSaveRouterMethod;
    if ((getSaveRouterMethod = RouterTableServiceGrpc.getSaveRouterMethod) == null) {
      synchronized (RouterTableServiceGrpc.class) {
        if ((getSaveRouterMethod = RouterTableServiceGrpc.getSaveRouterMethod) == null) {
          RouterTableServiceGrpc.getSaveRouterMethod = getSaveRouterMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest, com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveRouter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterTableServiceMethodDescriptorSupplier("saveRouter"))
              .build();
        }
      }
    }
    return getSaveRouterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouterTableServiceStub newStub(io.grpc.Channel channel) {
    return new RouterTableServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouterTableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouterTableServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouterTableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouterTableServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RouterTableServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryRouterMethod(), responseObserver);
    }

    /**
     */
    public void addRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRouterMethod(), responseObserver);
    }

    /**
     */
    public void updateRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRouterMethod(), responseObserver);
    }

    /**
     */
    public void deleteRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRouterMethod(), responseObserver);
    }

    /**
     */
    public void saveRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveRouterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryRouterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>(
                  this, METHODID_QUERY_ROUTER)))
          .addMethod(
            getAddRouterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>(
                  this, METHODID_ADD_ROUTER)))
          .addMethod(
            getUpdateRouterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>(
                  this, METHODID_UPDATE_ROUTER)))
          .addMethod(
            getDeleteRouterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>(
                  this, METHODID_DELETE_ROUTER)))
          .addMethod(
            getSaveRouterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest,
                com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>(
                  this, METHODID_SAVE_ROUTER)))
          .build();
    }
  }

  /**
   */
  public static final class RouterTableServiceStub extends io.grpc.stub.AbstractStub<RouterTableServiceStub> {
    private RouterTableServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterTableServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterTableServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterTableServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryRouterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRouterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRouterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRouterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveRouterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RouterTableServiceBlockingStub extends io.grpc.stub.AbstractStub<RouterTableServiceBlockingStub> {
    private RouterTableServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterTableServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterTableServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterTableServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse queryRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryRouterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse addRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRouterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse updateRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRouterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse deleteRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRouterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse saveRouter(com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveRouterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RouterTableServiceFutureStub extends io.grpc.stub.AbstractStub<RouterTableServiceFutureStub> {
    private RouterTableServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterTableServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterTableServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterTableServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> queryRouter(
        com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryRouterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> addRouter(
        com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRouterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> updateRouter(
        com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRouterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> deleteRouter(
        com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRouterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse> saveRouter(
        com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveRouterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_ROUTER = 0;
  private static final int METHODID_ADD_ROUTER = 1;
  private static final int METHODID_UPDATE_ROUTER = 2;
  private static final int METHODID_DELETE_ROUTER = 3;
  private static final int METHODID_SAVE_ROUTER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouterTableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouterTableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_ROUTER:
          serviceImpl.queryRouter((com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>) responseObserver);
          break;
        case METHODID_ADD_ROUTER:
          serviceImpl.addRouter((com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTER:
          serviceImpl.updateRouter((com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROUTER:
          serviceImpl.deleteRouter((com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>) responseObserver);
          break;
        case METHODID_SAVE_ROUTER:
          serviceImpl.saveRouter((com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.RouterOperatetResponse>) responseObserver);
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

  private static abstract class RouterTableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouterTableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.webank.ai.fate.serving.proxy.rpc.grpc.RouterTableServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouterTableService");
    }
  }

  private static final class RouterTableServiceFileDescriptorSupplier
      extends RouterTableServiceBaseDescriptorSupplier {
    RouterTableServiceFileDescriptorSupplier() {}
  }

  private static final class RouterTableServiceMethodDescriptorSupplier
      extends RouterTableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouterTableServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouterTableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouterTableServiceFileDescriptorSupplier())
              .addMethod(getQueryRouterMethod())
              .addMethod(getAddRouterMethod())
              .addMethod(getUpdateRouterMethod())
              .addMethod(getDeleteRouterMethod())
              .addMethod(getSaveRouterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
