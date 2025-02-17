package com.backend.model;

import java.net.URI;
import java.util.Objects;
import com.backend.model.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Order
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-17T10:24:11.654393+08:00[Asia/Shanghai]", comments = "Generator version: 7.11.0")
public class Order {

  private @Nullable String id;

  private @Nullable String customerID;

  private @Nullable String status;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  private @Nullable String paymentLink;

  public Order id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order customerID(String customerID) {
    this.customerID = customerID;
    return this;
  }

  /**
   * Get customerID
   * @return customerID
   */
  
  @Schema(name = "customerID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerID")
  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public Order status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Order items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Item> getItems() {
    return items;
  }

  public void setItems(List<@Valid Item> items) {
    this.items = items;
  }

  public Order paymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
    return this;
  }

  /**
   * Get paymentLink
   * @return paymentLink
   */
  
  @Schema(name = "paymentLink", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentLink")
  public String getPaymentLink() {
    return paymentLink;
  }

  public void setPaymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.customerID, order.customerID) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.paymentLink, order.paymentLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerID, status, items, paymentLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

