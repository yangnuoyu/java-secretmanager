/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/secrets/v1beta1/service.proto

package com.google.cloud.secrets.v1beta1;

public final class SecretsProto {
  private SecretsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_ListSecretsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_ListSecretsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_CreateSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_CreateSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_AddSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_AddSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_GetSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_GetSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_DeleteSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_DeleteSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_DisableSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_DisableSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_EnableSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_EnableSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secrets_v1beta1_DestroySecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secrets_v1beta1_DestroySecretVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/secrets/v1beta1/service.p"
          + "roto\022\034google.cloud.secrets.v1beta1\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032,google/cl"
          + "oud/secrets/v1beta1/resources.proto\032\036goo"
          + "gle/iam/v1/iam_policy.proto\032\032google/iam/"
          + "v1/policy.proto\032\033google/protobuf/empty.p"
          + "roto\032 google/protobuf/field_mask.proto\"\212"
          + "\001\n\022ListSecretsRequest\022C\n\006parent\030\001 \001(\tB3\340"
          + "A\002\372A-\n+cloudresourcemanager.googleapis.c"
          + "om/Project\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npa"
          + "ge_token\030\003 \001(\tB\003\340A\001\"y\n\023ListSecretsRespon"
          + "se\0225\n\007secrets\030\001 \003(\0132$.google.cloud.secre"
          + "ts.v1beta1.Secret\022\027\n\017next_page_token\030\002 \001"
          + "(\t\022\022\n\ntotal_size\030\003 \001(\005\"\250\001\n\023CreateSecretR"
          + "equest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudres"
          + "ourcemanager.googleapis.com/Project\022\026\n\ts"
          + "ecret_id\030\002 \001(\tB\003\340A\002\0224\n\006secret\030\003 \001(\0132$.go"
          + "ogle.cloud.secrets.v1beta1.Secret\"\231\001\n\027Ad"
          + "dSecretVersionRequest\022;\n\006parent\030\001 \001(\tB+\340"
          + "A\002\372A%\n#secretmanager.googleapis.com/Secr"
          + "et\022A\n\007payload\030\002 \001(\0132+.google.cloud.secre"
          + "ts.v1beta1.SecretPayloadB\003\340A\002\"M\n\020GetSecr"
          + "etRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#secretm"
          + "anager.googleapis.com/Secret\"\211\001\n\031ListSec"
          + "retVersionsRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372"
          + "A%\n#secretmanager.googleapis.com/Secret\022"
          + "\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 "
          + "\001(\tB\003\340A\001\"\210\001\n\032ListSecretVersionsResponse\022"
          + "=\n\010versions\030\001 \003(\0132+.google.cloud.secrets"
          + ".v1beta1.SecretVersion\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\005\"[\n\027GetSecret"
          + "VersionRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*se"
          + "cretmanager.googleapis.com/SecretVersion"
          + "\"\206\001\n\023UpdateSecretRequest\0229\n\006secret\030\001 \001(\013"
          + "2$.google.cloud.secrets.v1beta1.SecretB\003"
          + "\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.protob"
          + "uf.FieldMaskB\003\340A\002\"^\n\032AccessSecretVersion"
          + "Request\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*secretman"
          + "ager.googleapis.com/SecretVersion\"\232\001\n\033Ac"
          + "cessSecretVersionResponse\022=\n\004name\030\001 \001(\tB"
          + "/\372A,\n*secretmanager.googleapis.com/Secre"
          + "tVersion\022<\n\007payload\030\002 \001(\0132+.google.cloud"
          + ".secrets.v1beta1.SecretPayload\"P\n\023Delete"
          + "SecretRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#sec"
          + "retmanager.googleapis.com/Secret\"_\n\033Disa"
          + "bleSecretVersionRequest\022@\n\004name\030\001 \001(\tB2\340"
          + "A\002\372A,\n*secretmanager.googleapis.com/Secr"
          + "etVersion\"^\n\032EnableSecretVersionRequest\022"
          + "@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*secretmanager.goo"
          + "gleapis.com/SecretVersion\"_\n\033DestroySecr"
          + "etVersionRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*"
          + "secretmanager.googleapis.com/SecretVersi"
          + "on2\203\026\n\024SecretManagerService\022\251\001\n\013ListSecr"
          + "ets\0220.google.cloud.secrets.v1beta1.ListS"
          + "ecretsRequest\0321.google.cloud.secrets.v1b"
          + "eta1.ListSecretsResponse\"5\202\323\344\223\002&\022$/v1bet"
          + "a1/{parent=projects/*}/secrets\332A\006parent\022"
          + "\267\001\n\014CreateSecret\0221.google.cloud.secrets."
          + "v1beta1.CreateSecretRequest\032$.google.clo"
          + "ud.secrets.v1beta1.Secret\"N\202\323\344\223\002.\"$/v1be"
          + "ta1/{parent=projects/*}/secrets:\006secret\332"
          + "A\027parent,secret_id,secret\022\305\001\n\020AddSecretV"
          + "ersion\0225.google.cloud.secrets.v1beta1.Ad"
          + "dSecretVersionRequest\032+.google.cloud.sec"
          + "rets.v1beta1.SecretVersion\"M\202\323\344\223\0026\"1/v1b"
          + "eta1/{parent=projects/*/secrets/*}:addVe"
          + "rsion:\001*\332A\016parent,payload\022\226\001\n\tGetSecret\022"
          + "..google.cloud.secrets.v1beta1.GetSecret"
          + "Request\032$.google.cloud.secrets.v1beta1.S"
          + "ecret\"3\202\323\344\223\002&\022$/v1beta1/{name=projects/*"
          + "/secrets/*}\332A\004name\022\271\001\n\014UpdateSecret\0221.go"
          + "ogle.cloud.secrets.v1beta1.UpdateSecretR"
          + "equest\032$.google.cloud.secrets.v1beta1.Se"
          + "cret\"P\202\323\344\223\00252+/v1beta1/{secret.name=proj"
          + "ects/*/secrets/*}:\006secret\332A\022secret,updat"
          + "e_mask\022\216\001\n\014DeleteSecret\0221.google.cloud.s"
          + "ecrets.v1beta1.DeleteSecretRequest\032\026.goo"
          + "gle.protobuf.Empty\"3\202\323\344\223\002&*$/v1beta1/{na"
          + "me=projects/*/secrets/*}\332A\004name\022\311\001\n\022List"
          + "SecretVersions\0227.google.cloud.secrets.v1"
          + "beta1.ListSecretVersionsRequest\0328.google"
          + ".cloud.secrets.v1beta1.ListSecretVersion"
          + "sResponse\"@\202\323\344\223\0021\022//v1beta1/{parent=proj"
          + "ects/*/secrets/*}/versions\332A\006parent\022\266\001\n\020"
          + "GetSecretVersion\0225.google.cloud.secrets."
          + "v1beta1.GetSecretVersionRequest\032+.google"
          + ".cloud.secrets.v1beta1.SecretVersion\">\202\323"
          + "\344\223\0021\022//v1beta1/{name=projects/*/secrets/"
          + "*/versions/*}\332A\004name\022\321\001\n\023AccessSecretVer"
          + "sion\0228.google.cloud.secrets.v1beta1.Acce"
          + "ssSecretVersionRequest\0329.google.cloud.se"
          + "crets.v1beta1.AccessSecretVersionRespons"
          + "e\"E\202\323\344\223\0028\0226/v1beta1/{name=projects/*/sec"
          + "rets/*/versions/*}:access\332A\004name\022\311\001\n\024Dis"
          + "ableSecretVersion\0229.google.cloud.secrets"
          + ".v1beta1.DisableSecretVersionRequest\032+.g"
          + "oogle.cloud.secrets.v1beta1.SecretVersio"
          + "n\"I\202\323\344\223\002<\"7/v1beta1/{name=projects/*/sec"
          + "rets/*/versions/*}:disable:\001*\332A\004name\022\306\001\n"
          + "\023EnableSecretVersion\0228.google.cloud.secr"
          + "ets.v1beta1.EnableSecretVersionRequest\032+"
          + ".google.cloud.secrets.v1beta1.SecretVers"
          + "ion\"H\202\323\344\223\002;\"6/v1beta1/{name=projects/*/s"
          + "ecrets/*/versions/*}:enable:\001*\332A\004name\022\311\001"
          + "\n\024DestroySecretVersion\0229.google.cloud.se"
          + "crets.v1beta1.DestroySecretVersionReques"
          + "t\032+.google.cloud.secrets.v1beta1.SecretV"
          + "ersion\"I\202\323\344\223\002<\"7/v1beta1/{name=projects/"
          + "*/secrets/*/versions/*}:destroy:\001*\332A\004nam"
          + "e\022\213\001\n\014SetIamPolicy\022\".google.iam.v1.SetIa"
          + "mPolicyRequest\032\025.google.iam.v1.Policy\"@\202"
          + "\323\344\223\002:\"5/v1beta1/{resource=projects/*/sec"
          + "rets/*}:setIamPolicy:\001*\022\210\001\n\014GetIamPolicy"
          + "\022\".google.iam.v1.GetIamPolicyRequest\032\025.g"
          + "oogle.iam.v1.Policy\"=\202\323\344\223\0027\0225/v1beta1/{r"
          + "esource=projects/*/secrets/*}:getIamPoli"
          + "cy\022\261\001\n\022TestIamPermissions\022(.google.iam.v"
          + "1.TestIamPermissionsRequest\032).google.iam"
          + ".v1.TestIamPermissionsResponse\"F\202\323\344\223\002@\";"
          + "/v1beta1/{resource=projects/*/secrets/*}"
          + ":testIamPermissions:\001*\032P\312A\034secretmanager"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\276\001\n com.google."
          + "cloud.secrets.v1beta1B\014SecretsProtoP\001ZCg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/secrets/v1beta1;secrets\370\001\001\242\002\003GSM\252\002\034Go"
          + "ogle.Cloud.Secrets.V1Beta1\312\002\034Google\\Clou"
          + "d\\Secrets\\V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.secrets.v1beta1.ResourcesProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_secrets_v1beta1_ListSecretsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_secrets_v1beta1_ListSecretsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_ListSecretsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_ListSecretsResponse_descriptor,
            new java.lang.String[] {
              "Secrets", "NextPageToken", "TotalSize",
            });
    internal_static_google_cloud_secrets_v1beta1_CreateSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_secrets_v1beta1_CreateSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_CreateSecretRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SecretId", "Secret",
            });
    internal_static_google_cloud_secrets_v1beta1_AddSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_secrets_v1beta1_AddSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_AddSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Payload",
            });
    internal_static_google_cloud_secrets_v1beta1_GetSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_secrets_v1beta1_GetSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_GetSecretRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_ListSecretVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken", "TotalSize",
            });
    internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_UpdateSecretRequest_descriptor,
            new java.lang.String[] {
              "Secret", "UpdateMask",
            });
    internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_AccessSecretVersionResponse_descriptor,
            new java.lang.String[] {
              "Name", "Payload",
            });
    internal_static_google_cloud_secrets_v1beta1_DeleteSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_secrets_v1beta1_DeleteSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_DeleteSecretRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secrets_v1beta1_DisableSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_secrets_v1beta1_DisableSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_DisableSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secrets_v1beta1_EnableSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_secrets_v1beta1_EnableSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_EnableSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secrets_v1beta1_DestroySecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_secrets_v1beta1_DestroySecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secrets_v1beta1_DestroySecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.secrets.v1beta1.ResourcesProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
