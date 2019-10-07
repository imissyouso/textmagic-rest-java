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
 * UpdateSurveyInputObject
 */

public class UpdateSurveyInputObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("contacts")
  private String contacts = null;

  @SerializedName("lists")
  private String lists = null;

  @SerializedName("phones")
  private String phones = null;

  @SerializedName("country")
  private Object country = null;

  public UpdateSurveyInputObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Survey name
   * @return name
  **/
  @ApiModelProperty(example = "New test name", required = true, value = "Survey name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSurveyInputObject contacts(String contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Array of contact resources id message will be sent to
   * @return contacts
  **/
  @ApiModelProperty(example = "1,2,3,4", value = "Array of contact resources id message will be sent to")
  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  public UpdateSurveyInputObject lists(String lists) {
    this.lists = lists;
    return this;
  }

   /**
   * Array of list resources id message will be sent to
   * @return lists
  **/
  @ApiModelProperty(example = "1,2,3,4", value = "Array of list resources id message will be sent to")
  public String getLists() {
    return lists;
  }

  public void setLists(String lists) {
    this.lists = lists;
  }

  public UpdateSurveyInputObject phones(String phones) {
    this.phones = phones;
    return this;
  }

   /**
   * Array of E.164 phone numbers message will be sent to
   * @return phones
  **/
  @ApiModelProperty(example = "447860021130,447860021131", value = "Array of E.164 phone numbers message will be sent to")
  public String getPhones() {
    return phones;
  }

  public void setPhones(String phones) {
    this.phones = phones;
  }

  public UpdateSurveyInputObject country(Object country) {
    this.country = country;
    return this;
  }

   /**
   * Country values mapping (country &#x3D;&gt; inbound phone id), e.g. country[GB] &#x3D; \&quot;123\&quot;, country[US] &#x3D; \&quot;123\&quot;
   * @return country
  **/
  @ApiModelProperty(example = "{\"GB\":123,\"US\":123}", value = "Country values mapping (country => inbound phone id), e.g. country[GB] = \"123\", country[US] = \"123\"")
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSurveyInputObject updateSurveyInputObject = (UpdateSurveyInputObject) o;
    return Objects.equals(this.name, updateSurveyInputObject.name) &&
        Objects.equals(this.contacts, updateSurveyInputObject.contacts) &&
        Objects.equals(this.lists, updateSurveyInputObject.lists) &&
        Objects.equals(this.phones, updateSurveyInputObject.phones) &&
        Objects.equals(this.country, updateSurveyInputObject.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contacts, lists, phones, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSurveyInputObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

