package com.order.management.orderitems.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product code",
    "product name",
    "quantity"
})
public class OrderItemsPOJO {

    @JsonProperty("product code")
    private String productCode;
    @JsonProperty("product name")
    private String productName;
    @JsonProperty("quantity")
    private String quantity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("product code")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("product code")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public OrderItemsPOJO withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    @JsonProperty("product name")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("product name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OrderItemsPOJO withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public OrderItemsPOJO withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public OrderItemsPOJO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(productCode).append(productName).append(quantity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderItemsPOJO) == false) {
            return false;
        }
        OrderItemsPOJO rhs = ((OrderItemsPOJO) other);
        return new EqualsBuilder().append(productCode, rhs.productCode).append(productName, rhs.productName).append(quantity, rhs.quantity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
