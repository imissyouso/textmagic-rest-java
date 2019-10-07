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
import com.textmagic.sdk.model.MessagesIcsParametersRecipients;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MessagesIcsParameters
 */

public class MessagesIcsParameters {
  @SerializedName("text")
  private String text = null;

  @SerializedName("recipients")
  private MessagesIcsParametersRecipients recipients = null;

  public MessagesIcsParameters text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "Sample text", required = true, value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessagesIcsParameters recipients(MessagesIcsParametersRecipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "")
  public MessagesIcsParametersRecipients getRecipients() {
    return recipients;
  }

  public void setRecipients(MessagesIcsParametersRecipients recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesIcsParameters messagesIcsParameters = (MessagesIcsParameters) o;
    return Objects.equals(this.text, messagesIcsParameters.text) &&
        Objects.equals(this.recipients, messagesIcsParameters.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesIcsParameters {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

