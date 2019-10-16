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

/**
 * GetContactImportSessionProgressResponse
 */

public class GetContactImportSessionProgressResponse {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("processed")
  private Integer processed = null;

  public GetContactImportSessionProgressResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Session status: * **1** if session has been initialized but not yet started * **3** if session is being processed * **4** if session has errors * **5** if session completed successfully 
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Session status: * **1** if session has been initialized but not yet started * **3** if session is being processed * **4** if session has errors * **5** if session completed successfully ")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public GetContactImportSessionProgressResponse processed(Integer processed) {
    this.processed = processed;
    return this;
  }

   /**
   * How many contacts have been imported.
   * @return processed
  **/
  @ApiModelProperty(example = "67", required = true, value = "How many contacts have been imported.")
  public Integer getProcessed() {
    return processed;
  }

  public void setProcessed(Integer processed) {
    this.processed = processed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContactImportSessionProgressResponse getContactImportSessionProgressResponse = (GetContactImportSessionProgressResponse) o;
    return Objects.equals(this.status, getContactImportSessionProgressResponse.status) &&
        Objects.equals(this.processed, getContactImportSessionProgressResponse.processed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, processed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContactImportSessionProgressResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
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

