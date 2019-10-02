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
 * UpdateCurrentUserInputObject
 */

public class UpdateCurrentUserInputObject {
  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("timezone")
  private Integer timezone = null;

  public UpdateCurrentUserInputObject username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "Test", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UpdateCurrentUserInputObject firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Account first name.
   * @return firstName
  **/
  @ApiModelProperty(example = "Charles", value = "Account first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateCurrentUserInputObject lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Account last name.
   * @return lastName
  **/
  @ApiModelProperty(example = "Conway", value = "Account last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateCurrentUserInputObject email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "charles@example.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateCurrentUserInputObject phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "447860021130", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UpdateCurrentUserInputObject company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Account company name.
   * @return company
  **/
  @ApiModelProperty(example = "Example Ltd.", value = "Account company name.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UpdateCurrentUserInputObject timezone(Integer timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezome internal id
   * @return timezone
  **/
  @ApiModelProperty(example = "2", value = "The timezome internal id")
  public Integer getTimezone() {
    return timezone;
  }

  public void setTimezone(Integer timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCurrentUserInputObject updateCurrentUserInputObject = (UpdateCurrentUserInputObject) o;
    return Objects.equals(this.username, updateCurrentUserInputObject.username) &&
        Objects.equals(this.firstName, updateCurrentUserInputObject.firstName) &&
        Objects.equals(this.lastName, updateCurrentUserInputObject.lastName) &&
        Objects.equals(this.email, updateCurrentUserInputObject.email) &&
        Objects.equals(this.phone, updateCurrentUserInputObject.phone) &&
        Objects.equals(this.company, updateCurrentUserInputObject.company) &&
        Objects.equals(this.timezone, updateCurrentUserInputObject.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName, email, phone, company, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCurrentUserInputObject {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

