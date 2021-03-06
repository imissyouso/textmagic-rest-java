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
 * Invoice
 */

public class Invoice {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("bundle")
  private Integer bundle = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("vat")
  private Float vat = null;

  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  public Invoice id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The invoice ID.
   * @return id
  **/
  @ApiModelProperty(example = "1099", required = true, value = "The invoice ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Invoice bundle(Integer bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Top up amount.
   * @return bundle
  **/
  @ApiModelProperty(example = "200", required = true, value = "Top up amount.")
  public Integer getBundle() {
    return bundle;
  }

  public void setBundle(Integer bundle) {
    this.bundle = bundle;
  }

  public Invoice currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Top up currency.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "Top up currency.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Invoice vat(Float vat) {
    this.vat = vat;
    return this;
  }

   /**
   * VAT charged (if any).
   * @return vat
  **/
  @ApiModelProperty(example = "2.0", required = true, value = "VAT charged (if any).")
  public Float getVat() {
    return vat;
  }

  public void setVat(Float vat) {
    this.vat = vat;
  }

  public Invoice paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method description.
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "MasterCard ending in 1234", required = true, value = "Payment method description.")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.bundle, invoice.bundle) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.vat, invoice.vat) &&
        Objects.equals(this.paymentMethod, invoice.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bundle, currency, vat, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

