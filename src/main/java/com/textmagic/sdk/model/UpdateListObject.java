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
 * UpdateListObject
 */

public class UpdateListObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("shared")
  private Boolean shared = false;

  @SerializedName("favorited")
  private Boolean favorited = false;

  @SerializedName("isDefault")
  private Boolean isDefault = false;

  public UpdateListObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * List name.
   * @return name
  **/
  @ApiModelProperty(example = "Private list", required = true, value = "List name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateListObject shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Make this list shared or not?
   * @return shared
  **/
  @ApiModelProperty(example = "true", value = "Make this list shared or not?")
  public Boolean isShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public UpdateListObject favorited(Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

   /**
   * Is list favorited.
   * @return favorited
  **/
  @ApiModelProperty(example = "true", value = "Is list favorited.")
  public Boolean isFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  public UpdateListObject isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is list default for new contacts (web only).
   * @return isDefault
  **/
  @ApiModelProperty(example = "true", value = "Is list default for new contacts (web only).")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateListObject updateListObject = (UpdateListObject) o;
    return Objects.equals(this.name, updateListObject.name) &&
        Objects.equals(this.shared, updateListObject.shared) &&
        Objects.equals(this.favorited, updateListObject.favorited) &&
        Objects.equals(this.isDefault, updateListObject.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shared, favorited, isDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateListObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

