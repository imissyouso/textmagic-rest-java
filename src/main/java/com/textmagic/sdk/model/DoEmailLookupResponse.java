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
 * DoEmailLookupResponse
 */

public class DoEmailLookupResponse {
  @SerializedName("address")
  private String address = null;

  /**
   * The email is &#x60;valid&#x60; or &#x60;invalid&#x60;.
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

  @SerializedName("reason")
  private String reason = null;

  /**
   * The risk score of the email is&#x60;high&#x60;, &#x60;medium&#x60;, &#x60;low&#x60; or &#x60;null&#x60;.
   */
  @JsonAdapter(RiskEnum.Adapter.class)
  public enum RiskEnum {
    HIGH("high"),
    
    MEDIUM("medium"),
    
    LOW("low"),
    
    UNKNOWN("unknown");

    private String value;

    RiskEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RiskEnum fromValue(String text) {
      for (RiskEnum b : RiskEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RiskEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RiskEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RiskEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("risk")
  private RiskEnum risk = null;

  /**
   * The email address type (domain) is &#x60;free&#x60; or &#x60;corporate&#x60;.
   */
  @JsonAdapter(AddressTypeEnum.Adapter.class)
  public enum AddressTypeEnum {
    CORPORATE("corporate"),
    
    FREE("free");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("addressType")
  private AddressTypeEnum addressType = null;

  @SerializedName("isDisposableAddress")
  private Boolean isDisposableAddress = null;

  @SerializedName("suggestion")
  private String suggestion = null;

  @SerializedName("emailRole")
  private String emailRole = null;

  @SerializedName("localPart")
  private String localPart = null;

  @SerializedName("domainPart")
  private String domainPart = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("preference")
  private Integer preference = null;

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

  public DoEmailLookupResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The email address passed to the call.
   * @return address
  **/
  @ApiModelProperty(example = "john@sample.com", required = true, value = "The email address passed to the call.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DoEmailLookupResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The email is &#x60;valid&#x60; or &#x60;invalid&#x60;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The email is `valid` or `invalid`.")
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
   * The delivery status of the email address is&#x60;deliverable&#x60;, &#x60;undeliverable&#x60;  or &#x60;unknown&#x60;.
   * @return deliverability
  **/
  @ApiModelProperty(example = "undeliverable", required = true, value = "The delivery status of the email address is`deliverable`, `undeliverable`  or `unknown`.")
  public String getDeliverability() {
    return deliverability;
  }

  public void setDeliverability(String deliverability) {
    this.deliverability = deliverability;
  }

  public DoEmailLookupResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the checked email is invalid/undeliverable.
   * @return reason
  **/
  @ApiModelProperty(example = "No MX host found", required = true, value = "The reason why the checked email is invalid/undeliverable.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DoEmailLookupResponse risk(RiskEnum risk) {
    this.risk = risk;
    return this;
  }

   /**
   * The risk score of the email is&#x60;high&#x60;, &#x60;medium&#x60;, &#x60;low&#x60; or &#x60;null&#x60;.
   * @return risk
  **/
  @ApiModelProperty(example = "high", required = true, value = "The risk score of the email is`high`, `medium`, `low` or `null`.")
  public RiskEnum getRisk() {
    return risk;
  }

  public void setRisk(RiskEnum risk) {
    this.risk = risk;
  }

  public DoEmailLookupResponse addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * The email address type (domain) is &#x60;free&#x60; or &#x60;corporate&#x60;.
   * @return addressType
  **/
  @ApiModelProperty(example = "corporate", required = true, value = "The email address type (domain) is `free` or `corporate`.")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public DoEmailLookupResponse isDisposableAddress(Boolean isDisposableAddress) {
    this.isDisposableAddress = isDisposableAddress;
    return this;
  }

   /**
   * This is be &#x60;true&#x60; if the domain is in the list of disposable email addresses, otherwise returns as &#x60;false&#x60;.
   * @return isDisposableAddress
  **/
  @ApiModelProperty(example = "false", required = true, value = "This is be `true` if the domain is in the list of disposable email addresses, otherwise returns as `false`.")
  public Boolean isIsDisposableAddress() {
    return isDisposableAddress;
  }

  public void setIsDisposableAddress(Boolean isDisposableAddress) {
    this.isDisposableAddress = isDisposableAddress;
  }

  public DoEmailLookupResponse suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Null if nothing is suggested, however, if there is a potential typo in the email address, the closest suggestion is provided.
   * @return suggestion
  **/
  @ApiModelProperty(example = "john@sample.com", required = true, value = "Null if nothing is suggested, however, if there is a potential typo in the email address, the closest suggestion is provided.")
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }

  public DoEmailLookupResponse emailRole(String emailRole) {
    this.emailRole = emailRole;
    return this;
  }

   /**
   * Checks the mailbox part of the email whether it matches a specific role type (‘admin’, ‘sales’, ‘webmaster’)
   * @return emailRole
  **/
  @ApiModelProperty(example = "admin", required = true, value = "Checks the mailbox part of the email whether it matches a specific role type (‘admin’, ‘sales’, ‘webmaster’)")
  public String getEmailRole() {
    return emailRole;
  }

  public void setEmailRole(String emailRole) {
    this.emailRole = emailRole;
  }

  public DoEmailLookupResponse localPart(String localPart) {
    this.localPart = localPart;
    return this;
  }

   /**
   * The local part of the email address.
   * @return localPart
  **/
  @ApiModelProperty(example = "john", required = true, value = "The local part of the email address.")
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
   * The domain part of the email address.
   * @return domainPart
  **/
  @ApiModelProperty(example = "sample.com", required = true, value = "The domain part of the email address.")
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
   * Email exchange server domain name (MX record value).
   * @return exchange
  **/
  @ApiModelProperty(example = "mx1.textmagic.com", required = true, value = "Email exchange server domain name (MX record value).")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public DoEmailLookupResponse preference(Integer preference) {
    this.preference = preference;
    return this;
  }

   /**
   * MX record preference.
   * @return preference
  **/
  @ApiModelProperty(example = "10", required = true, value = "MX record preference.")
  public Integer getPreference() {
    return preference;
  }

  public void setPreference(Integer preference) {
    this.preference = preference;
  }

  public DoEmailLookupResponse isInWhiteList(Boolean isInWhiteList) {
    this.isInWhiteList = isInWhiteList;
    return this;
  }

   /**
   * &#x60;true&#x60; if the email address exists in TextMagic whitelist. 
   * @return isInWhiteList
  **/
  @ApiModelProperty(example = "false", required = true, value = "`true` if the email address exists in TextMagic whitelist. ")
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
   * &#x60;true&#x60; if the email address exists in TextMagic blacklist. 
   * @return isInBlackList
  **/
  @ApiModelProperty(example = "false", required = true, value = "`true` if the email address exists in TextMagic blacklist. ")
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
   * &#x60;true&#x60; if the email address domain has an MX record. 
   * @return hasMx
  **/
  @ApiModelProperty(example = "true", required = true, value = "`true` if the email address domain has an MX record. ")
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
   * &#x60;true&#x60; if the email address domain has an A record (IPv4). 
   * @return hasAa
  **/
  @ApiModelProperty(example = "true", required = true, value = "`true` if the email address domain has an A record (IPv4). ")
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
   * &#x60;true&#x60; if the email address domain has an AAAA record (IPv6). 
   * @return hasAaaa
  **/
  @ApiModelProperty(example = "true", required = true, value = "`true` if the email address domain has an AAAA record (IPv6). ")
  public Boolean isHasAaaa() {
    return hasAaaa;
  }

  public void setHasAaaa(Boolean hasAaaa) {
    this.hasAaaa = hasAaaa;
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
        Objects.equals(this.status, doEmailLookupResponse.status) &&
        Objects.equals(this.deliverability, doEmailLookupResponse.deliverability) &&
        Objects.equals(this.reason, doEmailLookupResponse.reason) &&
        Objects.equals(this.risk, doEmailLookupResponse.risk) &&
        Objects.equals(this.addressType, doEmailLookupResponse.addressType) &&
        Objects.equals(this.isDisposableAddress, doEmailLookupResponse.isDisposableAddress) &&
        Objects.equals(this.suggestion, doEmailLookupResponse.suggestion) &&
        Objects.equals(this.emailRole, doEmailLookupResponse.emailRole) &&
        Objects.equals(this.localPart, doEmailLookupResponse.localPart) &&
        Objects.equals(this.domainPart, doEmailLookupResponse.domainPart) &&
        Objects.equals(this.exchange, doEmailLookupResponse.exchange) &&
        Objects.equals(this.preference, doEmailLookupResponse.preference) &&
        Objects.equals(this.isInWhiteList, doEmailLookupResponse.isInWhiteList) &&
        Objects.equals(this.isInBlackList, doEmailLookupResponse.isInBlackList) &&
        Objects.equals(this.hasMx, doEmailLookupResponse.hasMx) &&
        Objects.equals(this.hasAa, doEmailLookupResponse.hasAa) &&
        Objects.equals(this.hasAaaa, doEmailLookupResponse.hasAaaa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, status, deliverability, reason, risk, addressType, isDisposableAddress, suggestion, emailRole, localPart, domainPart, exchange, preference, isInWhiteList, isInBlackList, hasMx, hasAa, hasAaaa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoEmailLookupResponse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deliverability: ").append(toIndentedString(deliverability)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    isDisposableAddress: ").append(toIndentedString(isDisposableAddress)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    emailRole: ").append(toIndentedString(emailRole)).append("\n");
    sb.append("    localPart: ").append(toIndentedString(localPart)).append("\n");
    sb.append("    domainPart: ").append(toIndentedString(domainPart)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    isInWhiteList: ").append(toIndentedString(isInWhiteList)).append("\n");
    sb.append("    isInBlackList: ").append(toIndentedString(isInBlackList)).append("\n");
    sb.append("    hasMx: ").append(toIndentedString(hasMx)).append("\n");
    sb.append("    hasAa: ").append(toIndentedString(hasAa)).append("\n");
    sb.append("    hasAaaa: ").append(toIndentedString(hasAaaa)).append("\n");
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

