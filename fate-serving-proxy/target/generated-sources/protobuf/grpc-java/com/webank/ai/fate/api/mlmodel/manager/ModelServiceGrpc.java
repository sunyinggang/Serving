package com.webank.ai.fate.api.mlmodel.manager;

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
    comments = "Source: model_service.proto")
public final class ModelServiceGrpc {

  private ModelServiceGrpc() {}

  public static final String SERVICE_NAME = "com.webank.ai.fate.api.mlmodel.manager.ModelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishLoadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "publishLoad",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishLoadMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishLoadMethod;
    if ((getPublishLoadMethod = ModelServiceGrpc.getPublishLoadMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getPublishLoadMethod = ModelServiceGrpc.getPublishLoadMethod) == null) {
          ModelServiceGrpc.getPublishLoadMethod = getPublishLoadMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "publishLoad"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("publishLoad"))
              .build();
        }
      }
    }
    return getPublishLoadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishBindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "publishBind",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishBindMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishBindMethod;
    if ((getPublishBindMethod = ModelServiceGrpc.getPublishBindMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getPublishBindMethod = ModelServiceGrpc.getPublishBindMethod) == null) {
          ModelServiceGrpc.getPublishBindMethod = getPublishBindMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "publishBind"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("publishBind"))
              .build();
        }
      }
    }
    return getPublishBindMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishOnlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "publishOnline",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishOnlineMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> getPublishOnlineMethod;
    if ((getPublishOnlineMethod = ModelServiceGrpc.getPublishOnlineMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getPublishOnlineMethod = ModelServiceGrpc.getPublishOnlineMethod) == null) {
          ModelServiceGrpc.getPublishOnlineMethod = getPublishOnlineMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "publishOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("publishOnline"))
              .build();
        }
      }
    }
    return getPublishOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse> getQueryModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryModel",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse> getQueryModelMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse> getQueryModelMethod;
    if ((getQueryModelMethod = ModelServiceGrpc.getQueryModelMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getQueryModelMethod = ModelServiceGrpc.getQueryModelMethod) == null) {
          ModelServiceGrpc.getQueryModelMethod = getQueryModelMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("queryModel"))
              .build();
        }
      }
    }
    return getQueryModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse> getUnloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unload",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse> getUnloadMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse> getUnloadMethod;
    if ((getUnloadMethod = ModelServiceGrpc.getUnloadMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getUnloadMethod = ModelServiceGrpc.getUnloadMethod) == null) {
          ModelServiceGrpc.getUnloadMethod = getUnloadMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("unload"))
              .build();
        }
      }
    }
    return getUnloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse> getUnbindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unbind",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse> getUnbindMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse> getUnbindMethod;
    if ((getUnbindMethod = ModelServiceGrpc.getUnbindMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getUnbindMethod = ModelServiceGrpc.getUnbindMethod) == null) {
          ModelServiceGrpc.getUnbindMethod = getUnbindMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unbind"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("unbind"))
              .build();
        }
      }
    }
    return getUnbindMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse> getFetchModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchModel",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse> getFetchModelMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse> getFetchModelMethod;
    if ((getFetchModelMethod = ModelServiceGrpc.getFetchModelMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getFetchModelMethod = ModelServiceGrpc.getFetchModelMethod) == null) {
          ModelServiceGrpc.getFetchModelMethod = getFetchModelMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetchModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("fetchModel"))
              .build();
        }
      }
    }
    return getFetchModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse> getModelTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "modelTransfer",
      requestType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest.class,
      responseType = com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest,
      com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse> getModelTransferMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse> getModelTransferMethod;
    if ((getModelTransferMethod = ModelServiceGrpc.getModelTransferMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getModelTransferMethod = ModelServiceGrpc.getModelTransferMethod) == null) {
          ModelServiceGrpc.getModelTransferMethod = getModelTransferMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest, com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "modelTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("modelTransfer"))
              .build();
        }
      }
    }
    return getModelTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModelServiceStub newStub(io.grpc.Channel channel) {
    return new ModelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ModelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ModelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ModelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void publishLoad(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishLoadMethod(), responseObserver);
    }

    /**
     */
    public void publishBind(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishBindMethod(), responseObserver);
    }

    /**
     */
    public void publishOnline(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishOnlineMethod(), responseObserver);
    }

    /**
     */
    public void queryModel(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryModelMethod(), responseObserver);
    }

    /**
     */
    public void unload(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnloadMethod(), responseObserver);
    }

    /**
     */
    public void unbind(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnbindMethod(), responseObserver);
    }

    /**
     */
    public void fetchModel(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchModelMethod(), responseObserver);
    }

    /**
     */
    public void modelTransfer(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModelTransferMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishLoadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>(
                  this, METHODID_PUBLISH_LOAD)))
          .addMethod(
            getPublishBindMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>(
                  this, METHODID_PUBLISH_BIND)))
          .addMethod(
            getPublishOnlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>(
                  this, METHODID_PUBLISH_ONLINE)))
          .addMethod(
            getQueryModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse>(
                  this, METHODID_QUERY_MODEL)))
          .addMethod(
            getUnloadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse>(
                  this, METHODID_UNLOAD)))
          .addMethod(
            getUnbindMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse>(
                  this, METHODID_UNBIND)))
          .addMethod(
            getFetchModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse>(
                  this, METHODID_FETCH_MODEL)))
          .addMethod(
            getModelTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest,
                com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse>(
                  this, METHODID_MODEL_TRANSFER)))
          .build();
    }
  }

  /**
   */
  public static final class ModelServiceStub extends io.grpc.stub.AbstractStub<ModelServiceStub> {
    private ModelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModelServiceStub(channel, callOptions);
    }

    /**
     */
    public void publishLoad(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishLoadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publishBind(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishBindMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publishOnline(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryModel(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unload(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unbind(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnbindMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchModel(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modelTransfer(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModelTransferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ModelServiceBlockingStub extends io.grpc.stub.AbstractStub<ModelServiceBlockingStub> {
    private ModelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse publishLoad(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublishLoadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse publishBind(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublishBindMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse publishOnline(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublishOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse queryModel(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse unload(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnloadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse unbind(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnbindMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse fetchModel(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse modelTransfer(com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest request) {
      return blockingUnaryCall(
          getChannel(), getModelTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ModelServiceFutureStub extends io.grpc.stub.AbstractStub<ModelServiceFutureStub> {
    private ModelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> publishLoad(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishLoadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> publishBind(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishBindMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse> publishOnline(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishOnlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse> queryModel(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse> unload(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnloadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse> unbind(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnbindMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse> fetchModel(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse> modelTransfer(
        com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModelTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH_LOAD = 0;
  private static final int METHODID_PUBLISH_BIND = 1;
  private static final int METHODID_PUBLISH_ONLINE = 2;
  private static final int METHODID_QUERY_MODEL = 3;
  private static final int METHODID_UNLOAD = 4;
  private static final int METHODID_UNBIND = 5;
  private static final int METHODID_FETCH_MODEL = 6;
  private static final int METHODID_MODEL_TRANSFER = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ModelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH_LOAD:
          serviceImpl.publishLoad((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_BIND:
          serviceImpl.publishBind((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_ONLINE:
          serviceImpl.publishOnline((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.PublishResponse>) responseObserver);
          break;
        case METHODID_QUERY_MODEL:
          serviceImpl.queryModel((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.QueryModelResponse>) responseObserver);
          break;
        case METHODID_UNLOAD:
          serviceImpl.unload((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnloadResponse>) responseObserver);
          break;
        case METHODID_UNBIND:
          serviceImpl.unbind((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.UnbindResponse>) responseObserver);
          break;
        case METHODID_FETCH_MODEL:
          serviceImpl.fetchModel((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.FetchModelResponse>) responseObserver);
          break;
        case METHODID_MODEL_TRANSFER:
          serviceImpl.modelTransfer((com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.ModelTransferResponse>) responseObserver);
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

  private static abstract class ModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.webank.ai.fate.api.mlmodel.manager.ModelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModelService");
    }
  }

  private static final class ModelServiceFileDescriptorSupplier
      extends ModelServiceBaseDescriptorSupplier {
    ModelServiceFileDescriptorSupplier() {}
  }

  private static final class ModelServiceMethodDescriptorSupplier
      extends ModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ModelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ModelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModelServiceFileDescriptorSupplier())
              .addMethod(getPublishLoadMethod())
              .addMethod(getPublishBindMethod())
              .addMethod(getPublishOnlineMethod())
              .addMethod(getQueryModelMethod())
              .addMethod(getUnloadMethod())
              .addMethod(getUnbindMethod())
              .addMethod(getFetchModelMethod())
              .addMethod(getModelTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
