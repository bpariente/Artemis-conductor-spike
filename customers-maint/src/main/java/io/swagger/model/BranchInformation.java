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
 * BranchInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class BranchInformation   {
  @JsonProperty("branchName")
  private String branchName = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("userTelephoneNumber")
  private String userTelephoneNumber = null;

  @JsonProperty("formattedCurrentDate")
  private String formattedCurrentDate = null;

  @JsonProperty("branchTown")
  private String branchTown = null;

  @JsonProperty("branchStreet")
  private String branchStreet = null;

  @JsonProperty("branchFaxNumber")
  private String branchFaxNumber = null;

  @JsonProperty("branchBankCode")
  private Integer branchBankCode = null;

  @JsonProperty("commercialRegisterNumber")
  private String commercialRegisterNumber = null;

  @JsonProperty("dvrNumber")
  private Integer dvrNumber = null;

  @JsonProperty("companyAddress")
  private String companyAddress = null;

  @JsonProperty("companyInternetAddress")
  private String companyInternetAddress = null;

  @JsonProperty("companyMailAddress")
  private String companyMailAddress = null;

  @JsonProperty("shortCompanyName")
  private String shortCompanyName = null;

  @JsonProperty("mediumCompanyName")
  private String mediumCompanyName = null;

  @JsonProperty("companyName1")
  private String companyName1 = null;

  @JsonProperty("companyName2")
  private String companyName2 = null;

  @JsonProperty("companyName3")
  private String companyName3 = null;

  @JsonProperty("companyPostalCode")
  private String companyPostalCode = null;

  @JsonProperty("companyTelephoneNumber")
  private String companyTelephoneNumber = null;

  @JsonProperty("sender")
  private String sender = null;

  @JsonProperty("companyBrandName")
  private String companyBrandName = null;

  public BranchInformation branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Branch Name
   * @return branchName
  **/
  @ApiModelProperty(example = "Wein Branch", value = "Branch Name")

@Size(max=40) 
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public BranchInformation username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username
   * @return username
  **/
  @ApiModelProperty(example = "Admin", value = "Username")

@Size(max=40) 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public BranchInformation userTelephoneNumber(String userTelephoneNumber) {
    this.userTelephoneNumber = userTelephoneNumber;
    return this;
  }

  /**
   * User Telephone number
   * @return userTelephoneNumber
  **/
  @ApiModelProperty(example = "+43 12345678", value = "User Telephone number")

@Size(max=15) 
  public String getUserTelephoneNumber() {
    return userTelephoneNumber;
  }

  public void setUserTelephoneNumber(String userTelephoneNumber) {
    this.userTelephoneNumber = userTelephoneNumber;
  }

  public BranchInformation formattedCurrentDate(String formattedCurrentDate) {
    this.formattedCurrentDate = formattedCurrentDate;
    return this;
  }

  /**
   * Formatted Current Date
   * @return formattedCurrentDate
  **/
  @ApiModelProperty(example = "10.10.2017", value = "Formatted Current Date")

@Size(max=10) 
  public String getFormattedCurrentDate() {
    return formattedCurrentDate;
  }

  public void setFormattedCurrentDate(String formattedCurrentDate) {
    this.formattedCurrentDate = formattedCurrentDate;
  }

  public BranchInformation branchTown(String branchTown) {
    this.branchTown = branchTown;
    return this;
  }

  /**
   * Branch Town
   * @return branchTown
  **/
  @ApiModelProperty(example = "Wein", value = "Branch Town")

@Size(max=50) 
  public String getBranchTown() {
    return branchTown;
  }

  public void setBranchTown(String branchTown) {
    this.branchTown = branchTown;
  }

  public BranchInformation branchStreet(String branchStreet) {
    this.branchStreet = branchStreet;
    return this;
  }

  /**
   * Branch Street
   * @return branchStreet
  **/
  @ApiModelProperty(example = "Street", value = "Branch Street")

@Size(max=40) 
  public String getBranchStreet() {
    return branchStreet;
  }

  public void setBranchStreet(String branchStreet) {
    this.branchStreet = branchStreet;
  }

  public BranchInformation branchFaxNumber(String branchFaxNumber) {
    this.branchFaxNumber = branchFaxNumber;
    return this;
  }

  /**
   * Branch Fax Number
   * @return branchFaxNumber
  **/
  @ApiModelProperty(example = "+43 12345", value = "Branch Fax Number")

@Size(max=15) 
  public String getBranchFaxNumber() {
    return branchFaxNumber;
  }

  public void setBranchFaxNumber(String branchFaxNumber) {
    this.branchFaxNumber = branchFaxNumber;
  }

  public BranchInformation branchBankCode(Integer branchBankCode) {
    this.branchBankCode = branchBankCode;
    return this;
  }

  /**
   * Branch Bank code
   * @return branchBankCode
  **/
  @ApiModelProperty(example = "14000", value = "Branch Bank code")


  public Integer getBranchBankCode() {
    return branchBankCode;
  }

  public void setBranchBankCode(Integer branchBankCode) {
    this.branchBankCode = branchBankCode;
  }

  public BranchInformation commercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
    return this;
  }

  /**
   * Commercial Register Number
   * @return commercialRegisterNumber
  **/
  @ApiModelProperty(example = "98765542", value = "Commercial Register Number")

@Size(max=8) 
  public String getCommercialRegisterNumber() {
    return commercialRegisterNumber;
  }

  public void setCommercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
  }

  public BranchInformation dvrNumber(Integer dvrNumber) {
    this.dvrNumber = dvrNumber;
    return this;
  }

  /**
   * DVR Number
   * @return dvrNumber
  **/
  @ApiModelProperty(example = "1234567", value = "DVR Number")


  public Integer getDvrNumber() {
    return dvrNumber;
  }

  public void setDvrNumber(Integer dvrNumber) {
    this.dvrNumber = dvrNumber;
  }

  public BranchInformation companyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

  /**
   * Company Address
   * @return companyAddress
  **/
  @ApiModelProperty(example = "Wein, Austria", value = "Company Address")

@Size(max=90) 
  public String getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  public BranchInformation companyInternetAddress(String companyInternetAddress) {
    this.companyInternetAddress = companyInternetAddress;
    return this;
  }

  /**
   * Company Internet Address
   * @return companyInternetAddress
  **/
  @ApiModelProperty(example = "IP Add", value = "Company Internet Address")

@Size(max=50) 
  public String getCompanyInternetAddress() {
    return companyInternetAddress;
  }

  public void setCompanyInternetAddress(String companyInternetAddress) {
    this.companyInternetAddress = companyInternetAddress;
  }

  public BranchInformation companyMailAddress(String companyMailAddress) {
    this.companyMailAddress = companyMailAddress;
    return this;
  }

  /**
   * Company Mail Address
   * @return companyMailAddress
  **/
  @ApiModelProperty(example = "123 Wein", value = "Company Mail Address")

@Size(max=50) 
  public String getCompanyMailAddress() {
    return companyMailAddress;
  }

  public void setCompanyMailAddress(String companyMailAddress) {
    this.companyMailAddress = companyMailAddress;
  }

  public BranchInformation shortCompanyName(String shortCompanyName) {
    this.shortCompanyName = shortCompanyName;
    return this;
  }

  /**
   * Short Company Name
   * @return shortCompanyName
  **/
  @ApiModelProperty(example = "BWG", value = "Short Company Name")

@Size(max=20) 
  public String getShortCompanyName() {
    return shortCompanyName;
  }

  public void setShortCompanyName(String shortCompanyName) {
    this.shortCompanyName = shortCompanyName;
  }

  public BranchInformation mediumCompanyName(String mediumCompanyName) {
    this.mediumCompanyName = mediumCompanyName;
    return this;
  }

  /**
   * Medium Company Name
   * @return mediumCompanyName
  **/
  @ApiModelProperty(example = "Bawag P.S.K.", value = "Medium Company Name")

@Size(max=40) 
  public String getMediumCompanyName() {
    return mediumCompanyName;
  }

  public void setMediumCompanyName(String mediumCompanyName) {
    this.mediumCompanyName = mediumCompanyName;
  }

  public BranchInformation companyName1(String companyName1) {
    this.companyName1 = companyName1;
    return this;
  }

  /**
   * Company Name 1
   * @return companyName1
  **/
  @ApiModelProperty(example = "Bawag P.S.K. 1", value = "Company Name 1")

@Size(max=60) 
  public String getCompanyName1() {
    return companyName1;
  }

  public void setCompanyName1(String companyName1) {
    this.companyName1 = companyName1;
  }

  public BranchInformation companyName2(String companyName2) {
    this.companyName2 = companyName2;
    return this;
  }

  /**
   * Company Name 2
   * @return companyName2
  **/
  @ApiModelProperty(example = "Bawag P.S.K. 2", value = "Company Name 2")

@Size(max=60) 
  public String getCompanyName2() {
    return companyName2;
  }

  public void setCompanyName2(String companyName2) {
    this.companyName2 = companyName2;
  }

  public BranchInformation companyName3(String companyName3) {
    this.companyName3 = companyName3;
    return this;
  }

  /**
   * Company Name 3
   * @return companyName3
  **/
  @ApiModelProperty(example = "Bawag P.S.K. 3", value = "Company Name 3")

@Size(max=50) 
  public String getCompanyName3() {
    return companyName3;
  }

  public void setCompanyName3(String companyName3) {
    this.companyName3 = companyName3;
  }

  public BranchInformation companyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
    return this;
  }

  /**
   * Company Postal Code
   * @return companyPostalCode
  **/
  @ApiModelProperty(example = "12345", value = "Company Postal Code")

@Size(max=8) 
  public String getCompanyPostalCode() {
    return companyPostalCode;
  }

  public void setCompanyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
  }

  public BranchInformation companyTelephoneNumber(String companyTelephoneNumber) {
    this.companyTelephoneNumber = companyTelephoneNumber;
    return this;
  }

  /**
   * Company Telephone Number
   * @return companyTelephoneNumber
  **/
  @ApiModelProperty(example = "+43 12345", value = "Company Telephone Number")

@Size(max=30) 
  public String getCompanyTelephoneNumber() {
    return companyTelephoneNumber;
  }

  public void setCompanyTelephoneNumber(String companyTelephoneNumber) {
    this.companyTelephoneNumber = companyTelephoneNumber;
  }

  public BranchInformation sender(String sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Sender
   * @return sender
  **/
  @ApiModelProperty(example = "Sender", value = "Sender")

@Size(max=100) 
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public BranchInformation companyBrandName(String companyBrandName) {
    this.companyBrandName = companyBrandName;
    return this;
  }

  /**
   * Company Brand Name
   * @return companyBrandName
  **/
  @ApiModelProperty(example = "BAWAG P.S.K.", value = "Company Brand Name")

@Size(max=40) 
  public String getCompanyBrandName() {
    return companyBrandName;
  }

  public void setCompanyBrandName(String companyBrandName) {
    this.companyBrandName = companyBrandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchInformation branchInformation = (BranchInformation) o;
    return Objects.equals(this.branchName, branchInformation.branchName) &&
        Objects.equals(this.username, branchInformation.username) &&
        Objects.equals(this.userTelephoneNumber, branchInformation.userTelephoneNumber) &&
        Objects.equals(this.formattedCurrentDate, branchInformation.formattedCurrentDate) &&
        Objects.equals(this.branchTown, branchInformation.branchTown) &&
        Objects.equals(this.branchStreet, branchInformation.branchStreet) &&
        Objects.equals(this.branchFaxNumber, branchInformation.branchFaxNumber) &&
        Objects.equals(this.branchBankCode, branchInformation.branchBankCode) &&
        Objects.equals(this.commercialRegisterNumber, branchInformation.commercialRegisterNumber) &&
        Objects.equals(this.dvrNumber, branchInformation.dvrNumber) &&
        Objects.equals(this.companyAddress, branchInformation.companyAddress) &&
        Objects.equals(this.companyInternetAddress, branchInformation.companyInternetAddress) &&
        Objects.equals(this.companyMailAddress, branchInformation.companyMailAddress) &&
        Objects.equals(this.shortCompanyName, branchInformation.shortCompanyName) &&
        Objects.equals(this.mediumCompanyName, branchInformation.mediumCompanyName) &&
        Objects.equals(this.companyName1, branchInformation.companyName1) &&
        Objects.equals(this.companyName2, branchInformation.companyName2) &&
        Objects.equals(this.companyName3, branchInformation.companyName3) &&
        Objects.equals(this.companyPostalCode, branchInformation.companyPostalCode) &&
        Objects.equals(this.companyTelephoneNumber, branchInformation.companyTelephoneNumber) &&
        Objects.equals(this.sender, branchInformation.sender) &&
        Objects.equals(this.companyBrandName, branchInformation.companyBrandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, username, userTelephoneNumber, formattedCurrentDate, branchTown, branchStreet, branchFaxNumber, branchBankCode, commercialRegisterNumber, dvrNumber, companyAddress, companyInternetAddress, companyMailAddress, shortCompanyName, mediumCompanyName, companyName1, companyName2, companyName3, companyPostalCode, companyTelephoneNumber, sender, companyBrandName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchInformation {\n");
    
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userTelephoneNumber: ").append(toIndentedString(userTelephoneNumber)).append("\n");
    sb.append("    formattedCurrentDate: ").append(toIndentedString(formattedCurrentDate)).append("\n");
    sb.append("    branchTown: ").append(toIndentedString(branchTown)).append("\n");
    sb.append("    branchStreet: ").append(toIndentedString(branchStreet)).append("\n");
    sb.append("    branchFaxNumber: ").append(toIndentedString(branchFaxNumber)).append("\n");
    sb.append("    branchBankCode: ").append(toIndentedString(branchBankCode)).append("\n");
    sb.append("    commercialRegisterNumber: ").append(toIndentedString(commercialRegisterNumber)).append("\n");
    sb.append("    dvrNumber: ").append(toIndentedString(dvrNumber)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    companyInternetAddress: ").append(toIndentedString(companyInternetAddress)).append("\n");
    sb.append("    companyMailAddress: ").append(toIndentedString(companyMailAddress)).append("\n");
    sb.append("    shortCompanyName: ").append(toIndentedString(shortCompanyName)).append("\n");
    sb.append("    mediumCompanyName: ").append(toIndentedString(mediumCompanyName)).append("\n");
    sb.append("    companyName1: ").append(toIndentedString(companyName1)).append("\n");
    sb.append("    companyName2: ").append(toIndentedString(companyName2)).append("\n");
    sb.append("    companyName3: ").append(toIndentedString(companyName3)).append("\n");
    sb.append("    companyPostalCode: ").append(toIndentedString(companyPostalCode)).append("\n");
    sb.append("    companyTelephoneNumber: ").append(toIndentedString(companyTelephoneNumber)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    companyBrandName: ").append(toIndentedString(companyBrandName)).append("\n");
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

