package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Amount object
 */
@ApiModel(description = "Amount object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class Amount   {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * 3 character currency
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", required = true, value = "3 character currency")
  @NotNull


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Amount amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * actual amount
   * @return amount
  **/
  @ApiModelProperty(example = "1000.0", required = true, value = "actual amount")
  @NotNull

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.amount, amount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

