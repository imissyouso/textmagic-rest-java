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
 * UpdateCustomFieldValueInputObject
 */

public class UpdateCustomFieldValueInputObject {
  @SerializedName("contactId")
  private Integer contactId = null;

  @SerializedName("value")
  private String value = null;

  public UpdateCustomFieldValueInputObject contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * [Contact](http://docs.textmagictesting.com/tag#Contacts) 
   * @return contactId
  **/
  @ApiModelProperty(example = "50315", value = "[Contact](http://docs.textmagictesting.com/tag#Contacts) ")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public UpdateCustomFieldValueInputObject value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Custom field value. Note that this value is not parsed in any way. It is stored and used in tags exactly as you send it.
   * @return value
  **/
  @ApiModelProperty(example = "1983-08-31T00:00:00.000Z", value = "Custom field value. Note that this value is not parsed in any way. It is stored and used in tags exactly as you send it.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomFieldValueInputObject updateCustomFieldValueInputObject = (UpdateCustomFieldValueInputObject) o;
    return Objects.equals(this.contactId, updateCustomFieldValueInputObject.contactId) &&
        Objects.equals(this.value, updateCustomFieldValueInputObject.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomFieldValueInputObject {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

