package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GrantingRulesParameters;
import io.swagger.model.PersonHouseholdCalculation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HouseholdCalculationCheck
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class HouseholdCalculationCheck   {
  @JsonProperty("personHouseholdCalculation")
  private PersonHouseholdCalculation personHouseholdCalculation = null;

  @JsonProperty("personHouseholdCalculationAISP")
  private PersonHouseholdCalculation personHouseholdCalculationAISP = null;

  @JsonProperty("secondPersonHouseholdCalculation")
  private PersonHouseholdCalculation secondPersonHouseholdCalculation = null;

  @JsonProperty("secondPersonHouseholdCalculationAISP")
  private PersonHouseholdCalculation secondPersonHouseholdCalculationAISP = null;

  @JsonProperty("grantingRulesParameters")
  private GrantingRulesParameters grantingRulesParameters = null;

  public HouseholdCalculationCheck personHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
    this.personHouseholdCalculation = personHouseholdCalculation;
    return this;
  }

  /**
   * Get personHouseholdCalculation
   * @return personHouseholdCalculation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PersonHouseholdCalculation getPersonHouseholdCalculation() {
    return personHouseholdCalculation;
  }

  public void setPersonHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
    this.personHouseholdCalculation = personHouseholdCalculation;
  }

  public HouseholdCalculationCheck personHouseholdCalculationAISP(PersonHouseholdCalculation personHouseholdCalculationAISP) {
    this.personHouseholdCalculationAISP = personHouseholdCalculationAISP;
    return this;
  }

  /**
   * Get personHouseholdCalculationAISP
   * @return personHouseholdCalculationAISP
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonHouseholdCalculation getPersonHouseholdCalculationAISP() {
    return personHouseholdCalculationAISP;
  }

  public void setPersonHouseholdCalculationAISP(PersonHouseholdCalculation personHouseholdCalculationAISP) {
    this.personHouseholdCalculationAISP = personHouseholdCalculationAISP;
  }

  public HouseholdCalculationCheck secondPersonHouseholdCalculation(PersonHouseholdCalculation secondPersonHouseholdCalculation) {
    this.secondPersonHouseholdCalculation = secondPersonHouseholdCalculation;
    return this;
  }

  /**
   * Get secondPersonHouseholdCalculation
   * @return secondPersonHouseholdCalculation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonHouseholdCalculation getSecondPersonHouseholdCalculation() {
    return secondPersonHouseholdCalculation;
  }

  public void setSecondPersonHouseholdCalculation(PersonHouseholdCalculation secondPersonHouseholdCalculation) {
    this.secondPersonHouseholdCalculation = secondPersonHouseholdCalculation;
  }

  public HouseholdCalculationCheck secondPersonHouseholdCalculationAISP(PersonHouseholdCalculation secondPersonHouseholdCalculationAISP) {
    this.secondPersonHouseholdCalculationAISP = secondPersonHouseholdCalculationAISP;
    return this;
  }

  /**
   * Get secondPersonHouseholdCalculationAISP
   * @return secondPersonHouseholdCalculationAISP
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonHouseholdCalculation getSecondPersonHouseholdCalculationAISP() {
    return secondPersonHouseholdCalculationAISP;
  }

  public void setSecondPersonHouseholdCalculationAISP(PersonHouseholdCalculation secondPersonHouseholdCalculationAISP) {
    this.secondPersonHouseholdCalculationAISP = secondPersonHouseholdCalculationAISP;
  }

  public HouseholdCalculationCheck grantingRulesParameters(GrantingRulesParameters grantingRulesParameters) {
    this.grantingRulesParameters = grantingRulesParameters;
    return this;
  }

  /**
   * Get grantingRulesParameters
   * @return grantingRulesParameters
  **/
  @ApiModelProperty(value = "")

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
    HouseholdCalculationCheck householdCalculationCheck = (HouseholdCalculationCheck) o;
    return Objects.equals(this.personHouseholdCalculation, householdCalculationCheck.personHouseholdCalculation) &&
        Objects.equals(this.personHouseholdCalculationAISP, householdCalculationCheck.personHouseholdCalculationAISP) &&
        Objects.equals(this.secondPersonHouseholdCalculation, householdCalculationCheck.secondPersonHouseholdCalculation) &&
        Objects.equals(this.secondPersonHouseholdCalculationAISP, householdCalculationCheck.secondPersonHouseholdCalculationAISP) &&
        Objects.equals(this.grantingRulesParameters, householdCalculationCheck.grantingRulesParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personHouseholdCalculation, personHouseholdCalculationAISP, secondPersonHouseholdCalculation, secondPersonHouseholdCalculationAISP, grantingRulesParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseholdCalculationCheck {\n");
    
    sb.append("    personHouseholdCalculation: ").append(toIndentedString(personHouseholdCalculation)).append("\n");
    sb.append("    personHouseholdCalculationAISP: ").append(toIndentedString(personHouseholdCalculationAISP)).append("\n");
    sb.append("    secondPersonHouseholdCalculation: ").append(toIndentedString(secondPersonHouseholdCalculation)).append("\n");
    sb.append("    secondPersonHouseholdCalculationAISP: ").append(toIndentedString(secondPersonHouseholdCalculationAISP)).append("\n");
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

