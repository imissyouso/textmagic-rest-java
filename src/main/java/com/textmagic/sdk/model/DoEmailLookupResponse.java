/*
 * TextMagic API Documentation
 * # Overview ## Introduction <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
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
 * DoEmailLookupResponse
 */

public class DoEmailLookupResponse {
  @SerializedName("address")
  private String address = null;

  @SerializedName("addressType")
  private String addressType = null;

  @SerializedName("emailRole")
  private String emailRole = null;

  @SerializedName("reason")
  private String reason = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALID("valid"),
    
    INVALID("invalid");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("deliverability")
  private String deliverability = null;

  @SerializedName("isDisposableAddress")
  private Boolean isDisposableAddress = null;

  @SerializedName("localPart")
  private String localPart = null;

  @SerializedName("domainPart")
  private String domainPart = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("isInWhiteList")
  private Boolean isInWhiteList = null;

  @SerializedName("isInBlackList")
  private Boolean isInBlackList = null;

  @SerializedName("hasMx")
  private Boolean hasMx = null;

  @SerializedName("hasAa")
  private Boolean hasAa = null;

  @SerializedName("hasAaaa")
  private Boolean hasAaaa = null;

  @SerializedName("risk")
  private String risk = null;

  @SerializedName("preference")
  private Integer preference = null;

  @SerializedName("suggestion")
  private String suggestion = null;

  public DoEmailLookupResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "manager@company.com", required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DoEmailLookupResponse addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(example = "corporate", required = true, value = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public DoEmailLookupResponse emailRole(String emailRole) {
    this.emailRole = emailRole;
    return this;
  }

   /**
   * Get emailRole
   * @return emailRole
  **/
  @ApiModelProperty(example = "manager", required = true, value = "")
  public String getEmailRole() {
    return emailRole;
  }

  public void setEmailRole(String emailRole) {
    this.emailRole = emailRole;
  }

  public DoEmailLookupResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "Requested Mailbox does not exist", required = true, value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DoEmailLookupResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DoEmailLookupResponse deliverability(String deliverability) {
    this.deliverability = deliverability;
    return this;
  }

   /**
   * Get deliverability
   * @return deliverability
  **/
  @ApiModelProperty(example = "undeliverable", required = true, value = "")
  public String getDeliverability() {
    return deliverability;
  }

  public void setDeliverability(String deliverability) {
    this.deliverability = deliverability;
  }

  public DoEmailLookupResponse isDisposableAddress(Boolean isDisposableAddress) {
    this.isDisposableAddress = isDisposableAddress;
    return this;
  }

   /**
   * Get isDisposableAddress
   * @return isDisposableAddress
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isIsDisposableAddress() {
    return isDisposableAddress;
  }

  public void setIsDisposableAddress(Boolean isDisposableAddress) {
    this.isDisposableAddress = isDisposableAddress;
  }

  public DoEmailLookupResponse localPart(String localPart) {
    this.localPart = localPart;
    return this;
  }

   /**
   * Get localPart
   * @return localPart
  **/
  @ApiModelProperty(example = "manager", required = true, value = "")
  public String getLocalPart() {
    return localPart;
  }

  public void setLocalPart(String localPart) {
    this.localPart = localPart;
  }

  public DoEmailLookupResponse domainPart(String domainPart) {
    this.domainPart = domainPart;
    return this;
  }

   /**
   * Get domainPart
   * @return domainPart
  **/
  @ApiModelProperty(example = "test.com", required = true, value = "")
  public String getDomainPart() {
    return domainPart;
  }

  public void setDomainPart(String domainPart) {
    this.domainPart = domainPart;
  }

  public DoEmailLookupResponse exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @ApiModelProperty(example = "mx01.xworks.net", required = true, value = "")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public DoEmailLookupResponse isInWhiteList(Boolean isInWhiteList) {
    this.isInWhiteList = isInWhiteList;
    return this;
  }

   /**
   * Get isInWhiteList
   * @return isInWhiteList
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isIsInWhiteList() {
    return isInWhiteList;
  }

  public void setIsInWhiteList(Boolean isInWhiteList) {
    this.isInWhiteList = isInWhiteList;
  }

  public DoEmailLookupResponse isInBlackList(Boolean isInBlackList) {
    this.isInBlackList = isInBlackList;
    return this;
  }

   /**
   * Get isInBlackList
   * @return isInBlackList
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isIsInBlackList() {
    return isInBlackList;
  }

  public void setIsInBlackList(Boolean isInBlackList) {
    this.isInBlackList = isInBlackList;
  }

  public DoEmailLookupResponse hasMx(Boolean hasMx) {
    this.hasMx = hasMx;
    return this;
  }

   /**
   * Get hasMx
   * @return hasMx
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean isHasMx() {
    return hasMx;
  }

  public void setHasMx(Boolean hasMx) {
    this.hasMx = hasMx;
  }

  public DoEmailLookupResponse hasAa(Boolean hasAa) {
    this.hasAa = hasAa;
    return this;
  }

   /**
   * Get hasAa
   * @return hasAa
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean isHasAa() {
    return hasAa;
  }

  public void setHasAa(Boolean hasAa) {
    this.hasAa = hasAa;
  }

  public DoEmailLookupResponse hasAaaa(Boolean hasAaaa) {
    this.hasAaaa = hasAaaa;
    return this;
  }

   /**
   * Get hasAaaa
   * @return hasAaaa
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean isHasAaaa() {
    return hasAaaa;
  }

  public void setHasAaaa(Boolean hasAaaa) {
    this.hasAaaa = hasAaaa;
  }

  public DoEmailLookupResponse risk(String risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(example = "high", required = true, value = "")
  public String getRisk() {
    return risk;
  }

  public void setRisk(String risk) {
    this.risk = risk;
  }

  public DoEmailLookupResponse preference(Integer preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  public Integer getPreference() {
    return preference;
  }

  public void setPreference(Integer preference) {
    this.preference = preference;
  }

  public DoEmailLookupResponse suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @ApiModelProperty(example = "account-manager@company.com", required = true, value = "")
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoEmailLookupResponse doEmailLookupResponse = (DoEmailLookupResponse) o;
    return Objects.equals(this.address, doEmailLookupResponse.address) &&
        Objects.equals(this.addressType, doEmailLookupResponse.addressType) &&
        Objects.equals(this.emailRole, doEmailLookupResponse.emailRole) &&
        Objects.equals(this.reason, doEmailLookupResponse.reason) &&
        Objects.equals(this.status, doEmailLookupResponse.status) &&
        Objects.equals(this.deliverability, doEmailLookupResponse.deliverability) &&
        Objects.equals(this.isDisposableAddress, doEmailLookupResponse.isDisposableAddress) &&
        Objects.equals(this.localPart, doEmailLookupResponse.localPart) &&
        Objects.equals(this.domainPart, doEmailLookupResponse.domainPart) &&
        Objects.equals(this.exchange, doEmailLookupResponse.exchange) &&
        Objects.equals(this.isInWhiteList, doEmailLookupResponse.isInWhiteList) &&
        Objects.equals(this.isInBlackList, doEmailLookupResponse.isInBlackList) &&
        Objects.equals(this.hasMx, doEmailLookupResponse.hasMx) &&
        Objects.equals(this.hasAa, doEmailLookupResponse.hasAa) &&
        Objects.equals(this.hasAaaa, doEmailLookupResponse.hasAaaa) &&
        Objects.equals(this.risk, doEmailLookupResponse.risk) &&
        Objects.equals(this.preference, doEmailLookupResponse.preference) &&
        Objects.equals(this.suggestion, doEmailLookupResponse.suggestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressType, emailRole, reason, status, deliverability, isDisposableAddress, localPart, domainPart, exchange, isInWhiteList, isInBlackList, hasMx, hasAa, hasAaaa, risk, preference, suggestion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoEmailLookupResponse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    emailRole: ").append(toIndentedString(emailRole)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deliverability: ").append(toIndentedString(deliverability)).append("\n");
    sb.append("    isDisposableAddress: ").append(toIndentedString(isDisposableAddress)).append("\n");
    sb.append("    localPart: ").append(toIndentedString(localPart)).append("\n");
    sb.append("    domainPart: ").append(toIndentedString(domainPart)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    isInWhiteList: ").append(toIndentedString(isInWhiteList)).append("\n");
    sb.append("    isInBlackList: ").append(toIndentedString(isInBlackList)).append("\n");
    sb.append("    hasMx: ").append(toIndentedString(hasMx)).append("\n");
    sb.append("    hasAa: ").append(toIndentedString(hasAa)).append("\n");
    sb.append("    hasAaaa: ").append(toIndentedString(hasAaaa)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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

