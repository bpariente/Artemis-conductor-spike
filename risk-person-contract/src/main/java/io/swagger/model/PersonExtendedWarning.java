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
 * PersonExtendedWarning
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class PersonExtendedWarning   {
  @JsonProperty("reasonCodeExtern")
  private String reasonCodeExtern = null;

  @JsonProperty("reasonCodeIntern")
  private String reasonCodeIntern = null;

  @JsonProperty("identNumber")
  private String identNumber = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("messageDate")
  private Date messageDate = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("redemptionAgreementCode")
  private String redemptionAgreementCode = null;

  @JsonProperty("redemptionAgreementDate")
  private Date redemptionAgreementDate = null;

  @JsonProperty("redemptionCode")
  private String redemptionCode = null;

  @JsonProperty("redemptionDate")
  private Date redemptionDate = null;

  @JsonProperty("redemptionProcDate")
  private Date redemptionProcDate = null;

  @JsonProperty("contradicted")
  private String contradicted = null;

  @JsonProperty("contradictionDate")
  private Date contradictionDate = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("surName")
  private String surName = null;

  @JsonProperty("birthDate")
  private Date birthDate = null;

  @JsonProperty("redemptionDescription")
  private String redemptionDescription = null;

  @JsonProperty("redemptionAgreed")
  private String redemptionAgreed = null;

  @JsonProperty("defrayal")
  private String defrayal = null;

  @JsonProperty("customerRelation")
  private String customerRelation = null;

  @JsonProperty("entityRelation")
  private String entityRelation = null;

  @JsonProperty("sequenceUkvRelation")
  private String sequenceUkvRelation = null;

  public PersonExtendedWarning reasonCodeExtern(String reasonCodeExtern) {
    this.reasonCodeExtern = reasonCodeExtern;
    return this;
  }

  /**
   * GAG: EXTERN
   * @return reasonCodeExtern
  **/
  @ApiModelProperty(example = "100", value = "GAG: EXTERN")

@Size(max=3) 
  public String getReasonCodeExtern() {
    return reasonCodeExtern;
  }

  public void setReasonCodeExtern(String reasonCodeExtern) {
    this.reasonCodeExtern = reasonCodeExtern;
  }

  public PersonExtendedWarning reasonCodeIntern(String reasonCodeIntern) {
    this.reasonCodeIntern = reasonCodeIntern;
    return this;
  }

  /**
   * GAG: INTERN
   * @return reasonCodeIntern
  **/
  @ApiModelProperty(example = "100", value = "GAG: INTERN")

@Size(max=3) 
  public String getReasonCodeIntern() {
    return reasonCodeIntern;
  }

  public void setReasonCodeIntern(String reasonCodeIntern) {
    this.reasonCodeIntern = reasonCodeIntern;
  }

  public PersonExtendedWarning identNumber(String identNumber) {
    this.identNumber = identNumber;
    return this;
  }

  /**
   * GAG: IDENT
   * @return identNumber
  **/
  @ApiModelProperty(example = "123456789", value = "GAG: IDENT")

@Size(max=9) 
  public String getIdentNumber() {
    return identNumber;
  }

  public void setIdentNumber(String identNumber) {
    this.identNumber = identNumber;
  }

  public PersonExtendedWarning bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * GAG: BANK
   * @return bankCode
  **/
  @ApiModelProperty(example = "", value = "GAG: BANK")

@Size(max=5) 
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public PersonExtendedWarning messageDate(Date messageDate) {
    this.messageDate = messageDate;
    return this;
  }

  /**
   * GAG: MESSAGE
   * @return messageDate
  **/
  @ApiModelProperty(example = "201712", value = "GAG: MESSAGE")

  @Valid

  public Date getMessageDate() {
    return messageDate;
  }

  public void setMessageDate(Date messageDate) {
    this.messageDate = messageDate;
  }

  public PersonExtendedWarning comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * GAG: COMMENT
   * @return comment
  **/
  @ApiModelProperty(example = "001", value = "GAG: COMMENT")

@Size(max=35) 
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PersonExtendedWarning redemptionAgreementCode(String redemptionAgreementCode) {
    this.redemptionAgreementCode = redemptionAgreementCode;
    return this;
  }

  /**
   * GAG: REDAGR
   * @return redemptionAgreementCode
  **/
  @ApiModelProperty(example = "", value = "GAG: REDAGR")

@Size(max=1) 
  public String getRedemptionAgreementCode() {
    return redemptionAgreementCode;
  }

  public void setRedemptionAgreementCode(String redemptionAgreementCode) {
    this.redemptionAgreementCode = redemptionAgreementCode;
  }

  public PersonExtendedWarning redemptionAgreementDate(Date redemptionAgreementDate) {
    this.redemptionAgreementDate = redemptionAgreementDate;
    return this;
  }

  /**
   * GAG: REDAGRD
   * @return redemptionAgreementDate
  **/
  @ApiModelProperty(example = "", value = "GAG: REDAGRD")

  @Valid

  public Date getRedemptionAgreementDate() {
    return redemptionAgreementDate;
  }

  public void setRedemptionAgreementDate(Date redemptionAgreementDate) {
    this.redemptionAgreementDate = redemptionAgreementDate;
  }

  public PersonExtendedWarning redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

  /**
   * GAG: RED
   * @return redemptionCode
  **/
  @ApiModelProperty(example = "", value = "GAG: RED")

@Size(max=1) 
  public String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public PersonExtendedWarning redemptionDate(Date redemptionDate) {
    this.redemptionDate = redemptionDate;
    return this;
  }

  /**
   * GAG: REDD
   * @return redemptionDate
  **/
  @ApiModelProperty(example = "", value = "GAG: REDD")

  @Valid

  public Date getRedemptionDate() {
    return redemptionDate;
  }

  public void setRedemptionDate(Date redemptionDate) {
    this.redemptionDate = redemptionDate;
  }

  public PersonExtendedWarning redemptionProcDate(Date redemptionProcDate) {
    this.redemptionProcDate = redemptionProcDate;
    return this;
  }

  /**
   * GAG: REDPD
   * @return redemptionProcDate
  **/
  @ApiModelProperty(example = "", value = "GAG: REDPD")

  @Valid

  public Date getRedemptionProcDate() {
    return redemptionProcDate;
  }

  public void setRedemptionProcDate(Date redemptionProcDate) {
    this.redemptionProcDate = redemptionProcDate;
  }

  public PersonExtendedWarning contradicted(String contradicted) {
    this.contradicted = contradicted;
    return this;
  }

  /**
   * GAG: CNTRFLG
   * @return contradicted
  **/
  @ApiModelProperty(example = "", value = "GAG: CNTRFLG")

@Size(max=1) 
  public String getContradicted() {
    return contradicted;
  }

  public void setContradicted(String contradicted) {
    this.contradicted = contradicted;
  }

  public PersonExtendedWarning contradictionDate(Date contradictionDate) {
    this.contradictionDate = contradictionDate;
    return this;
  }

  /**
   * GAG: CNTRD
   * @return contradictionDate
  **/
  @ApiModelProperty(example = "", value = "GAG: CNTRD")

  @Valid

  public Date getContradictionDate() {
    return contradictionDate;
  }

  public void setContradictionDate(Date contradictionDate) {
    this.contradictionDate = contradictionDate;
  }

  public PersonExtendedWarning accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * GAG: ACCOUNT
   * @return accountNumber
  **/
  @ApiModelProperty(example = "", value = "GAG: ACCOUNT")

@Size(max=13) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PersonExtendedWarning countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * GAG: CTRYLIC
   * @return countryCode
  **/
  @ApiModelProperty(example = "001", value = "GAG: CTRYLIC")

@Size(max=3) 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PersonExtendedWarning zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * GAG: ZIP
   * @return zipCode
  **/
  @ApiModelProperty(example = "1080", value = "GAG: ZIP")

@Size(max=7) 
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public PersonExtendedWarning street(String street) {
    this.street = street;
    return this;
  }

  /**
   * GAG: STREET
   * @return street
  **/
  @ApiModelProperty(example = "Elm Street", value = "GAG: STREET")

@Size(max=35) 
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PersonExtendedWarning city(String city) {
    this.city = city;
    return this;
  }

  /**
   * GAG: CITY
   * @return city
  **/
  @ApiModelProperty(example = "Lipa", value = "GAG: CITY")

@Size(max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PersonExtendedWarning firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * GAG: NAME
   * @return firstName
  **/
  @ApiModelProperty(example = "Sam", value = "GAG: NAME")

@Size(max=30) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonExtendedWarning surName(String surName) {
    this.surName = surName;
    return this;
  }

  /**
   * GAG: SURNAME
   * @return surName
  **/
  @ApiModelProperty(example = "Smith", value = "GAG: SURNAME")

@Size(max=30) 
  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public PersonExtendedWarning birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * GAG: DAYBRTH
   * @return birthDate
  **/
  @ApiModelProperty(example = "1995-01-01", value = "GAG: DAYBRTH")

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public PersonExtendedWarning redemptionDescription(String redemptionDescription) {
    this.redemptionDescription = redemptionDescription;
    return this;
  }

  /**
   * GAG: REDESC
   * @return redemptionDescription
  **/
  @ApiModelProperty(example = "Description", value = "GAG: REDESC")

@Size(max=16) 
  public String getRedemptionDescription() {
    return redemptionDescription;
  }

  public void setRedemptionDescription(String redemptionDescription) {
    this.redemptionDescription = redemptionDescription;
  }

  public PersonExtendedWarning redemptionAgreed(String redemptionAgreed) {
    this.redemptionAgreed = redemptionAgreed;
    return this;
  }

  /**
   * GAG: AGRDESC
   * @return redemptionAgreed
  **/
  @ApiModelProperty(example = "Agreed", value = "GAG: AGRDESC")


  public String getRedemptionAgreed() {
    return redemptionAgreed;
  }

  public void setRedemptionAgreed(String redemptionAgreed) {
    this.redemptionAgreed = redemptionAgreed;
  }

  public PersonExtendedWarning defrayal(String defrayal) {
    this.defrayal = defrayal;
    return this;
  }

  /**
   * GAG: CNTRDESC
   * @return defrayal
  **/
  @ApiModelProperty(example = "Defray", value = "GAG: CNTRDESC")


  public String getDefrayal() {
    return defrayal;
  }

  public void setDefrayal(String defrayal) {
    this.defrayal = defrayal;
  }

  public PersonExtendedWarning customerRelation(String customerRelation) {
    this.customerRelation = customerRelation;
    return this;
  }

  /**
   * GAG: CUSREL
   * @return customerRelation
  **/
  @ApiModelProperty(example = "", value = "GAG: CUSREL")

@Size(max=8) 
  public String getCustomerRelation() {
    return customerRelation;
  }

  public void setCustomerRelation(String customerRelation) {
    this.customerRelation = customerRelation;
  }

  public PersonExtendedWarning entityRelation(String entityRelation) {
    this.entityRelation = entityRelation;
    return this;
  }

  /**
   * GAG: ENTREL
   * @return entityRelation
  **/
  @ApiModelProperty(example = "abcd", value = "GAG: ENTREL")

@Size(max=4) 
  public String getEntityRelation() {
    return entityRelation;
  }

  public void setEntityRelation(String entityRelation) {
    this.entityRelation = entityRelation;
  }

  public PersonExtendedWarning sequenceUkvRelation(String sequenceUkvRelation) {
    this.sequenceUkvRelation = sequenceUkvRelation;
    return this;
  }

  /**
   * GAG: SEQREL
   * @return sequenceUkvRelation
  **/
  @ApiModelProperty(example = "001", value = "GAG: SEQREL")

@Size(max=3) 
  public String getSequenceUkvRelation() {
    return sequenceUkvRelation;
  }

  public void setSequenceUkvRelation(String sequenceUkvRelation) {
    this.sequenceUkvRelation = sequenceUkvRelation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonExtendedWarning personExtendedWarning = (PersonExtendedWarning) o;
    return Objects.equals(this.reasonCodeExtern, personExtendedWarning.reasonCodeExtern) &&
        Objects.equals(this.reasonCodeIntern, personExtendedWarning.reasonCodeIntern) &&
        Objects.equals(this.identNumber, personExtendedWarning.identNumber) &&
        Objects.equals(this.bankCode, personExtendedWarning.bankCode) &&
        Objects.equals(this.messageDate, personExtendedWarning.messageDate) &&
        Objects.equals(this.comment, personExtendedWarning.comment) &&
        Objects.equals(this.redemptionAgreementCode, personExtendedWarning.redemptionAgreementCode) &&
        Objects.equals(this.redemptionAgreementDate, personExtendedWarning.redemptionAgreementDate) &&
        Objects.equals(this.redemptionCode, personExtendedWarning.redemptionCode) &&
        Objects.equals(this.redemptionDate, personExtendedWarning.redemptionDate) &&
        Objects.equals(this.redemptionProcDate, personExtendedWarning.redemptionProcDate) &&
        Objects.equals(this.contradicted, personExtendedWarning.contradicted) &&
        Objects.equals(this.contradictionDate, personExtendedWarning.contradictionDate) &&
        Objects.equals(this.accountNumber, personExtendedWarning.accountNumber) &&
        Objects.equals(this.countryCode, personExtendedWarning.countryCode) &&
        Objects.equals(this.zipCode, personExtendedWarning.zipCode) &&
        Objects.equals(this.street, personExtendedWarning.street) &&
        Objects.equals(this.city, personExtendedWarning.city) &&
        Objects.equals(this.firstName, personExtendedWarning.firstName) &&
        Objects.equals(this.surName, personExtendedWarning.surName) &&
        Objects.equals(this.birthDate, personExtendedWarning.birthDate) &&
        Objects.equals(this.redemptionDescription, personExtendedWarning.redemptionDescription) &&
        Objects.equals(this.redemptionAgreed, personExtendedWarning.redemptionAgreed) &&
        Objects.equals(this.defrayal, personExtendedWarning.defrayal) &&
        Objects.equals(this.customerRelation, personExtendedWarning.customerRelation) &&
        Objects.equals(this.entityRelation, personExtendedWarning.entityRelation) &&
        Objects.equals(this.sequenceUkvRelation, personExtendedWarning.sequenceUkvRelation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCodeExtern, reasonCodeIntern, identNumber, bankCode, messageDate, comment, redemptionAgreementCode, redemptionAgreementDate, redemptionCode, redemptionDate, redemptionProcDate, contradicted, contradictionDate, accountNumber, countryCode, zipCode, street, city, firstName, surName, birthDate, redemptionDescription, redemptionAgreed, defrayal, customerRelation, entityRelation, sequenceUkvRelation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonExtendedWarning {\n");
    
    sb.append("    reasonCodeExtern: ").append(toIndentedString(reasonCodeExtern)).append("\n");
    sb.append("    reasonCodeIntern: ").append(toIndentedString(reasonCodeIntern)).append("\n");
    sb.append("    identNumber: ").append(toIndentedString(identNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    messageDate: ").append(toIndentedString(messageDate)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    redemptionAgreementCode: ").append(toIndentedString(redemptionAgreementCode)).append("\n");
    sb.append("    redemptionAgreementDate: ").append(toIndentedString(redemptionAgreementDate)).append("\n");
    sb.append("    redemptionCode: ").append(toIndentedString(redemptionCode)).append("\n");
    sb.append("    redemptionDate: ").append(toIndentedString(redemptionDate)).append("\n");
    sb.append("    redemptionProcDate: ").append(toIndentedString(redemptionProcDate)).append("\n");
    sb.append("    contradicted: ").append(toIndentedString(contradicted)).append("\n");
    sb.append("    contradictionDate: ").append(toIndentedString(contradictionDate)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surName: ").append(toIndentedString(surName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    redemptionDescription: ").append(toIndentedString(redemptionDescription)).append("\n");
    sb.append("    redemptionAgreed: ").append(toIndentedString(redemptionAgreed)).append("\n");
    sb.append("    defrayal: ").append(toIndentedString(defrayal)).append("\n");
    sb.append("    customerRelation: ").append(toIndentedString(customerRelation)).append("\n");
    sb.append("    entityRelation: ").append(toIndentedString(entityRelation)).append("\n");
    sb.append("    sequenceUkvRelation: ").append(toIndentedString(sequenceUkvRelation)).append("\n");
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

