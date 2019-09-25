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
import com.textmagic.sdk.model.MessageSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAllMessageSessionsResponse
 */

public class GetAllMessageSessionsResponse {
  @SerializedName("page")
  private Integer page = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("resources")
  private List<MessageSession> resources = new ArrayList<MessageSession>();

  public GetAllMessageSessionsResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public GetAllMessageSessionsResponse pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public GetAllMessageSessionsResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public GetAllMessageSessionsResponse resources(List<MessageSession> resources) {
    this.resources = resources;
    return this;
  }

  public GetAllMessageSessionsResponse addResourcesItem(MessageSession resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(required = true, value = "")
  public List<MessageSession> getResources() {
    return resources;
  }

  public void setResources(List<MessageSession> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllMessageSessionsResponse getAllMessageSessionsResponse = (GetAllMessageSessionsResponse) o;
    return Objects.equals(this.page, getAllMessageSessionsResponse.page) &&
        Objects.equals(this.pageCount, getAllMessageSessionsResponse.pageCount) &&
        Objects.equals(this.limit, getAllMessageSessionsResponse.limit) &&
        Objects.equals(this.resources, getAllMessageSessionsResponse.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageCount, limit, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllMessageSessionsResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

