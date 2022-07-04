package com.webank.ai.fate.api.networking.common;

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
    comments = "Source: common-service.proto")
public final class CommonServiceGrpc {

  private CommonServiceGrpc() {}

  public static final String SERVICE_NAME = "com.webank.ai.fate.api.networking.common.CommonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getQueryMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryMetrics",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getQueryMetricsMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getQueryMetricsMethod;
    if ((getQueryMetricsMethod = CommonServiceGrpc.getQueryMetricsMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getQueryMetricsMethod = CommonServiceGrpc.getQueryMetricsMethod) == null) {
          CommonServiceGrpc.getQueryMetricsMethod = getQueryMetricsMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("queryMetrics"))
              .build();
        }
      }
    }
    return getQueryMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateFlowRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateFlowRule",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateFlowRuleMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateFlowRuleMethod;
    if ((getUpdateFlowRuleMethod = CommonServiceGrpc.getUpdateFlowRuleMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getUpdateFlowRuleMethod = CommonServiceGrpc.getUpdateFlowRuleMethod) == null) {
          CommonServiceGrpc.getUpdateFlowRuleMethod = getUpdateFlowRuleMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateFlowRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("updateFlowRule"))
              .build();
        }
      }
    }
    return getUpdateFlowRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getListPropsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listProps",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getListPropsMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getListPropsMethod;
    if ((getListPropsMethod = CommonServiceGrpc.getListPropsMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getListPropsMethod = CommonServiceGrpc.getListPropsMethod) == null) {
          CommonServiceGrpc.getListPropsMethod = getListPropsMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listProps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("listProps"))
              .build();
        }
      }
    }
    return getListPropsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getQueryJvmInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryJvmInfo",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getQueryJvmInfoMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getQueryJvmInfoMethod;
    if ((getQueryJvmInfoMethod = CommonServiceGrpc.getQueryJvmInfoMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getQueryJvmInfoMethod = CommonServiceGrpc.getQueryJvmInfoMethod) == null) {
          CommonServiceGrpc.getQueryJvmInfoMethod = getQueryJvmInfoMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryJvmInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("queryJvmInfo"))
              .build();
        }
      }
    }
    return getQueryJvmInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateService",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateServiceMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateServiceMethod;
    if ((getUpdateServiceMethod = CommonServiceGrpc.getUpdateServiceMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getUpdateServiceMethod = CommonServiceGrpc.getUpdateServiceMethod) == null) {
          CommonServiceGrpc.getUpdateServiceMethod = getUpdateServiceMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("updateService"))
              .build();
        }
      }
    }
    return getUpdateServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateConfig",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateConfigMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getUpdateConfigMethod;
    if ((getUpdateConfigMethod = CommonServiceGrpc.getUpdateConfigMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getUpdateConfigMethod = CommonServiceGrpc.getUpdateConfigMethod) == null) {
          CommonServiceGrpc.getUpdateConfigMethod = getUpdateConfigMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("updateConfig"))
              .build();
        }
      }
    }
    return getUpdateConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getCheckHealthServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkHealthService",
      requestType = com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest.class,
      responseType = com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest,
      com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getCheckHealthServiceMethod() {
    io.grpc.MethodDescriptor<com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> getCheckHealthServiceMethod;
    if ((getCheckHealthServiceMethod = CommonServiceGrpc.getCheckHealthServiceMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getCheckHealthServiceMethod = CommonServiceGrpc.getCheckHealthServiceMethod) == null) {
          CommonServiceGrpc.getCheckHealthServiceMethod = getCheckHealthServiceMethod =
              io.grpc.MethodDescriptor.<com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest, com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkHealthService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("checkHealthService"))
              .build();
        }
      }
    }
    return getCheckHealthServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommonServiceStub newStub(io.grpc.Channel channel) {
    return new CommonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CommonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryMetrics(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMetricsMethod(), responseObserver);
    }

    /**
     */
    public void updateFlowRule(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFlowRuleMethod(), responseObserver);
    }

    /**
     */
    public void listProps(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPropsMethod(), responseObserver);
    }

    /**
     */
    public void queryJvmInfo(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryJvmInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateService(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServiceMethod(), responseObserver);
    }

    /**
     */
    public void updateConfig(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateConfigMethod(), responseObserver);
    }

    /**
     */
    public void checkHealthService(com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckHealthServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_QUERY_METRICS)))
          .addMethod(
            getUpdateFlowRuleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_UPDATE_FLOW_RULE)))
          .addMethod(
            getListPropsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_LIST_PROPS)))
          .addMethod(
            getQueryJvmInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_QUERY_JVM_INFO)))
          .addMethod(
            getUpdateServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_UPDATE_SERVICE)))
          .addMethod(
            getUpdateConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_UPDATE_CONFIG)))
          .addMethod(
            getCheckHealthServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest,
                com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>(
                  this, METHODID_CHECK_HEALTH_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class CommonServiceStub extends io.grpc.stub.AbstractStub<CommonServiceStub> {
    private CommonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryMetrics(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFlowRule(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFlowRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProps(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPropsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryJvmInfo(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryJvmInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateService(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConfig(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkHealthService(com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckHealthServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommonServiceBlockingStub extends io.grpc.stub.AbstractStub<CommonServiceBlockingStub> {
    private CommonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse queryMetrics(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse updateFlowRule(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFlowRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse listProps(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPropsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse queryJvmInfo(com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryJvmInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse updateService(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse updateConfig(com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse checkHealthService(com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckHealthServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommonServiceFutureStub extends io.grpc.stub.AbstractStub<CommonServiceFutureStub> {
    private CommonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> queryMetrics(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> updateFlowRule(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFlowRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> listProps(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPropsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> queryJvmInfo(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryJvmInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> updateService(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> updateConfig(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse> checkHealthService(
        com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckHealthServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_METRICS = 0;
  private static final int METHODID_UPDATE_FLOW_RULE = 1;
  private static final int METHODID_LIST_PROPS = 2;
  private static final int METHODID_QUERY_JVM_INFO = 3;
  private static final int METHODID_UPDATE_SERVICE = 4;
  private static final int METHODID_UPDATE_CONFIG = 5;
  private static final int METHODID_CHECK_HEALTH_SERVICE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_METRICS:
          serviceImpl.queryMetrics((com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FLOW_RULE:
          serviceImpl.updateFlowRule((com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateFlowRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
          break;
        case METHODID_LIST_PROPS:
          serviceImpl.listProps((com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryPropsRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
          break;
        case METHODID_QUERY_JVM_INFO:
          serviceImpl.queryJvmInfo((com.webank.ai.fate.api.networking.common.CommonServiceProto.QueryJvmInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE:
          serviceImpl.updateService((com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONFIG:
          serviceImpl.updateConfig((com.webank.ai.fate.api.networking.common.CommonServiceProto.UpdateConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
          break;
        case METHODID_CHECK_HEALTH_SERVICE:
          serviceImpl.checkHealthService((com.webank.ai.fate.api.networking.common.CommonServiceProto.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.webank.ai.fate.api.networking.common.CommonServiceProto.CommonResponse>) responseObserver);
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

  private static abstract class CommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.webank.ai.fate.api.networking.common.CommonServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommonService");
    }
  }

  private static final class CommonServiceFileDescriptorSupplier
      extends CommonServiceBaseDescriptorSupplier {
    CommonServiceFileDescriptorSupplier() {}
  }

  private static final class CommonServiceMethodDescriptorSupplier
      extends CommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommonServiceFileDescriptorSupplier())
              .addMethod(getQueryMetricsMethod())
              .addMethod(getUpdateFlowRuleMethod())
              .addMethod(getListPropsMethod())
              .addMethod(getQueryJvmInfoMethod())
              .addMethod(getUpdateServiceMethod())
              .addMethod(getUpdateConfigMethod())
              .addMethod(getCheckHealthServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
