/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/conversation/update_conversation_request.proto

package im.turms.common.model.dto.request.conversation;

/**
 * Protobuf type {@code im.turms.proto.UpdateConversationRequest}
 */
public final class UpdateConversationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateConversationRequest)
    UpdateConversationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateConversationRequest.newBuilder() to construct.
  private UpdateConversationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateConversationRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateConversationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateConversationRequest(
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
          case 10: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (targetId_ != null) {
              subBuilder = targetId_.toBuilder();
            }
            targetId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(targetId_);
              targetId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (groupId_ != null) {
              subBuilder = groupId_.toBuilder();
            }
            groupId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(groupId_);
              groupId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            readDate_ = input.readInt64();
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
    return im.turms.common.model.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.conversation.UpdateConversationRequest.class, im.turms.common.model.dto.request.conversation.UpdateConversationRequest.Builder.class);
  }

  public static final int TARGET_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value targetId_;
  /**
   * <code>.google.protobuf.Int64Value target_id = 1;</code>
   * @return Whether the targetId field is set.
   */
  @java.lang.Override
  public boolean hasTargetId() {
    return targetId_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value target_id = 1;</code>
   * @return The targetId.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTargetId() {
    return targetId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : targetId_;
  }
  /**
   * <code>.google.protobuf.Int64Value target_id = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getTargetIdOrBuilder() {
    return getTargetId();
  }

  public static final int GROUP_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value groupId_;
  /**
   * <code>.google.protobuf.Int64Value group_id = 2;</code>
   * @return Whether the groupId field is set.
   */
  @java.lang.Override
  public boolean hasGroupId() {
    return groupId_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value group_id = 2;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getGroupId() {
    return groupId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : groupId_;
  }
  /**
   * <code>.google.protobuf.Int64Value group_id = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder() {
    return getGroupId();
  }

  public static final int READ_DATE_FIELD_NUMBER = 3;
  private long readDate_;
  /**
   * <code>int64 read_date = 3;</code>
   * @return The readDate.
   */
  @java.lang.Override
  public long getReadDate() {
    return readDate_;
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
    if (targetId_ != null) {
      output.writeMessage(1, getTargetId());
    }
    if (groupId_ != null) {
      output.writeMessage(2, getGroupId());
    }
    if (readDate_ != 0L) {
      output.writeInt64(3, readDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTargetId());
    }
    if (groupId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGroupId());
    }
    if (readDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, readDate_);
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
    if (!(obj instanceof im.turms.common.model.dto.request.conversation.UpdateConversationRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.conversation.UpdateConversationRequest other = (im.turms.common.model.dto.request.conversation.UpdateConversationRequest) obj;

    if (hasTargetId() != other.hasTargetId()) return false;
    if (hasTargetId()) {
      if (!getTargetId()
          .equals(other.getTargetId())) return false;
    }
    if (hasGroupId() != other.hasGroupId()) return false;
    if (hasGroupId()) {
      if (!getGroupId()
          .equals(other.getGroupId())) return false;
    }
    if (getReadDate()
        != other.getReadDate()) return false;
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
    if (hasTargetId()) {
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId().hashCode();
    }
    if (hasGroupId()) {
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId().hashCode();
    }
    hash = (37 * hash) + READ_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReadDate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.dto.request.conversation.UpdateConversationRequest prototype) {
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
   * Protobuf type {@code im.turms.proto.UpdateConversationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateConversationRequest)
      im.turms.common.model.dto.request.conversation.UpdateConversationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.conversation.UpdateConversationRequest.class, im.turms.common.model.dto.request.conversation.UpdateConversationRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.conversation.UpdateConversationRequest.newBuilder()
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
      if (targetIdBuilder_ == null) {
        targetId_ = null;
      } else {
        targetId_ = null;
        targetIdBuilder_ = null;
      }
      if (groupIdBuilder_ == null) {
        groupId_ = null;
      } else {
        groupId_ = null;
        groupIdBuilder_ = null;
      }
      readDate_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.conversation.UpdateConversationRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.conversation.UpdateConversationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.conversation.UpdateConversationRequest build() {
      im.turms.common.model.dto.request.conversation.UpdateConversationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.conversation.UpdateConversationRequest buildPartial() {
      im.turms.common.model.dto.request.conversation.UpdateConversationRequest result = new im.turms.common.model.dto.request.conversation.UpdateConversationRequest(this);
      if (targetIdBuilder_ == null) {
        result.targetId_ = targetId_;
      } else {
        result.targetId_ = targetIdBuilder_.build();
      }
      if (groupIdBuilder_ == null) {
        result.groupId_ = groupId_;
      } else {
        result.groupId_ = groupIdBuilder_.build();
      }
      result.readDate_ = readDate_;
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
      if (other instanceof im.turms.common.model.dto.request.conversation.UpdateConversationRequest) {
        return mergeFrom((im.turms.common.model.dto.request.conversation.UpdateConversationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.conversation.UpdateConversationRequest other) {
      if (other == im.turms.common.model.dto.request.conversation.UpdateConversationRequest.getDefaultInstance()) return this;
      if (other.hasTargetId()) {
        mergeTargetId(other.getTargetId());
      }
      if (other.hasGroupId()) {
        mergeGroupId(other.getGroupId());
      }
      if (other.getReadDate() != 0L) {
        setReadDate(other.getReadDate());
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
      im.turms.common.model.dto.request.conversation.UpdateConversationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.conversation.UpdateConversationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value targetId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> targetIdBuilder_;
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     * @return Whether the targetId field is set.
     */
    public boolean hasTargetId() {
      return targetIdBuilder_ != null || targetId_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     * @return The targetId.
     */
    public com.google.protobuf.Int64Value getTargetId() {
      if (targetIdBuilder_ == null) {
        return targetId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : targetId_;
      } else {
        return targetIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    public Builder setTargetId(com.google.protobuf.Int64Value value) {
      if (targetIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetId_ = value;
        onChanged();
      } else {
        targetIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    public Builder setTargetId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (targetIdBuilder_ == null) {
        targetId_ = builderForValue.build();
        onChanged();
      } else {
        targetIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    public Builder mergeTargetId(com.google.protobuf.Int64Value value) {
      if (targetIdBuilder_ == null) {
        if (targetId_ != null) {
          targetId_ =
            com.google.protobuf.Int64Value.newBuilder(targetId_).mergeFrom(value).buildPartial();
        } else {
          targetId_ = value;
        }
        onChanged();
      } else {
        targetIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    public Builder clearTargetId() {
      if (targetIdBuilder_ == null) {
        targetId_ = null;
        onChanged();
      } else {
        targetId_ = null;
        targetIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getTargetIdBuilder() {

      onChanged();
      return getTargetIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getTargetIdOrBuilder() {
      if (targetIdBuilder_ != null) {
        return targetIdBuilder_.getMessageOrBuilder();
      } else {
        return targetId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : targetId_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value target_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>
        getTargetIdFieldBuilder() {
      if (targetIdBuilder_ == null) {
        targetIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getTargetId(),
                getParentForChildren(),
                isClean());
        targetId_ = null;
      }
      return targetIdBuilder_;
    }

    private com.google.protobuf.Int64Value groupId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> groupIdBuilder_;
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     * @return Whether the groupId field is set.
     */
    public boolean hasGroupId() {
      return groupIdBuilder_ != null || groupId_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     * @return The groupId.
     */
    public com.google.protobuf.Int64Value getGroupId() {
      if (groupIdBuilder_ == null) {
        return groupId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : groupId_;
      } else {
        return groupIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    public Builder setGroupId(com.google.protobuf.Int64Value value) {
      if (groupIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupId_ = value;
        onChanged();
      } else {
        groupIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    public Builder setGroupId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (groupIdBuilder_ == null) {
        groupId_ = builderForValue.build();
        onChanged();
      } else {
        groupIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    public Builder mergeGroupId(com.google.protobuf.Int64Value value) {
      if (groupIdBuilder_ == null) {
        if (groupId_ != null) {
          groupId_ =
            com.google.protobuf.Int64Value.newBuilder(groupId_).mergeFrom(value).buildPartial();
        } else {
          groupId_ = value;
        }
        onChanged();
      } else {
        groupIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    public Builder clearGroupId() {
      if (groupIdBuilder_ == null) {
        groupId_ = null;
        onChanged();
      } else {
        groupId_ = null;
        groupIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getGroupIdBuilder() {

      onChanged();
      return getGroupIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder() {
      if (groupIdBuilder_ != null) {
        return groupIdBuilder_.getMessageOrBuilder();
      } else {
        return groupId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : groupId_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>
        getGroupIdFieldBuilder() {
      if (groupIdBuilder_ == null) {
        groupIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getGroupId(),
                getParentForChildren(),
                isClean());
        groupId_ = null;
      }
      return groupIdBuilder_;
    }

    private long readDate_ ;
    /**
     * <code>int64 read_date = 3;</code>
     * @return The readDate.
     */
    @java.lang.Override
    public long getReadDate() {
      return readDate_;
    }
    /**
     * <code>int64 read_date = 3;</code>
     * @param value The readDate to set.
     * @return This builder for chaining.
     */
    public Builder setReadDate(long value) {

      readDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 read_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReadDate() {

      readDate_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateConversationRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateConversationRequest)
  private static final im.turms.common.model.dto.request.conversation.UpdateConversationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.conversation.UpdateConversationRequest();
  }

  public static im.turms.common.model.dto.request.conversation.UpdateConversationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConversationRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateConversationRequest>() {
    @java.lang.Override
    public UpdateConversationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateConversationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateConversationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConversationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.conversation.UpdateConversationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
