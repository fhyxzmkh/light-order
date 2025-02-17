package com.backend.model;

import java.net.URI;
import java.util.Objects;
import com.backend.model.ItemWithQuantity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * CreateOrderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-17T10:24:11.654393+08:00[Asia/Shanghai]", comments = "Generator version: 7.11.0")
public class CreateOrderRequest {

  private String customerID;

  @Valid
  private List<@Valid ItemWithQuantity> items = new ArrayList<>();

  public CreateOrderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateOrderRequest(String customerID, List<@Valid ItemWithQuantity> items) {
    this.customerID = customerID;
    this.items = items;
  }

  public CreateOrderRequest customerID(String customerID) {
    this.customerID = customerID;
    return this;
  }

  /**
   * Get customerID
   * @return customerID
   */
  @NotNull
  @Schema(name = "customerID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerID")
  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public CreateOrderRequest items(List<@Valid ItemWithQuantity> items) {
    this.items = items;
    return this;
  }

  public CreateOrderRequest addItemsItem(ItemWithQuantity itemsItem) {
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
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ItemWithQuantity> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemWithQuantity> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.customerID, createOrderRequest.customerID) &&
        Objects.equals(this.items, createOrderRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

