/*
 * TextMagic API Documentation
 * # Overview ## Introduction test <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
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
import org.threeten.bp.OffsetDateTime;

/**
 * MessageOut
 */

public class MessageOut {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("contactId")
  private Integer contactId = null;

  @SerializedName("sessionId")
  private Integer sessionId = null;

  @SerializedName("receiver")
  private String receiver = null;

  @SerializedName("messageTime")
  private OffsetDateTime messageTime = null;

  /**
   * q - queued s - scheduled queue e - sending error r - enroute a - acked d - delivered b - buffered f - failed u - unknown j - rejected i - bulk insert p - scheduled suspend h - queue suspend
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    Q("q"),
    
    S("s"),
    
    E("e"),
    
    R("r"),
    
    A("a"),
    
    D("d"),
    
    B("b"),
    
    F("f"),
    
    U("u"),
    
    J("j"),
    
    I("i"),
    
    P("p"),
    
    H("h");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("charset")
  private String charset = null;

  @SerializedName("charsetLabel")
  private String charsetLabel = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("partsCount")
  private Integer partsCount = null;

  @SerializedName("fromEmail")
  private String fromEmail = null;

  @SerializedName("fromNumber")
  private String fromNumber = null;

  @SerializedName("smscId")
  private String smscId = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("deliveredCount")
  private Integer deliveredCount = null;

  @SerializedName("numbersCount")
  private Integer numbersCount = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("creditsPrice")
  private String creditsPrice = null;

  @SerializedName("chars")
  private Integer chars = null;

  public MessageOut id(Integer id) {
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

  public MessageOut contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public MessageOut sessionId(Integer sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getSessionId() {
    return sessionId;
  }

  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }

  public MessageOut receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @ApiModelProperty(example = "19993322110", value = "")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public MessageOut messageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
    return this;
  }

   /**
   * Get messageTime
   * @return messageTime
  **/
  @ApiModelProperty(example = "2019-08-12T11:43:37+0000", required = true, value = "")
  public OffsetDateTime getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
  }

  public MessageOut status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * q - queued s - scheduled queue e - sending error r - enroute a - acked d - delivered b - buffered f - failed u - unknown j - rejected i - bulk insert p - scheduled suspend h - queue suspend
   * @return status
  **/
  @ApiModelProperty(example = "q", required = true, value = "q - queued s - scheduled queue e - sending error r - enroute a - acked d - delivered b - buffered f - failed u - unknown j - rejected i - bulk insert p - scheduled suspend h - queue suspend")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MessageOut avatar(String avatar) {
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

  public MessageOut text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "Test message", required = true, value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageOut deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public MessageOut charset(String charset) {
    this.charset = charset;
    return this;
  }

   /**
   * Get charset
   * @return charset
  **/
  @ApiModelProperty(example = "ISO-8859-1", required = true, value = "")
  public String getCharset() {
    return charset;
  }

  public void setCharset(String charset) {
    this.charset = charset;
  }

  public MessageOut charsetLabel(String charsetLabel) {
    this.charsetLabel = charsetLabel;
    return this;
  }

   /**
   * Get charsetLabel
   * @return charsetLabel
  **/
  @ApiModelProperty(example = "ISO-8859-1", required = true, value = "")
  public String getCharsetLabel() {
    return charsetLabel;
  }

  public void setCharsetLabel(String charsetLabel) {
    this.charsetLabel = charsetLabel;
  }

  public MessageOut firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "Test first name", required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MessageOut lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Test last name", required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MessageOut country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public MessageOut sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(example = "447624800500", value = "")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public MessageOut phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "447624800500", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MessageOut price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "0.025", value = "")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public MessageOut partsCount(Integer partsCount) {
    this.partsCount = partsCount;
    return this;
  }

   /**
   * Get partsCount
   * @return partsCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getPartsCount() {
    return partsCount;
  }

  public void setPartsCount(Integer partsCount) {
    this.partsCount = partsCount;
  }

  public MessageOut fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Get fromEmail
   * @return fromEmail
  **/
  @ApiModelProperty(example = "test@email.com", value = "")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public MessageOut fromNumber(String fromNumber) {
    this.fromNumber = fromNumber;
    return this;
  }

   /**
   * Get fromNumber
   * @return fromNumber
  **/
  @ApiModelProperty(example = "447624800500", value = "")
  public String getFromNumber() {
    return fromNumber;
  }

  public void setFromNumber(String fromNumber) {
    this.fromNumber = fromNumber;
  }

  public MessageOut smscId(String smscId) {
    this.smscId = smscId;
    return this;
  }

   /**
   * Get smscId
   * @return smscId
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getSmscId() {
    return smscId;
  }

  public void setSmscId(String smscId) {
    this.smscId = smscId;
  }

  public MessageOut contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public MessageOut source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MessageOut deliveredCount(Integer deliveredCount) {
    this.deliveredCount = deliveredCount;
    return this;
  }

   /**
   * Get deliveredCount
   * @return deliveredCount
  **/
  @ApiModelProperty(value = "")
  public Integer getDeliveredCount() {
    return deliveredCount;
  }

  public void setDeliveredCount(Integer deliveredCount) {
    this.deliveredCount = deliveredCount;
  }

  public MessageOut numbersCount(Integer numbersCount) {
    this.numbersCount = numbersCount;
    return this;
  }

   /**
   * Get numbersCount
   * @return numbersCount
  **/
  @ApiModelProperty(value = "")
  public Integer getNumbersCount() {
    return numbersCount;
  }

  public void setNumbersCount(Integer numbersCount) {
    this.numbersCount = numbersCount;
  }

  public MessageOut userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public MessageOut creditsPrice(String creditsPrice) {
    this.creditsPrice = creditsPrice;
    return this;
  }

   /**
   * Get creditsPrice
   * @return creditsPrice
  **/
  @ApiModelProperty(value = "")
  public String getCreditsPrice() {
    return creditsPrice;
  }

  public void setCreditsPrice(String creditsPrice) {
    this.creditsPrice = creditsPrice;
  }

  public MessageOut chars(Integer chars) {
    this.chars = chars;
    return this;
  }

   /**
   * Get chars
   * @return chars
  **/
  @ApiModelProperty(value = "")
  public Integer getChars() {
    return chars;
  }

  public void setChars(Integer chars) {
    this.chars = chars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageOut messageOut = (MessageOut) o;
    return Objects.equals(this.id, messageOut.id) &&
        Objects.equals(this.contactId, messageOut.contactId) &&
        Objects.equals(this.sessionId, messageOut.sessionId) &&
        Objects.equals(this.receiver, messageOut.receiver) &&
        Objects.equals(this.messageTime, messageOut.messageTime) &&
        Objects.equals(this.status, messageOut.status) &&
        Objects.equals(this.avatar, messageOut.avatar) &&
        Objects.equals(this.text, messageOut.text) &&
        Objects.equals(this.deleted, messageOut.deleted) &&
        Objects.equals(this.charset, messageOut.charset) &&
        Objects.equals(this.charsetLabel, messageOut.charsetLabel) &&
        Objects.equals(this.firstName, messageOut.firstName) &&
        Objects.equals(this.lastName, messageOut.lastName) &&
        Objects.equals(this.country, messageOut.country) &&
        Objects.equals(this.sender, messageOut.sender) &&
        Objects.equals(this.phone, messageOut.phone) &&
        Objects.equals(this.price, messageOut.price) &&
        Objects.equals(this.partsCount, messageOut.partsCount) &&
        Objects.equals(this.fromEmail, messageOut.fromEmail) &&
        Objects.equals(this.fromNumber, messageOut.fromNumber) &&
        Objects.equals(this.smscId, messageOut.smscId) &&
        Objects.equals(this.contact, messageOut.contact) &&
        Objects.equals(this.source, messageOut.source) &&
        Objects.equals(this.deliveredCount, messageOut.deliveredCount) &&
        Objects.equals(this.numbersCount, messageOut.numbersCount) &&
        Objects.equals(this.userId, messageOut.userId) &&
        Objects.equals(this.creditsPrice, messageOut.creditsPrice) &&
        Objects.equals(this.chars, messageOut.chars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactId, sessionId, receiver, messageTime, status, avatar, text, deleted, charset, charsetLabel, firstName, lastName, country, sender, phone, price, partsCount, fromEmail, fromNumber, smscId, contact, source, deliveredCount, numbersCount, userId, creditsPrice, chars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOut {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    charsetLabel: ").append(toIndentedString(charsetLabel)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    partsCount: ").append(toIndentedString(partsCount)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    fromNumber: ").append(toIndentedString(fromNumber)).append("\n");
    sb.append("    smscId: ").append(toIndentedString(smscId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    deliveredCount: ").append(toIndentedString(deliveredCount)).append("\n");
    sb.append("    numbersCount: ").append(toIndentedString(numbersCount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    creditsPrice: ").append(toIndentedString(creditsPrice)).append("\n");
    sb.append("    chars: ").append(toIndentedString(chars)).append("\n");
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

