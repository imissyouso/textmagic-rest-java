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
import java.util.ArrayList;
import java.util.List;

/**
 * GetAvailableDedicatedNumbersResponse
 */

public class GetAvailableDedicatedNumbersResponse {
  @SerializedName("numbers")
  private List<String> numbers = new ArrayList<String>();

  @SerializedName("price")
  private Float price = null;

  public GetAvailableDedicatedNumbersResponse numbers(List<String> numbers) {
    this.numbers = numbers;
    return this;
  }

  public GetAvailableDedicatedNumbersResponse addNumbersItem(String numbersItem) {
    this.numbers.add(numbersItem);
    return this;
  }

   /**
   * Array of phone numbers.
   * @return numbers
  **/
  @ApiModelProperty(example = "[447860021130,447860021131]", required = true, value = "Array of phone numbers.")
  public List<String> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<String> numbers) {
    this.numbers = numbers;
  }

  public GetAvailableDedicatedNumbersResponse price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Dedicated number monthly fee for this country. Returned in current [account](http://docs.textmagictesting.com/#tag/User) currency.
   * @return price
  **/
  @ApiModelProperty(example = "2.4", required = true, value = "Dedicated number monthly fee for this country. Returned in current [account](http://docs.textmagictesting.com/#tag/User) currency.")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAvailableDedicatedNumbersResponse getAvailableDedicatedNumbersResponse = (GetAvailableDedicatedNumbersResponse) o;
    return Objects.equals(this.numbers, getAvailableDedicatedNumbersResponse.numbers) &&
        Objects.equals(this.price, getAvailableDedicatedNumbersResponse.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numbers, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAvailableDedicatedNumbersResponse {\n");
    
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

