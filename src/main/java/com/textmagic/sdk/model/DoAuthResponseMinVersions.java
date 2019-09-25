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
 * DoAuthResponseMinVersions
 */

public class DoAuthResponseMinVersions {
  @SerializedName("ios")
  private Integer ios = null;

  @SerializedName("android")
  private Integer android = null;

  @SerializedName("desktop")
  private Integer desktop = null;

  public DoAuthResponseMinVersions ios(Integer ios) {
    this.ios = ios;
    return this;
  }

   /**
   * Get ios
   * @return ios
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public Integer getIos() {
    return ios;
  }

  public void setIos(Integer ios) {
    this.ios = ios;
  }

  public DoAuthResponseMinVersions android(Integer android) {
    this.android = android;
    return this;
  }

   /**
   * Get android
   * @return android
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public Integer getAndroid() {
    return android;
  }

  public void setAndroid(Integer android) {
    this.android = android;
  }

  public DoAuthResponseMinVersions desktop(Integer desktop) {
    this.desktop = desktop;
    return this;
  }

   /**
   * Get desktop
   * @return desktop
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public Integer getDesktop() {
    return desktop;
  }

  public void setDesktop(Integer desktop) {
    this.desktop = desktop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoAuthResponseMinVersions doAuthResponseMinVersions = (DoAuthResponseMinVersions) o;
    return Objects.equals(this.ios, doAuthResponseMinVersions.ios) &&
        Objects.equals(this.android, doAuthResponseMinVersions.android) &&
        Objects.equals(this.desktop, doAuthResponseMinVersions.desktop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ios, android, desktop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoAuthResponseMinVersions {\n");
    
    sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
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

