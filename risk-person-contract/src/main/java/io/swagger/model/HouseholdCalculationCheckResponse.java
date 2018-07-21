package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonHouseholdCalculation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HouseholdCalculationCheckResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class HouseholdCalculationCheckResponse   {
  @JsonProperty("personHouseholdCalculation")
  private PersonHouseholdCalculation personHouseholdCalculation = null;

  @JsonProperty("secondPersonHouseholdCalculation")
  private PersonHouseholdCalculation secondPersonHouseholdCalculation = null;

  public HouseholdCalculationCheckResponse personHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
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

  public HouseholdCalculationCheckResponse secondPersonHouseholdCalculation(PersonHouseholdCalculation secondPersonHouseholdCalculation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HouseholdCalculationCheckResponse householdCalculationCheckResponse = (HouseholdCalculationCheckResponse) o;
    return Objects.equals(this.personHouseholdCalculation, householdCalculationCheckResponse.personHouseholdCalculation) &&
        Objects.equals(this.secondPersonHouseholdCalculation, householdCalculationCheckResponse.secondPersonHouseholdCalculation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personHouseholdCalculation, secondPersonHouseholdCalculation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseholdCalculationCheckResponse {\n");
    
    sb.append("    personHouseholdCalculation: ").append(toIndentedString(personHouseholdCalculation)).append("\n");
    sb.append("    secondPersonHouseholdCalculation: ").append(toIndentedString(secondPersonHouseholdCalculation)).append("\n");
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

