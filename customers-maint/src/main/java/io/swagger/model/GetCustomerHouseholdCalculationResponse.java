package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonHouseholdCalculation;
import io.swagger.model.PersonHouseholdCalculationAddOn;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCustomerHouseholdCalculationResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerHouseholdCalculationResponse   {
  @JsonProperty("personHouseholdCalculation")
  private PersonHouseholdCalculation personHouseholdCalculation = null;

  @JsonProperty("personHouseholdCalculationAddOn")
  private PersonHouseholdCalculationAddOn personHouseholdCalculationAddOn = null;

  public GetCustomerHouseholdCalculationResponse personHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
    this.personHouseholdCalculation = personHouseholdCalculation;
    return this;
  }

  /**
   * Get personHouseholdCalculation
   * @return personHouseholdCalculation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonHouseholdCalculation getPersonHouseholdCalculation() {
    return personHouseholdCalculation;
  }

  public void setPersonHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
    this.personHouseholdCalculation = personHouseholdCalculation;
  }

  public GetCustomerHouseholdCalculationResponse personHouseholdCalculationAddOn(PersonHouseholdCalculationAddOn personHouseholdCalculationAddOn) {
    this.personHouseholdCalculationAddOn = personHouseholdCalculationAddOn;
    return this;
  }

  /**
   * Get personHouseholdCalculationAddOn
   * @return personHouseholdCalculationAddOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonHouseholdCalculationAddOn getPersonHouseholdCalculationAddOn() {
    return personHouseholdCalculationAddOn;
  }

  public void setPersonHouseholdCalculationAddOn(PersonHouseholdCalculationAddOn personHouseholdCalculationAddOn) {
    this.personHouseholdCalculationAddOn = personHouseholdCalculationAddOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerHouseholdCalculationResponse getCustomerHouseholdCalculationResponse = (GetCustomerHouseholdCalculationResponse) o;
    return Objects.equals(this.personHouseholdCalculation, getCustomerHouseholdCalculationResponse.personHouseholdCalculation) &&
        Objects.equals(this.personHouseholdCalculationAddOn, getCustomerHouseholdCalculationResponse.personHouseholdCalculationAddOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personHouseholdCalculation, personHouseholdCalculationAddOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerHouseholdCalculationResponse {\n");
    
    sb.append("    personHouseholdCalculation: ").append(toIndentedString(personHouseholdCalculation)).append("\n");
    sb.append("    personHouseholdCalculationAddOn: ").append(toIndentedString(personHouseholdCalculationAddOn)).append("\n");
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

