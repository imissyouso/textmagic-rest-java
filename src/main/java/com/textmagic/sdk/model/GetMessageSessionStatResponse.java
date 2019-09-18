/*
 * TextMagic API Documentation
 * # Overview ## Introduction 123 <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
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
 * GetMessageSessionStatResponse
 */

public class GetMessageSessionStatResponse {
  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("delivered")
  private Integer delivered = null;

  @SerializedName("accepted")
  private Integer accepted = null;

  @SerializedName("rejected")
  private Integer rejected = null;

  @SerializedName("scheduled")
  private Integer scheduled = null;

  @SerializedName("all")
  private Integer all = null;

  @SerializedName("sent")
  private Integer sent = null;

  public GetMessageSessionStatResponse failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public GetMessageSessionStatResponse delivered(Integer delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Get delivered
   * @return delivered
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getDelivered() {
    return delivered;
  }

  public void setDelivered(Integer delivered) {
    this.delivered = delivered;
  }

  public GetMessageSessionStatResponse accepted(Integer accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Get accepted
   * @return accepted
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getAccepted() {
    return accepted;
  }

  public void setAccepted(Integer accepted) {
    this.accepted = accepted;
  }

  public GetMessageSessionStatResponse rejected(Integer rejected) {
    this.rejected = rejected;
    return this;
  }

   /**
   * Get rejected
   * @return rejected
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getRejected() {
    return rejected;
  }

  public void setRejected(Integer rejected) {
    this.rejected = rejected;
  }

  public GetMessageSessionStatResponse scheduled(Integer scheduled) {
    this.scheduled = scheduled;
    return this;
  }

   /**
   * Get scheduled
   * @return scheduled
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getScheduled() {
    return scheduled;
  }

  public void setScheduled(Integer scheduled) {
    this.scheduled = scheduled;
  }

  public GetMessageSessionStatResponse all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public GetMessageSessionStatResponse sent(Integer sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getSent() {
    return sent;
  }

  public void setSent(Integer sent) {
    this.sent = sent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessageSessionStatResponse getMessageSessionStatResponse = (GetMessageSessionStatResponse) o;
    return Objects.equals(this.failed, getMessageSessionStatResponse.failed) &&
        Objects.equals(this.delivered, getMessageSessionStatResponse.delivered) &&
        Objects.equals(this.accepted, getMessageSessionStatResponse.accepted) &&
        Objects.equals(this.rejected, getMessageSessionStatResponse.rejected) &&
        Objects.equals(this.scheduled, getMessageSessionStatResponse.scheduled) &&
        Objects.equals(this.all, getMessageSessionStatResponse.all) &&
        Objects.equals(this.sent, getMessageSessionStatResponse.sent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, delivered, accepted, rejected, scheduled, all, sent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessageSessionStatResponse {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
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

