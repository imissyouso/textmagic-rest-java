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
 * DoAuthInputObject
 */

public class DoAuthInputObject {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("appName")
  private String appName = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("pushServiceType")
  private String pushServiceType = null;

  @SerializedName("tfaCode")
  private String tfaCode = null;

  @SerializedName("tfaId")
  private String tfaId = null;

  public DoAuthInputObject username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Account username or email
   * @return username
  **/
  @ApiModelProperty(example = "test@test.com", required = true, value = "Account username or email")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DoAuthInputObject password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Account password
   * @return password
  **/
  @ApiModelProperty(example = "test", required = true, value = "Account password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DoAuthInputObject appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Application name
   * @return appName
  **/
  @ApiModelProperty(example = "My application", value = "Application name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public DoAuthInputObject appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Application version
   * @return appVersion
  **/
  @ApiModelProperty(example = "1.0.0 beta", value = "Application version")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public DoAuthInputObject deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device ID for push notification service
   * @return deviceId
  **/
  @ApiModelProperty(example = "03df25c845d460bcdad7802d2vf6fc1dfde97283bf75cc993eb6dca835ea2e2", value = "Device ID for push notification service")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DoAuthInputObject pushServiceType(String pushServiceType) {
    this.pushServiceType = pushServiceType;
    return this;
  }

   /**
   * required when deviceId provided. Push notification service type: a for Apple Push Notifications, g for Google Cloud Messaging
   * @return pushServiceType
  **/
  @ApiModelProperty(example = "a", value = "required when deviceId provided. Push notification service type: a for Apple Push Notifications, g for Google Cloud Messaging")
  public String getPushServiceType() {
    return pushServiceType;
  }

  public void setPushServiceType(String pushServiceType) {
    this.pushServiceType = pushServiceType;
  }

  public DoAuthInputObject tfaCode(String tfaCode) {
    this.tfaCode = tfaCode;
    return this;
  }

   /**
   * required when 2FA enabled on account. 2FA challenge response (SMS code or security question answer)
   * @return tfaCode
  **/
  @ApiModelProperty(example = "12345", value = "required when 2FA enabled on account. 2FA challenge response (SMS code or security question answer)")
  public String getTfaCode() {
    return tfaCode;
  }

  public void setTfaCode(String tfaCode) {
    this.tfaCode = tfaCode;
  }

  public DoAuthInputObject tfaId(String tfaId) {
    this.tfaId = tfaId;
    return this;
  }

   /**
   * required when 2FA enabled on account. 2FA challenge response (SMS code or security question answer)
   * @return tfaId
  **/
  @ApiModelProperty(example = "12345", value = "required when 2FA enabled on account. 2FA challenge response (SMS code or security question answer)")
  public String getTfaId() {
    return tfaId;
  }

  public void setTfaId(String tfaId) {
    this.tfaId = tfaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoAuthInputObject doAuthInputObject = (DoAuthInputObject) o;
    return Objects.equals(this.username, doAuthInputObject.username) &&
        Objects.equals(this.password, doAuthInputObject.password) &&
        Objects.equals(this.appName, doAuthInputObject.appName) &&
        Objects.equals(this.appVersion, doAuthInputObject.appVersion) &&
        Objects.equals(this.deviceId, doAuthInputObject.deviceId) &&
        Objects.equals(this.pushServiceType, doAuthInputObject.pushServiceType) &&
        Objects.equals(this.tfaCode, doAuthInputObject.tfaCode) &&
        Objects.equals(this.tfaId, doAuthInputObject.tfaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, appName, appVersion, deviceId, pushServiceType, tfaCode, tfaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoAuthInputObject {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    pushServiceType: ").append(toIndentedString(pushServiceType)).append("\n");
    sb.append("    tfaCode: ").append(toIndentedString(tfaCode)).append("\n");
    sb.append("    tfaId: ").append(toIndentedString(tfaId)).append("\n");
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

