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
   * Schedule ID.
   * @return id
  **/
  @ApiModelProperty(example = "562", required = true, value = "Schedule ID.")
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
   * Next send date in [ISO 8601](https://en.wikipedia.org/?title&#x3D;ISO_8601) format. 
   * @return nextSend
  **/
  @ApiModelProperty(example = "2014-10-13T05:00:00+0000", required = true, value = "Next send date in [ISO 8601](https://en.wikipedia.org/?title=ISO_8601) format. ")
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
   * [iCal RRULE](http://www.kanzaki.com/docs/ical/rrule.html) string. 
   * @return rrule
  **/
  @ApiModelProperty(example = "FREQ=DAILY;INTERVAL=2;COUNT=5;", required = true, value = "[iCal RRULE](http://www.kanzaki.com/docs/ical/rrule.html) string. ")
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
   * Date and time when last message has been sent.
   * @return lastSent
  **/
  @ApiModelProperty(example = "2015-06-19T09:48:24+0000", required = true, value = "Date and time when last message has been sent.")
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
  @ApiModelProperty(example = "Test contact name TODO", required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(example = "2015-06-19T09:48:24+0000", required = true, value = "")
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
  @ApiModelProperty(example = "2015-06-19T09:48:24+0000", required = true, value = "")
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
   * Amount of actual recipients.
   * @return recipientsCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "Amount of actual recipients.")
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
   * User-friendly timezone name (with spaces replaced by underscores).
   * @return timezone
  **/
  @ApiModelProperty(example = "Europe/Tallinn", required = true, value = "User-friendly timezone name (with spaces replaced by underscores).")
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
   * Indicates that schedling has been completed.
   * @return completed
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates that schedling has been completed.")
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
   * null
   * @return avatar
  **/
  @ApiModelProperty(example = "avatars/dummy_avatar.png", required = true, value = "null")
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
   * Scheduling creation time.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2015-06-19T09:48:24+0000", required = true, value = "Scheduling creation time.")
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

