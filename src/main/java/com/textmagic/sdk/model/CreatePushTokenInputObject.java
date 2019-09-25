/*
 * TextMagic API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2
 * Contact: support@textmagi.biz
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.textmagic.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreatePushTokenInputObject
 */

public class CreatePushTokenInputObject {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("pushServiceType")
  private String pushServiceType = null;

  public CreatePushTokenInputObject deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device ID for push notification service
   * @return deviceId
  **/
  @ApiModelProperty(example = "123", required = true, value = "Device ID for push notification service")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public CreatePushTokenInputObject pushServiceType(String pushServiceType) {
    this.pushServiceType = pushServiceType;
    return this;
  }

   /**
   * Push notification service type: a for Apple Push Notifications, g for Google Cloud Messaging
   * @return pushServiceType
  **/
  @ApiModelProperty(example = "a", required = true, value = "Push notification service type: a for Apple Push Notifications, g for Google Cloud Messaging")
  public String getPushServiceType() {
    return pushServiceType;
  }

  public void setPushServiceType(String pushServiceType) {
    this.pushServiceType = pushServiceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePushTokenInputObject createPushTokenInputObject = (CreatePushTokenInputObject) o;
    return Objects.equals(this.deviceId, createPushTokenInputObject.deviceId) &&
        Objects.equals(this.pushServiceType, createPushTokenInputObject.pushServiceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, pushServiceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePushTokenInputObject {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    pushServiceType: ").append(toIndentedString(pushServiceType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

