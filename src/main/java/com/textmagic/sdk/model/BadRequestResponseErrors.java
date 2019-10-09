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
import java.util.ArrayList;
import java.util.List;

/**
 * If it was a **POST** or **PUT** request (and the **message** returned is &#x60;Validation Failed&#x60;), this field may contain **errors **that describe the errors grouped by the input parameter name. 
 */
@ApiModel(description = "If it was a **POST** or **PUT** request (and the **message** returned is `Validation Failed`), this field may contain **errors **that describe the errors grouped by the input parameter name. ")

public class BadRequestResponseErrors {
  @SerializedName("common")
  private List<String> common = null;

  @SerializedName("fields")
  private Object fields = null;

  public BadRequestResponseErrors common(List<String> common) {
    this.common = common;
    return this;
  }

  public BadRequestResponseErrors addCommonItem(String commonItem) {
    if (this.common == null) {
      this.common = new ArrayList<String>();
    }
    this.common.add(commonItem);
    return this;
  }

   /**
   * Array of messages with errors related to the entire request. For example, you did not specify either the **text** or **templateId** when [sending the message](http://docs.textmagictesting.com/#tag/Outbound-Messages). 
   * @return common
  **/
  @ApiModelProperty(example = "[\"Common error message 1\",\"Common error message 2\"]", value = "Array of messages with errors related to the entire request. For example, you did not specify either the **text** or **templateId** when [sending the message](http://docs.textmagictesting.com/#tag/Outbound-Messages). ")
  public List<String> getCommon() {
    return common;
  }

  public void setCommon(List<String> common) {
    this.common = common;
  }

  public BadRequestResponseErrors fields(Object fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Associative array. The keys are the POST/PUT parameters names and the values are arrays with error messages for these parameters. 
   * @return fields
  **/
  @ApiModelProperty(example = "{\"fieldName1\":[\"Error message 1\",\"Error message 2\"],\"fieldName2\":[\"Error message 3\",\"Error message 4\"]}", value = "Associative array. The keys are the POST/PUT parameters names and the values are arrays with error messages for these parameters. ")
  public Object getFields() {
    return fields;
  }

  public void setFields(Object fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestResponseErrors badRequestResponseErrors = (BadRequestResponseErrors) o;
    return Objects.equals(this.common, badRequestResponseErrors.common) &&
        Objects.equals(this.fields, badRequestResponseErrors.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(common, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestResponseErrors {\n");
    
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

