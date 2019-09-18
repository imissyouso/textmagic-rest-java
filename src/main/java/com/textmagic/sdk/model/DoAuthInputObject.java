/*
 * TextMagic API Documentation
 * # Overview ## Introduction <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
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

