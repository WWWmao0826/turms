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
// source: request/user/relationship/delete_relationship_request.proto

package im.turms.common.model.dto.request.user.relationship;

public interface DeleteRelationshipRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.DeleteRelationshipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 related_user_id = 1;</code>
   * @return The relatedUserId.
   */
  long getRelatedUserId();

  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   * @return Whether the groupIndex field is set.
   */
  boolean hasGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   * @return The groupIndex.
   */
  com.google.protobuf.Int32Value getGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getGroupIndexOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
   * @return Whether the targetGroupIndex field is set.
   */
  boolean hasTargetGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
   * @return The targetGroupIndex.
   */
  com.google.protobuf.Int32Value getTargetGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getTargetGroupIndexOrBuilder();
}
