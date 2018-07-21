package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetAttachableIncomeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetAttachableIncomeRequest   {
  @JsonProperty("income")
  private Amount income = null;

  @JsonProperty("spouseIncome")
  private Amount spouseIncome = null;

  @JsonProperty("numberOfDependentChildren")
  private Integer numberOfDependentChildren = null;

  public GetAttachableIncomeRequest income(Amount income) {
    this.income = income;
    return this;
  }

  /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Amount getIncome() {
    return income;
  }

  public void setIncome(Amount income) {
    this.income = income;
  }

  public GetAttachableIncomeRequest spouseIncome(Amount spouseIncome) {
    this.spouseIncome = spouseIncome;
    return this;
  }

  /**
   * Get spouseIncome
   * @return spouseIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getSpouseIncome() {
    return spouseIncome;
  }

  public void setSpouseIncome(Amount spouseIncome) {
    this.spouseIncome = spouseIncome;
  }

  public GetAttachableIncomeRequest numberOfDependentChildren(Integer numberOfDependentChildren) {
    this.numberOfDependentChildren = numberOfDependentChildren;
    return this;
  }

  /**
   * Get numberOfDependentChildren
   * @return numberOfDependentChildren
  **/
  @ApiModelProperty(example = "0", value = "")


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
    GetAttachableIncomeRequest getAttachableIncomeRequest = (GetAttachableIncomeRequest) o;
    return Objects.equals(this.income, getAttachableIncomeRequest.income) &&
        Objects.equals(this.spouseIncome, getAttachableIncomeRequest.spouseIncome) &&
        Objects.equals(this.numberOfDependentChildren, getAttachableIncomeRequest.numberOfDependentChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(income, spouseIncome, numberOfDependentChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttachableIncomeRequest {\n");
    
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    spouseIncome: ").append(toIndentedString(spouseIncome)).append("\n");
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

