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
 * PersonIdentificationDocument
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class PersonIdentificationDocument   {
  @JsonProperty("codeType")
  private String codeType = null;

  @JsonProperty("issuingAuthority")
  private String issuingAuthority = null;

  @JsonProperty("issuingAuthorityCountryCode")
  private String issuingAuthorityCountryCode = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("issuingDate")
  private Date issuingDate = null;

  @JsonProperty("expirationDate")
  private Date expirationDate = null;

  @JsonProperty("comment")
  private String comment = null;

  public PersonIdentificationDocument codeType(String codeType) {
    this.codeType = codeType;
    return this;
  }

  /**
   * Type of the document given
   * @return codeType
  **/
  @ApiModelProperty(example = "A / BEHINDERTENPASS", value = "Type of the document given")

@Size(max=100) 
  public String getCodeType() {
    return codeType;
  }

  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }

  public PersonIdentificationDocument issuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

  /**
   * Authority which issued the document
   * @return issuingAuthority
  **/
  @ApiModelProperty(example = "Issuer", value = "Authority which issued the document")

@Size(max=35) 
  public String getIssuingAuthority() {
    return issuingAuthority;
  }

  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }

  public PersonIdentificationDocument issuingAuthorityCountryCode(String issuingAuthorityCountryCode) {
    this.issuingAuthorityCountryCode = issuingAuthorityCountryCode;
    return this;
  }

  /**
   * Country of authority which issued the document
   * @return issuingAuthorityCountryCode
  **/
  @ApiModelProperty(example = "AT", value = "Country of authority which issued the document")

@Size(max=2) 
  public String getIssuingAuthorityCountryCode() {
    return issuingAuthorityCountryCode;
  }

  public void setIssuingAuthorityCountryCode(String issuingAuthorityCountryCode) {
    this.issuingAuthorityCountryCode = issuingAuthorityCountryCode;
  }

  public PersonIdentificationDocument number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Register Number/Legitimation data for natural persons
   * @return number
  **/
  @ApiModelProperty(example = "C", value = "Register Number/Legitimation data for natural persons")

@Size(max=35) 
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PersonIdentificationDocument issuingDate(Date issuingDate) {
    this.issuingDate = issuingDate;
    return this;
  }

  /**
   * Date issued
   * @return issuingDate
  **/
  @ApiModelProperty(example = "2017-12-12", value = "Date issued")

  @Valid

  public Date getIssuingDate() {
    return issuingDate;
  }

  public void setIssuingDate(Date issuingDate) {
    this.issuingDate = issuingDate;
  }

  public PersonIdentificationDocument expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Expiry Date
   * @return expirationDate
  **/
  @ApiModelProperty(example = "2017-12-12", value = "Expiry Date")

  @Valid

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PersonIdentificationDocument comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Comment
   * @return comment
  **/
  @ApiModelProperty(example = "C", value = "Comment")

@Size(max=35) 
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonIdentificationDocument personIdentificationDocument = (PersonIdentificationDocument) o;
    return Objects.equals(this.codeType, personIdentificationDocument.codeType) &&
        Objects.equals(this.issuingAuthority, personIdentificationDocument.issuingAuthority) &&
        Objects.equals(this.issuingAuthorityCountryCode, personIdentificationDocument.issuingAuthorityCountryCode) &&
        Objects.equals(this.number, personIdentificationDocument.number) &&
        Objects.equals(this.issuingDate, personIdentificationDocument.issuingDate) &&
        Objects.equals(this.expirationDate, personIdentificationDocument.expirationDate) &&
        Objects.equals(this.comment, personIdentificationDocument.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeType, issuingAuthority, issuingAuthorityCountryCode, number, issuingDate, expirationDate, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonIdentificationDocument {\n");
    
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    issuingAuthorityCountryCode: ").append(toIndentedString(issuingAuthorityCountryCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

