package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Granting Rules Parameters
 */
@ApiModel(description = "Granting Rules Parameters")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GrantingRulesParameters   {
  @JsonProperty("customersShareHousehold")
  private Boolean customersShareHousehold = null;

  @JsonProperty("numberOfPersonsInHousehold")
  private Integer numberOfPersonsInHousehold = null;

  @JsonProperty("married")
  private Boolean married = null;

  @JsonProperty("numberOfDependentChildren")
  private Integer numberOfDependentChildren = null;

  public GrantingRulesParameters customersShareHousehold(Boolean customersShareHousehold) {
    this.customersShareHousehold = customersShareHousehold;
    return this;
  }

  /**
   * Get customersShareHousehold
   * @return customersShareHousehold
  **/
  @ApiModelProperty(value = "")


  public Boolean isCustomersShareHousehold() {
    return customersShareHousehold;
  }

  public void setCustomersShareHousehold(Boolean customersShareHousehold) {
    this.customersShareHousehold = customersShareHousehold;
  }

  public GrantingRulesParameters numberOfPersonsInHousehold(Integer numberOfPersonsInHousehold) {
    this.numberOfPersonsInHousehold = numberOfPersonsInHousehold;
    return this;
  }

  /**
   * Get numberOfPersonsInHousehold
   * @return numberOfPersonsInHousehold
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfPersonsInHousehold() {
    return numberOfPersonsInHousehold;
  }

  public void setNumberOfPersonsInHousehold(Integer numberOfPersonsInHousehold) {
    this.numberOfPersonsInHousehold = numberOfPersonsInHousehold;
  }

  public GrantingRulesParameters married(Boolean married) {
    this.married = married;
    return this;
  }

  /**
   * Get married
   * @return married
  **/
  @ApiModelProperty(value = "")


  public Boolean isMarried() {
    return married;
  }

  public void setMarried(Boolean married) {
    this.married = married;
  }

  public GrantingRulesParameters numberOfDependentChildren(Integer numberOfDependentChildren) {
    this.numberOfDependentChildren = numberOfDependentChildren;
    return this;
  }

  /**
   * Get numberOfDependentChildren
   * @return numberOfDependentChildren
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfDependentChildren() {
    return numberOfDependentChildren;
  }

  public void setNumberOfDependentChildren(Integer numberOfDependentChildren) {
    this.numberOfDependentChildren = numberOfDependentChildren;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantingRulesParameters grantingRulesParameters = (GrantingRulesParameters) o;
    return Objects.equals(this.customersShareHousehold, grantingRulesParameters.customersShareHousehold) &&
        Objects.equals(this.numberOfPersonsInHousehold, grantingRulesParameters.numberOfPersonsInHousehold) &&
        Objects.equals(this.married, grantingRulesParameters.married) &&
        Objects.equals(this.numberOfDependentChildren, grantingRulesParameters.numberOfDependentChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customersShareHousehold, numberOfPersonsInHousehold, married, numberOfDependentChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantingRulesParameters {\n");
    
    sb.append("    customersShareHousehold: ").append(toIndentedString(customersShareHousehold)).append("\n");
    sb.append("    numberOfPersonsInHousehold: ").append(toIndentedString(numberOfPersonsInHousehold)).append("\n");
    sb.append("    married: ").append(toIndentedString(married)).append("\n");
    sb.append("    numberOfDependentChildren: ").append(toIndentedString(numberOfDependentChildren)).append("\n");
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

