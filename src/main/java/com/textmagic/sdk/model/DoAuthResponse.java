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
import com.textmagic.sdk.model.DoAuthResponseMinVersions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DoAuthResponse
 */

public class DoAuthResponse {
  @SerializedName("username")
  private String username = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("expires")
  private OffsetDateTime expires = null;

  @SerializedName("minVersions")
  private DoAuthResponseMinVersions minVersions = null;

  @SerializedName("disallowedRules")
  private List<String> disallowedRules = new ArrayList<String>();

  public DoAuthResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "test", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DoAuthResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "fPTUUKQ4Dvaq9l9ZQQgsLO1HfSR0K4", required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public DoAuthResponse expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public DoAuthResponse minVersions(DoAuthResponseMinVersions minVersions) {
    this.minVersions = minVersions;
    return this;
  }

   /**
   * Get minVersions
   * @return minVersions
  **/
  @ApiModelProperty(required = true, value = "")
  public DoAuthResponseMinVersions getMinVersions() {
    return minVersions;
  }

  public void setMinVersions(DoAuthResponseMinVersions minVersions) {
    this.minVersions = minVersions;
  }

  public DoAuthResponse disallowedRules(List<String> disallowedRules) {
    this.disallowedRules = disallowedRules;
    return this;
  }

  public DoAuthResponse addDisallowedRulesItem(String disallowedRulesItem) {
    this.disallowedRules.add(disallowedRulesItem);
    return this;
  }

   /**
   * Get disallowedRules
   * @return disallowedRules
  **/
  @ApiModelProperty(example = "[\"SEND_MESSAGES\",\"MAKE_CALLS\",\"EMAIL_LOOKUP\"]", required = true, value = "")
  public List<String> getDisallowedRules() {
    return disallowedRules;
  }

  public void setDisallowedRules(List<String> disallowedRules) {
    this.disallowedRules = disallowedRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoAuthResponse doAuthResponse = (DoAuthResponse) o;
    return Objects.equals(this.username, doAuthResponse.username) &&
        Objects.equals(this.token, doAuthResponse.token) &&
        Objects.equals(this.expires, doAuthResponse.expires) &&
        Objects.equals(this.minVersions, doAuthResponse.minVersions) &&
        Objects.equals(this.disallowedRules, doAuthResponse.disallowedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, token, expires, minVersions, disallowedRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoAuthResponse {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    minVersions: ").append(toIndentedString(minVersions)).append("\n");
    sb.append("    disallowedRules: ").append(toIndentedString(disallowedRules)).append("\n");
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

