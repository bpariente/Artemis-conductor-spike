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
 * Household Calculation
 */
@ApiModel(description = "Household Calculation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class HouseholdCalculation   {
  @JsonProperty("netIncome")
  private Amount netIncome = null;

  @JsonProperty("familyAllowance")
  private Amount familyAllowance = null;

  @JsonProperty("additionalIncome")
  private Amount additionalIncome = null;

  @JsonProperty("additionalIncomeType")
  private String additionalIncomeType = null;

  @JsonProperty("livingCosts")
  private Amount livingCosts = null;

  @JsonProperty("carCosts")
  private Amount carCosts = null;

  @JsonProperty("ownInstituteLoanInstallment")
  private Amount ownInstituteLoanInstallment = null;

  @JsonProperty("externalInstituteLoanInstallment")
  private Amount externalInstituteLoanInstallment = null;

  @JsonProperty("insuranceRate")
  private Amount insuranceRate = null;

  @JsonProperty("phoneAndTelevisionCosts")
  private Amount phoneAndTelevisionCosts = null;

  @JsonProperty("housingCosts")
  private Amount housingCosts = null;

  @JsonProperty("houseSavingsRate")
  private Amount houseSavingsRate = null;

  @JsonProperty("savingsRate")
  private Amount savingsRate = null;

  @JsonProperty("otherSavingsRate")
  private Amount otherSavingsRate = null;

  @JsonProperty("leasingRate")
  private Amount leasingRate = null;

  @JsonProperty("otherCosts")
  private Amount otherCosts = null;

  @JsonProperty("overallIncome")
  private Amount overallIncome = null;

  @JsonProperty("overallExpenses")
  private Amount overallExpenses = null;

  @JsonProperty("distrainableAmount")
  private Amount distrainableAmount = null;

  @JsonProperty("ownHome")
  private Boolean ownHome = null;

  @JsonProperty("incomePartner")
  private Boolean incomePartner = null;

  @JsonProperty("partnerNetIncome")
  private Amount partnerNetIncome = null;

  @JsonProperty("ownCar")
  private Boolean ownCar = null;

  @JsonProperty("housingCostsProved")
  private Boolean housingCostsProved = null;

  @JsonProperty("distrainableNetIncome")
  private Amount distrainableNetIncome = null;

  public HouseholdCalculation netIncome(Amount netIncome) {
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

  public HouseholdCalculation familyAllowance(Amount familyAllowance) {
    this.familyAllowance = familyAllowance;
    return this;
  }

  /**
   * Get familyAllowance
   * @return familyAllowance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getFamilyAllowance() {
    return familyAllowance;
  }

  public void setFamilyAllowance(Amount familyAllowance) {
    this.familyAllowance = familyAllowance;
  }

  public HouseholdCalculation additionalIncome(Amount additionalIncome) {
    this.additionalIncome = additionalIncome;
    return this;
  }

  /**
   * Get additionalIncome
   * @return additionalIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAdditionalIncome() {
    return additionalIncome;
  }

  public void setAdditionalIncome(Amount additionalIncome) {
    this.additionalIncome = additionalIncome;
  }

  public HouseholdCalculation additionalIncomeType(String additionalIncomeType) {
    this.additionalIncomeType = additionalIncomeType;
    return this;
  }

  /**
   * Get additionalIncomeType
   * @return additionalIncomeType
  **/
  @ApiModelProperty(value = "")


  public String getAdditionalIncomeType() {
    return additionalIncomeType;
  }

  public void setAdditionalIncomeType(String additionalIncomeType) {
    this.additionalIncomeType = additionalIncomeType;
  }

  public HouseholdCalculation livingCosts(Amount livingCosts) {
    this.livingCosts = livingCosts;
    return this;
  }

  /**
   * Get livingCosts
   * @return livingCosts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getLivingCosts() {
    return livingCosts;
  }

  public void setLivingCosts(Amount livingCosts) {
    this.livingCosts = livingCosts;
  }

  public HouseholdCalculation carCosts(Amount carCosts) {
    this.carCosts = carCosts;
    return this;
  }

  /**
   * Get carCosts
   * @return carCosts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getCarCosts() {
    return carCosts;
  }

  public void setCarCosts(Amount carCosts) {
    this.carCosts = carCosts;
  }

  public HouseholdCalculation ownInstituteLoanInstallment(Amount ownInstituteLoanInstallment) {
    this.ownInstituteLoanInstallment = ownInstituteLoanInstallment;
    return this;
  }

  /**
   * Get ownInstituteLoanInstallment
   * @return ownInstituteLoanInstallment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOwnInstituteLoanInstallment() {
    return ownInstituteLoanInstallment;
  }

  public void setOwnInstituteLoanInstallment(Amount ownInstituteLoanInstallment) {
    this.ownInstituteLoanInstallment = ownInstituteLoanInstallment;
  }

  public HouseholdCalculation externalInstituteLoanInstallment(Amount externalInstituteLoanInstallment) {
    this.externalInstituteLoanInstallment = externalInstituteLoanInstallment;
    return this;
  }

  /**
   * Get externalInstituteLoanInstallment
   * @return externalInstituteLoanInstallment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getExternalInstituteLoanInstallment() {
    return externalInstituteLoanInstallment;
  }

  public void setExternalInstituteLoanInstallment(Amount externalInstituteLoanInstallment) {
    this.externalInstituteLoanInstallment = externalInstituteLoanInstallment;
  }

  public HouseholdCalculation insuranceRate(Amount insuranceRate) {
    this.insuranceRate = insuranceRate;
    return this;
  }

  /**
   * Get insuranceRate
   * @return insuranceRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getInsuranceRate() {
    return insuranceRate;
  }

  public void setInsuranceRate(Amount insuranceRate) {
    this.insuranceRate = insuranceRate;
  }

  public HouseholdCalculation phoneAndTelevisionCosts(Amount phoneAndTelevisionCosts) {
    this.phoneAndTelevisionCosts = phoneAndTelevisionCosts;
    return this;
  }

  /**
   * Get phoneAndTelevisionCosts
   * @return phoneAndTelevisionCosts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getPhoneAndTelevisionCosts() {
    return phoneAndTelevisionCosts;
  }

  public void setPhoneAndTelevisionCosts(Amount phoneAndTelevisionCosts) {
    this.phoneAndTelevisionCosts = phoneAndTelevisionCosts;
  }

  public HouseholdCalculation housingCosts(Amount housingCosts) {
    this.housingCosts = housingCosts;
    return this;
  }

  /**
   * Get housingCosts
   * @return housingCosts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getHousingCosts() {
    return housingCosts;
  }

  public void setHousingCosts(Amount housingCosts) {
    this.housingCosts = housingCosts;
  }

  public HouseholdCalculation houseSavingsRate(Amount houseSavingsRate) {
    this.houseSavingsRate = houseSavingsRate;
    return this;
  }

  /**
   * Get houseSavingsRate
   * @return houseSavingsRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getHouseSavingsRate() {
    return houseSavingsRate;
  }

  public void setHouseSavingsRate(Amount houseSavingsRate) {
    this.houseSavingsRate = houseSavingsRate;
  }

  public HouseholdCalculation savingsRate(Amount savingsRate) {
    this.savingsRate = savingsRate;
    return this;
  }

  /**
   * Get savingsRate
   * @return savingsRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getSavingsRate() {
    return savingsRate;
  }

  public void setSavingsRate(Amount savingsRate) {
    this.savingsRate = savingsRate;
  }

  public HouseholdCalculation otherSavingsRate(Amount otherSavingsRate) {
    this.otherSavingsRate = otherSavingsRate;
    return this;
  }

  /**
   * Get otherSavingsRate
   * @return otherSavingsRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOtherSavingsRate() {
    return otherSavingsRate;
  }

  public void setOtherSavingsRate(Amount otherSavingsRate) {
    this.otherSavingsRate = otherSavingsRate;
  }

  public HouseholdCalculation leasingRate(Amount leasingRate) {
    this.leasingRate = leasingRate;
    return this;
  }

  /**
   * Get leasingRate
   * @return leasingRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getLeasingRate() {
    return leasingRate;
  }

  public void setLeasingRate(Amount leasingRate) {
    this.leasingRate = leasingRate;
  }

  public HouseholdCalculation otherCosts(Amount otherCosts) {
    this.otherCosts = otherCosts;
    return this;
  }

  /**
   * Get otherCosts
   * @return otherCosts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOtherCosts() {
    return otherCosts;
  }

  public void setOtherCosts(Amount otherCosts) {
    this.otherCosts = otherCosts;
  }

  public HouseholdCalculation overallIncome(Amount overallIncome) {
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

  public HouseholdCalculation overallExpenses(Amount overallExpenses) {
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

  public HouseholdCalculation distrainableAmount(Amount distrainableAmount) {
    this.distrainableAmount = distrainableAmount;
    return this;
  }

  /**
   * Get distrainableAmount
   * @return distrainableAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getDistrainableAmount() {
    return distrainableAmount;
  }

  public void setDistrainableAmount(Amount distrainableAmount) {
    this.distrainableAmount = distrainableAmount;
  }

  public HouseholdCalculation ownHome(Boolean ownHome) {
    this.ownHome = ownHome;
    return this;
  }

  /**
   * Get ownHome
   * @return ownHome
  **/
  @ApiModelProperty(value = "")


  public Boolean isOwnHome() {
    return ownHome;
  }

  public void setOwnHome(Boolean ownHome) {
    this.ownHome = ownHome;
  }

  public HouseholdCalculation incomePartner(Boolean incomePartner) {
    this.incomePartner = incomePartner;
    return this;
  }

  /**
   * Get incomePartner
   * @return incomePartner
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncomePartner() {
    return incomePartner;
  }

  public void setIncomePartner(Boolean incomePartner) {
    this.incomePartner = incomePartner;
  }

  public HouseholdCalculation partnerNetIncome(Amount partnerNetIncome) {
    this.partnerNetIncome = partnerNetIncome;
    return this;
  }

  /**
   * Get partnerNetIncome
   * @return partnerNetIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getPartnerNetIncome() {
    return partnerNetIncome;
  }

  public void setPartnerNetIncome(Amount partnerNetIncome) {
    this.partnerNetIncome = partnerNetIncome;
  }

  public HouseholdCalculation ownCar(Boolean ownCar) {
    this.ownCar = ownCar;
    return this;
  }

  /**
   * Get ownCar
   * @return ownCar
  **/
  @ApiModelProperty(value = "")


  public Boolean isOwnCar() {
    return ownCar;
  }

  public void setOwnCar(Boolean ownCar) {
    this.ownCar = ownCar;
  }

  public HouseholdCalculation housingCostsProved(Boolean housingCostsProved) {
    this.housingCostsProved = housingCostsProved;
    return this;
  }

  /**
   * Get housingCostsProved
   * @return housingCostsProved
  **/
  @ApiModelProperty(value = "")


  public Boolean isHousingCostsProved() {
    return housingCostsProved;
  }

  public void setHousingCostsProved(Boolean housingCostsProved) {
    this.housingCostsProved = housingCostsProved;
  }

  public HouseholdCalculation distrainableNetIncome(Amount distrainableNetIncome) {
    this.distrainableNetIncome = distrainableNetIncome;
    return this;
  }

  /**
   * Get distrainableNetIncome
   * @return distrainableNetIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getDistrainableNetIncome() {
    return distrainableNetIncome;
  }

  public void setDistrainableNetIncome(Amount distrainableNetIncome) {
    this.distrainableNetIncome = distrainableNetIncome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HouseholdCalculation householdCalculation = (HouseholdCalculation) o;
    return Objects.equals(this.netIncome, householdCalculation.netIncome) &&
        Objects.equals(this.familyAllowance, householdCalculation.familyAllowance) &&
        Objects.equals(this.additionalIncome, householdCalculation.additionalIncome) &&
        Objects.equals(this.additionalIncomeType, householdCalculation.additionalIncomeType) &&
        Objects.equals(this.livingCosts, householdCalculation.livingCosts) &&
        Objects.equals(this.carCosts, householdCalculation.carCosts) &&
        Objects.equals(this.ownInstituteLoanInstallment, householdCalculation.ownInstituteLoanInstallment) &&
        Objects.equals(this.externalInstituteLoanInstallment, householdCalculation.externalInstituteLoanInstallment) &&
        Objects.equals(this.insuranceRate, householdCalculation.insuranceRate) &&
        Objects.equals(this.phoneAndTelevisionCosts, householdCalculation.phoneAndTelevisionCosts) &&
        Objects.equals(this.housingCosts, householdCalculation.housingCosts) &&
        Objects.equals(this.houseSavingsRate, householdCalculation.houseSavingsRate) &&
        Objects.equals(this.savingsRate, householdCalculation.savingsRate) &&
        Objects.equals(this.otherSavingsRate, householdCalculation.otherSavingsRate) &&
        Objects.equals(this.leasingRate, householdCalculation.leasingRate) &&
        Objects.equals(this.otherCosts, householdCalculation.otherCosts) &&
        Objects.equals(this.overallIncome, householdCalculation.overallIncome) &&
        Objects.equals(this.overallExpenses, householdCalculation.overallExpenses) &&
        Objects.equals(this.distrainableAmount, householdCalculation.distrainableAmount) &&
        Objects.equals(this.ownHome, householdCalculation.ownHome) &&
        Objects.equals(this.incomePartner, householdCalculation.incomePartner) &&
        Objects.equals(this.partnerNetIncome, householdCalculation.partnerNetIncome) &&
        Objects.equals(this.ownCar, householdCalculation.ownCar) &&
        Objects.equals(this.housingCostsProved, householdCalculation.housingCostsProved) &&
        Objects.equals(this.distrainableNetIncome, householdCalculation.distrainableNetIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netIncome, familyAllowance, additionalIncome, additionalIncomeType, livingCosts, carCosts, ownInstituteLoanInstallment, externalInstituteLoanInstallment, insuranceRate, phoneAndTelevisionCosts, housingCosts, houseSavingsRate, savingsRate, otherSavingsRate, leasingRate, otherCosts, overallIncome, overallExpenses, distrainableAmount, ownHome, incomePartner, partnerNetIncome, ownCar, housingCostsProved, distrainableNetIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseholdCalculation {\n");
    
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    familyAllowance: ").append(toIndentedString(familyAllowance)).append("\n");
    sb.append("    additionalIncome: ").append(toIndentedString(additionalIncome)).append("\n");
    sb.append("    additionalIncomeType: ").append(toIndentedString(additionalIncomeType)).append("\n");
    sb.append("    livingCosts: ").append(toIndentedString(livingCosts)).append("\n");
    sb.append("    carCosts: ").append(toIndentedString(carCosts)).append("\n");
    sb.append("    ownInstituteLoanInstallment: ").append(toIndentedString(ownInstituteLoanInstallment)).append("\n");
    sb.append("    externalInstituteLoanInstallment: ").append(toIndentedString(externalInstituteLoanInstallment)).append("\n");
    sb.append("    insuranceRate: ").append(toIndentedString(insuranceRate)).append("\n");
    sb.append("    phoneAndTelevisionCosts: ").append(toIndentedString(phoneAndTelevisionCosts)).append("\n");
    sb.append("    housingCosts: ").append(toIndentedString(housingCosts)).append("\n");
    sb.append("    houseSavingsRate: ").append(toIndentedString(houseSavingsRate)).append("\n");
    sb.append("    savingsRate: ").append(toIndentedString(savingsRate)).append("\n");
    sb.append("    otherSavingsRate: ").append(toIndentedString(otherSavingsRate)).append("\n");
    sb.append("    leasingRate: ").append(toIndentedString(leasingRate)).append("\n");
    sb.append("    otherCosts: ").append(toIndentedString(otherCosts)).append("\n");
    sb.append("    overallIncome: ").append(toIndentedString(overallIncome)).append("\n");
    sb.append("    overallExpenses: ").append(toIndentedString(overallExpenses)).append("\n");
    sb.append("    distrainableAmount: ").append(toIndentedString(distrainableAmount)).append("\n");
    sb.append("    ownHome: ").append(toIndentedString(ownHome)).append("\n");
    sb.append("    incomePartner: ").append(toIndentedString(incomePartner)).append("\n");
    sb.append("    partnerNetIncome: ").append(toIndentedString(partnerNetIncome)).append("\n");
    sb.append("    ownCar: ").append(toIndentedString(ownCar)).append("\n");
    sb.append("    housingCostsProved: ").append(toIndentedString(housingCostsProved)).append("\n");
    sb.append("    distrainableNetIncome: ").append(toIndentedString(distrainableNetIncome)).append("\n");
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

