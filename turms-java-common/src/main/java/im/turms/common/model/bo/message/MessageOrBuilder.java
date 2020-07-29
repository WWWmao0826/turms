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
// source: model/message/message.proto

package im.turms.common.model.bo.message;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value delivery_date = 2;</code>
   * @return Whether the deliveryDate field is set.
   */
  boolean hasDeliveryDate();
  /**
   * <code>.google.protobuf.Int64Value delivery_date = 2;</code>
   * @return The deliveryDate.
   */
  com.google.protobuf.Int64Value getDeliveryDate();
  /**
   * <code>.google.protobuf.Int64Value delivery_date = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeliveryDateOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value deletion_date = 3;</code>
   * @return Whether the deletionDate field is set.
   */
  boolean hasDeletionDate();
  /**
   * <code>.google.protobuf.Int64Value deletion_date = 3;</code>
   * @return The deletionDate.
   */
  com.google.protobuf.Int64Value getDeletionDate();
  /**
   * <code>.google.protobuf.Int64Value deletion_date = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeletionDateOrBuilder();

  /**
   * <code>.google.protobuf.StringValue text = 4;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>.google.protobuf.StringValue text = 4;</code>
   * @return The text.
   */
  com.google.protobuf.StringValue getText();
  /**
   * <code>.google.protobuf.StringValue text = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value sender_id = 5;</code>
   * @return Whether the senderId field is set.
   */
  boolean hasSenderId();
  /**
   * <code>.google.protobuf.Int64Value sender_id = 5;</code>
   * @return The senderId.
   */
  com.google.protobuf.Int64Value getSenderId();
  /**
   * <code>.google.protobuf.Int64Value sender_id = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSenderIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value group_id = 6;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <code>.google.protobuf.Int64Value group_id = 6;</code>
   * @return The groupId.
   */
  com.google.protobuf.Int64Value getGroupId();
  /**
   * <code>.google.protobuf.Int64Value group_id = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue is_system_message = 7;</code>
   * @return Whether the isSystemMessage field is set.
   */
  boolean hasIsSystemMessage();
  /**
   * <code>.google.protobuf.BoolValue is_system_message = 7;</code>
   * @return The isSystemMessage.
   */
  com.google.protobuf.BoolValue getIsSystemMessage();
  /**
   * <code>.google.protobuf.BoolValue is_system_message = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsSystemMessageOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value recipient_id = 8;</code>
   * @return Whether the recipientId field is set.
   */
  boolean hasRecipientId();
  /**
   * <code>.google.protobuf.Int64Value recipient_id = 8;</code>
   * @return The recipientId.
   */
  com.google.protobuf.Int64Value getRecipientId();
  /**
   * <code>.google.protobuf.Int64Value recipient_id = 8;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecipientIdOrBuilder();

  /**
   * <code>repeated bytes records = 9;</code>
   * @return A list containing the records.
   */
  java.util.List<com.google.protobuf.ByteString> getRecordsList();
  /**
   * <code>repeated bytes records = 9;</code>
   * @return The count of records.
   */
  int getRecordsCount();
  /**
   * <code>repeated bytes records = 9;</code>
   * @param index The index of the element to return.
   * @return The records at the given index.
   */
  com.google.protobuf.ByteString getRecords(int index);
}
