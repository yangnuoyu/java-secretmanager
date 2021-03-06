/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_SecretVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_Automatic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/secretmanager/v1/resource"
          + "s.proto\022\035google.cloud.secretmanager.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\032\034google/api/annotations.prot"
          + "o\"\333\002\n\006Secret\022\021\n\004name\030\001 \001(\tB\003\340A\003\022G\n\013repli"
          + "cation\030\002 \001(\0132*.google.cloud.secretmanage"
          + "r.v1.ReplicationB\006\340A\005\340A\002\0224\n\013create_time\030"
          + "\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022A"
          + "\n\006labels\030\004 \003(\01321.google.cloud.secretmana"
          + "ger.v1.Secret.LabelsEntry\032-\n\013LabelsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:M\352AJ\n#s"
          + "ecretmanager.googleapis.com/Secret\022#proj"
          + "ects/{project}/secrets/{secret}\"\221\003\n\rSecr"
          + "etVersion\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\0225\n\014destroy_time\030\003 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\022F\n\005state\030\004 \001(\01622.googl"
          + "e.cloud.secretmanager.v1.SecretVersion.S"
          + "tateB\003\340A\003\"H\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002\022\r\n\tDESTROYE"
          + "D\020\003:n\352Ak\n*secretmanager.googleapis.com/S"
          + "ecretVersion\022=projects/{project}/secrets"
          + "/{secret}/versions/{secret_version}\"\310\002\n\013"
          + "Replication\022I\n\tautomatic\030\001 \001(\01324.google."
          + "cloud.secretmanager.v1.Replication.Autom"
          + "aticH\000\022N\n\014user_managed\030\002 \001(\01326.google.cl"
          + "oud.secretmanager.v1.Replication.UserMan"
          + "agedH\000\032\013\n\tAutomatic\032\201\001\n\013UserManaged\022U\n\010r"
          + "eplicas\030\001 \003(\0132>.google.cloud.secretmanag"
          + "er.v1.Replication.UserManaged.ReplicaB\003\340"
          + "A\002\032\033\n\007Replica\022\020\n\010location\030\001 \001(\tB\r\n\013repli"
          + "cation\"\035\n\rSecretPayload\022\014\n\004data\030\001 \001(\014B\355\001"
          + "\n!com.google.cloud.secretmanager.v1B\016Res"
          + "ourcesProtoP\001ZJgoogle.golang.org/genprot"
          + "o/googleapis/cloud/secretmanager/v1;secr"
          + "etmanager\370\001\001\242\002\003GSM\252\002\035Google.Cloud.Secret"
          + "Manager.V1\312\002\035Google\\Cloud\\SecretManager\\"
          + "V1\352\002 Google::Cloud::SecretManager::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_secretmanager_v1_Secret_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_Secret_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_descriptor,
            new java.lang.String[] {
              "Name", "Replication", "CreateTime", "Labels",
            });
    internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor =
        internal_static_google_cloud_secretmanager_v1_Secret_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_secretmanager_v1_SecretVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "DestroyTime", "State",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_secretmanager_v1_Replication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_descriptor,
            new java.lang.String[] {
              "Automatic", "UserManaged", "Replication",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_Replication_Automatic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor,
            new java.lang.String[] {
              "Replicas",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor,
            new java.lang.String[] {
              "Location",
            });
    internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor,
            new java.lang.String[] {
              "Data",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
