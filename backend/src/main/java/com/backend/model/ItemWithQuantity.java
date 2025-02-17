package com.backend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * ItemWithQuantity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-17T10:24:11.654393+08:00[Asia/Shanghai]", comments = "Generator version: 7.11.0")
public class ItemWithQuantity {

  private @Nullable String id;

  private @Nullable Integer quantity;

  public ItemWithQuantity id(String id) {
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

  public ItemWithQuantity quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemWithQuantity itemWithQuantity = (ItemWithQuantity) o;
    return Objects.equals(this.id, itemWithQuantity.id) &&
        Objects.equals(this.quantity, itemWithQuantity.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemWithQuantity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

