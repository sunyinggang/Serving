// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: default-empty-fill.proto

package com.webank.ai.fate.core.mlmodel.buffer;

public final class DefaultEmptyFillProto {
  private DefaultEmptyFillProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DefaultEmptyFillMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string flag = 1;</code>
     */
    java.lang.String getFlag();
    /**
     * <code>string flag = 1;</code>
     */
    com.google.protobuf.ByteString
        getFlagBytes();
  }
  /**
   * Protobuf type {@code com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage}
   */
  public  static final class DefaultEmptyFillMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage)
      DefaultEmptyFillMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DefaultEmptyFillMessage.newBuilder() to construct.
    private DefaultEmptyFillMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DefaultEmptyFillMessage() {
      flag_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DefaultEmptyFillMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              flag_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.class, com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.Builder.class);
    }

    public static final int FLAG_FIELD_NUMBER = 1;
    private volatile java.lang.Object flag_;
    /**
     * <code>string flag = 1;</code>
     */
    public java.lang.String getFlag() {
      java.lang.Object ref = flag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flag_ = s;
        return s;
      }
    }
    /**
     * <code>string flag = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFlagBytes() {
      java.lang.Object ref = flag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getFlagBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flag_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFlagBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flag_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage)) {
        return super.equals(obj);
      }
      com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage other = (com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage) obj;

      boolean result = true;
      result = result && getFlag()
          .equals(other.getFlag());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FLAG_FIELD_NUMBER;
      hash = (53 * hash) + getFlag().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage)
        com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.class, com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.Builder.class);
      }

      // Construct using com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        flag_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_descriptor;
      }

      @java.lang.Override
      public com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage getDefaultInstanceForType() {
        return com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage build() {
        com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage buildPartial() {
        com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage result = new com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage(this);
        result.flag_ = flag_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage) {
          return mergeFrom((com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage other) {
        if (other == com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage.getDefaultInstance()) return this;
        if (!other.getFlag().isEmpty()) {
          flag_ = other.flag_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object flag_ = "";
      /**
       * <code>string flag = 1;</code>
       */
      public java.lang.String getFlag() {
        java.lang.Object ref = flag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          flag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string flag = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFlagBytes() {
        java.lang.Object ref = flag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          flag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string flag = 1;</code>
       */
      public Builder setFlag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        flag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string flag = 1;</code>
       */
      public Builder clearFlag() {
        
        flag_ = getDefaultInstance().getFlag();
        onChanged();
        return this;
      }
      /**
       * <code>string flag = 1;</code>
       */
      public Builder setFlagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        flag_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage)
    }

    // @@protoc_insertion_point(class_scope:com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillMessage)
    private static final com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage();
    }

    public static com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DefaultEmptyFillMessage>
        PARSER = new com.google.protobuf.AbstractParser<DefaultEmptyFillMessage>() {
      @java.lang.Override
      public DefaultEmptyFillMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DefaultEmptyFillMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DefaultEmptyFillMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DefaultEmptyFillMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.webank.ai.fate.core.mlmodel.buffer.DefaultEmptyFillProto.DefaultEmptyFillMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030default-empty-fill.proto\022&com.webank.a" +
      "i.fate.core.mlmodel.buffer\"\'\n\027DefaultEmp" +
      "tyFillMessage\022\014\n\004flag\030\001 \001(\tB\027B\025DefaultEm" +
      "ptyFillProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_webank_ai_fate_core_mlmodel_buffer_DefaultEmptyFillMessage_descriptor,
        new java.lang.String[] { "Flag", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
