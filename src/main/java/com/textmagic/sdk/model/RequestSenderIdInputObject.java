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
 * RequestSenderIdInputObject
 */

public class RequestSenderIdInputObject {
  @SerializedName("senderId")
  private String senderId = null;

  @SerializedName("explanation")
  private String explanation = null;

  public RequestSenderIdInputObject senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * Alphanumeric Sender ID (maximum 11 characters)
   * @return senderId
  **/
  @ApiModelProperty(example = "Testid1", required = true, value = "Alphanumeric Sender ID (maximum 11 characters)")
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public RequestSenderIdInputObject explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Explain why do you need this Sender ID
   * @return explanation
  **/
  @ApiModelProperty(example = "Test description", required = true, value = "Explain why do you need this Sender ID")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSenderIdInputObject requestSenderIdInputObject = (RequestSenderIdInputObject) o;
    return Objects.equals(this.senderId, requestSenderIdInputObject.senderId) &&
        Objects.equals(this.explanation, requestSenderIdInputObject.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderId, explanation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSenderIdInputObject {\n");
    
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

