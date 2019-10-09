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
 * DeleteContacsFromListObject
 */

public class DeleteContacsFromListObject {
  @SerializedName("contacts")
  private String contacts = null;

  public DeleteContacsFromListObject contacts(String contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Comma-separated array of [Contacts](http://docs.textmagictesting.com/#tag/Contacts) IDs. 
   * @return contacts
  **/
  @ApiModelProperty(example = "318,454,30091", required = true, value = "Comma-separated array of [Contacts](http://docs.textmagictesting.com/#tag/Contacts) IDs. ")
  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteContacsFromListObject deleteContacsFromListObject = (DeleteContacsFromListObject) o;
    return Objects.equals(this.contacts, deleteContacsFromListObject.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteContacsFromListObject {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

