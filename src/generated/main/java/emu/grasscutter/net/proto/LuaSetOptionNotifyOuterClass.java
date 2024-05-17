// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuaSetOptionNotify.proto

package emu.grasscutter.net.proto;

public final class LuaSetOptionNotifyOuterClass {
  private LuaSetOptionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LuaSetOptionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LuaSetOptionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
     * @return The enum numeric value on the wire for optionType.
     */
    int getOptionTypeValue();
    /**
     * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
     * @return The optionType.
     */
    emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType getOptionType();

    /**
     * <code>string lua_set_param = 15;</code>
     * @return The luaSetParam.
     */
    java.lang.String getLuaSetParam();
    /**
     * <code>string lua_set_param = 15;</code>
     * @return The bytes for luaSetParam.
     */
    com.google.protobuf.ByteString
        getLuaSetParamBytes();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 850
   * </pre>
   *
   * Protobuf type {@code LuaSetOptionNotify}
   */
  public static final class LuaSetOptionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LuaSetOptionNotify)
      LuaSetOptionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LuaSetOptionNotify.newBuilder() to construct.
    private LuaSetOptionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LuaSetOptionNotify() {
      optionType_ = 0;
      luaSetParam_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LuaSetOptionNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LuaSetOptionNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 72: {
              int rawValue = input.readEnum();

              optionType_ = rawValue;
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              luaSetParam_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.internal_static_LuaSetOptionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.internal_static_LuaSetOptionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.class, emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code LuaSetOptionNotify.LuaOptionType}
     */
    public enum LuaOptionType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>LUA_OPTION_NONE = 0;</code>
       */
      LUA_OPTION_NONE(0),
      /**
       * <code>LUA_OPTION_PLAYER_INPUT = 1;</code>
       */
      LUA_OPTION_PLAYER_INPUT(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>LUA_OPTION_NONE = 0;</code>
       */
      public static final int LUA_OPTION_NONE_VALUE = 0;
      /**
       * <code>LUA_OPTION_PLAYER_INPUT = 1;</code>
       */
      public static final int LUA_OPTION_PLAYER_INPUT_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static LuaOptionType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static LuaOptionType forNumber(int value) {
        switch (value) {
          case 0: return LUA_OPTION_NONE;
          case 1: return LUA_OPTION_PLAYER_INPUT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LuaOptionType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LuaOptionType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LuaOptionType>() {
              public LuaOptionType findValueByNumber(int number) {
                return LuaOptionType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final LuaOptionType[] VALUES = values();

      public static LuaOptionType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private LuaOptionType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:LuaSetOptionNotify.LuaOptionType)
    }

    public static final int OPTION_TYPE_FIELD_NUMBER = 9;
    private int optionType_;
    /**
     * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
     * @return The enum numeric value on the wire for optionType.
     */
    @java.lang.Override public int getOptionTypeValue() {
      return optionType_;
    }
    /**
     * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
     * @return The optionType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType getOptionType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType result = emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType.valueOf(optionType_);
      return result == null ? emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType.UNRECOGNIZED : result;
    }

    public static final int LUA_SET_PARAM_FIELD_NUMBER = 15;
    private volatile java.lang.Object luaSetParam_;
    /**
     * <code>string lua_set_param = 15;</code>
     * @return The luaSetParam.
     */
    @java.lang.Override
    public java.lang.String getLuaSetParam() {
      java.lang.Object ref = luaSetParam_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        luaSetParam_ = s;
        return s;
      }
    }
    /**
     * <code>string lua_set_param = 15;</code>
     * @return The bytes for luaSetParam.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLuaSetParamBytes() {
      java.lang.Object ref = luaSetParam_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        luaSetParam_ = b;
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
      if (optionType_ != emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType.LUA_OPTION_NONE.getNumber()) {
        output.writeEnum(9, optionType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(luaSetParam_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, luaSetParam_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (optionType_ != emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType.LUA_OPTION_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, optionType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(luaSetParam_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, luaSetParam_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify other = (emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify) obj;

      if (optionType_ != other.optionType_) return false;
      if (!getLuaSetParam()
          .equals(other.getLuaSetParam())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OPTION_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + optionType_;
      hash = (37 * hash) + LUA_SET_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getLuaSetParam().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify prototype) {
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
     * <pre>
     * 4.6.0
     * CmdId: 850
     * </pre>
     *
     * Protobuf type {@code LuaSetOptionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LuaSetOptionNotify)
        emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.internal_static_LuaSetOptionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.internal_static_LuaSetOptionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.class, emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.newBuilder()
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
        optionType_ = 0;

        luaSetParam_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.internal_static_LuaSetOptionNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify build() {
        emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify buildPartial() {
        emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify result = new emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify(this);
        result.optionType_ = optionType_;
        result.luaSetParam_ = luaSetParam_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify) {
          return mergeFrom((emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify other) {
        if (other == emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.getDefaultInstance()) return this;
        if (other.optionType_ != 0) {
          setOptionTypeValue(other.getOptionTypeValue());
        }
        if (!other.getLuaSetParam().isEmpty()) {
          luaSetParam_ = other.luaSetParam_;
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
        emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int optionType_ = 0;
      /**
       * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
       * @return The enum numeric value on the wire for optionType.
       */
      @java.lang.Override public int getOptionTypeValue() {
        return optionType_;
      }
      /**
       * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
       * @param value The enum numeric value on the wire for optionType to set.
       * @return This builder for chaining.
       */
      public Builder setOptionTypeValue(int value) {
        
        optionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
       * @return The optionType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType getOptionType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType result = emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType.valueOf(optionType_);
        return result == null ? emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
       * @param value The optionType to set.
       * @return This builder for chaining.
       */
      public Builder setOptionType(emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify.LuaOptionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        optionType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.LuaSetOptionNotify.LuaOptionType option_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionType() {
        
        optionType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object luaSetParam_ = "";
      /**
       * <code>string lua_set_param = 15;</code>
       * @return The luaSetParam.
       */
      public java.lang.String getLuaSetParam() {
        java.lang.Object ref = luaSetParam_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          luaSetParam_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string lua_set_param = 15;</code>
       * @return The bytes for luaSetParam.
       */
      public com.google.protobuf.ByteString
          getLuaSetParamBytes() {
        java.lang.Object ref = luaSetParam_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          luaSetParam_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string lua_set_param = 15;</code>
       * @param value The luaSetParam to set.
       * @return This builder for chaining.
       */
      public Builder setLuaSetParam(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        luaSetParam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string lua_set_param = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLuaSetParam() {
        
        luaSetParam_ = getDefaultInstance().getLuaSetParam();
        onChanged();
        return this;
      }
      /**
       * <code>string lua_set_param = 15;</code>
       * @param value The bytes for luaSetParam to set.
       * @return This builder for chaining.
       */
      public Builder setLuaSetParamBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        luaSetParam_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LuaSetOptionNotify)
    }

    // @@protoc_insertion_point(class_scope:LuaSetOptionNotify)
    private static final emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify();
    }

    public static emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LuaSetOptionNotify>
        PARSER = new com.google.protobuf.AbstractParser<LuaSetOptionNotify>() {
      @java.lang.Override
      public LuaSetOptionNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LuaSetOptionNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LuaSetOptionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LuaSetOptionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LuaSetOptionNotifyOuterClass.LuaSetOptionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LuaSetOptionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LuaSetOptionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LuaSetOptionNotify.proto\"\246\001\n\022LuaSetOpt" +
      "ionNotify\0226\n\013option_type\030\t \001(\0162!.LuaSetO" +
      "ptionNotify.LuaOptionType\022\025\n\rlua_set_par" +
      "am\030\017 \001(\t\"A\n\rLuaOptionType\022\023\n\017LUA_OPTION_" +
      "NONE\020\000\022\033\n\027LUA_OPTION_PLAYER_INPUT\020\001B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LuaSetOptionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LuaSetOptionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LuaSetOptionNotify_descriptor,
        new java.lang.String[] { "OptionType", "LuaSetParam", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
