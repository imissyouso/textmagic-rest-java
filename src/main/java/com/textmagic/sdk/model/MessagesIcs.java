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
import com.textmagic.sdk.model.MessageSession;
import com.textmagic.sdk.model.MessagesIcsParameters;
import com.textmagic.sdk.model.MessagesIcsTextParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * MessagesIcs
 */

public class MessagesIcs {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("nextSend")
  private OffsetDateTime nextSend = null;

  @SerializedName("rrule")
  private String rrule = null;

  @SerializedName("session")
  private MessageSession session = null;

  @SerializedName("lastSent")
  private OffsetDateTime lastSent = null;

  @SerializedName("contactName")
  private String contactName = null;

  @SerializedName("parameters")
  private MessagesIcsParameters parameters = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("textParameters")
  private MessagesIcsTextParameters textParameters = null;

  @SerializedName("firstOccurrence")
  private OffsetDateTime firstOccurrence = null;

  @SerializedName("lastOccurrence")
  private OffsetDateTime lastOccurrence = null;

  @SerializedName("recipientsCount")
  private Integer recipientsCount = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("completed")
  private Boolean completed = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  public MessagesIcs id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessagesIcs nextSend(OffsetDateTime nextSend) {
    this.nextSend = nextSend;
    return this;
  }

   /**
   * Get nextSend
   * @return nextSend
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getNextSend() {
    return nextSend;
  }

  public void setNextSend(OffsetDateTime nextSend) {
    this.nextSend = nextSend;
  }

  public MessagesIcs rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

   /**
   * Get rrule
   * @return rrule
  **/
  @ApiModelProperty(example = "FREQ=YEARLY;BYMONTH=1;BYMONTHDAY=1;COUNT=1", required = true, value = "")
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public MessagesIcs session(MessageSession session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @ApiModelProperty(required = true, value = "")
  public MessageSession getSession() {
    return session;
  }

  public void setSession(MessageSession session) {
    this.session = session;
  }

  public MessagesIcs lastSent(OffsetDateTime lastSent) {
    this.lastSent = lastSent;
    return this;
  }

   /**
   * Get lastSent
   * @return lastSent
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastSent() {
    return lastSent;
  }

  public void setLastSent(OffsetDateTime lastSent) {
    this.lastSent = lastSent;
  }

  public MessagesIcs contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(example = "Test contact name", required = true, value = "")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public MessagesIcs parameters(MessagesIcsParameters parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "")
  public MessagesIcsParameters getParameters() {
    return parameters;
  }

  public void setParameters(MessagesIcsParameters parameters) {
    this.parameters = parameters;
  }

  public MessagesIcs type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "once", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MessagesIcs summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(example = "once", required = true, value = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public MessagesIcs textParameters(MessagesIcsTextParameters textParameters) {
    this.textParameters = textParameters;
    return this;
  }

   /**
   * Get textParameters
   * @return textParameters
  **/
  @ApiModelProperty(required = true, value = "")
  public MessagesIcsTextParameters getTextParameters() {
    return textParameters;
  }

  public void setTextParameters(MessagesIcsTextParameters textParameters) {
    this.textParameters = textParameters;
  }

  public MessagesIcs firstOccurrence(OffsetDateTime firstOccurrence) {
    this.firstOccurrence = firstOccurrence;
    return this;
  }

   /**
   * Get firstOccurrence
   * @return firstOccurrence
  **/
  @ApiModelProperty(example = "2019-08-13T05:48:37.486Z", required = true, value = "")
  public OffsetDateTime getFirstOccurrence() {
    return firstOccurrence;
  }

  public void setFirstOccurrence(OffsetDateTime firstOccurrence) {
    this.firstOccurrence = firstOccurrence;
  }

  public MessagesIcs lastOccurrence(OffsetDateTime lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
    return this;
  }

   /**
   * Get lastOccurrence
   * @return lastOccurrence
  **/
  @ApiModelProperty(example = "2019-09-13T05:48:37.486Z", required = true, value = "")
  public OffsetDateTime getLastOccurrence() {
    return lastOccurrence;
  }

  public void setLastOccurrence(OffsetDateTime lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
  }

  public MessagesIcs recipientsCount(Integer recipientsCount) {
    this.recipientsCount = recipientsCount;
    return this;
  }

   /**
   * Get recipientsCount
   * @return recipientsCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "")
  public Integer getRecipientsCount() {
    return recipientsCount;
  }

  public void setRecipientsCount(Integer recipientsCount) {
    this.recipientsCount = recipientsCount;
  }

  public MessagesIcs timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "Europe/Tallinn", required = true, value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public MessagesIcs completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean isCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public MessagesIcs avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(example = "avatars/dummy_avatar.png", required = true, value = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public MessagesIcs createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesIcs messagesIcs = (MessagesIcs) o;
    return Objects.equals(this.id, messagesIcs.id) &&
        Objects.equals(this.nextSend, messagesIcs.nextSend) &&
        Objects.equals(this.rrule, messagesIcs.rrule) &&
        Objects.equals(this.session, messagesIcs.session) &&
        Objects.equals(this.lastSent, messagesIcs.lastSent) &&
        Objects.equals(this.contactName, messagesIcs.contactName) &&
        Objects.equals(this.parameters, messagesIcs.parameters) &&
        Objects.equals(this.type, messagesIcs.type) &&
        Objects.equals(this.summary, messagesIcs.summary) &&
        Objects.equals(this.textParameters, messagesIcs.textParameters) &&
        Objects.equals(this.firstOccurrence, messagesIcs.firstOccurrence) &&
        Objects.equals(this.lastOccurrence, messagesIcs.lastOccurrence) &&
        Objects.equals(this.recipientsCount, messagesIcs.recipientsCount) &&
        Objects.equals(this.timezone, messagesIcs.timezone) &&
        Objects.equals(this.completed, messagesIcs.completed) &&
        Objects.equals(this.avatar, messagesIcs.avatar) &&
        Objects.equals(this.createdAt, messagesIcs.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nextSend, rrule, session, lastSent, contactName, parameters, type, summary, textParameters, firstOccurrence, lastOccurrence, recipientsCount, timezone, completed, avatar, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesIcs {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextSend: ").append(toIndentedString(nextSend)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    lastSent: ").append(toIndentedString(lastSent)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    textParameters: ").append(toIndentedString(textParameters)).append("\n");
    sb.append("    firstOccurrence: ").append(toIndentedString(firstOccurrence)).append("\n");
    sb.append("    lastOccurrence: ").append(toIndentedString(lastOccurrence)).append("\n");
    sb.append("    recipientsCount: ").append(toIndentedString(recipientsCount)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

