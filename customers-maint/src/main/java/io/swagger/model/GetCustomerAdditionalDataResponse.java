package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCustomerAdditionalDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerAdditionalDataResponse   {
  @JsonProperty("bookkeepingTypeCode")
  private Integer bookkeepingTypeCode = null;

  @JsonProperty("distributionPartner")
  private Boolean distributionPartner = null;

  @JsonProperty("employee")
  private Boolean employee = null;

  @JsonProperty("riskManager")
  private String riskManager = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("financeAuthority")
  private String financeAuthority = null;

  @JsonProperty("taxNumber")
  private String taxNumber = null;

  @JsonProperty("legalSelfEmployed")
  private Boolean legalSelfEmployed = null;

  @JsonProperty("customerFlagCode")
  private String customerFlagCode = null;

  @JsonProperty("capitalGainTax")
  private Boolean capitalGainTax = null;

  @JsonProperty("economicTask")
  private Boolean economicTask = null;

  @JsonProperty("projectFinancingCode")
  private String projectFinancingCode = null;

  @JsonProperty("emitterKey")
  private String emitterKey = null;

  @JsonProperty("balanceSettlementMonth")
  private String balanceSettlementMonth = null;

  @JsonProperty("kokuNumber")
  private String kokuNumber = null;

  @JsonProperty("customerType")
  private String customerType = null;

  @JsonProperty("uidNumber")
  private String uidNumber = null;

  @JsonProperty("lastReviewDate")
  private LocalDate lastReviewDate = null;

  @JsonProperty("economicDocumentsObtainingDate")
  private LocalDate economicDocumentsObtainingDate = null;

  public GetCustomerAdditionalDataResponse bookkeepingTypeCode(Integer bookkeepingTypeCode) {
    this.bookkeepingTypeCode = bookkeepingTypeCode;
    return this;
  }

  /**
   * Get bookkeepingTypeCode
   * @return bookkeepingTypeCode
  **/
  @ApiModelProperty(value = "")


  public Integer getBookkeepingTypeCode() {
    return bookkeepingTypeCode;
  }

  public void setBookkeepingTypeCode(Integer bookkeepingTypeCode) {
    this.bookkeepingTypeCode = bookkeepingTypeCode;
  }

  public GetCustomerAdditionalDataResponse distributionPartner(Boolean distributionPartner) {
    this.distributionPartner = distributionPartner;
    return this;
  }

  /**
   * Get distributionPartner
   * @return distributionPartner
  **/
  @ApiModelProperty(value = "")


  public Boolean isDistributionPartner() {
    return distributionPartner;
  }

  public void setDistributionPartner(Boolean distributionPartner) {
    this.distributionPartner = distributionPartner;
  }

  public GetCustomerAdditionalDataResponse employee(Boolean employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")


  public Boolean isEmployee() {
    return employee;
  }

  public void setEmployee(Boolean employee) {
    this.employee = employee;
  }

  public GetCustomerAdditionalDataResponse riskManager(String riskManager) {
    this.riskManager = riskManager;
    return this;
  }

  /**
   * Get riskManager
   * @return riskManager
  **/
  @ApiModelProperty(value = "")

@Size(max=19) 
  public String getRiskManager() {
    return riskManager;
  }

  public void setRiskManager(String riskManager) {
    this.riskManager = riskManager;
  }

  public GetCustomerAdditionalDataResponse bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public GetCustomerAdditionalDataResponse financeAuthority(String financeAuthority) {
    this.financeAuthority = financeAuthority;
    return this;
  }

  /**
   * Get financeAuthority
   * @return financeAuthority
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getFinanceAuthority() {
    return financeAuthority;
  }

  public void setFinanceAuthority(String financeAuthority) {
    this.financeAuthority = financeAuthority;
  }

  public GetCustomerAdditionalDataResponse taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

  /**
   * Get taxNumber
   * @return taxNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=26) 
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public GetCustomerAdditionalDataResponse legalSelfEmployed(Boolean legalSelfEmployed) {
    this.legalSelfEmployed = legalSelfEmployed;
    return this;
  }

  /**
   * Get legalSelfEmployed
   * @return legalSelfEmployed
  **/
  @ApiModelProperty(value = "")


  public Boolean isLegalSelfEmployed() {
    return legalSelfEmployed;
  }

  public void setLegalSelfEmployed(Boolean legalSelfEmployed) {
    this.legalSelfEmployed = legalSelfEmployed;
  }

  public GetCustomerAdditionalDataResponse customerFlagCode(String customerFlagCode) {
    this.customerFlagCode = customerFlagCode;
    return this;
  }

  /**
   * Get customerFlagCode
   * @return customerFlagCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getCustomerFlagCode() {
    return customerFlagCode;
  }

  public void setCustomerFlagCode(String customerFlagCode) {
    this.customerFlagCode = customerFlagCode;
  }

  public GetCustomerAdditionalDataResponse capitalGainTax(Boolean capitalGainTax) {
    this.capitalGainTax = capitalGainTax;
    return this;
  }

  /**
   * Get capitalGainTax
   * @return capitalGainTax
  **/
  @ApiModelProperty(value = "")


  public Boolean isCapitalGainTax() {
    return capitalGainTax;
  }

  public void setCapitalGainTax(Boolean capitalGainTax) {
    this.capitalGainTax = capitalGainTax;
  }

  public GetCustomerAdditionalDataResponse economicTask(Boolean economicTask) {
    this.economicTask = economicTask;
    return this;
  }

  /**
   * Get economicTask
   * @return economicTask
  **/
  @ApiModelProperty(value = "")


  public Boolean isEconomicTask() {
    return economicTask;
  }

  public void setEconomicTask(Boolean economicTask) {
    this.economicTask = economicTask;
  }

  public GetCustomerAdditionalDataResponse projectFinancingCode(String projectFinancingCode) {
    this.projectFinancingCode = projectFinancingCode;
    return this;
  }

  /**
   * Get projectFinancingCode
   * @return projectFinancingCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getProjectFinancingCode() {
    return projectFinancingCode;
  }

  public void setProjectFinancingCode(String projectFinancingCode) {
    this.projectFinancingCode = projectFinancingCode;
  }

  public GetCustomerAdditionalDataResponse emitterKey(String emitterKey) {
    this.emitterKey = emitterKey;
    return this;
  }

  /**
   * Get emitterKey
   * @return emitterKey
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getEmitterKey() {
    return emitterKey;
  }

  public void setEmitterKey(String emitterKey) {
    this.emitterKey = emitterKey;
  }

  public GetCustomerAdditionalDataResponse balanceSettlementMonth(String balanceSettlementMonth) {
    this.balanceSettlementMonth = balanceSettlementMonth;
    return this;
  }

  /**
   * Get balanceSettlementMonth
   * @return balanceSettlementMonth
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getBalanceSettlementMonth() {
    return balanceSettlementMonth;
  }

  public void setBalanceSettlementMonth(String balanceSettlementMonth) {
    this.balanceSettlementMonth = balanceSettlementMonth;
  }

  public GetCustomerAdditionalDataResponse kokuNumber(String kokuNumber) {
    this.kokuNumber = kokuNumber;
    return this;
  }

  /**
   * Enterprise customer number
   * @return kokuNumber
  **/
  @ApiModelProperty(value = "Enterprise customer number")

@Size(max=17) 
  public String getKokuNumber() {
    return kokuNumber;
  }

  public void setKokuNumber(String kokuNumber) {
    this.kokuNumber = kokuNumber;
  }

  public GetCustomerAdditionalDataResponse customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType
   * @return customerType
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public GetCustomerAdditionalDataResponse uidNumber(String uidNumber) {
    this.uidNumber = uidNumber;
    return this;
  }

  /**
   * Get uidNumber
   * @return uidNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=14) 
  public String getUidNumber() {
    return uidNumber;
  }

  public void setUidNumber(String uidNumber) {
    this.uidNumber = uidNumber;
  }

  public GetCustomerAdditionalDataResponse lastReviewDate(LocalDate lastReviewDate) {
    this.lastReviewDate = lastReviewDate;
    return this;
  }

  /**
   * Get lastReviewDate
   * @return lastReviewDate
  **/
  @ApiModelProperty(example = "2013-02-03", value = "")

  @Valid

  public LocalDate getLastReviewDate() {
    return lastReviewDate;
  }

  public void setLastReviewDate(LocalDate lastReviewDate) {
    this.lastReviewDate = lastReviewDate;
  }

  public GetCustomerAdditionalDataResponse economicDocumentsObtainingDate(LocalDate economicDocumentsObtainingDate) {
    this.economicDocumentsObtainingDate = economicDocumentsObtainingDate;
    return this;
  }

  /**
   * Get economicDocumentsObtainingDate
   * @return economicDocumentsObtainingDate
  **/
  @ApiModelProperty(example = "2013-02-03", value = "")

  @Valid

  public LocalDate getEconomicDocumentsObtainingDate() {
    return economicDocumentsObtainingDate;
  }

  public void setEconomicDocumentsObtainingDate(LocalDate economicDocumentsObtainingDate) {
    this.economicDocumentsObtainingDate = economicDocumentsObtainingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerAdditionalDataResponse getCustomerAdditionalDataResponse = (GetCustomerAdditionalDataResponse) o;
    return Objects.equals(this.bookkeepingTypeCode, getCustomerAdditionalDataResponse.bookkeepingTypeCode) &&
        Objects.equals(this.distributionPartner, getCustomerAdditionalDataResponse.distributionPartner) &&
        Objects.equals(this.employee, getCustomerAdditionalDataResponse.employee) &&
        Objects.equals(this.riskManager, getCustomerAdditionalDataResponse.riskManager) &&
        Objects.equals(this.bankCode, getCustomerAdditionalDataResponse.bankCode) &&
        Objects.equals(this.financeAuthority, getCustomerAdditionalDataResponse.financeAuthority) &&
        Objects.equals(this.taxNumber, getCustomerAdditionalDataResponse.taxNumber) &&
        Objects.equals(this.legalSelfEmployed, getCustomerAdditionalDataResponse.legalSelfEmployed) &&
        Objects.equals(this.customerFlagCode, getCustomerAdditionalDataResponse.customerFlagCode) &&
        Objects.equals(this.capitalGainTax, getCustomerAdditionalDataResponse.capitalGainTax) &&
        Objects.equals(this.economicTask, getCustomerAdditionalDataResponse.economicTask) &&
        Objects.equals(this.projectFinancingCode, getCustomerAdditionalDataResponse.projectFinancingCode) &&
        Objects.equals(this.emitterKey, getCustomerAdditionalDataResponse.emitterKey) &&
        Objects.equals(this.balanceSettlementMonth, getCustomerAdditionalDataResponse.balanceSettlementMonth) &&
        Objects.equals(this.kokuNumber, getCustomerAdditionalDataResponse.kokuNumber) &&
        Objects.equals(this.customerType, getCustomerAdditionalDataResponse.customerType) &&
        Objects.equals(this.uidNumber, getCustomerAdditionalDataResponse.uidNumber) &&
        Objects.equals(this.lastReviewDate, getCustomerAdditionalDataResponse.lastReviewDate) &&
        Objects.equals(this.economicDocumentsObtainingDate, getCustomerAdditionalDataResponse.economicDocumentsObtainingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookkeepingTypeCode, distributionPartner, employee, riskManager, bankCode, financeAuthority, taxNumber, legalSelfEmployed, customerFlagCode, capitalGainTax, economicTask, projectFinancingCode, emitterKey, balanceSettlementMonth, kokuNumber, customerType, uidNumber, lastReviewDate, economicDocumentsObtainingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerAdditionalDataResponse {\n");
    
    sb.append("    bookkeepingTypeCode: ").append(toIndentedString(bookkeepingTypeCode)).append("\n");
    sb.append("    distributionPartner: ").append(toIndentedString(distributionPartner)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    riskManager: ").append(toIndentedString(riskManager)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    financeAuthority: ").append(toIndentedString(financeAuthority)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    legalSelfEmployed: ").append(toIndentedString(legalSelfEmployed)).append("\n");
    sb.append("    customerFlagCode: ").append(toIndentedString(customerFlagCode)).append("\n");
    sb.append("    capitalGainTax: ").append(toIndentedString(capitalGainTax)).append("\n");
    sb.append("    economicTask: ").append(toIndentedString(economicTask)).append("\n");
    sb.append("    projectFinancingCode: ").append(toIndentedString(projectFinancingCode)).append("\n");
    sb.append("    emitterKey: ").append(toIndentedString(emitterKey)).append("\n");
    sb.append("    balanceSettlementMonth: ").append(toIndentedString(balanceSettlementMonth)).append("\n");
    sb.append("    kokuNumber: ").append(toIndentedString(kokuNumber)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    uidNumber: ").append(toIndentedString(uidNumber)).append("\n");
    sb.append("    lastReviewDate: ").append(toIndentedString(lastReviewDate)).append("\n");
    sb.append("    economicDocumentsObtainingDate: ").append(toIndentedString(economicDocumentsObtainingDate)).append("\n");
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

