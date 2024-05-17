// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFurnitureCustomSuiteData.proto

package emu.grasscutter.net.proto;

public final class HomeFurnitureCustomSuiteDataOuterClass {
  private HomeFurnitureCustomSuiteDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFurnitureCustomSuiteDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFurnitureCustomSuiteData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 guid = 9;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>repeated int32 included_furniture_index_list = 10;</code>
     * @return A list containing the includedFurnitureIndexList.
     */
    java.util.List<java.lang.Integer> getIncludedFurnitureIndexListList();
    /**
     * <code>repeated int32 included_furniture_index_list = 10;</code>
     * @return The count of includedFurnitureIndexList.
     */
    int getIncludedFurnitureIndexListCount();
    /**
     * <code>repeated int32 included_furniture_index_list = 10;</code>
     * @param index The index of the element to return.
     * @return The includedFurnitureIndexList at the given index.
     */
    int getIncludedFurnitureIndexList(int index);

    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return Whether the spawnPos field is set.
     */
    boolean hasSpawnPos();
    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return The spawnPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos();
    /**
     * <code>.Vector spawn_pos = 11;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();
  }
  /**
   * <pre>
   *obf: ECIIKJIKNFC
   * </pre>
   *
   * Protobuf type {@code HomeFurnitureCustomSuiteData}
   */
  public static final class HomeFurnitureCustomSuiteData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFurnitureCustomSuiteData)
      HomeFurnitureCustomSuiteDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFurnitureCustomSuiteData.newBuilder() to construct.
    private HomeFurnitureCustomSuiteData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFurnitureCustomSuiteData() {
      includedFurnitureIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFurnitureCustomSuiteData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeFurnitureCustomSuiteData(
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
            case 72: {

              guid_ = input.readUInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                includedFurnitureIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              includedFurnitureIndexList_.addInt(input.readInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                includedFurnitureIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                includedFurnitureIndexList_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnPos_ != null) {
                subBuilder = spawnPos_.toBuilder();
              }
              spawnPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnPos_);
                spawnPos_ = subBuilder.buildPartial();
              }

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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          includedFurnitureIndexList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.internal_static_HomeFurnitureCustomSuiteData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.internal_static_HomeFurnitureCustomSuiteData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.class, emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.Builder.class);
    }

    public static final int GUID_FIELD_NUMBER = 9;
    private int guid_;
    /**
     * <code>uint32 guid = 9;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int INCLUDED_FURNITURE_INDEX_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList includedFurnitureIndexList_;
    /**
     * <code>repeated int32 included_furniture_index_list = 10;</code>
     * @return A list containing the includedFurnitureIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getIncludedFurnitureIndexListList() {
      return includedFurnitureIndexList_;
    }
    /**
     * <code>repeated int32 included_furniture_index_list = 10;</code>
     * @return The count of includedFurnitureIndexList.
     */
    public int getIncludedFurnitureIndexListCount() {
      return includedFurnitureIndexList_.size();
    }
    /**
     * <code>repeated int32 included_furniture_index_list = 10;</code>
     * @param index The index of the element to return.
     * @return The includedFurnitureIndexList at the given index.
     */
    public int getIncludedFurnitureIndexList(int index) {
      return includedFurnitureIndexList_.getInt(index);
    }
    private int includedFurnitureIndexListMemoizedSerializedSize = -1;

    public static final int SPAWN_POS_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector spawnPos_;
    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return Whether the spawnPos field is set.
     */
    @java.lang.Override
    public boolean hasSpawnPos() {
      return spawnPos_ != null;
    }
    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return The spawnPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos() {
      return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
    }
    /**
     * <code>.Vector spawn_pos = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
      return getSpawnPos();
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
      getSerializedSize();
      if (guid_ != 0) {
        output.writeUInt32(9, guid_);
      }
      if (getIncludedFurnitureIndexListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(includedFurnitureIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < includedFurnitureIndexList_.size(); i++) {
        output.writeInt32NoTag(includedFurnitureIndexList_.getInt(i));
      }
      if (spawnPos_ != null) {
        output.writeMessage(11, getSpawnPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, guid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < includedFurnitureIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(includedFurnitureIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getIncludedFurnitureIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        includedFurnitureIndexListMemoizedSerializedSize = dataSize;
      }
      if (spawnPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getSpawnPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData other = (emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData) obj;

      if (getGuid()
          != other.getGuid()) return false;
      if (!getIncludedFurnitureIndexListList()
          .equals(other.getIncludedFurnitureIndexListList())) return false;
      if (hasSpawnPos() != other.hasSpawnPos()) return false;
      if (hasSpawnPos()) {
        if (!getSpawnPos()
            .equals(other.getSpawnPos())) return false;
      }
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
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      if (getIncludedFurnitureIndexListCount() > 0) {
        hash = (37 * hash) + INCLUDED_FURNITURE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getIncludedFurnitureIndexListList().hashCode();
      }
      if (hasSpawnPos()) {
        hash = (37 * hash) + SPAWN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData prototype) {
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
     *obf: ECIIKJIKNFC
     * </pre>
     *
     * Protobuf type {@code HomeFurnitureCustomSuiteData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFurnitureCustomSuiteData)
        emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.internal_static_HomeFurnitureCustomSuiteData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.internal_static_HomeFurnitureCustomSuiteData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.class, emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.newBuilder()
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
        guid_ = 0;

        includedFurnitureIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.internal_static_HomeFurnitureCustomSuiteData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData build() {
        emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData buildPartial() {
        emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData result = new emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData(this);
        int from_bitField0_ = bitField0_;
        result.guid_ = guid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          includedFurnitureIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.includedFurnitureIndexList_ = includedFurnitureIndexList_;
        if (spawnPosBuilder_ == null) {
          result.spawnPos_ = spawnPos_;
        } else {
          result.spawnPos_ = spawnPosBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData) {
          return mergeFrom((emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData other) {
        if (other == emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData.getDefaultInstance()) return this;
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (!other.includedFurnitureIndexList_.isEmpty()) {
          if (includedFurnitureIndexList_.isEmpty()) {
            includedFurnitureIndexList_ = other.includedFurnitureIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIncludedFurnitureIndexListIsMutable();
            includedFurnitureIndexList_.addAll(other.includedFurnitureIndexList_);
          }
          onChanged();
        }
        if (other.hasSpawnPos()) {
          mergeSpawnPos(other.getSpawnPos());
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
        emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int guid_ ;
      /**
       * <code>uint32 guid = 9;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 9;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList includedFurnitureIndexList_ = emptyIntList();
      private void ensureIncludedFurnitureIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          includedFurnitureIndexList_ = mutableCopy(includedFurnitureIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @return A list containing the includedFurnitureIndexList.
       */
      public java.util.List<java.lang.Integer>
          getIncludedFurnitureIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(includedFurnitureIndexList_) : includedFurnitureIndexList_;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @return The count of includedFurnitureIndexList.
       */
      public int getIncludedFurnitureIndexListCount() {
        return includedFurnitureIndexList_.size();
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @param index The index of the element to return.
       * @return The includedFurnitureIndexList at the given index.
       */
      public int getIncludedFurnitureIndexList(int index) {
        return includedFurnitureIndexList_.getInt(index);
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The includedFurnitureIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setIncludedFurnitureIndexList(
          int index, int value) {
        ensureIncludedFurnitureIndexListIsMutable();
        includedFurnitureIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @param value The includedFurnitureIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addIncludedFurnitureIndexList(int value) {
        ensureIncludedFurnitureIndexListIsMutable();
        includedFurnitureIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @param values The includedFurnitureIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllIncludedFurnitureIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureIncludedFurnitureIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, includedFurnitureIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIncludedFurnitureIndexList() {
        includedFurnitureIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector spawnPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
      /**
       * <code>.Vector spawn_pos = 11;</code>
       * @return Whether the spawnPos field is set.
       */
      public boolean hasSpawnPos() {
        return spawnPosBuilder_ != null || spawnPos_ != null;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       * @return The spawnPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos() {
        if (spawnPosBuilder_ == null) {
          return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        } else {
          return spawnPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder setSpawnPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnPos_ = value;
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder setSpawnPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = builderForValue.build();
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder mergeSpawnPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (spawnPos_ != null) {
            spawnPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(spawnPos_).mergeFrom(value).buildPartial();
          } else {
            spawnPos_ = value;
          }
          onChanged();
        } else {
          spawnPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder clearSpawnPos() {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
          onChanged();
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
        
        onChanged();
        return getSpawnPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
        if (spawnPosBuilder_ != null) {
          return spawnPosBuilder_.getMessageOrBuilder();
        } else {
          return spawnPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        }
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnPosFieldBuilder() {
        if (spawnPosBuilder_ == null) {
          spawnPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnPos(),
                  getParentForChildren(),
                  isClean());
          spawnPos_ = null;
        }
        return spawnPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeFurnitureCustomSuiteData)
    }

    // @@protoc_insertion_point(class_scope:HomeFurnitureCustomSuiteData)
    private static final emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData();
    }

    public static emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFurnitureCustomSuiteData>
        PARSER = new com.google.protobuf.AbstractParser<HomeFurnitureCustomSuiteData>() {
      @java.lang.Override
      public HomeFurnitureCustomSuiteData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeFurnitureCustomSuiteData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeFurnitureCustomSuiteData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFurnitureCustomSuiteData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureCustomSuiteDataOuterClass.HomeFurnitureCustomSuiteData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFurnitureCustomSuiteData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFurnitureCustomSuiteData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"HomeFurnitureCustomSuiteData.proto\032\014Ve" +
      "ctor.proto\"o\n\034HomeFurnitureCustomSuiteDa" +
      "ta\022\014\n\004guid\030\t \001(\r\022%\n\035included_furniture_i" +
      "ndex_list\030\n \003(\005\022\032\n\tspawn_pos\030\013 \001(\0132\007.Vec" +
      "torB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HomeFurnitureCustomSuiteData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFurnitureCustomSuiteData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFurnitureCustomSuiteData_descriptor,
        new java.lang.String[] { "Guid", "IncludedFurnitureIndexList", "SpawnPos", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
