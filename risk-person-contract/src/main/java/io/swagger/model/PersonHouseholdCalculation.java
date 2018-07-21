package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonHouseholdCalculation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class PersonHouseholdCalculation   {
  @JsonProperty("netIncome")
  private Amount netIncome = null;

  @JsonProperty("isIncomeVerified")
  private Boolean isIncomeVerified = null;

  @JsonProperty("loanInstallmentsOwn")
  private Amount loanInstallmentsOwn = null;

  @JsonProperty("loanInstallmentsForeign")
  private Amount loanInstallmentsForeign = null;

  @JsonProperty("livingExpenses")
  private Amount livingExpenses = null;

  @JsonProperty("residencyExpenses")
  private Amount residencyExpenses = null;

  @JsonProperty("insuranceExpenses")
  private Amount insuranceExpenses = null;

  @JsonProperty("carExpenses")
  private Amount carExpenses = null;

  @JsonProperty("telecommunicationExpenses")
  private Amount telecommunicationExpenses = null;

  @JsonProperty("isCarOwned")
  private Boolean isCarOwned = null;

  @JsonProperty("alimentaryPersons")
  private BigDecimal alimentaryPersons = null;

  @JsonProperty("otherExpenses")
  private Amount otherExpenses = null;

  @JsonProperty("overallIncome")
  private Amount overallIncome = null;

  @JsonProperty("overallExpenses")
  private Amount overallExpenses = null;

  public PersonHouseholdCalculation netIncome(Amount netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Get netIncome
   * @return netIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(Amount netIncome) {
    this.netIncome = netIncome;
  }

  public PersonHouseholdCalculation isIncomeVerified(Boolean isIncomeVerified) {
    this.isIncomeVerified = isIncomeVerified;
    return this;
  }

  /**
   * Get isIncomeVerified
   * @return isIncomeVerified
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsIncomeVerified() {
    return isIncomeVerified;
  }

  public void setIsIncomeVerified(Boolean isIncomeVerified) {
    this.isIncomeVerified = isIncomeVerified;
  }

  public PersonHouseholdCalculation loanInstallmentsOwn(Amount loanInstallmentsOwn) {
    this.loanInstallmentsOwn = loanInstallmentsOwn;
    return this;
  }

  /**
   * Get loanInstallmentsOwn
   * @return loanInstallmentsOwn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getLoanInstallmentsOwn() {
    return loanInstallmentsOwn;
  }

  public void setLoanInstallmentsOwn(Amount loanInstallmentsOwn) {
    this.loanInstallmentsOwn = loanInstallmentsOwn;
  }

  public PersonHouseholdCalculation loanInstallmentsForeign(Amount loanInstallmentsForeign) {
    this.loanInstallmentsForeign = loanInstallmentsForeign;
    return this;
  }

  /**
   * Get loanInstallmentsForeign
   * @return loanInstallmentsForeign
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getLoanInstallmentsForeign() {
    return loanInstallmentsForeign;
  }

  public void setLoanInstallmentsForeign(Amount loanInstallmentsForeign) {
    this.loanInstallmentsForeign = loanInstallmentsForeign;
  }

  public PersonHouseholdCalculation livingExpenses(Amount livingExpenses) {
    this.livingExpenses = livingExpenses;
    return this;
  }

  /**
   * Get livingExpenses
   * @return livingExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getLivingExpenses() {
    return livingExpenses;
  }

  public void setLivingExpenses(Amount livingExpenses) {
    this.livingExpenses = livingExpenses;
  }

  public PersonHouseholdCalculation residencyExpenses(Amount residencyExpenses) {
    this.residencyExpenses = residencyExpenses;
    return this;
  }

  /**
   * Get residencyExpenses
   * @return residencyExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getResidencyExpenses() {
    return residencyExpenses;
  }

  public void setResidencyExpenses(Amount residencyExpenses) {
    this.residencyExpenses = residencyExpenses;
  }

  public PersonHouseholdCalculation insuranceExpenses(Amount insuranceExpenses) {
    this.insuranceExpenses = insuranceExpenses;
    return this;
  }

  /**
   * Get insuranceExpenses
   * @return insuranceExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getInsuranceExpenses() {
    return insuranceExpenses;
  }

  public void setInsuranceExpenses(Amount insuranceExpenses) {
    this.insuranceExpenses = insuranceExpenses;
  }

  public PersonHouseholdCalculation carExpenses(Amount carExpenses) {
    this.carExpenses = carExpenses;
    return this;
  }

  /**
   * Get carExpenses
   * @return carExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getCarExpenses() {
    return carExpenses;
  }

  public void setCarExpenses(Amount carExpenses) {
    this.carExpenses = carExpenses;
  }

  public PersonHouseholdCalculation telecommunicationExpenses(Amount telecommunicationExpenses) {
    this.telecommunicationExpenses = telecommunicationExpenses;
    return this;
  }

  /**
   * Get telecommunicationExpenses
   * @return telecommunicationExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTelecommunicationExpenses() {
    return telecommunicationExpenses;
  }

  public void setTelecommunicationExpenses(Amount telecommunicationExpenses) {
    this.telecommunicationExpenses = telecommunicationExpenses;
  }

  public PersonHouseholdCalculation isCarOwned(Boolean isCarOwned) {
    this.isCarOwned = isCarOwned;
    return this;
  }

  /**
   * Get isCarOwned
   * @return isCarOwned
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsCarOwned() {
    return isCarOwned;
  }

  public void setIsCarOwned(Boolean isCarOwned) {
    this.isCarOwned = isCarOwned;
  }

  public PersonHouseholdCalculation alimentaryPersons(BigDecimal alimentaryPersons) {
    this.alimentaryPersons = alimentaryPersons;
    return this;
  }

  /**
   * Number of alimentary persons
   * @return alimentaryPersons
  **/
  @ApiModelProperty(example = "2.0", value = "Number of alimentary persons")

  @Valid

  public BigDecimal getAlimentaryPersons() {
    return alimentaryPersons;
  }

  public void setAlimentaryPersons(BigDecimal alimentaryPersons) {
    this.alimentaryPersons = alimentaryPersons;
  }

  public PersonHouseholdCalculation otherExpenses(Amount otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

  /**
   * Get otherExpenses
   * @return otherExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(Amount otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public PersonHouseholdCalculation overallIncome(Amount overallIncome) {
    this.overallIncome = overallIncome;
    return this;
  }

  /**
   * Get overallIncome
   * @return overallIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOverallIncome() {
    return overallIncome;
  }

  public void setOverallIncome(Amount overallIncome) {
    this.overallIncome = overallIncome;
  }

  public PersonHouseholdCalculation overallExpenses(Amount overallExpenses) {
    this.overallExpenses = overallExpenses;
    return this;
  }

  /**
   * Get overallExpenses
   * @return overallExpenses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOverallExpenses() {
    return overallExpenses;
  }

  public void setOverallExpenses(Amount overallExpenses) {
    this.overallExpenses = overallExpenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonHouseholdCalculation personHouseholdCalculation = (PersonHouseholdCalculation) o;
    return Objects.equals(this.netIncome, personHouseholdCalculation.netIncome) &&
        Objects.equals(this.isIncomeVerified, personHouseholdCalculation.isIncomeVerified) &&
        Objects.equals(this.loanInstallmentsOwn, personHouseholdCalculation.loanInstallmentsOwn) &&
        Objects.equals(this.loanInstallmentsForeign, personHouseholdCalculation.loanInstallmentsForeign) &&
        Objects.equals(this.livingExpenses, personHouseholdCalculation.livingExpenses) &&
        Objects.equals(this.residencyExpenses, personHouseholdCalculation.residencyExpenses) &&
        Objects.equals(this.insuranceExpenses, personHouseholdCalculation.insuranceExpenses) &&
        Objects.equals(this.carExpenses, personHouseholdCalculation.carExpenses) &&
        Objects.equals(this.telecommunicationExpenses, personHouseholdCalculation.telecommunicationExpenses) &&
        Objects.equals(this.isCarOwned, personHouseholdCalculation.isCarOwned) &&
        Objects.equals(this.alimentaryPersons, personHouseholdCalculation.alimentaryPersons) &&
        Objects.equals(this.otherExpenses, personHouseholdCalculation.otherExpenses) &&
        Objects.equals(this.overallIncome, personHouseholdCalculation.overallIncome) &&
        Objects.equals(this.overallExpenses, personHouseholdCalculation.overallExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netIncome, isIncomeVerified, loanInstallmentsOwn, loanInstallmentsForeign, livingExpenses, residencyExpenses, insuranceExpenses, carExpenses, telecommunicationExpenses, isCarOwned, alimentaryPersons, otherExpenses, overallIncome, overallExpenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonHouseholdCalculation {\n");
    
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    isIncomeVerified: ").append(toIndentedString(isIncomeVerified)).append("\n");
    sb.append("    loanInstallmentsOwn: ").append(toIndentedString(loanInstallmentsOwn)).append("\n");
    sb.append("    loanInstallmentsForeign: ").append(toIndentedString(loanInstallmentsForeign)).append("\n");
    sb.append("    livingExpenses: ").append(toIndentedString(livingExpenses)).append("\n");
    sb.append("    residencyExpenses: ").append(toIndentedString(residencyExpenses)).append("\n");
    sb.append("    insuranceExpenses: ").append(toIndentedString(insuranceExpenses)).append("\n");
    sb.append("    carExpenses: ").append(toIndentedString(carExpenses)).append("\n");
    sb.append("    telecommunicationExpenses: ").append(toIndentedString(telecommunicationExpenses)).append("\n");
    sb.append("    isCarOwned: ").append(toIndentedString(isCarOwned)).append("\n");
    sb.append("    alimentaryPersons: ").append(toIndentedString(alimentaryPersons)).append("\n");
    sb.append("    otherExpenses: ").append(toIndentedString(otherExpenses)).append("\n");
    sb.append("    overallIncome: ").append(toIndentedString(overallIncome)).append("\n");
    sb.append("    overallExpenses: ").append(toIndentedString(overallExpenses)).append("\n");
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

