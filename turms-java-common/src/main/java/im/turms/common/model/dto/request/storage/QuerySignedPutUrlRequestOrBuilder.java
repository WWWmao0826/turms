// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/storage/query_signed_put_url_request.proto

package im.turms.common.model.dto.request.storage;

public interface QuerySignedPutUrlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.QuerySignedPutUrlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.im.turms.proto.ContentType content_type = 1;</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <code>.im.turms.proto.ContentType content_type = 1;</code>
   * @return The contentType.
   */
  im.turms.common.constant.ContentType getContentType();

  /**
   * <code>.google.protobuf.StringValue key_str = 2;</code>
   * @return Whether the keyStr field is set.
   */
  boolean hasKeyStr();
  /**
   * <code>.google.protobuf.StringValue key_str = 2;</code>
   * @return The keyStr.
   */
  com.google.protobuf.StringValue getKeyStr();
  /**
   * <code>.google.protobuf.StringValue key_str = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeyStrOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value key_num = 3;</code>
   * @return Whether the keyNum field is set.
   */
  boolean hasKeyNum();
  /**
   * <code>.google.protobuf.Int64Value key_num = 3;</code>
   * @return The keyNum.
   */
  com.google.protobuf.Int64Value getKeyNum();
  /**
   * <code>.google.protobuf.Int64Value key_num = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getKeyNumOrBuilder();

  /**
   * <code>int64 content_length = 4;</code>
   * @return The contentLength.
   */
  long getContentLength();
}
