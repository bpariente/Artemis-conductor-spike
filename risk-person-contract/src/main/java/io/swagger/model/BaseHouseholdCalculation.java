package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GrantingRulesParameters;
import io.swagger.model.HouseholdCalculation;
import io.swagger.model.MinimumValueModificationFactors;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Abstract class for Household Calculation
 */
@ApiModel(description = "Abstract class for Household Calculation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "subType", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = GrantingGuidelinesCorrectionResponse.class, name = "GrantingGuidelinesCorrectionResponse"),
  @JsonSubTypes.Type(value = GrantingGuidelinesCorrectionRequest.class, name = "GrantingGuidelinesCorrectionRequest"),
})

public class BaseHouseholdCalculation   {
  @JsonProperty("firstCustHouseholdCalculation")
  private HouseholdCalculation firstCustHouseholdCalculation = null;

  @JsonProperty("secondCustHouseholdCalculation")
  private HouseholdCalculation secondCustHouseholdCalculation = null;

  @JsonProperty("firstCustMinValueModFactors")
  private MinimumValueModificationFactors firstCustMinValueModFactors = null;

  @JsonProperty("secondCustMinValueModFactors")
  private MinimumValueModificationFactors secondCustMinValueModFactors = null;

  @JsonProperty("grantingRulesParameters")
  private GrantingRulesParameters grantingRulesParameters = null;

  public BaseHouseholdCalculation firstCustHouseholdCalculation(HouseholdCalculation firstCustHouseholdCalculation) {
    this.firstCustHouseholdCalculation = firstCustHouseholdCalculation;
    return this;
  }

  /**
   * Get firstCustHouseholdCalculation
   * @return firstCustHouseholdCalculation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public HouseholdCalculation getFirstCustHouseholdCalculation() {
    return firstCustHouseholdCalculation;
  }

  public void setFirstCustHouseholdCalculation(HouseholdCalculation firstCustHouseholdCalculation) {
    this.firstCustHouseholdCalculation = firstCustHouseholdCalculation;
  }

  public BaseHouseholdCalculation secondCustHouseholdCalculation(HouseholdCalculation secondCustHouseholdCalculation) {
    this.secondCustHouseholdCalculation = secondCustHouseholdCalculation;
    return this;
  }

  /**
   * Get secondCustHouseholdCalculation
   * @return secondCustHouseholdCalculation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HouseholdCalculation getSecondCustHouseholdCalculation() {
    return secondCustHouseholdCalculation;
  }

  public void setSecondCustHouseholdCalculation(HouseholdCalculation secondCustHouseholdCalculation) {
    this.secondCustHouseholdCalculation = secondCustHouseholdCalculation;
  }

  public BaseHouseholdCalculation firstCustMinValueModFactors(MinimumValueModificationFactors firstCustMinValueModFactors) {
    this.firstCustMinValueModFactors = firstCustMinValueModFactors;
    return this;
  }

  /**
   * Get firstCustMinValueModFactors
   * @return firstCustMinValueModFactors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MinimumValueModificationFactors getFirstCustMinValueModFactors() {
    return firstCustMinValueModFactors;
  }

  public void setFirstCustMinValueModFactors(MinimumValueModificationFactors firstCustMinValueModFactors) {
    this.firstCustMinValueModFactors = firstCustMinValueModFactors;
  }

  public BaseHouseholdCalculation secondCustMinValueModFactors(MinimumValueModificationFactors secondCustMinValueModFactors) {
    this.secondCustMinValueModFactors = secondCustMinValueModFactors;
    return this;
  }

  /**
   * Get secondCustMinValueModFactors
   * @return secondCustMinValueModFactors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MinimumValueModificationFactors getSecondCustMinValueModFactors() {
    return secondCustMinValueModFactors;
  }

  public void setSecondCustMinValueModFactors(MinimumValueModificationFactors secondCustMinValueModFactors) {
    this.secondCustMinValueModFactors = secondCustMinValueModFactors;
  }

  public BaseHouseholdCalculation grantingRulesParameters(GrantingRulesParameters grantingRulesParameters) {
    this.grantingRulesParameters = grantingRulesParameters;
    return this;
  }

  /**
   * Get grantingRulesParameters
   * @return grantingRulesParameters
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GrantingRulesParameters getGrantingRulesParameters() {
    return grantingRulesParameters;
  }

  public void setGrantingRulesParameters(GrantingRulesParameters grantingRulesParameters) {
    this.grantingRulesParameters = grantingRulesParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseHouseholdCalculation baseHouseholdCalculation = (BaseHouseholdCalculation) o;
    return Objects.equals(this.firstCustHouseholdCalculation, baseHouseholdCalculation.firstCustHouseholdCalculation) &&
        Objects.equals(this.secondCustHouseholdCalculation, baseHouseholdCalculation.secondCustHouseholdCalculation) &&
        Objects.equals(this.firstCustMinValueModFactors, baseHouseholdCalculation.firstCustMinValueModFactors) &&
        Objects.equals(this.secondCustMinValueModFactors, baseHouseholdCalculation.secondCustMinValueModFactors) &&
        Objects.equals(this.grantingRulesParameters, baseHouseholdCalculation.grantingRulesParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstCustHouseholdCalculation, secondCustHouseholdCalculation, firstCustMinValueModFactors, secondCustMinValueModFactors, grantingRulesParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseHouseholdCalculation {\n");
    
    sb.append("    firstCustHouseholdCalculation: ").append(toIndentedString(firstCustHouseholdCalculation)).append("\n");
    sb.append("    secondCustHouseholdCalculation: ").append(toIndentedString(secondCustHouseholdCalculation)).append("\n");
    sb.append("    firstCustMinValueModFactors: ").append(toIndentedString(firstCustMinValueModFactors)).append("\n");
    sb.append("    secondCustMinValueModFactors: ").append(toIndentedString(secondCustMinValueModFactors)).append("\n");
    sb.append("    grantingRulesParameters: ").append(toIndentedString(grantingRulesParameters)).append("\n");
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

