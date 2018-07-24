package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetAddressCheckRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetAddressCheckRequest   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userFirstName")
  private String userFirstName = null;

  @JsonProperty("userOrgUnit")
  private String userOrgUnit = null;

  @JsonProperty("userCostCenter")
  private String userCostCenter = null;

  @JsonProperty("userEMail")
  private String userEMail = null;

  @JsonProperty("privateName")
  private String privateName = null;

  @JsonProperty("privateMaidenName")
  private String privateMaidenName = null;

  @JsonProperty("privateFirstName")
  private String privateFirstName = null;

  @JsonProperty("privateBirthDate")
  private Date privateBirthDate = null;

  @JsonProperty("privateSex")
  private String privateSex = null;

  @JsonProperty("privateNationality")
  private String privateNationality = null;

  @JsonProperty("privateStreet")
  private String privateStreet = null;

  @JsonProperty("privateHouseNumber")
  private String privateHouseNumber = null;

  @JsonProperty("privateZIP")
  private String privateZIP = null;

  @JsonProperty("privateCity")
  private String privateCity = null;

  @JsonProperty("privateCountryCode")
  private String privateCountryCode = null;

  @JsonProperty("reason")
  private Integer reason = null;

  public GetAddressCheckRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")

@Size(max=100) 
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public GetAddressCheckRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")

@Size(max=30) 
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public GetAddressCheckRequest userFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
    return this;
  }

  /**
   * Get userFirstName
   * @return userFirstName
  **/
  @ApiModelProperty(value = "")

@Size(max=30) 
  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public GetAddressCheckRequest userOrgUnit(String userOrgUnit) {
    this.userOrgUnit = userOrgUnit;
    return this;
  }

  /**
   * Get userOrgUnit
   * @return userOrgUnit
  **/
  @ApiModelProperty(value = "")

@Size(max=50) 
  public String getUserOrgUnit() {
    return userOrgUnit;
  }

  public void setUserOrgUnit(String userOrgUnit) {
    this.userOrgUnit = userOrgUnit;
  }

  public GetAddressCheckRequest userCostCenter(String userCostCenter) {
    this.userCostCenter = userCostCenter;
    return this;
  }

  /**
   * Get userCostCenter
   * @return userCostCenter
  **/
  @ApiModelProperty(value = "")

@Size(max=50) 
  public String getUserCostCenter() {
    return userCostCenter;
  }

  public void setUserCostCenter(String userCostCenter) {
    this.userCostCenter = userCostCenter;
  }

  public GetAddressCheckRequest userEMail(String userEMail) {
    this.userEMail = userEMail;
    return this;
  }

  /**
   * Get userEMail
   * @return userEMail
  **/
  @ApiModelProperty(value = "")

@Size(max=100) 
  public String getUserEMail() {
    return userEMail;
  }

  public void setUserEMail(String userEMail) {
    this.userEMail = userEMail;
  }

  public GetAddressCheckRequest privateName(String privateName) {
    this.privateName = privateName;
    return this;
  }

  /**
   * Get privateName
   * @return privateName
  **/
  @ApiModelProperty(value = "")

@Size(max=255) 
  public String getPrivateName() {
    return privateName;
  }

  public void setPrivateName(String privateName) {
    this.privateName = privateName;
  }

  public GetAddressCheckRequest privateMaidenName(String privateMaidenName) {
    this.privateMaidenName = privateMaidenName;
    return this;
  }

  /**
   * Get privateMaidenName
   * @return privateMaidenName
  **/
  @ApiModelProperty(value = "")

@Size(max=255) 
  public String getPrivateMaidenName() {
    return privateMaidenName;
  }

  public void setPrivateMaidenName(String privateMaidenName) {
    this.privateMaidenName = privateMaidenName;
  }

  public GetAddressCheckRequest privateFirstName(String privateFirstName) {
    this.privateFirstName = privateFirstName;
    return this;
  }

  /**
   * Get privateFirstName
   * @return privateFirstName
  **/
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getPrivateFirstName() {
    return privateFirstName;
  }

  public void setPrivateFirstName(String privateFirstName) {
    this.privateFirstName = privateFirstName;
  }

  public GetAddressCheckRequest privateBirthDate(Date privateBirthDate) {
    this.privateBirthDate = privateBirthDate;
    return this;
  }

  /**
   * The date for the birthdate
   * @return privateBirthDate
  **/
  @ApiModelProperty(example = "2017-09-07", value = "The date for the birthdate")

  @Valid

  public Date getPrivateBirthDate() {
    return privateBirthDate;
  }

  public void setPrivateBirthDate(Date privateBirthDate) {
    this.privateBirthDate = privateBirthDate;
  }

  public GetAddressCheckRequest privateSex(String privateSex) {
    this.privateSex = privateSex;
    return this;
  }

  /**
   * Get privateSex
   * @return privateSex
  **/
  @ApiModelProperty(value = "")

@Size(max=255) 
  public String getPrivateSex() {
    return privateSex;
  }

  public void setPrivateSex(String privateSex) {
    this.privateSex = privateSex;
  }

  public GetAddressCheckRequest privateNationality(String privateNationality) {
    this.privateNationality = privateNationality;
    return this;
  }

  /**
   * Get privateNationality
   * @return privateNationality
  **/
  @ApiModelProperty(value = "")

@Size(max=255) 
  public String getPrivateNationality() {
    return privateNationality;
  }

  public void setPrivateNationality(String privateNationality) {
    this.privateNationality = privateNationality;
  }

  public GetAddressCheckRequest privateStreet(String privateStreet) {
    this.privateStreet = privateStreet;
    return this;
  }

  /**
   * Get privateStreet
   * @return privateStreet
  **/
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getPrivateStreet() {
    return privateStreet;
  }

  public void setPrivateStreet(String privateStreet) {
    this.privateStreet = privateStreet;
  }

  public GetAddressCheckRequest privateHouseNumber(String privateHouseNumber) {
    this.privateHouseNumber = privateHouseNumber;
    return this;
  }

  /**
   * Get privateHouseNumber
   * @return privateHouseNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=50) 
  public String getPrivateHouseNumber() {
    return privateHouseNumber;
  }

  public void setPrivateHouseNumber(String privateHouseNumber) {
    this.privateHouseNumber = privateHouseNumber;
  }

  public GetAddressCheckRequest privateZIP(String privateZIP) {
    this.privateZIP = privateZIP;
    return this;
  }

  /**
   * Get privateZIP
   * @return privateZIP
  **/
  @ApiModelProperty(value = "")

@Size(max=12) 
  public String getPrivateZIP() {
    return privateZIP;
  }

  public void setPrivateZIP(String privateZIP) {
    this.privateZIP = privateZIP;
  }

  public GetAddressCheckRequest privateCity(String privateCity) {
    this.privateCity = privateCity;
    return this;
  }

  /**
   * Get privateCity
   * @return privateCity
  **/
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getPrivateCity() {
    return privateCity;
  }

  public void setPrivateCity(String privateCity) {
    this.privateCity = privateCity;
  }

  public GetAddressCheckRequest privateCountryCode(String privateCountryCode) {
    this.privateCountryCode = privateCountryCode;
    return this;
  }

  /**
   * Get privateCountryCode
   * @return privateCountryCode
  **/
  @ApiModelProperty(value = "")

@Size(max=255) 
  public String getPrivateCountryCode() {
    return privateCountryCode;
  }

  public void setPrivateCountryCode(String privateCountryCode) {
    this.privateCountryCode = privateCountryCode;
  }

  public GetAddressCheckRequest reason(Integer reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")


  public Integer getReason() {
    return reason;
  }

  public void setReason(Integer reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressCheckRequest getAddressCheckRequest = (GetAddressCheckRequest) o;
    return Objects.equals(this.userId, getAddressCheckRequest.userId) &&
        Objects.equals(this.userName, getAddressCheckRequest.userName) &&
        Objects.equals(this.userFirstName, getAddressCheckRequest.userFirstName) &&
        Objects.equals(this.userOrgUnit, getAddressCheckRequest.userOrgUnit) &&
        Objects.equals(this.userCostCenter, getAddressCheckRequest.userCostCenter) &&
        Objects.equals(this.userEMail, getAddressCheckRequest.userEMail) &&
        Objects.equals(this.privateName, getAddressCheckRequest.privateName) &&
        Objects.equals(this.privateMaidenName, getAddressCheckRequest.privateMaidenName) &&
        Objects.equals(this.privateFirstName, getAddressCheckRequest.privateFirstName) &&
        Objects.equals(this.privateBirthDate, getAddressCheckRequest.privateBirthDate) &&
        Objects.equals(this.privateSex, getAddressCheckRequest.privateSex) &&
        Objects.equals(this.privateNationality, getAddressCheckRequest.privateNationality) &&
        Objects.equals(this.privateStreet, getAddressCheckRequest.privateStreet) &&
        Objects.equals(this.privateHouseNumber, getAddressCheckRequest.privateHouseNumber) &&
        Objects.equals(this.privateZIP, getAddressCheckRequest.privateZIP) &&
        Objects.equals(this.privateCity, getAddressCheckRequest.privateCity) &&
        Objects.equals(this.privateCountryCode, getAddressCheckRequest.privateCountryCode) &&
        Objects.equals(this.reason, getAddressCheckRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userFirstName, userOrgUnit, userCostCenter, userEMail, privateName, privateMaidenName, privateFirstName, privateBirthDate, privateSex, privateNationality, privateStreet, privateHouseNumber, privateZIP, privateCity, privateCountryCode, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressCheckRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userFirstName: ").append(toIndentedString(userFirstName)).append("\n");
    sb.append("    userOrgUnit: ").append(toIndentedString(userOrgUnit)).append("\n");
    sb.append("    userCostCenter: ").append(toIndentedString(userCostCenter)).append("\n");
    sb.append("    userEMail: ").append(toIndentedString(userEMail)).append("\n");
    sb.append("    privateName: ").append(toIndentedString(privateName)).append("\n");
    sb.append("    privateMaidenName: ").append(toIndentedString(privateMaidenName)).append("\n");
    sb.append("    privateFirstName: ").append(toIndentedString(privateFirstName)).append("\n");
    sb.append("    privateBirthDate: ").append(toIndentedString(privateBirthDate)).append("\n");
    sb.append("    privateSex: ").append(toIndentedString(privateSex)).append("\n");
    sb.append("    privateNationality: ").append(toIndentedString(privateNationality)).append("\n");
    sb.append("    privateStreet: ").append(toIndentedString(privateStreet)).append("\n");
    sb.append("    privateHouseNumber: ").append(toIndentedString(privateHouseNumber)).append("\n");
    sb.append("    privateZIP: ").append(toIndentedString(privateZIP)).append("\n");
    sb.append("    privateCity: ").append(toIndentedString(privateCity)).append("\n");
    sb.append("    privateCountryCode: ").append(toIndentedString(privateCountryCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

