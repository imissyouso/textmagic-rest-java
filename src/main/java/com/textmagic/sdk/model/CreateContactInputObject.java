/*
 * TextMagic API Documentation
 * # Overview ## Introduction         test <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
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
 * CreateContactInputObject
 */

public class CreateContactInputObject {
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

  public CreateContactInputObject firstName(String firstName) {
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

  public CreateContactInputObject lastName(String lastName) {
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

  public CreateContactInputObject phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Contact phone number in E.164 (international) format without leading + or zeroes
   * @return phone
  **/
  @ApiModelProperty(example = "+23058300573", required = true, value = "Contact phone number in E.164 (international) format without leading + or zeroes")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateContactInputObject email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email
   * @return email
  **/
  @ApiModelProperty(example = "test@test.com", value = "Contact email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateContactInputObject companyName(String companyName) {
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

  public CreateContactInputObject lists(String lists) {
    this.lists = lists;
    return this;
  }

   /**
   * Array of list resources id contact will be assigned to
   * @return lists
  **/
  @ApiModelProperty(example = "1,2,3,4", required = true, value = "Array of list resources id contact will be assigned to")
  public String getLists() {
    return lists;
  }

  public void setLists(String lists) {
    this.lists = lists;
  }

  public CreateContactInputObject favorited(Boolean favorited) {
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

  public CreateContactInputObject blocked(Boolean blocked) {
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

  public CreateContactInputObject type(Integer type) {
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

  public CreateContactInputObject customFieldValues(Object customFieldValues) {
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

  public CreateContactInputObject local(Integer local) {
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

  public CreateContactInputObject country(String country) {
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
    CreateContactInputObject createContactInputObject = (CreateContactInputObject) o;
    return Objects.equals(this.firstName, createContactInputObject.firstName) &&
        Objects.equals(this.lastName, createContactInputObject.lastName) &&
        Objects.equals(this.phone, createContactInputObject.phone) &&
        Objects.equals(this.email, createContactInputObject.email) &&
        Objects.equals(this.companyName, createContactInputObject.companyName) &&
        Objects.equals(this.lists, createContactInputObject.lists) &&
        Objects.equals(this.favorited, createContactInputObject.favorited) &&
        Objects.equals(this.blocked, createContactInputObject.blocked) &&
        Objects.equals(this.type, createContactInputObject.type) &&
        Objects.equals(this.customFieldValues, createContactInputObject.customFieldValues) &&
        Objects.equals(this.local, createContactInputObject.local) &&
        Objects.equals(this.country, createContactInputObject.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, email, companyName, lists, favorited, blocked, type, customFieldValues, local, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContactInputObject {\n");
    
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

