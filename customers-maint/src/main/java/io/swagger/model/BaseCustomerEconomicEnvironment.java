package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DomesticAddress;
import io.swagger.model.EnumProperty;
import io.swagger.model.PersonKey;
import java.math.BigDecimal;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaseCustomerEconomicEnvironment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "subType", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = UpdateCustomerEconomicEnvironmentRequest.class, name = "UpdateCustomerEconomicEnvironmentRequest"),
  @JsonSubTypes.Type(value = GetCustomerEconomicEnvironmentResponse.class, name = "GetCustomerEconomicEnvironmentResponse"),
})

public class BaseCustomerEconomicEnvironment   {
  @JsonProperty("birthDate")
  private Date birthDate = null;

  @JsonProperty("gender")
  private EnumProperty gender = null;

  @JsonProperty("maritalStatus")
  private EnumProperty maritalStatus = null;

  @JsonProperty("status")
  private EnumProperty status = null;

  @JsonProperty("statusDate")
  private Date statusDate = null;

  @JsonProperty("spouseWithoutIncome")
  private Boolean spouseWithoutIncome = null;

  @JsonProperty("numberOfChildren")
  private Integer numberOfChildren = null;

  @JsonProperty("occupation")
  private EnumProperty occupation = null;

  @JsonProperty("employmentStartDate")
  private Date employmentStartDate = null;

  @JsonProperty("education")
  private EnumProperty education = null;

  @JsonProperty("oenace")
  private EnumProperty oenace = null;

  @JsonProperty("oenaceEmployer")
  private EnumProperty oenaceEmployer = null;

  @JsonProperty("incomeStatement")
  private Boolean incomeStatement = null;

  @JsonProperty("employerName")
  private String employerName = null;

  @JsonProperty("employerAddress")
  private DomesticAddress employerAddress = null;

  @JsonProperty("residenceType")
  private String residenceType = null;

  @JsonProperty("residenceStartDate")
  private Date residenceStartDate = null;

  @JsonProperty("residenceSize")
  private Integer residenceSize = null;

  @JsonProperty("personsInHousehold")
  private Integer personsInHousehold = null;

  @JsonProperty("overallIncome")
  private BigDecimal overallIncome = null;

  @JsonProperty("overallExpenses")
  private BigDecimal overallExpenses = null;

  @JsonProperty("availableIncome")
  private BigDecimal availableIncome = null;

  @JsonProperty("personCode")
  private String personCode = null;

  @JsonProperty("employer")
  private PersonKey employer = null;

  @JsonProperty("payrollIncome")
  private BigDecimal payrollIncome = null;

  @JsonProperty("otherIncome")
  private BigDecimal otherIncome = null;

  @JsonProperty("fixedExpenses")
  private BigDecimal fixedExpenses = null;

  @JsonProperty("distrainableIncome")
  private BigDecimal distrainableIncome = null;

  @JsonProperty("sharedHousehold")
  private Boolean sharedHousehold = null;

  @JsonProperty("employerDeletionDate")
  private Date employerDeletionDate = null;

  public BaseCustomerEconomicEnvironment birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2015-05-26T00:00:00.000+0000", required = true, value = "")
  @NotNull

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public BaseCustomerEconomicEnvironment gender(EnumProperty gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getGender() {
    return gender;
  }

  public void setGender(EnumProperty gender) {
    this.gender = gender;
  }

  public BaseCustomerEconomicEnvironment maritalStatus(EnumProperty maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(EnumProperty maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public BaseCustomerEconomicEnvironment status(EnumProperty status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getStatus() {
    return status;
  }

  public void setStatus(EnumProperty status) {
    this.status = status;
  }

  public BaseCustomerEconomicEnvironment statusDate(Date statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Get statusDate
   * @return statusDate
  **/
  @ApiModelProperty(example = "2012-08-24", required = true, value = "")
  @NotNull

  @Valid

  public Date getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }

  public BaseCustomerEconomicEnvironment spouseWithoutIncome(Boolean spouseWithoutIncome) {
    this.spouseWithoutIncome = spouseWithoutIncome;
    return this;
  }

  /**
   * Get spouseWithoutIncome
   * @return spouseWithoutIncome
  **/
  @ApiModelProperty(value = "")


  public Boolean isSpouseWithoutIncome() {
    return spouseWithoutIncome;
  }

  public void setSpouseWithoutIncome(Boolean spouseWithoutIncome) {
    this.spouseWithoutIncome = spouseWithoutIncome;
  }

  public BaseCustomerEconomicEnvironment numberOfChildren(Integer numberOfChildren) {
    this.numberOfChildren = numberOfChildren;
    return this;
  }

  /**
   * Get numberOfChildren
   * @return numberOfChildren
  **/
  @ApiModelProperty(example = "12", value = "")


  public Integer getNumberOfChildren() {
    return numberOfChildren;
  }

  public void setNumberOfChildren(Integer numberOfChildren) {
    this.numberOfChildren = numberOfChildren;
  }

  public BaseCustomerEconomicEnvironment occupation(EnumProperty occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Get occupation
   * @return occupation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getOccupation() {
    return occupation;
  }

  public void setOccupation(EnumProperty occupation) {
    this.occupation = occupation;
  }

  public BaseCustomerEconomicEnvironment employmentStartDate(Date employmentStartDate) {
    this.employmentStartDate = employmentStartDate;
    return this;
  }

  /**
   * Get employmentStartDate
   * @return employmentStartDate
  **/
  @ApiModelProperty(example = "2013-02-03", value = "")

  @Valid

  public Date getEmploymentStartDate() {
    return employmentStartDate;
  }

  public void setEmploymentStartDate(Date employmentStartDate) {
    this.employmentStartDate = employmentStartDate;
  }

  public BaseCustomerEconomicEnvironment education(EnumProperty education) {
    this.education = education;
    return this;
  }

  /**
   * Get education
   * @return education
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getEducation() {
    return education;
  }

  public void setEducation(EnumProperty education) {
    this.education = education;
  }

  public BaseCustomerEconomicEnvironment oenace(EnumProperty oenace) {
    this.oenace = oenace;
    return this;
  }

  /**
   * Get oenace
   * @return oenace
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getOenace() {
    return oenace;
  }

  public void setOenace(EnumProperty oenace) {
    this.oenace = oenace;
  }

  public BaseCustomerEconomicEnvironment oenaceEmployer(EnumProperty oenaceEmployer) {
    this.oenaceEmployer = oenaceEmployer;
    return this;
  }

  /**
   * Get oenaceEmployer
   * @return oenaceEmployer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getOenaceEmployer() {
    return oenaceEmployer;
  }

  public void setOenaceEmployer(EnumProperty oenaceEmployer) {
    this.oenaceEmployer = oenaceEmployer;
  }

  public BaseCustomerEconomicEnvironment incomeStatement(Boolean incomeStatement) {
    this.incomeStatement = incomeStatement;
    return this;
  }

  /**
   * Get incomeStatement
   * @return incomeStatement
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncomeStatement() {
    return incomeStatement;
  }

  public void setIncomeStatement(Boolean incomeStatement) {
    this.incomeStatement = incomeStatement;
  }

  public BaseCustomerEconomicEnvironment employerName(String employerName) {
    this.employerName = employerName;
    return this;
  }

  /**
   * Get employerName
   * @return employerName
  **/
  @ApiModelProperty(value = "")

@Size(max=35) 
  public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }

  public BaseCustomerEconomicEnvironment employerAddress(DomesticAddress employerAddress) {
    this.employerAddress = employerAddress;
    return this;
  }

  /**
   * Get employerAddress
   * @return employerAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DomesticAddress getEmployerAddress() {
    return employerAddress;
  }

  public void setEmployerAddress(DomesticAddress employerAddress) {
    this.employerAddress = employerAddress;
  }

  public BaseCustomerEconomicEnvironment residenceType(String residenceType) {
    this.residenceType = residenceType;
    return this;
  }

  /**
   * Get residenceType
   * @return residenceType
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getResidenceType() {
    return residenceType;
  }

  public void setResidenceType(String residenceType) {
    this.residenceType = residenceType;
  }

  public BaseCustomerEconomicEnvironment residenceStartDate(Date residenceStartDate) {
    this.residenceStartDate = residenceStartDate;
    return this;
  }

  /**
   * Get residenceStartDate
   * @return residenceStartDate
  **/
  @ApiModelProperty(example = "2014-05-08", value = "")

  @Valid

  public Date getResidenceStartDate() {
    return residenceStartDate;
  }

  public void setResidenceStartDate(Date residenceStartDate) {
    this.residenceStartDate = residenceStartDate;
  }

  public BaseCustomerEconomicEnvironment residenceSize(Integer residenceSize) {
    this.residenceSize = residenceSize;
    return this;
  }

  /**
   * Get residenceSize
   * @return residenceSize
  **/
  @ApiModelProperty(example = "12", value = "")


  public Integer getResidenceSize() {
    return residenceSize;
  }

  public void setResidenceSize(Integer residenceSize) {
    this.residenceSize = residenceSize;
  }

  public BaseCustomerEconomicEnvironment personsInHousehold(Integer personsInHousehold) {
    this.personsInHousehold = personsInHousehold;
    return this;
  }

  /**
   * Get personsInHousehold
   * @return personsInHousehold
  **/
  @ApiModelProperty(example = "4", value = "")


  public Integer getPersonsInHousehold() {
    return personsInHousehold;
  }

  public void setPersonsInHousehold(Integer personsInHousehold) {
    this.personsInHousehold = personsInHousehold;
  }

  public BaseCustomerEconomicEnvironment overallIncome(BigDecimal overallIncome) {
    this.overallIncome = overallIncome;
    return this;
  }

  /**
   * Get overallIncome
   * @return overallIncome
  **/
  @ApiModelProperty(example = "500.0", value = "")

  @Valid

  public BigDecimal getOverallIncome() {
    return overallIncome;
  }

  public void setOverallIncome(BigDecimal overallIncome) {
    this.overallIncome = overallIncome;
  }

  public BaseCustomerEconomicEnvironment overallExpenses(BigDecimal overallExpenses) {
    this.overallExpenses = overallExpenses;
    return this;
  }

  /**
   * Get overallExpenses
   * @return overallExpenses
  **/
  @ApiModelProperty(example = "600.0", value = "")

  @Valid

  public BigDecimal getOverallExpenses() {
    return overallExpenses;
  }

  public void setOverallExpenses(BigDecimal overallExpenses) {
    this.overallExpenses = overallExpenses;
  }

  public BaseCustomerEconomicEnvironment availableIncome(BigDecimal availableIncome) {
    this.availableIncome = availableIncome;
    return this;
  }

  /**
   * Get availableIncome
   * @return availableIncome
  **/
  @ApiModelProperty(example = "478.0", value = "")

  @Valid

  public BigDecimal getAvailableIncome() {
    return availableIncome;
  }

  public void setAvailableIncome(BigDecimal availableIncome) {
    this.availableIncome = availableIncome;
  }

  public BaseCustomerEconomicEnvironment personCode(String personCode) {
    this.personCode = personCode;
    return this;
  }

  /**
   * Get personCode
   * @return personCode
  **/
  @ApiModelProperty(value = "")

@Size(max=39) 
  public String getPersonCode() {
    return personCode;
  }

  public void setPersonCode(String personCode) {
    this.personCode = personCode;
  }

  public BaseCustomerEconomicEnvironment employer(PersonKey employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonKey getEmployer() {
    return employer;
  }

  public void setEmployer(PersonKey employer) {
    this.employer = employer;
  }

  public BaseCustomerEconomicEnvironment payrollIncome(BigDecimal payrollIncome) {
    this.payrollIncome = payrollIncome;
    return this;
  }

  /**
   * Get payrollIncome
   * @return payrollIncome
  **/
  @ApiModelProperty(example = "123.0", value = "")

  @Valid

  public BigDecimal getPayrollIncome() {
    return payrollIncome;
  }

  public void setPayrollIncome(BigDecimal payrollIncome) {
    this.payrollIncome = payrollIncome;
  }

  public BaseCustomerEconomicEnvironment otherIncome(BigDecimal otherIncome) {
    this.otherIncome = otherIncome;
    return this;
  }

  /**
   * Get otherIncome
   * @return otherIncome
  **/
  @ApiModelProperty(example = "400.0", value = "")

  @Valid

  public BigDecimal getOtherIncome() {
    return otherIncome;
  }

  public void setOtherIncome(BigDecimal otherIncome) {
    this.otherIncome = otherIncome;
  }

  public BaseCustomerEconomicEnvironment fixedExpenses(BigDecimal fixedExpenses) {
    this.fixedExpenses = fixedExpenses;
    return this;
  }

  /**
   * Get fixedExpenses
   * @return fixedExpenses
  **/
  @ApiModelProperty(example = "700.0", value = "")

  @Valid

  public BigDecimal getFixedExpenses() {
    return fixedExpenses;
  }

  public void setFixedExpenses(BigDecimal fixedExpenses) {
    this.fixedExpenses = fixedExpenses;
  }

  public BaseCustomerEconomicEnvironment distrainableIncome(BigDecimal distrainableIncome) {
    this.distrainableIncome = distrainableIncome;
    return this;
  }

  /**
   * Get distrainableIncome
   * @return distrainableIncome
  **/
  @ApiModelProperty(example = "100.0", value = "")

  @Valid

  public BigDecimal getDistrainableIncome() {
    return distrainableIncome;
  }

  public void setDistrainableIncome(BigDecimal distrainableIncome) {
    this.distrainableIncome = distrainableIncome;
  }

  public BaseCustomerEconomicEnvironment sharedHousehold(Boolean sharedHousehold) {
    this.sharedHousehold = sharedHousehold;
    return this;
  }

  /**
   * Get sharedHousehold
   * @return sharedHousehold
  **/
  @ApiModelProperty(value = "")


  public Boolean isSharedHousehold() {
    return sharedHousehold;
  }

  public void setSharedHousehold(Boolean sharedHousehold) {
    this.sharedHousehold = sharedHousehold;
  }

  public BaseCustomerEconomicEnvironment employerDeletionDate(Date employerDeletionDate) {
    this.employerDeletionDate = employerDeletionDate;
    return this;
  }

  /**
   * Get employerDeletionDate
   * @return employerDeletionDate
  **/
  @ApiModelProperty(example = "2017-03-24", value = "")

  @Valid

  public Date getEmployerDeletionDate() {
    return employerDeletionDate;
  }

  public void setEmployerDeletionDate(Date employerDeletionDate) {
    this.employerDeletionDate = employerDeletionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCustomerEconomicEnvironment baseCustomerEconomicEnvironment = (BaseCustomerEconomicEnvironment) o;
    return Objects.equals(this.birthDate, baseCustomerEconomicEnvironment.birthDate) &&
        Objects.equals(this.gender, baseCustomerEconomicEnvironment.gender) &&
        Objects.equals(this.maritalStatus, baseCustomerEconomicEnvironment.maritalStatus) &&
        Objects.equals(this.status, baseCustomerEconomicEnvironment.status) &&
        Objects.equals(this.statusDate, baseCustomerEconomicEnvironment.statusDate) &&
        Objects.equals(this.spouseWithoutIncome, baseCustomerEconomicEnvironment.spouseWithoutIncome) &&
        Objects.equals(this.numberOfChildren, baseCustomerEconomicEnvironment.numberOfChildren) &&
        Objects.equals(this.occupation, baseCustomerEconomicEnvironment.occupation) &&
        Objects.equals(this.employmentStartDate, baseCustomerEconomicEnvironment.employmentStartDate) &&
        Objects.equals(this.education, baseCustomerEconomicEnvironment.education) &&
        Objects.equals(this.oenace, baseCustomerEconomicEnvironment.oenace) &&
        Objects.equals(this.oenaceEmployer, baseCustomerEconomicEnvironment.oenaceEmployer) &&
        Objects.equals(this.incomeStatement, baseCustomerEconomicEnvironment.incomeStatement) &&
        Objects.equals(this.employerName, baseCustomerEconomicEnvironment.employerName) &&
        Objects.equals(this.employerAddress, baseCustomerEconomicEnvironment.employerAddress) &&
        Objects.equals(this.residenceType, baseCustomerEconomicEnvironment.residenceType) &&
        Objects.equals(this.residenceStartDate, baseCustomerEconomicEnvironment.residenceStartDate) &&
        Objects.equals(this.residenceSize, baseCustomerEconomicEnvironment.residenceSize) &&
        Objects.equals(this.personsInHousehold, baseCustomerEconomicEnvironment.personsInHousehold) &&
        Objects.equals(this.overallIncome, baseCustomerEconomicEnvironment.overallIncome) &&
        Objects.equals(this.overallExpenses, baseCustomerEconomicEnvironment.overallExpenses) &&
        Objects.equals(this.availableIncome, baseCustomerEconomicEnvironment.availableIncome) &&
        Objects.equals(this.personCode, baseCustomerEconomicEnvironment.personCode) &&
        Objects.equals(this.employer, baseCustomerEconomicEnvironment.employer) &&
        Objects.equals(this.payrollIncome, baseCustomerEconomicEnvironment.payrollIncome) &&
        Objects.equals(this.otherIncome, baseCustomerEconomicEnvironment.otherIncome) &&
        Objects.equals(this.fixedExpenses, baseCustomerEconomicEnvironment.fixedExpenses) &&
        Objects.equals(this.distrainableIncome, baseCustomerEconomicEnvironment.distrainableIncome) &&
        Objects.equals(this.sharedHousehold, baseCustomerEconomicEnvironment.sharedHousehold) &&
        Objects.equals(this.employerDeletionDate, baseCustomerEconomicEnvironment.employerDeletionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, gender, maritalStatus, status, statusDate, spouseWithoutIncome, numberOfChildren, occupation, employmentStartDate, education, oenace, oenaceEmployer, incomeStatement, employerName, employerAddress, residenceType, residenceStartDate, residenceSize, personsInHousehold, overallIncome, overallExpenses, availableIncome, personCode, employer, payrollIncome, otherIncome, fixedExpenses, distrainableIncome, sharedHousehold, employerDeletionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseCustomerEconomicEnvironment {\n");
    
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    spouseWithoutIncome: ").append(toIndentedString(spouseWithoutIncome)).append("\n");
    sb.append("    numberOfChildren: ").append(toIndentedString(numberOfChildren)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    employmentStartDate: ").append(toIndentedString(employmentStartDate)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    oenace: ").append(toIndentedString(oenace)).append("\n");
    sb.append("    oenaceEmployer: ").append(toIndentedString(oenaceEmployer)).append("\n");
    sb.append("    incomeStatement: ").append(toIndentedString(incomeStatement)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    employerAddress: ").append(toIndentedString(employerAddress)).append("\n");
    sb.append("    residenceType: ").append(toIndentedString(residenceType)).append("\n");
    sb.append("    residenceStartDate: ").append(toIndentedString(residenceStartDate)).append("\n");
    sb.append("    residenceSize: ").append(toIndentedString(residenceSize)).append("\n");
    sb.append("    personsInHousehold: ").append(toIndentedString(personsInHousehold)).append("\n");
    sb.append("    overallIncome: ").append(toIndentedString(overallIncome)).append("\n");
    sb.append("    overallExpenses: ").append(toIndentedString(overallExpenses)).append("\n");
    sb.append("    availableIncome: ").append(toIndentedString(availableIncome)).append("\n");
    sb.append("    personCode: ").append(toIndentedString(personCode)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    payrollIncome: ").append(toIndentedString(payrollIncome)).append("\n");
    sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
    sb.append("    fixedExpenses: ").append(toIndentedString(fixedExpenses)).append("\n");
    sb.append("    distrainableIncome: ").append(toIndentedString(distrainableIncome)).append("\n");
    sb.append("    sharedHousehold: ").append(toIndentedString(sharedHousehold)).append("\n");
    sb.append("    employerDeletionDate: ").append(toIndentedString(employerDeletionDate)).append("\n");
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

