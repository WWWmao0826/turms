///
//  Generated code. Do not modify.
//  source: constant/response_action.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,unnecessary_const,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type,unnecessary_this,prefer_final_fields,deprecated_member_use_from_same_package

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use responseActionDescriptor instead')
const ResponseAction$json = const {
  '1': 'ResponseAction',
  '2': const [
    const {'1': 'ACCEPT', '2': 0},
    const {'1': 'DECLINE', '2': 1},
    const {'1': 'IGNORE', '2': 2},
  ],
};

/// Descriptor for `ResponseAction`. Decode as a `google.protobuf.EnumDescriptorProto`.
final $typed_data.Uint8List responseActionDescriptor = $convert.base64Decode(
    'Cg5SZXNwb25zZUFjdGlvbhIKCgZBQ0NFUFQQABILCgdERUNMSU5FEAESCgoGSUdOT1JFEAI=');
