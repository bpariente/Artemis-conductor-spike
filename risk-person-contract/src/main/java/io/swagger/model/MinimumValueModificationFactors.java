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
 * Minimum Value Modification Factors
 */
@ApiModel(description = "Minimum Value Modification Factors")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class MinimumValueModificationFactors   {
  @JsonProperty("livingCostsFactor")
  private BigDecimal livingCostsFactor = null;

  @JsonProperty("carCostsFactor")
  private BigDecimal carCostsFactor = null;

  @JsonProperty("phoneAndTelevisionCostsFactor")
  private BigDecimal phoneAndTelevisionCostsFactor = null;

  @JsonProperty("housingCostsFactor")
  private BigDecimal housingCostsFactor = null;

  public MinimumValueModificationFactors livingCostsFactor(BigDecimal livingCostsFactor) {
    this.livingCostsFactor = livingCostsFactor;
    return this;
  }

  /**
   * Get livingCostsFactor
   * @return livingCostsFactor
  **/
  @ApiModelProperty(example = "1000.0", value = "")

  @Valid

  public BigDecimal getLivingCostsFactor() {
    return livingCostsFactor;
  }

  public void setLivingCostsFactor(BigDecimal livingCostsFactor) {
    this.livingCostsFactor = livingCostsFactor;
  }

  public MinimumValueModificationFactors carCostsFactor(BigDecimal carCostsFactor) {
    this.carCostsFactor = carCostsFactor;
    return this;
  }

  /**
   * Get carCostsFactor
   * @return carCostsFactor
  **/
  @ApiModelProperty(example = "1000.0", value = "")

  @Valid

  public BigDecimal getCarCostsFactor() {
    return carCostsFactor;
  }

  public void setCarCostsFactor(BigDecimal carCostsFactor) {
    this.carCostsFactor = carCostsFactor;
  }

  public MinimumValueModificationFactors phoneAndTelevisionCostsFactor(BigDecimal phoneAndTelevisionCostsFactor) {
    this.phoneAndTelevisionCostsFactor = phoneAndTelevisionCostsFactor;
    return this;
  }

  /**
   * Get phoneAndTelevisionCostsFactor
   * @return phoneAndTelevisionCostsFactor
  **/
  @ApiModelProperty(example = "1000.0", value = "")

  @Valid

  public BigDecimal getPhoneAndTelevisionCostsFactor() {
    return phoneAndTelevisionCostsFactor;
  }

  public void setPhoneAndTelevisionCostsFactor(BigDecimal phoneAndTelevisionCostsFactor) {
    this.phoneAndTelevisionCostsFactor = phoneAndTelevisionCostsFactor;
  }

  public MinimumValueModificationFactors housingCostsFactor(BigDecimal housingCostsFactor) {
    this.housingCostsFactor = housingCostsFactor;
    return this;
  }

  /**
   * Get housingCostsFactor
   * @return housingCostsFactor
  **/
  @ApiModelProperty(example = "1000.0", value = "")

  @Valid

  public BigDecimal getHousingCostsFactor() {
    return housingCostsFactor;
  }

  public void setHousingCostsFactor(BigDecimal housingCostsFactor) {
    this.housingCostsFactor = housingCostsFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimumValueModificationFactors minimumValueModificationFactors = (MinimumValueModificationFactors) o;
    return Objects.equals(this.livingCostsFactor, minimumValueModificationFactors.livingCostsFactor) &&
        Objects.equals(this.carCostsFactor, minimumValueModificationFactors.carCostsFactor) &&
        Objects.equals(this.phoneAndTelevisionCostsFactor, minimumValueModificationFactors.phoneAndTelevisionCostsFactor) &&
        Objects.equals(this.housingCostsFactor, minimumValueModificationFactors.housingCostsFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(livingCostsFactor, carCostsFactor, phoneAndTelevisionCostsFactor, housingCostsFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimumValueModificationFactors {\n");
    
    sb.append("    livingCostsFactor: ").append(toIndentedString(livingCostsFactor)).append("\n");
    sb.append("    carCostsFactor: ").append(toIndentedString(carCostsFactor)).append("\n");
    sb.append("    phoneAndTelevisionCostsFactor: ").append(toIndentedString(phoneAndTelevisionCostsFactor)).append("\n");
    sb.append("    housingCostsFactor: ").append(toIndentedString(housingCostsFactor)).append("\n");
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

