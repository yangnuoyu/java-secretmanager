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

/**
 *
 *
 * <pre>
 * Request message for [SecretManagerService.GetSecretVersion][google.cloud.secrets.v1beta1.SecretManagerService.GetSecretVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secrets.v1beta1.GetSecretVersionRequest}
 */
public final class GetSecretVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.secrets.v1beta1.GetSecretVersionRequest)
    GetSecretVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetSecretVersionRequest.newBuilder() to construct.
  private GetSecretVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetSecretVersionRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetSecretVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetSecretVersionRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.secrets.v1beta1.SecretsProto
        .internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secrets.v1beta1.SecretsProto
        .internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.class,
            com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
   * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
   * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
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
    if (!(obj instanceof com.google.cloud.secrets.v1beta1.GetSecretVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.secrets.v1beta1.GetSecretVersionRequest other =
        (com.google.cloud.secrets.v1beta1.GetSecretVersionRequest) obj;

    if (!getName().equals(other.getName())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.secrets.v1beta1.GetSecretVersionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [SecretManagerService.GetSecretVersion][google.cloud.secrets.v1beta1.SecretManagerService.GetSecretVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secrets.v1beta1.GetSecretVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secrets.v1beta1.GetSecretVersionRequest)
      com.google.cloud.secrets.v1beta1.GetSecretVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.secrets.v1beta1.SecretsProto
          .internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secrets.v1beta1.SecretsProto
          .internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.class,
              com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.secrets.v1beta1.SecretsProto
          .internal_static_google_cloud_secrets_v1beta1_GetSecretVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secrets.v1beta1.GetSecretVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secrets.v1beta1.GetSecretVersionRequest build() {
      com.google.cloud.secrets.v1beta1.GetSecretVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secrets.v1beta1.GetSecretVersionRequest buildPartial() {
      com.google.cloud.secrets.v1beta1.GetSecretVersionRequest result =
          new com.google.cloud.secrets.v1beta1.GetSecretVersionRequest(this);
      result.name_ = name_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.secrets.v1beta1.GetSecretVersionRequest) {
        return mergeFrom((com.google.cloud.secrets.v1beta1.GetSecretVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secrets.v1beta1.GetSecretVersionRequest other) {
      if (other == com.google.cloud.secrets.v1beta1.GetSecretVersionRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      com.google.cloud.secrets.v1beta1.GetSecretVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.secrets.v1beta1.GetSecretVersionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
     * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
     * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
     * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
     * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/latest` is an alias to the `latest`
     * [SecretVersion][google.cloud.secrets.v1beta1.SecretVersion].
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.secrets.v1beta1.GetSecretVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secrets.v1beta1.GetSecretVersionRequest)
  private static final com.google.cloud.secrets.v1beta1.GetSecretVersionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.secrets.v1beta1.GetSecretVersionRequest();
  }

  public static com.google.cloud.secrets.v1beta1.GetSecretVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSecretVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetSecretVersionRequest>() {
        @java.lang.Override
        public GetSecretVersionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetSecretVersionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetSecretVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSecretVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secrets.v1beta1.GetSecretVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
