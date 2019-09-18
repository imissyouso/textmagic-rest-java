/*
 * TextMagic API Documentation
 * # Overview ## Introduction 22 <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
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
 * GetContactsAutocompleteResponse
 */

public class GetContactsAutocompleteResponse {
  @SerializedName("entityId")
  private Integer entityId = null;

  /**
   * 
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    LIST("list"),
    
    CONTACT("contact"),
    
    REPLY("reply");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntityTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("entityType")
  private EntityTypeEnum entityType = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("sharedBy")
  private String sharedBy = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("favorited")
  private Boolean favorited = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("qposition")
  private Integer qposition = null;

  @SerializedName("rposition")
  private Integer rposition = null;

  public GetContactsAutocompleteResponse entityId(Integer entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Id of entity. 0 if object is a Reply
   * @return entityId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Id of entity. 0 if object is a Reply")
  public Integer getEntityId() {
    return entityId;
  }

  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }

  public GetContactsAutocompleteResponse entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * 
   * @return entityType
  **/
  @ApiModelProperty(example = "contact", required = true, value = "")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public GetContactsAutocompleteResponse value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Id of contact/list if entityType is contact/list OR phone number if entityType is reply
   * @return value
  **/
  @ApiModelProperty(example = "22", required = true, value = "Id of contact/list if entityType is contact/list OR phone number if entityType is reply")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GetContactsAutocompleteResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Name of the contact/list if entityType is contact/list OR phone number if entityType is reply
   * @return label
  **/
  @ApiModelProperty(example = "Homer Simpson", required = true, value = "Name of the contact/list if entityType is contact/list OR phone number if entityType is reply")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public GetContactsAutocompleteResponse sharedBy(String sharedBy) {
    this.sharedBy = sharedBy;
    return this;
  }

   /**
   * If contact or list was shared by another user then name if this user will be shown
   * @return sharedBy
  **/
  @ApiModelProperty(example = "John Doe", required = true, value = "If contact or list was shared by another user then name if this user will be shown")
  public String getSharedBy() {
    return sharedBy;
  }

  public void setSharedBy(String sharedBy) {
    this.sharedBy = sharedBy;
  }

  public GetContactsAutocompleteResponse avatar(String avatar) {
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

  public GetContactsAutocompleteResponse favorited(Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

   /**
   * If contact was marked as favourited
   * @return favorited
  **/
  @ApiModelProperty(example = "true", required = true, value = "If contact was marked as favourited")
  public Boolean isFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  public GetContactsAutocompleteResponse userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Owner id of the contact/list (if it was shared)
   * @return userId
  **/
  @ApiModelProperty(example = "33", required = true, value = "Owner id of the contact/list (if it was shared)")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public GetContactsAutocompleteResponse countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(example = "Australia", required = true, value = "")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public GetContactsAutocompleteResponse qposition(Integer qposition) {
    this.qposition = qposition;
    return this;
  }

   /**
   * Get qposition
   * @return qposition
  **/
  @ApiModelProperty(example = "Internal field, used for sorting purposes", required = true, value = "")
  public Integer getQposition() {
    return qposition;
  }

  public void setQposition(Integer qposition) {
    this.qposition = qposition;
  }

  public GetContactsAutocompleteResponse rposition(Integer rposition) {
    this.rposition = rposition;
    return this;
  }

   /**
   * Get rposition
   * @return rposition
  **/
  @ApiModelProperty(example = "Internal field, used for sorting purposes", required = true, value = "")
  public Integer getRposition() {
    return rposition;
  }

  public void setRposition(Integer rposition) {
    this.rposition = rposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContactsAutocompleteResponse getContactsAutocompleteResponse = (GetContactsAutocompleteResponse) o;
    return Objects.equals(this.entityId, getContactsAutocompleteResponse.entityId) &&
        Objects.equals(this.entityType, getContactsAutocompleteResponse.entityType) &&
        Objects.equals(this.value, getContactsAutocompleteResponse.value) &&
        Objects.equals(this.label, getContactsAutocompleteResponse.label) &&
        Objects.equals(this.sharedBy, getContactsAutocompleteResponse.sharedBy) &&
        Objects.equals(this.avatar, getContactsAutocompleteResponse.avatar) &&
        Objects.equals(this.favorited, getContactsAutocompleteResponse.favorited) &&
        Objects.equals(this.userId, getContactsAutocompleteResponse.userId) &&
        Objects.equals(this.countryName, getContactsAutocompleteResponse.countryName) &&
        Objects.equals(this.qposition, getContactsAutocompleteResponse.qposition) &&
        Objects.equals(this.rposition, getContactsAutocompleteResponse.rposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, value, label, sharedBy, avatar, favorited, userId, countryName, qposition, rposition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContactsAutocompleteResponse {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    qposition: ").append(toIndentedString(qposition)).append("\n");
    sb.append("    rposition: ").append(toIndentedString(rposition)).append("\n");
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

