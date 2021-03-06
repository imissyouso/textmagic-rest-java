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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * BulkSession
 */

public class BulkSession {
  @SerializedName("id")
  private Integer id = null;

  /**
   * * **n** - bulk session is just created * **w** - work in progress * **f** - failed * **c** - completed with success * **s** - suspended 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    N("n"),
    
    W("w"),
    
    F("f"),
    
    C("c"),
    
    S("s");

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

  @SerializedName("itemsProcessed")
  private Integer itemsProcessed = null;

  @SerializedName("itemsTotal")
  private Integer itemsTotal = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("session")
  private MessageSession session = null;

  @SerializedName("text")
  private String text = null;

  public BulkSession id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Bulk Session ID.
   * @return id
  **/
  @ApiModelProperty(example = "599", required = true, value = "Bulk Session ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BulkSession status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * * **n** - bulk session is just created * **w** - work in progress * **f** - failed * **c** - completed with success * **s** - suspended 
   * @return status
  **/
  @ApiModelProperty(example = "n", required = true, value = "* **n** - bulk session is just created * **w** - work in progress * **f** - failed * **c** - completed with success * **s** - suspended ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BulkSession itemsProcessed(Integer itemsProcessed) {
    this.itemsProcessed = itemsProcessed;
    return this;
  }

   /**
   * Amount of messages which is already processed.
   * @return itemsProcessed
  **/
  @ApiModelProperty(example = "564", required = true, value = "Amount of messages which is already processed.")
  public Integer getItemsProcessed() {
    return itemsProcessed;
  }

  public void setItemsProcessed(Integer itemsProcessed) {
    this.itemsProcessed = itemsProcessed;
  }

  public BulkSession itemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

   /**
   * Total amount of messages to be processed.
   * @return itemsTotal
  **/
  @ApiModelProperty(example = "2", required = true, value = "Total amount of messages to be processed.")
  public Integer getItemsTotal() {
    return itemsTotal;
  }

  public void setItemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

  public BulkSession createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date and time of a Bulk Session.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2015-01-08T06:13:21+0000", required = true, value = "Creation date and time of a Bulk Session.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BulkSession session(MessageSession session) {
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

  public BulkSession text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message text of a Bulk Session.
   * @return text
  **/
  @ApiModelProperty(example = "I Love TextMagic!", required = true, value = "Message text of a Bulk Session.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSession bulkSession = (BulkSession) o;
    return Objects.equals(this.id, bulkSession.id) &&
        Objects.equals(this.status, bulkSession.status) &&
        Objects.equals(this.itemsProcessed, bulkSession.itemsProcessed) &&
        Objects.equals(this.itemsTotal, bulkSession.itemsTotal) &&
        Objects.equals(this.createdAt, bulkSession.createdAt) &&
        Objects.equals(this.session, bulkSession.session) &&
        Objects.equals(this.text, bulkSession.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, itemsProcessed, itemsTotal, createdAt, session, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    itemsProcessed: ").append(toIndentedString(itemsProcessed)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

