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
 * UpdateContactInputObject
 */

public class UpdateContactInputObject {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("lists")
  private String lists = null;

  @SerializedName("favorited")
  private Boolean favorited = null;

  @SerializedName("blocked")
  private Boolean blocked = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("customFieldValues")
  private Object customFieldValues = null;

  @SerializedName("local")
  private Integer local = null;

  @SerializedName("country")
  private String country = null;

  public UpdateContactInputObject firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Contact first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Example first name", value = "Contact first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateContactInputObject lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Contact last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Example first name", value = "Contact last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateContactInputObject phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
   * @return phone
  **/
  @ApiModelProperty(example = "447860021130", required = true, value = "Phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UpdateContactInputObject email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email address.
   * @return email
  **/
  @ApiModelProperty(example = "charles@example.com", value = "Contact email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateContactInputObject companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Contact company name
   * @return companyName
  **/
  @ApiModelProperty(example = "My pretty company", value = "Contact company name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UpdateContactInputObject lists(String lists) {
    this.lists = lists;
    return this;
  }

   /**
   * Comma-separated [list](/docs/api/lists/) ID. Each contact must be assigned to at least one list.
   * @return lists
  **/
  @ApiModelProperty(example = "10541,18599", required = true, value = "Comma-separated [list](/docs/api/lists/) ID. Each contact must be assigned to at least one list.")
  public String getLists() {
    return lists;
  }

  public void setLists(String lists) {
    this.lists = lists;
  }

  public UpdateContactInputObject favorited(Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

   /**
   * Is contact favorited
   * @return favorited
  **/
  @ApiModelProperty(example = "false", value = "Is contact favorited")
  public Boolean isFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  public UpdateContactInputObject blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Is contact blocked for outgoing and incoming messaging
   * @return blocked
  **/
  @ApiModelProperty(example = "false", value = "Is contact blocked for outgoing and incoming messaging")
  public Boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public UpdateContactInputObject type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Force type of phone. Possible values: 0 - landline, 1 - mobile. Default is -1 (auto detection)
   * @return type
  **/
  @ApiModelProperty(example = "1", value = "Force type of phone. Possible values: 0 - landline, 1 - mobile. Default is -1 (auto detection)")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public UpdateContactInputObject customFieldValues(Object customFieldValues) {
    this.customFieldValues = customFieldValues;
    return this;
  }

   /**
   * Get customFieldValues
   * @return customFieldValues
  **/
  @ApiModelProperty(example = "{\"2\":\"My test custom value for custom field with id 2\",\"5\":\"My test custom value for custom field with id 5\"}", value = "")
  public Object getCustomFieldValues() {
    return customFieldValues;
  }

  public void setCustomFieldValues(Object customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public UpdateContactInputObject local(Integer local) {
    this.local = local;
    return this;
  }

   /**
   * Treat phone number passed in request body as local
   * @return local
  **/
  @ApiModelProperty(example = "0", value = "Treat phone number passed in request body as local")
  public Integer getLocal() {
    return local;
  }

  public void setLocal(Integer local) {
    this.local = local;
  }

  public UpdateContactInputObject country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 2-letter ISO country code for local phone numbers, used when local is  set to true. Default is account country
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "2-letter ISO country code for local phone numbers, used when local is  set to true. Default is account country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
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
    UpdateContactInputObject updateContactInputObject = (UpdateContactInputObject) o;
    return Objects.equals(this.firstName, updateContactInputObject.firstName) &&
        Objects.equals(this.lastName, updateContactInputObject.lastName) &&
        Objects.equals(this.phone, updateContactInputObject.phone) &&
        Objects.equals(this.email, updateContactInputObject.email) &&
        Objects.equals(this.companyName, updateContactInputObject.companyName) &&
        Objects.equals(this.lists, updateContactInputObject.lists) &&
        Objects.equals(this.favorited, updateContactInputObject.favorited) &&
        Objects.equals(this.blocked, updateContactInputObject.blocked) &&
        Objects.equals(this.type, updateContactInputObject.type) &&
        Objects.equals(this.customFieldValues, updateContactInputObject.customFieldValues) &&
        Objects.equals(this.local, updateContactInputObject.local) &&
        Objects.equals(this.country, updateContactInputObject.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, email, companyName, lists, favorited, blocked, type, customFieldValues, local, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContactInputObject {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customFieldValues: ").append(toIndentedString(customFieldValues)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
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

