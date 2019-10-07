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
 * GetSubaccountsWithTokensInputObject
 */

public class GetSubaccountsWithTokensInputObject {
  @SerializedName("appName")
  private String appName = null;

  @SerializedName("password")
  private String password = null;

  public GetSubaccountsWithTokensInputObject appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Application name
   * @return appName
  **/
  @ApiModelProperty(example = "sample app", required = true, value = "Application name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public GetSubaccountsWithTokensInputObject password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Your account password
   * @return password
  **/
  @ApiModelProperty(example = "strongPassword", required = true, value = "Your account password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSubaccountsWithTokensInputObject getSubaccountsWithTokensInputObject = (GetSubaccountsWithTokensInputObject) o;
    return Objects.equals(this.appName, getSubaccountsWithTokensInputObject.appName) &&
        Objects.equals(this.password, getSubaccountsWithTokensInputObject.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSubaccountsWithTokensInputObject {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

