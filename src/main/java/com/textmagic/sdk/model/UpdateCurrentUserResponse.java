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
 * UpdateCurrentUserResponse
 */

public class UpdateCurrentUserResponse {
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

  public UpdateCurrentUserResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username.
   * @return username
  **/
  @ApiModelProperty(example = "charles.conway", value = "Username.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UpdateCurrentUserResponse firstName(String firstName) {
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

  public UpdateCurrentUserResponse lastName(String lastName) {
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

  public UpdateCurrentUserResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email address.
   * @return email
  **/
  @ApiModelProperty(example = "charles@example.com", value = "User email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateCurrentUserResponse phone(String phone) {
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

  public UpdateCurrentUserResponse company(String company) {
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

  public UpdateCurrentUserResponse timezone(Integer timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Internal timezone ID. See [Get timezones](http://docs.textmagictesting.com/#operation/getTimezones)
   * @return timezone
  **/
  @ApiModelProperty(example = "13", value = "Internal timezone ID. See [Get timezones](http://docs.textmagictesting.com/#operation/getTimezones)")
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
    UpdateCurrentUserResponse updateCurrentUserResponse = (UpdateCurrentUserResponse) o;
    return Objects.equals(this.username, updateCurrentUserResponse.username) &&
        Objects.equals(this.firstName, updateCurrentUserResponse.firstName) &&
        Objects.equals(this.lastName, updateCurrentUserResponse.lastName) &&
        Objects.equals(this.email, updateCurrentUserResponse.email) &&
        Objects.equals(this.phone, updateCurrentUserResponse.phone) &&
        Objects.equals(this.company, updateCurrentUserResponse.company) &&
        Objects.equals(this.timezone, updateCurrentUserResponse.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName, email, phone, company, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCurrentUserResponse {\n");
    
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

