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
 * PersonHouseholdCalculationAddOn
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class PersonHouseholdCalculationAddOn   {
  @JsonProperty("ownHome")
  private Boolean ownHome = null;

  @JsonProperty("incomePartner")
  private Boolean incomePartner = null;

  @JsonProperty("amountNettoIncomePartner")
  private BigDecimal amountNettoIncomePartner = null;

  @JsonProperty("automobile")
  private Boolean automobile = null;

  @JsonProperty("residentExpensesProof")
  private Boolean residentExpensesProof = null;

  @JsonProperty("amountIncomeDistrainable")
  private BigDecimal amountIncomeDistrainable = null;

  public PersonHouseholdCalculationAddOn ownHome(Boolean ownHome) {
    this.ownHome = ownHome;
    return this;
  }

  /**
   * OwnHome
   * @return ownHome
  **/
  @ApiModelProperty(example = "false", required = true, value = "OwnHome")
  @NotNull


  public Boolean isOwnHome() {
    return ownHome;
  }

  public void setOwnHome(Boolean ownHome) {
    this.ownHome = ownHome;
  }

  public PersonHouseholdCalculationAddOn incomePartner(Boolean incomePartner) {
    this.incomePartner = incomePartner;
    return this;
  }

  /**
   * IncomePartner
   * @return incomePartner
  **/
  @ApiModelProperty(example = "true", value = "IncomePartner")


  public Boolean isIncomePartner() {
    return incomePartner;
  }

  public void setIncomePartner(Boolean incomePartner) {
    this.incomePartner = incomePartner;
  }

  public PersonHouseholdCalculationAddOn amountNettoIncomePartner(BigDecimal amountNettoIncomePartner) {
    this.amountNettoIncomePartner = amountNettoIncomePartner;
    return this;
  }

  /**
   * AmountNettoIncomePartner
   * @return amountNettoIncomePartner
  **/
  @ApiModelProperty(example = "105.0", value = "AmountNettoIncomePartner")

  @Valid

  public BigDecimal getAmountNettoIncomePartner() {
    return amountNettoIncomePartner;
  }

  public void setAmountNettoIncomePartner(BigDecimal amountNettoIncomePartner) {
    this.amountNettoIncomePartner = amountNettoIncomePartner;
  }

  public PersonHouseholdCalculationAddOn automobile(Boolean automobile) {
    this.automobile = automobile;
    return this;
  }

  /**
   * Automobile
   * @return automobile
  **/
  @ApiModelProperty(example = "false", value = "Automobile")


  public Boolean isAutomobile() {
    return automobile;
  }

  public void setAutomobile(Boolean automobile) {
    this.automobile = automobile;
  }

  public PersonHouseholdCalculationAddOn residentExpensesProof(Boolean residentExpensesProof) {
    this.residentExpensesProof = residentExpensesProof;
    return this;
  }

  /**
   * ResidentExpensesProof
   * @return residentExpensesProof
  **/
  @ApiModelProperty(example = "false", value = "ResidentExpensesProof")


  public Boolean isResidentExpensesProof() {
    return residentExpensesProof;
  }

  public void setResidentExpensesProof(Boolean residentExpensesProof) {
    this.residentExpensesProof = residentExpensesProof;
  }

  public PersonHouseholdCalculationAddOn amountIncomeDistrainable(BigDecimal amountIncomeDistrainable) {
    this.amountIncomeDistrainable = amountIncomeDistrainable;
    return this;
  }

  /**
   * AmountIncomeDistrainable
   * @return amountIncomeDistrainable
  **/
  @ApiModelProperty(example = "100.0", value = "AmountIncomeDistrainable")

  @Valid

  public BigDecimal getAmountIncomeDistrainable() {
    return amountIncomeDistrainable;
  }

  public void setAmountIncomeDistrainable(BigDecimal amountIncomeDistrainable) {
    this.amountIncomeDistrainable = amountIncomeDistrainable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonHouseholdCalculationAddOn personHouseholdCalculationAddOn = (PersonHouseholdCalculationAddOn) o;
    return Objects.equals(this.ownHome, personHouseholdCalculationAddOn.ownHome) &&
        Objects.equals(this.incomePartner, personHouseholdCalculationAddOn.incomePartner) &&
        Objects.equals(this.amountNettoIncomePartner, personHouseholdCalculationAddOn.amountNettoIncomePartner) &&
        Objects.equals(this.automobile, personHouseholdCalculationAddOn.automobile) &&
        Objects.equals(this.residentExpensesProof, personHouseholdCalculationAddOn.residentExpensesProof) &&
        Objects.equals(this.amountIncomeDistrainable, personHouseholdCalculationAddOn.amountIncomeDistrainable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownHome, incomePartner, amountNettoIncomePartner, automobile, residentExpensesProof, amountIncomeDistrainable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonHouseholdCalculationAddOn {\n");
    
    sb.append("    ownHome: ").append(toIndentedString(ownHome)).append("\n");
    sb.append("    incomePartner: ").append(toIndentedString(incomePartner)).append("\n");
    sb.append("    amountNettoIncomePartner: ").append(toIndentedString(amountNettoIncomePartner)).append("\n");
    sb.append("    automobile: ").append(toIndentedString(automobile)).append("\n");
    sb.append("    residentExpensesProof: ").append(toIndentedString(residentExpensesProof)).append("\n");
    sb.append("    amountIncomeDistrainable: ").append(toIndentedString(amountIncomeDistrainable)).append("\n");
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

