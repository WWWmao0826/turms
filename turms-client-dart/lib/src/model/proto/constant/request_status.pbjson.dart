///
//  Generated code. Do not modify.
//  source: constant/request_status.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,unnecessary_const,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type,unnecessary_this,prefer_final_fields,deprecated_member_use_from_same_package

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use requestStatusDescriptor instead')
const RequestStatus$json = const {
  '1': 'RequestStatus',
  '2': const [
    const {'1': 'PENDING', '2': 0},
    const {'1': 'ACCEPTED', '2': 1},
    const {'1': 'ACCEPTED_WITHOUT_CONFIRM', '2': 2},
    const {'1': 'DECLINED', '2': 3},
    const {'1': 'IGNORED', '2': 4},
    const {'1': 'EXPIRED', '2': 5},
    const {'1': 'CANCELED', '2': 6},
  ],
};

/// Descriptor for `RequestStatus`. Decode as a `google.protobuf.EnumDescriptorProto`.
final $typed_data.Uint8List requestStatusDescriptor = $convert.base64Decode(
    'Cg1SZXF1ZXN0U3RhdHVzEgsKB1BFTkRJTkcQABIMCghBQ0NFUFRFRBABEhwKGEFDQ0VQVEVEX1dJVEhPVVRfQ09ORklSTRACEgwKCERFQ0xJTkVEEAMSCwoHSUdOT1JFRBAEEgsKB0VYUElSRUQQBRIMCghDQU5DRUxFRBAG');
