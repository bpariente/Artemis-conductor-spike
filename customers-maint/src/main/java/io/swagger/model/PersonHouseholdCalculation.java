package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnumProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonHouseholdCalculation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class PersonHouseholdCalculation   {
  @JsonProperty("amountNettoIncome")
  private BigDecimal amountNettoIncome = null;

  @JsonProperty("amountFamilyAllowance")
  private BigDecimal amountFamilyAllowance = null;

  @JsonProperty("amountOtherIncome")
  private BigDecimal amountOtherIncome = null;

  @JsonProperty("amountDistrainable")
  private BigDecimal amountDistrainable = null;

  @JsonProperty("amountLiving")
  private BigDecimal amountLiving = null;

  @JsonProperty("amountOverallIncome")
  private BigDecimal amountOverallIncome = null;

  @JsonProperty("amountOverallExpenses")
  private BigDecimal amountOverallExpenses = null;

  @JsonProperty("amountResidentExpenses")
  private BigDecimal amountResidentExpenses = null;

  @JsonProperty("amountHouseSavings")
  private BigDecimal amountHouseSavings = null;

  @JsonProperty("amountSavingsProduct")
  private BigDecimal amountSavingsProduct = null;

  @JsonProperty("amountTVPhone")
  private BigDecimal amountTVPhone = null;

  @JsonProperty("amountPaybackLeases")
  private BigDecimal amountPaybackLeases = null;

  @JsonProperty("amountOtherSavings")
  private BigDecimal amountOtherSavings = null;

  @JsonProperty("amountOwnRedemptions")
  private BigDecimal amountOwnRedemptions = null;

  @JsonProperty("amountOtherRedemptions")
  private BigDecimal amountOtherRedemptions = null;

  @JsonProperty("amountInsurance")
  private BigDecimal amountInsurance = null;

  @JsonProperty("amountOtherLiabilities")
  private BigDecimal amountOtherLiabilities = null;

  @JsonProperty("amountCar")
  private BigDecimal amountCar = null;

  @JsonProperty("otherIncomeType")
  private EnumProperty otherIncomeType = null;

  public PersonHouseholdCalculation amountNettoIncome(BigDecimal amountNettoIncome) {
    this.amountNettoIncome = amountNettoIncome;
    return this;
  }

  /**
   * Amount net Income
   * @return amountNettoIncome
  **/
  @ApiModelProperty(example = "1000.05", value = "Amount net Income")

  @Valid

  public BigDecimal getAmountNettoIncome() {
    return amountNettoIncome;
  }

  public void setAmountNettoIncome(BigDecimal amountNettoIncome) {
    this.amountNettoIncome = amountNettoIncome;
  }

  public PersonHouseholdCalculation amountFamilyAllowance(BigDecimal amountFamilyAllowance) {
    this.amountFamilyAllowance = amountFamilyAllowance;
    return this;
  }

  /**
   * Family Allowance
   * @return amountFamilyAllowance
  **/
  @ApiModelProperty(example = "1005.0", value = "Family Allowance")

  @Valid

  public BigDecimal getAmountFamilyAllowance() {
    return amountFamilyAllowance;
  }

  public void setAmountFamilyAllowance(BigDecimal amountFamilyAllowance) {
    this.amountFamilyAllowance = amountFamilyAllowance;
  }

  public PersonHouseholdCalculation amountOtherIncome(BigDecimal amountOtherIncome) {
    this.amountOtherIncome = amountOtherIncome;
    return this;
  }

  /**
   * Other monthly Income
   * @return amountOtherIncome
  **/
  @ApiModelProperty(example = "1000.0", value = "Other monthly Income")

  @Valid

  public BigDecimal getAmountOtherIncome() {
    return amountOtherIncome;
  }

  public void setAmountOtherIncome(BigDecimal amountOtherIncome) {
    this.amountOtherIncome = amountOtherIncome;
  }

  public PersonHouseholdCalculation amountDistrainable(BigDecimal amountDistrainable) {
    this.amountDistrainable = amountDistrainable;
    return this;
  }

  /**
   * Distrainable amount
   * @return amountDistrainable
  **/
  @ApiModelProperty(example = "100.0", value = "Distrainable amount")

  @Valid

  public BigDecimal getAmountDistrainable() {
    return amountDistrainable;
  }

  public void setAmountDistrainable(BigDecimal amountDistrainable) {
    this.amountDistrainable = amountDistrainable;
  }

  public PersonHouseholdCalculation amountLiving(BigDecimal amountLiving) {
    this.amountLiving = amountLiving;
    return this;
  }

  /**
   * Living amount
   * @return amountLiving
  **/
  @ApiModelProperty(example = "100.0", value = "Living amount")

  @Valid

  public BigDecimal getAmountLiving() {
    return amountLiving;
  }

  public void setAmountLiving(BigDecimal amountLiving) {
    this.amountLiving = amountLiving;
  }

  public PersonHouseholdCalculation amountOverallIncome(BigDecimal amountOverallIncome) {
    this.amountOverallIncome = amountOverallIncome;
    return this;
  }

  /**
   * Overall monthly Income
   * @return amountOverallIncome
  **/
  @ApiModelProperty(example = "2000.0", value = "Overall monthly Income")

  @Valid

  public BigDecimal getAmountOverallIncome() {
    return amountOverallIncome;
  }

  public void setAmountOverallIncome(BigDecimal amountOverallIncome) {
    this.amountOverallIncome = amountOverallIncome;
  }

  public PersonHouseholdCalculation amountOverallExpenses(BigDecimal amountOverallExpenses) {
    this.amountOverallExpenses = amountOverallExpenses;
    return this;
  }

  /**
   * Overall monthly Expenses
   * @return amountOverallExpenses
  **/
  @ApiModelProperty(example = "1000.5", value = "Overall monthly Expenses")

  @Valid

  public BigDecimal getAmountOverallExpenses() {
    return amountOverallExpenses;
  }

  public void setAmountOverallExpenses(BigDecimal amountOverallExpenses) {
    this.amountOverallExpenses = amountOverallExpenses;
  }

  public PersonHouseholdCalculation amountResidentExpenses(BigDecimal amountResidentExpenses) {
    this.amountResidentExpenses = amountResidentExpenses;
    return this;
  }

  /**
   * Residence-expenses
   * @return amountResidentExpenses
  **/
  @ApiModelProperty(example = "1000.5", value = "Residence-expenses")

  @Valid

  public BigDecimal getAmountResidentExpenses() {
    return amountResidentExpenses;
  }

  public void setAmountResidentExpenses(BigDecimal amountResidentExpenses) {
    this.amountResidentExpenses = amountResidentExpenses;
  }

  public PersonHouseholdCalculation amountHouseSavings(BigDecimal amountHouseSavings) {
    this.amountHouseSavings = amountHouseSavings;
    return this;
  }

  /**
   * Expenses on house-savings
   * @return amountHouseSavings
  **/
  @ApiModelProperty(example = "1000.05", value = "Expenses on house-savings")

  @Valid

  public BigDecimal getAmountHouseSavings() {
    return amountHouseSavings;
  }

  public void setAmountHouseSavings(BigDecimal amountHouseSavings) {
    this.amountHouseSavings = amountHouseSavings;
  }

  public PersonHouseholdCalculation amountSavingsProduct(BigDecimal amountSavingsProduct) {
    this.amountSavingsProduct = amountSavingsProduct;
    return this;
  }

  /**
   * Saving products
   * @return amountSavingsProduct
  **/
  @ApiModelProperty(example = "1000.5", value = "Saving products")

  @Valid

  public BigDecimal getAmountSavingsProduct() {
    return amountSavingsProduct;
  }

  public void setAmountSavingsProduct(BigDecimal amountSavingsProduct) {
    this.amountSavingsProduct = amountSavingsProduct;
  }

  public PersonHouseholdCalculation amountTVPhone(BigDecimal amountTVPhone) {
    this.amountTVPhone = amountTVPhone;
    return this;
  }

  /**
   * Costs for local TV network
   * @return amountTVPhone
  **/
  @ApiModelProperty(example = "1000.5", value = "Costs for local TV network")

  @Valid

  public BigDecimal getAmountTVPhone() {
    return amountTVPhone;
  }

  public void setAmountTVPhone(BigDecimal amountTVPhone) {
    this.amountTVPhone = amountTVPhone;
  }

  public PersonHouseholdCalculation amountPaybackLeases(BigDecimal amountPaybackLeases) {
    this.amountPaybackLeases = amountPaybackLeases;
    return this;
  }

  /**
   * Paybacks for leases
   * @return amountPaybackLeases
  **/
  @ApiModelProperty(example = "1000.5", value = "Paybacks for leases")

  @Valid

  public BigDecimal getAmountPaybackLeases() {
    return amountPaybackLeases;
  }

  public void setAmountPaybackLeases(BigDecimal amountPaybackLeases) {
    this.amountPaybackLeases = amountPaybackLeases;
  }

  public PersonHouseholdCalculation amountOtherSavings(BigDecimal amountOtherSavings) {
    this.amountOtherSavings = amountOtherSavings;
    return this;
  }

  /**
   * Expenses for other savings
   * @return amountOtherSavings
  **/
  @ApiModelProperty(example = "1005.0", value = "Expenses for other savings")

  @Valid

  public BigDecimal getAmountOtherSavings() {
    return amountOtherSavings;
  }

  public void setAmountOtherSavings(BigDecimal amountOtherSavings) {
    this.amountOtherSavings = amountOtherSavings;
  }

  public PersonHouseholdCalculation amountOwnRedemptions(BigDecimal amountOwnRedemptions) {
    this.amountOwnRedemptions = amountOwnRedemptions;
    return this;
  }

  /**
   * Own redemption expenses
   * @return amountOwnRedemptions
  **/
  @ApiModelProperty(example = "5000.0", value = "Own redemption expenses")

  @Valid

  public BigDecimal getAmountOwnRedemptions() {
    return amountOwnRedemptions;
  }

  public void setAmountOwnRedemptions(BigDecimal amountOwnRedemptions) {
    this.amountOwnRedemptions = amountOwnRedemptions;
  }

  public PersonHouseholdCalculation amountOtherRedemptions(BigDecimal amountOtherRedemptions) {
    this.amountOtherRedemptions = amountOtherRedemptions;
    return this;
  }

  /**
   * Redemption expenses for others
   * @return amountOtherRedemptions
  **/
  @ApiModelProperty(example = "1040.0", value = "Redemption expenses for others")

  @Valid

  public BigDecimal getAmountOtherRedemptions() {
    return amountOtherRedemptions;
  }

  public void setAmountOtherRedemptions(BigDecimal amountOtherRedemptions) {
    this.amountOtherRedemptions = amountOtherRedemptions;
  }

  public PersonHouseholdCalculation amountInsurance(BigDecimal amountInsurance) {
    this.amountInsurance = amountInsurance;
    return this;
  }

  /**
   * Insurance expenses
   * @return amountInsurance
  **/
  @ApiModelProperty(example = "2000.0", value = "Insurance expenses")

  @Valid

  public BigDecimal getAmountInsurance() {
    return amountInsurance;
  }

  public void setAmountInsurance(BigDecimal amountInsurance) {
    this.amountInsurance = amountInsurance;
  }

  public PersonHouseholdCalculation amountOtherLiabilities(BigDecimal amountOtherLiabilities) {
    this.amountOtherLiabilities = amountOtherLiabilities;
    return this;
  }

  /**
   * Other liabilities
   * @return amountOtherLiabilities
  **/
  @ApiModelProperty(example = "100.0", value = "Other liabilities")

  @Valid

  public BigDecimal getAmountOtherLiabilities() {
    return amountOtherLiabilities;
  }

  public void setAmountOtherLiabilities(BigDecimal amountOtherLiabilities) {
    this.amountOtherLiabilities = amountOtherLiabilities;
  }

  public PersonHouseholdCalculation amountCar(BigDecimal amountCar) {
    this.amountCar = amountCar;
    return this;
  }

  /**
   * Costs for car
   * @return amountCar
  **/
  @ApiModelProperty(example = "1050.0", value = "Costs for car")

  @Valid

  public BigDecimal getAmountCar() {
    return amountCar;
  }

  public void setAmountCar(BigDecimal amountCar) {
    this.amountCar = amountCar;
  }

  public PersonHouseholdCalculation otherIncomeType(EnumProperty otherIncomeType) {
    this.otherIncomeType = otherIncomeType;
    return this;
  }

  /**
   * Get otherIncomeType
   * @return otherIncomeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getOtherIncomeType() {
    return otherIncomeType;
  }

  public void setOtherIncomeType(EnumProperty otherIncomeType) {
    this.otherIncomeType = otherIncomeType;
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
    return Objects.equals(this.amountNettoIncome, personHouseholdCalculation.amountNettoIncome) &&
        Objects.equals(this.amountFamilyAllowance, personHouseholdCalculation.amountFamilyAllowance) &&
        Objects.equals(this.amountOtherIncome, personHouseholdCalculation.amountOtherIncome) &&
        Objects.equals(this.amountDistrainable, personHouseholdCalculation.amountDistrainable) &&
        Objects.equals(this.amountLiving, personHouseholdCalculation.amountLiving) &&
        Objects.equals(this.amountOverallIncome, personHouseholdCalculation.amountOverallIncome) &&
        Objects.equals(this.amountOverallExpenses, personHouseholdCalculation.amountOverallExpenses) &&
        Objects.equals(this.amountResidentExpenses, personHouseholdCalculation.amountResidentExpenses) &&
        Objects.equals(this.amountHouseSavings, personHouseholdCalculation.amountHouseSavings) &&
        Objects.equals(this.amountSavingsProduct, personHouseholdCalculation.amountSavingsProduct) &&
        Objects.equals(this.amountTVPhone, personHouseholdCalculation.amountTVPhone) &&
        Objects.equals(this.amountPaybackLeases, personHouseholdCalculation.amountPaybackLeases) &&
        Objects.equals(this.amountOtherSavings, personHouseholdCalculation.amountOtherSavings) &&
        Objects.equals(this.amountOwnRedemptions, personHouseholdCalculation.amountOwnRedemptions) &&
        Objects.equals(this.amountOtherRedemptions, personHouseholdCalculation.amountOtherRedemptions) &&
        Objects.equals(this.amountInsurance, personHouseholdCalculation.amountInsurance) &&
        Objects.equals(this.amountOtherLiabilities, personHouseholdCalculation.amountOtherLiabilities) &&
        Objects.equals(this.amountCar, personHouseholdCalculation.amountCar) &&
        Objects.equals(this.otherIncomeType, personHouseholdCalculation.otherIncomeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountNettoIncome, amountFamilyAllowance, amountOtherIncome, amountDistrainable, amountLiving, amountOverallIncome, amountOverallExpenses, amountResidentExpenses, amountHouseSavings, amountSavingsProduct, amountTVPhone, amountPaybackLeases, amountOtherSavings, amountOwnRedemptions, amountOtherRedemptions, amountInsurance, amountOtherLiabilities, amountCar, otherIncomeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonHouseholdCalculation {\n");
    
    sb.append("    amountNettoIncome: ").append(toIndentedString(amountNettoIncome)).append("\n");
    sb.append("    amountFamilyAllowance: ").append(toIndentedString(amountFamilyAllowance)).append("\n");
    sb.append("    amountOtherIncome: ").append(toIndentedString(amountOtherIncome)).append("\n");
    sb.append("    amountDistrainable: ").append(toIndentedString(amountDistrainable)).append("\n");
    sb.append("    amountLiving: ").append(toIndentedString(amountLiving)).append("\n");
    sb.append("    amountOverallIncome: ").append(toIndentedString(amountOverallIncome)).append("\n");
    sb.append("    amountOverallExpenses: ").append(toIndentedString(amountOverallExpenses)).append("\n");
    sb.append("    amountResidentExpenses: ").append(toIndentedString(amountResidentExpenses)).append("\n");
    sb.append("    amountHouseSavings: ").append(toIndentedString(amountHouseSavings)).append("\n");
    sb.append("    amountSavingsProduct: ").append(toIndentedString(amountSavingsProduct)).append("\n");
    sb.append("    amountTVPhone: ").append(toIndentedString(amountTVPhone)).append("\n");
    sb.append("    amountPaybackLeases: ").append(toIndentedString(amountPaybackLeases)).append("\n");
    sb.append("    amountOtherSavings: ").append(toIndentedString(amountOtherSavings)).append("\n");
    sb.append("    amountOwnRedemptions: ").append(toIndentedString(amountOwnRedemptions)).append("\n");
    sb.append("    amountOtherRedemptions: ").append(toIndentedString(amountOtherRedemptions)).append("\n");
    sb.append("    amountInsurance: ").append(toIndentedString(amountInsurance)).append("\n");
    sb.append("    amountOtherLiabilities: ").append(toIndentedString(amountOtherLiabilities)).append("\n");
    sb.append("    amountCar: ").append(toIndentedString(amountCar)).append("\n");
    sb.append("    otherIncomeType: ").append(toIndentedString(otherIncomeType)).append("\n");
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

