/*
 * TextMagic API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2
 * 
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

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("receiver")
  private String receiver = null;

  @SerializedName("text")
  private String text = null;

  /**
   * Delivery status of the message. TODO: Please see the table below to see different delivery statuses. 
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

  @SerializedName("contactId")
  private Integer contactId = null;

  @SerializedName("sessionId")
  private Integer sessionId = null;

  @SerializedName("messageTime")
  private OffsetDateTime messageTime = null;

  @SerializedName("avatar")
  private String avatar = null;

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
   * Message ID.
   * @return id
  **/
  @ApiModelProperty(example = "4991", required = true, value = "Message ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessageOut sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Message sender (phone number or alphanumeric Sender ID).
   * @return sender
  **/
  @ApiModelProperty(example = "447624800500", value = "Message sender (phone number or alphanumeric Sender ID).")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public MessageOut receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Recipient phone number.
   * @return receiver
  **/
  @ApiModelProperty(example = "447860021130", value = "Recipient phone number.")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public MessageOut text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "I love TextMagic!", required = true, value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageOut status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Delivery status of the message. TODO: Please see the table below to see different delivery statuses. 
   * @return status
  **/
  @ApiModelProperty(example = "d", required = true, value = "Delivery status of the message. TODO: Please see the table below to see different delivery statuses. ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
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

  public MessageOut messageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
    return this;
  }

   /**
   * Sending time.
   * @return messageTime
  **/
  @ApiModelProperty(example = "2019-08-12T11:43:37+0000", required = true, value = "Sending time.")
  public OffsetDateTime getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
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
   * Message charset. Could be: *   **ISO-8859-1** for plaintext SMS *   **UTF-16BE** for Unicode SMS 
   * @return charset
  **/
  @ApiModelProperty(example = "ISO-8859-1", required = true, value = "Message charset. Could be: *   **ISO-8859-1** for plaintext SMS *   **UTF-16BE** for Unicode SMS ")
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
   * Contact first name. Could be substituted from your [Contacts](http://docs.textmagictesting.com/tag#Contacts) (even if you submitted phone number instead of contact ID). 
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "Contact first name. Could be substituted from your [Contacts](http://docs.textmagictesting.com/tag#Contacts) (even if you submitted phone number instead of contact ID). ")
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
   * Contact last name.
   * @return lastName
  **/
  @ApiModelProperty(example = "Conway", required = true, value = "Contact last name.")
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
   * Two-letter ISO country code of the recipient phone number. 
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "Two-letter ISO country code of the recipient phone number. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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
   * Message parts (multiples of 160 characters) count.
   * @return partsCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "Message parts (multiples of 160 characters) count.")
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
        Objects.equals(this.sender, messageOut.sender) &&
        Objects.equals(this.receiver, messageOut.receiver) &&
        Objects.equals(this.text, messageOut.text) &&
        Objects.equals(this.status, messageOut.status) &&
        Objects.equals(this.contactId, messageOut.contactId) &&
        Objects.equals(this.sessionId, messageOut.sessionId) &&
        Objects.equals(this.messageTime, messageOut.messageTime) &&
        Objects.equals(this.avatar, messageOut.avatar) &&
        Objects.equals(this.deleted, messageOut.deleted) &&
        Objects.equals(this.charset, messageOut.charset) &&
        Objects.equals(this.charsetLabel, messageOut.charsetLabel) &&
        Objects.equals(this.firstName, messageOut.firstName) &&
        Objects.equals(this.lastName, messageOut.lastName) &&
        Objects.equals(this.country, messageOut.country) &&
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
    return Objects.hash(id, sender, receiver, text, status, contactId, sessionId, messageTime, avatar, deleted, charset, charsetLabel, firstName, lastName, country, phone, price, partsCount, fromEmail, fromNumber, smscId, contact, source, deliveredCount, numbersCount, userId, creditsPrice, chars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOut {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    charsetLabel: ").append(toIndentedString(charsetLabel)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

