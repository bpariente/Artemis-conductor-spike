package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BranchInformation;
import io.swagger.model.EnumProperty;
import io.swagger.model.ModificationInformation;
import io.swagger.model.PersonIdentificationDocument;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCustomerBasicDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerBasicDataResponse   {
  @JsonProperty("accessLevel")
  private Integer accessLevel = null;

  @JsonProperty("additionalName")
  private String additionalName = null;

  @JsonProperty("additionalText")
  private String additionalText = null;

  @JsonProperty("addressForBlinds")
  private Boolean addressForBlinds = null;

  @JsonProperty("addressOutdated")
  private Boolean addressOutdated = null;

  @JsonProperty("addressOutdated2")
  private Boolean addressOutdated2 = null;

  @JsonProperty("advisorKey1")
  private String advisorKey1 = null;

  @JsonProperty("advisorKey2")
  private String advisorKey2 = null;

  @JsonProperty("attentionOf")
  private String attentionOf = null;

  @JsonProperty("birthCountry")
  private String birthCountry = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("birthPlace")
  private String birthPlace = null;

  @JsonProperty("blockCustomer")
  private Boolean blockCustomer = null;

  @JsonProperty("cardName1")
  private String cardName1 = null;

  @JsonProperty("cardName2")
  private String cardName2 = null;

  @JsonProperty("cardName2Extended")
  private String cardName2Extended = null;

  @JsonProperty("citizenSince")
  private LocalDate citizenSince = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("city2")
  private String city2 = null;

  @JsonProperty("country")
  private EnumProperty country = null;

  @JsonProperty("country2")
  private EnumProperty country2 = null;

  @JsonProperty("esvg")
  private EnumProperty esvg = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("flagEmployerProspect")
  private Boolean flagEmployerProspect = null;

  @JsonProperty("gender")
  private EnumProperty gender = null;

  @JsonProperty("identificationDocument1")
  private PersonIdentificationDocument identificationDocument1 = null;

  @JsonProperty("identificationDocument2")
  private PersonIdentificationDocument identificationDocument2 = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("legalFormCode")
  private Integer legalFormCode = null;

  @JsonProperty("leiCode")
  private String leiCode = null;

  @JsonProperty("mainAddressChangeDate")
  private LocalDate mainAddressChangeDate = null;

  @JsonProperty("maritalStatus")
  private EnumProperty maritalStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nationality")
  private EnumProperty nationality = null;

  @JsonProperty("nationality2")
  private EnumProperty nationality2 = null;

  @JsonProperty("naturalPerson")
  private Boolean naturalPerson = null;

  @JsonProperty("noAdvertismentType")
  private String noAdvertismentType = null;

  @JsonProperty("noOENBId")
  private Boolean noOENBId = null;

  @JsonProperty("noOENBIdTemporary")
  private Boolean noOENBIdTemporary = null;

  @JsonProperty("oenace")
  private EnumProperty oenace = null;

  @JsonProperty("oenbId")
  private String oenbId = null;

  @JsonProperty("pep")
  private Boolean pep = null;

  @JsonProperty("pepCode")
  private String pepCode = null;

  @JsonProperty("pepComment")
  private String pepComment = null;

  @JsonProperty("pepRelative")
  private Boolean pepRelative = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postalCode2")
  private String postalCode2 = null;

  @JsonProperty("salutation")
  private EnumProperty salutation = null;

  @JsonProperty("segment")
  private EnumProperty segment = null;

  @JsonProperty("seperateCustomer")
  private Boolean seperateCustomer = null;

  @JsonProperty("shortWording")
  private String shortWording = null;

  @JsonProperty("socialSecurityNumber")
  private String socialSecurityNumber = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("street2")
  private String street2 = null;

  @JsonProperty("taxLiabilityCountryCode")
  private String taxLiabilityCountryCode = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("unwantedCustomer")
  private Boolean unwantedCustomer = null;

  @JsonProperty("addressMain")
  private String addressMain = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("advisorName1")
  private String advisorName1 = null;

  @JsonProperty("advisorName2")
  private String advisorName2 = null;

  @JsonProperty("amlDataAvailability")
  private String amlDataAvailability = null;

  @JsonProperty("authorizationFlag")
  private String authorizationFlag = null;

  @JsonProperty("branchInformation")
  private BranchInformation branchInformation = null;

  @JsonProperty("compressedCity2")
  private String compressedCity2 = null;

  @JsonProperty("deceased")
  private Boolean deceased = null;

  @JsonProperty("firstEditDate")
  private LocalDate firstEditDate = null;

  @JsonProperty("identFlag")
  private Boolean identFlag = null;

  @JsonProperty("lastModificationInformation")
  private ModificationInformation lastModificationInformation = null;

  @JsonProperty("mifid")
  private EnumProperty mifid = null;

  @JsonProperty("stateText")
  private String stateText = null;

  @JsonProperty("stateDate")
  private LocalDate stateDate = null;

  @JsonProperty("transactionCode")
  private String transactionCode = null;

  public GetCustomerBasicDataResponse accessLevel(Integer accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Access Level
   * @return accessLevel
  **/
  @ApiModelProperty(example = "1", value = "Access Level")


  public Integer getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(Integer accessLevel) {
    this.accessLevel = accessLevel;
  }

  public GetCustomerBasicDataResponse additionalName(String additionalName) {
    this.additionalName = additionalName;
    return this;
  }

  /**
   * Additional Name
   * @return additionalName
  **/
  @ApiModelProperty(example = "Sam Smith", value = "Additional Name")

@Size(max=90) 
  public String getAdditionalName() {
    return additionalName;
  }

  public void setAdditionalName(String additionalName) {
    this.additionalName = additionalName;
  }

  public GetCustomerBasicDataResponse additionalText(String additionalText) {
    this.additionalText = additionalText;
    return this;
  }

  /**
   * Additional Text
   * @return additionalText
  **/
  @ApiModelProperty(example = "Text", value = "Additional Text")

@Size(max=35) 
  public String getAdditionalText() {
    return additionalText;
  }

  public void setAdditionalText(String additionalText) {
    this.additionalText = additionalText;
  }

  public GetCustomerBasicDataResponse addressForBlinds(Boolean addressForBlinds) {
    this.addressForBlinds = addressForBlinds;
    return this;
  }

  /**
   * Flag for address for blind
   * @return addressForBlinds
  **/
  @ApiModelProperty(example = "false", value = "Flag for address for blind")


  public Boolean isAddressForBlinds() {
    return addressForBlinds;
  }

  public void setAddressForBlinds(Boolean addressForBlinds) {
    this.addressForBlinds = addressForBlinds;
  }

  public GetCustomerBasicDataResponse addressOutdated(Boolean addressOutdated) {
    this.addressOutdated = addressOutdated;
    return this;
  }

  /**
   * Flag for address outdated
   * @return addressOutdated
  **/
  @ApiModelProperty(example = "true", value = "Flag for address outdated")


  public Boolean isAddressOutdated() {
    return addressOutdated;
  }

  public void setAddressOutdated(Boolean addressOutdated) {
    this.addressOutdated = addressOutdated;
  }

  public GetCustomerBasicDataResponse addressOutdated2(Boolean addressOutdated2) {
    this.addressOutdated2 = addressOutdated2;
    return this;
  }

  /**
   * Flag for address outdated 2
   * @return addressOutdated2
  **/
  @ApiModelProperty(example = "true", value = "Flag for address outdated 2")


  public Boolean isAddressOutdated2() {
    return addressOutdated2;
  }

  public void setAddressOutdated2(Boolean addressOutdated2) {
    this.addressOutdated2 = addressOutdated2;
  }

  public GetCustomerBasicDataResponse advisorKey1(String advisorKey1) {
    this.advisorKey1 = advisorKey1;
    return this;
  }

  /**
   * Advisor Key 1
   * @return advisorKey1
  **/
  @ApiModelProperty(example = "Adviser 1", value = "Advisor Key 1")

@Size(max=19) 
  public String getAdvisorKey1() {
    return advisorKey1;
  }

  public void setAdvisorKey1(String advisorKey1) {
    this.advisorKey1 = advisorKey1;
  }

  public GetCustomerBasicDataResponse advisorKey2(String advisorKey2) {
    this.advisorKey2 = advisorKey2;
    return this;
  }

  /**
   * Advisor Key 2
   * @return advisorKey2
  **/
  @ApiModelProperty(example = "Adviser 2", value = "Advisor Key 2")

@Size(max=19) 
  public String getAdvisorKey2() {
    return advisorKey2;
  }

  public void setAdvisorKey2(String advisorKey2) {
    this.advisorKey2 = advisorKey2;
  }

  public GetCustomerBasicDataResponse attentionOf(String attentionOf) {
    this.attentionOf = attentionOf;
    return this;
  }

  /**
   * Attention of
   * @return attentionOf
  **/
  @ApiModelProperty(example = "Smith", value = "Attention of")

@Size(max=35) 
  public String getAttentionOf() {
    return attentionOf;
  }

  public void setAttentionOf(String attentionOf) {
    this.attentionOf = attentionOf;
  }

  public GetCustomerBasicDataResponse birthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
    return this;
  }

  /**
   * Birth country
   * @return birthCountry
  **/
  @ApiModelProperty(example = "PH/Philippines", value = "Birth country")

@Size(max=3) 
  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  public GetCustomerBasicDataResponse birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Birthdate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-01-01", value = "Birthdate")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public GetCustomerBasicDataResponse birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

  /**
   * Birthplace
   * @return birthPlace
  **/
  @ApiModelProperty(example = "Canada", value = "Birthplace")

@Size(max=40) 
  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public GetCustomerBasicDataResponse blockCustomer(Boolean blockCustomer) {
    this.blockCustomer = blockCustomer;
    return this;
  }

  /**
   * Flag for Block Customer
   * @return blockCustomer
  **/
  @ApiModelProperty(example = "false", value = "Flag for Block Customer")


  public Boolean isBlockCustomer() {
    return blockCustomer;
  }

  public void setBlockCustomer(Boolean blockCustomer) {
    this.blockCustomer = blockCustomer;
  }

  public GetCustomerBasicDataResponse cardName1(String cardName1) {
    this.cardName1 = cardName1;
    return this;
  }

  /**
   * Card Name 1
   * @return cardName1
  **/
  @ApiModelProperty(example = "cardName1", value = "Card Name 1")

@Size(max=26) 
  public String getCardName1() {
    return cardName1;
  }

  public void setCardName1(String cardName1) {
    this.cardName1 = cardName1;
  }

  public GetCustomerBasicDataResponse cardName2(String cardName2) {
    this.cardName2 = cardName2;
    return this;
  }

  /**
   * Card Name 2
   * @return cardName2
  **/
  @ApiModelProperty(example = "cardName2", value = "Card Name 2")

@Size(max=26) 
  public String getCardName2() {
    return cardName2;
  }

  public void setCardName2(String cardName2) {
    this.cardName2 = cardName2;
  }

  public GetCustomerBasicDataResponse cardName2Extended(String cardName2Extended) {
    this.cardName2Extended = cardName2Extended;
    return this;
  }

  /**
   * Card Name 2 Extended
   * @return cardName2Extended
  **/
  @ApiModelProperty(example = "cardName2Extended", value = "Card Name 2 Extended")

@Size(max=26) 
  public String getCardName2Extended() {
    return cardName2Extended;
  }

  public void setCardName2Extended(String cardName2Extended) {
    this.cardName2Extended = cardName2Extended;
  }

  public GetCustomerBasicDataResponse citizenSince(LocalDate citizenSince) {
    this.citizenSince = citizenSince;
    return this;
  }

  /**
   * Citizen Since
   * @return citizenSince
  **/
  @ApiModelProperty(example = "2017-10-26", value = "Citizen Since")

  @Valid

  public LocalDate getCitizenSince() {
    return citizenSince;
  }

  public void setCitizenSince(LocalDate citizenSince) {
    this.citizenSince = citizenSince;
  }

  public GetCustomerBasicDataResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "Wein", value = "City")

@Size(max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GetCustomerBasicDataResponse city2(String city2) {
    this.city2 = city2;
    return this;
  }

  /**
   * City 2
   * @return city2
  **/
  @ApiModelProperty(example = "Paris", value = "City 2")

@Size(max=35) 
  public String getCity2() {
    return city2;
  }

  public void setCity2(String city2) {
    this.city2 = city2;
  }

  public GetCustomerBasicDataResponse country(EnumProperty country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getCountry() {
    return country;
  }

  public void setCountry(EnumProperty country) {
    this.country = country;
  }

  public GetCustomerBasicDataResponse country2(EnumProperty country2) {
    this.country2 = country2;
    return this;
  }

  /**
   * Get country2
   * @return country2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getCountry2() {
    return country2;
  }

  public void setCountry2(EnumProperty country2) {
    this.country2 = country2;
  }

  public GetCustomerBasicDataResponse esvg(EnumProperty esvg) {
    this.esvg = esvg;
    return this;
  }

  /**
   * Get esvg
   * @return esvg
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getEsvg() {
    return esvg;
  }

  public void setEsvg(EnumProperty esvg) {
    this.esvg = esvg;
  }

  public GetCustomerBasicDataResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "Sam", value = "First Name")

@Size(max=30) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public GetCustomerBasicDataResponse flagEmployerProspect(Boolean flagEmployerProspect) {
    this.flagEmployerProspect = flagEmployerProspect;
    return this;
  }

  /**
   * Flag for Employer Prospect
   * @return flagEmployerProspect
  **/
  @ApiModelProperty(example = "false", value = "Flag for Employer Prospect")


  public Boolean isFlagEmployerProspect() {
    return flagEmployerProspect;
  }

  public void setFlagEmployerProspect(Boolean flagEmployerProspect) {
    this.flagEmployerProspect = flagEmployerProspect;
  }

  public GetCustomerBasicDataResponse gender(EnumProperty gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getGender() {
    return gender;
  }

  public void setGender(EnumProperty gender) {
    this.gender = gender;
  }

  public GetCustomerBasicDataResponse identificationDocument1(PersonIdentificationDocument identificationDocument1) {
    this.identificationDocument1 = identificationDocument1;
    return this;
  }

  /**
   * Get identificationDocument1
   * @return identificationDocument1
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonIdentificationDocument getIdentificationDocument1() {
    return identificationDocument1;
  }

  public void setIdentificationDocument1(PersonIdentificationDocument identificationDocument1) {
    this.identificationDocument1 = identificationDocument1;
  }

  public GetCustomerBasicDataResponse identificationDocument2(PersonIdentificationDocument identificationDocument2) {
    this.identificationDocument2 = identificationDocument2;
    return this;
  }

  /**
   * Get identificationDocument2
   * @return identificationDocument2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonIdentificationDocument getIdentificationDocument2() {
    return identificationDocument2;
  }

  public void setIdentificationDocument2(PersonIdentificationDocument identificationDocument2) {
    this.identificationDocument2 = identificationDocument2;
  }

  public GetCustomerBasicDataResponse language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language Code
   * @return language
  **/
  @ApiModelProperty(example = "0", value = "Language Code")

@Size(max=1) 
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public GetCustomerBasicDataResponse legalFormCode(Integer legalFormCode) {
    this.legalFormCode = legalFormCode;
    return this;
  }

  /**
   * Legal Form code
   * @return legalFormCode
  **/
  @ApiModelProperty(example = "100", required = true, value = "Legal Form code")
  @NotNull


  public Integer getLegalFormCode() {
    return legalFormCode;
  }

  public void setLegalFormCode(Integer legalFormCode) {
    this.legalFormCode = legalFormCode;
  }

  public GetCustomerBasicDataResponse leiCode(String leiCode) {
    this.leiCode = leiCode;
    return this;
  }

  /**
   * LEI Code
   * @return leiCode
  **/
  @ApiModelProperty(example = "51293836123123", value = "LEI Code")

@Size(max=20) 
  public String getLeiCode() {
    return leiCode;
  }

  public void setLeiCode(String leiCode) {
    this.leiCode = leiCode;
  }

  public GetCustomerBasicDataResponse mainAddressChangeDate(LocalDate mainAddressChangeDate) {
    this.mainAddressChangeDate = mainAddressChangeDate;
    return this;
  }

  /**
   * Main Address Change Date
   * @return mainAddressChangeDate
  **/
  @ApiModelProperty(example = "2017-01-20", value = "Main Address Change Date")

  @Valid

  public LocalDate getMainAddressChangeDate() {
    return mainAddressChangeDate;
  }

  public void setMainAddressChangeDate(LocalDate mainAddressChangeDate) {
    this.mainAddressChangeDate = mainAddressChangeDate;
  }

  public GetCustomerBasicDataResponse maritalStatus(EnumProperty maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(EnumProperty maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public GetCustomerBasicDataResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Surname
   * @return name
  **/
  @ApiModelProperty(example = "Smith", value = "Surname")

@Size(max=30) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCustomerBasicDataResponse nationality(EnumProperty nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getNationality() {
    return nationality;
  }

  public void setNationality(EnumProperty nationality) {
    this.nationality = nationality;
  }

  public GetCustomerBasicDataResponse nationality2(EnumProperty nationality2) {
    this.nationality2 = nationality2;
    return this;
  }

  /**
   * Get nationality2
   * @return nationality2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getNationality2() {
    return nationality2;
  }

  public void setNationality2(EnumProperty nationality2) {
    this.nationality2 = nationality2;
  }

  public GetCustomerBasicDataResponse naturalPerson(Boolean naturalPerson) {
    this.naturalPerson = naturalPerson;
    return this;
  }

  /**
   * Flag for Natural Person
   * @return naturalPerson
  **/
  @ApiModelProperty(example = "true", required = true, value = "Flag for Natural Person")
  @NotNull


  public Boolean isNaturalPerson() {
    return naturalPerson;
  }

  public void setNaturalPerson(Boolean naturalPerson) {
    this.naturalPerson = naturalPerson;
  }

  public GetCustomerBasicDataResponse noAdvertismentType(String noAdvertismentType) {
    this.noAdvertismentType = noAdvertismentType;
    return this;
  }

  /**
   * No Advertisment Type
   * @return noAdvertismentType
  **/
  @ApiModelProperty(example = "N", value = "No Advertisment Type")

@Size(max=1) 
  public String getNoAdvertismentType() {
    return noAdvertismentType;
  }

  public void setNoAdvertismentType(String noAdvertismentType) {
    this.noAdvertismentType = noAdvertismentType;
  }

  public GetCustomerBasicDataResponse noOENBId(Boolean noOENBId) {
    this.noOENBId = noOENBId;
    return this;
  }

  /**
   * person has no OeNB-Id - only when legal entity (values Y, N, space)
   * @return noOENBId
  **/
  @ApiModelProperty(example = "true", value = "person has no OeNB-Id - only when legal entity (values Y, N, space)")


  public Boolean isNoOENBId() {
    return noOENBId;
  }

  public void setNoOENBId(Boolean noOENBId) {
    this.noOENBId = noOENBId;
  }

  public GetCustomerBasicDataResponse noOENBIdTemporary(Boolean noOENBIdTemporary) {
    this.noOENBIdTemporary = noOENBIdTemporary;
    return this;
  }

  /**
   * No OeNB-Id available - only when legal entity (values Y, N, space)
   * @return noOENBIdTemporary
  **/
  @ApiModelProperty(example = "true", value = "No OeNB-Id available - only when legal entity (values Y, N, space)")


  public Boolean isNoOENBIdTemporary() {
    return noOENBIdTemporary;
  }

  public void setNoOENBIdTemporary(Boolean noOENBIdTemporary) {
    this.noOENBIdTemporary = noOENBIdTemporary;
  }

  public GetCustomerBasicDataResponse oenace(EnumProperty oenace) {
    this.oenace = oenace;
    return this;
  }

  /**
   * Get oenace
   * @return oenace
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getOenace() {
    return oenace;
  }

  public void setOenace(EnumProperty oenace) {
    this.oenace = oenace;
  }

  public GetCustomerBasicDataResponse oenbId(String oenbId) {
    this.oenbId = oenbId;
    return this;
  }

  /**
   * OENB ID
   * @return oenbId
  **/
  @ApiModelProperty(example = "123456789", value = "OENB ID")

@Size(max=9) 
  public String getOenbId() {
    return oenbId;
  }

  public void setOenbId(String oenbId) {
    this.oenbId = oenbId;
  }

  public GetCustomerBasicDataResponse pep(Boolean pep) {
    this.pep = pep;
    return this;
  }

  /**
   * PEP (values Y, N, space)
   * @return pep
  **/
  @ApiModelProperty(example = "true", value = "PEP (values Y, N, space)")


  public Boolean isPep() {
    return pep;
  }

  public void setPep(Boolean pep) {
    this.pep = pep;
  }

  public GetCustomerBasicDataResponse pepCode(String pepCode) {
    this.pepCode = pepCode;
    return this;
  }

  /**
   * PEP-Code
   * @return pepCode
  **/
  @ApiModelProperty(example = "PC", value = "PEP-Code")

@Size(max=2) 
  public String getPepCode() {
    return pepCode;
  }

  public void setPepCode(String pepCode) {
    this.pepCode = pepCode;
  }

  public GetCustomerBasicDataResponse pepComment(String pepComment) {
    this.pepComment = pepComment;
    return this;
  }

  /**
   * PEP-Comment
   * @return pepComment
  **/
  @ApiModelProperty(example = "Sample PEP Comment", value = "PEP-Comment")

@Size(max=50) 
  public String getPepComment() {
    return pepComment;
  }

  public void setPepComment(String pepComment) {
    this.pepComment = pepComment;
  }

  public GetCustomerBasicDataResponse pepRelative(Boolean pepRelative) {
    this.pepRelative = pepRelative;
    return this;
  }

  /**
   * PEP-Relative (values Y, N, space)
   * @return pepRelative
  **/
  @ApiModelProperty(example = "true", value = "PEP-Relative (values Y, N, space)")


  public Boolean isPepRelative() {
    return pepRelative;
  }

  public void setPepRelative(Boolean pepRelative) {
    this.pepRelative = pepRelative;
  }

  public GetCustomerBasicDataResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(example = "1010", value = "Postal Code")

@Size(max=6) 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public GetCustomerBasicDataResponse postalCode2(String postalCode2) {
    this.postalCode2 = postalCode2;
    return this;
  }

  /**
   * Postal Code2
   * @return postalCode2
  **/
  @ApiModelProperty(example = "1010", value = "Postal Code2")

@Size(max=6) 
  public String getPostalCode2() {
    return postalCode2;
  }

  public void setPostalCode2(String postalCode2) {
    this.postalCode2 = postalCode2;
  }

  public GetCustomerBasicDataResponse salutation(EnumProperty salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * Get salutation
   * @return salutation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getSalutation() {
    return salutation;
  }

  public void setSalutation(EnumProperty salutation) {
    this.salutation = salutation;
  }

  public GetCustomerBasicDataResponse segment(EnumProperty segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Get segment
   * @return segment
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProperty getSegment() {
    return segment;
  }

  public void setSegment(EnumProperty segment) {
    this.segment = segment;
  }

  public GetCustomerBasicDataResponse seperateCustomer(Boolean seperateCustomer) {
    this.seperateCustomer = seperateCustomer;
    return this;
  }

  /**
   * Seperate Customer
   * @return seperateCustomer
  **/
  @ApiModelProperty(example = "true", value = "Seperate Customer")


  public Boolean isSeperateCustomer() {
    return seperateCustomer;
  }

  public void setSeperateCustomer(Boolean seperateCustomer) {
    this.seperateCustomer = seperateCustomer;
  }

  public GetCustomerBasicDataResponse shortWording(String shortWording) {
    this.shortWording = shortWording;
    return this;
  }

  /**
   * ShortWording Person name
   * @return shortWording
  **/
  @ApiModelProperty(example = "Gmgb Company", required = true, value = "ShortWording Person name")
  @NotNull

@Size(max=35) 
  public String getShortWording() {
    return shortWording;
  }

  public void setShortWording(String shortWording) {
    this.shortWording = shortWording;
  }

  public GetCustomerBasicDataResponse socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

  /**
   * Social Security Number
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(example = "0123456789", value = "Social Security Number")

@Size(max=10) 
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public GetCustomerBasicDataResponse street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street
   * @return street
  **/
  @ApiModelProperty(example = "Karlsplatz", required = true, value = "Street")
  @NotNull

@Size(max=35) 
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public GetCustomerBasicDataResponse street2(String street2) {
    this.street2 = street2;
    return this;
  }

  /**
   * Street 2
   * @return street2
  **/
  @ApiModelProperty(example = "Herrengasse", value = "Street 2")

@Size(max=35) 
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public GetCustomerBasicDataResponse taxLiabilityCountryCode(String taxLiabilityCountryCode) {
    this.taxLiabilityCountryCode = taxLiabilityCountryCode;
    return this;
  }

  /**
   * Tax Liability Country Code
   * @return taxLiabilityCountryCode
  **/
  @ApiModelProperty(example = "AT", required = true, value = "Tax Liability Country Code")
  @NotNull

@Size(max=2) 
  public String getTaxLiabilityCountryCode() {
    return taxLiabilityCountryCode;
  }

  public void setTaxLiabilityCountryCode(String taxLiabilityCountryCode) {
    this.taxLiabilityCountryCode = taxLiabilityCountryCode;
  }

  public GetCustomerBasicDataResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title
   * @return title
  **/
  @ApiModelProperty(example = "Mr.", value = "Title")

@Size(max=30) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetCustomerBasicDataResponse unwantedCustomer(Boolean unwantedCustomer) {
    this.unwantedCustomer = unwantedCustomer;
    return this;
  }

  /**
   * Unwanted Customer Indicator
   * @return unwantedCustomer
  **/
  @ApiModelProperty(example = "true", value = "Unwanted Customer Indicator")


  public Boolean isUnwantedCustomer() {
    return unwantedCustomer;
  }

  public void setUnwantedCustomer(Boolean unwantedCustomer) {
    this.unwantedCustomer = unwantedCustomer;
  }

  public GetCustomerBasicDataResponse addressMain(String addressMain) {
    this.addressMain = addressMain;
    return this;
  }

  /**
   * Main address flag
   * @return addressMain
  **/
  @ApiModelProperty(example = "J", value = "Main address flag")

@Size(max=1) 
  public String getAddressMain() {
    return addressMain;
  }

  public void setAddressMain(String addressMain) {
    this.addressMain = addressMain;
  }

  public GetCustomerBasicDataResponse address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * div. Adressfelder2 (Straße)
   * @return address2
  **/
  @ApiModelProperty(example = "Wall Street", value = "div. Adressfelder2 (Straße)")

@Size(max=120) 
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public GetCustomerBasicDataResponse advisorName1(String advisorName1) {
    this.advisorName1 = advisorName1;
    return this;
  }

  /**
   * advisorName1 (text)
   * @return advisorName1
  **/
  @ApiModelProperty(example = "Franz Hue", value = "advisorName1 (text)")

@Size(max=30) 
  public String getAdvisorName1() {
    return advisorName1;
  }

  public void setAdvisorName1(String advisorName1) {
    this.advisorName1 = advisorName1;
  }

  public GetCustomerBasicDataResponse advisorName2(String advisorName2) {
    this.advisorName2 = advisorName2;
    return this;
  }

  /**
   * advisorName2 (text)
   * @return advisorName2
  **/
  @ApiModelProperty(example = "Thomas Young", value = "advisorName2 (text)")

@Size(max=30) 
  public String getAdvisorName2() {
    return advisorName2;
  }

  public void setAdvisorName2(String advisorName2) {
    this.advisorName2 = advisorName2;
  }

  public GetCustomerBasicDataResponse amlDataAvailability(String amlDataAvailability) {
    this.amlDataAvailability = amlDataAvailability;
    return this;
  }

  /**
   * AML information flag
   * @return amlDataAvailability
  **/
  @ApiModelProperty(example = "K", value = "AML information flag")

@Size(max=1) 
  public String getAmlDataAvailability() {
    return amlDataAvailability;
  }

  public void setAmlDataAvailability(String amlDataAvailability) {
    this.amlDataAvailability = amlDataAvailability;
  }

  public GetCustomerBasicDataResponse authorizationFlag(String authorizationFlag) {
    this.authorizationFlag = authorizationFlag;
    return this;
  }

  /**
   * FLAG TO IDENTITY IF GEBURTSORT IS REQUIRED OR NOT
   * @return authorizationFlag
  **/
  @ApiModelProperty(example = "J", value = "FLAG TO IDENTITY IF GEBURTSORT IS REQUIRED OR NOT")

@Size(max=1) 
  public String getAuthorizationFlag() {
    return authorizationFlag;
  }

  public void setAuthorizationFlag(String authorizationFlag) {
    this.authorizationFlag = authorizationFlag;
  }

  public GetCustomerBasicDataResponse branchInformation(BranchInformation branchInformation) {
    this.branchInformation = branchInformation;
    return this;
  }

  /**
   * Get branchInformation
   * @return branchInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BranchInformation getBranchInformation() {
    return branchInformation;
  }

  public void setBranchInformation(BranchInformation branchInformation) {
    this.branchInformation = branchInformation;
  }

  public GetCustomerBasicDataResponse compressedCity2(String compressedCity2) {
    this.compressedCity2 = compressedCity2;
    return this;
  }

  /**
   * div. Adressfelder2 (PLZ, Ort, Land, Blind, Adr.aktuell)
   * @return compressedCity2
  **/
  @ApiModelProperty(example = "Town Hall", value = "div. Adressfelder2 (PLZ, Ort, Land, Blind, Adr.aktuell)")

@Size(max=100) 
  public String getCompressedCity2() {
    return compressedCity2;
  }

  public void setCompressedCity2(String compressedCity2) {
    this.compressedCity2 = compressedCity2;
  }

  public GetCustomerBasicDataResponse deceased(Boolean deceased) {
    this.deceased = deceased;
    return this;
  }

  /**
   * true if customer is dead
   * @return deceased
  **/
  @ApiModelProperty(example = "true", value = "true if customer is dead")


  public Boolean isDeceased() {
    return deceased;
  }

  public void setDeceased(Boolean deceased) {
    this.deceased = deceased;
  }

  public GetCustomerBasicDataResponse firstEditDate(LocalDate firstEditDate) {
    this.firstEditDate = firstEditDate;
    return this;
  }

  /**
   * Date since the person is a client
   * @return firstEditDate
  **/
  @ApiModelProperty(example = "2000-12-12", value = "Date since the person is a client")

  @Valid

  public LocalDate getFirstEditDate() {
    return firstEditDate;
  }

  public void setFirstEditDate(LocalDate firstEditDate) {
    this.firstEditDate = firstEditDate;
  }

  public GetCustomerBasicDataResponse identFlag(Boolean identFlag) {
    this.identFlag = identFlag;
    return this;
  }

  /**
   * Ident Flag
   * @return identFlag
  **/
  @ApiModelProperty(example = "true", value = "Ident Flag")


  public Boolean isIdentFlag() {
    return identFlag;
  }

  public void setIdentFlag(Boolean identFlag) {
    this.identFlag = identFlag;
  }

  public GetCustomerBasicDataResponse lastModificationInformation(ModificationInformation lastModificationInformation) {
    this.lastModificationInformation = lastModificationInformation;
    return this;
  }

  /**
   * Get lastModificationInformation
   * @return lastModificationInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ModificationInformation getLastModificationInformation() {
    return lastModificationInformation;
  }

  public void setLastModificationInformation(ModificationInformation lastModificationInformation) {
    this.lastModificationInformation = lastModificationInformation;
  }

  public GetCustomerBasicDataResponse mifid(EnumProperty mifid) {
    this.mifid = mifid;
    return this;
  }

  /**
   * Get mifid
   * @return mifid
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getMifid() {
    return mifid;
  }

  public void setMifid(EnumProperty mifid) {
    this.mifid = mifid;
  }

  public GetCustomerBasicDataResponse stateText(String stateText) {
    this.stateText = stateText;
    return this;
  }

  /**
   * State Text
   * @return stateText
  **/
  @ApiModelProperty(example = "Sample State Text", value = "State Text")


  public String getStateText() {
    return stateText;
  }

  public void setStateText(String stateText) {
    this.stateText = stateText;
  }

  public GetCustomerBasicDataResponse stateDate(LocalDate stateDate) {
    this.stateDate = stateDate;
    return this;
  }

  /**
   * State Since
   * @return stateDate
  **/
  @ApiModelProperty(example = "2017-01-01", value = "State Since")

  @Valid

  public LocalDate getStateDate() {
    return stateDate;
  }

  public void setStateDate(LocalDate stateDate) {
    this.stateDate = stateDate;
  }

  public GetCustomerBasicDataResponse transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

  /**
   * Transaction being called in Allegro
   * @return transactionCode
  **/
  @ApiModelProperty(example = "P011", value = "Transaction being called in Allegro")


  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerBasicDataResponse getCustomerBasicDataResponse = (GetCustomerBasicDataResponse) o;
    return Objects.equals(this.accessLevel, getCustomerBasicDataResponse.accessLevel) &&
        Objects.equals(this.additionalName, getCustomerBasicDataResponse.additionalName) &&
        Objects.equals(this.additionalText, getCustomerBasicDataResponse.additionalText) &&
        Objects.equals(this.addressForBlinds, getCustomerBasicDataResponse.addressForBlinds) &&
        Objects.equals(this.addressOutdated, getCustomerBasicDataResponse.addressOutdated) &&
        Objects.equals(this.addressOutdated2, getCustomerBasicDataResponse.addressOutdated2) &&
        Objects.equals(this.advisorKey1, getCustomerBasicDataResponse.advisorKey1) &&
        Objects.equals(this.advisorKey2, getCustomerBasicDataResponse.advisorKey2) &&
        Objects.equals(this.attentionOf, getCustomerBasicDataResponse.attentionOf) &&
        Objects.equals(this.birthCountry, getCustomerBasicDataResponse.birthCountry) &&
        Objects.equals(this.birthDate, getCustomerBasicDataResponse.birthDate) &&
        Objects.equals(this.birthPlace, getCustomerBasicDataResponse.birthPlace) &&
        Objects.equals(this.blockCustomer, getCustomerBasicDataResponse.blockCustomer) &&
        Objects.equals(this.cardName1, getCustomerBasicDataResponse.cardName1) &&
        Objects.equals(this.cardName2, getCustomerBasicDataResponse.cardName2) &&
        Objects.equals(this.cardName2Extended, getCustomerBasicDataResponse.cardName2Extended) &&
        Objects.equals(this.citizenSince, getCustomerBasicDataResponse.citizenSince) &&
        Objects.equals(this.city, getCustomerBasicDataResponse.city) &&
        Objects.equals(this.city2, getCustomerBasicDataResponse.city2) &&
        Objects.equals(this.country, getCustomerBasicDataResponse.country) &&
        Objects.equals(this.country2, getCustomerBasicDataResponse.country2) &&
        Objects.equals(this.esvg, getCustomerBasicDataResponse.esvg) &&
        Objects.equals(this.firstName, getCustomerBasicDataResponse.firstName) &&
        Objects.equals(this.flagEmployerProspect, getCustomerBasicDataResponse.flagEmployerProspect) &&
        Objects.equals(this.gender, getCustomerBasicDataResponse.gender) &&
        Objects.equals(this.identificationDocument1, getCustomerBasicDataResponse.identificationDocument1) &&
        Objects.equals(this.identificationDocument2, getCustomerBasicDataResponse.identificationDocument2) &&
        Objects.equals(this.language, getCustomerBasicDataResponse.language) &&
        Objects.equals(this.legalFormCode, getCustomerBasicDataResponse.legalFormCode) &&
        Objects.equals(this.leiCode, getCustomerBasicDataResponse.leiCode) &&
        Objects.equals(this.mainAddressChangeDate, getCustomerBasicDataResponse.mainAddressChangeDate) &&
        Objects.equals(this.maritalStatus, getCustomerBasicDataResponse.maritalStatus) &&
        Objects.equals(this.name, getCustomerBasicDataResponse.name) &&
        Objects.equals(this.nationality, getCustomerBasicDataResponse.nationality) &&
        Objects.equals(this.nationality2, getCustomerBasicDataResponse.nationality2) &&
        Objects.equals(this.naturalPerson, getCustomerBasicDataResponse.naturalPerson) &&
        Objects.equals(this.noAdvertismentType, getCustomerBasicDataResponse.noAdvertismentType) &&
        Objects.equals(this.noOENBId, getCustomerBasicDataResponse.noOENBId) &&
        Objects.equals(this.noOENBIdTemporary, getCustomerBasicDataResponse.noOENBIdTemporary) &&
        Objects.equals(this.oenace, getCustomerBasicDataResponse.oenace) &&
        Objects.equals(this.oenbId, getCustomerBasicDataResponse.oenbId) &&
        Objects.equals(this.pep, getCustomerBasicDataResponse.pep) &&
        Objects.equals(this.pepCode, getCustomerBasicDataResponse.pepCode) &&
        Objects.equals(this.pepComment, getCustomerBasicDataResponse.pepComment) &&
        Objects.equals(this.pepRelative, getCustomerBasicDataResponse.pepRelative) &&
        Objects.equals(this.postalCode, getCustomerBasicDataResponse.postalCode) &&
        Objects.equals(this.postalCode2, getCustomerBasicDataResponse.postalCode2) &&
        Objects.equals(this.salutation, getCustomerBasicDataResponse.salutation) &&
        Objects.equals(this.segment, getCustomerBasicDataResponse.segment) &&
        Objects.equals(this.seperateCustomer, getCustomerBasicDataResponse.seperateCustomer) &&
        Objects.equals(this.shortWording, getCustomerBasicDataResponse.shortWording) &&
        Objects.equals(this.socialSecurityNumber, getCustomerBasicDataResponse.socialSecurityNumber) &&
        Objects.equals(this.street, getCustomerBasicDataResponse.street) &&
        Objects.equals(this.street2, getCustomerBasicDataResponse.street2) &&
        Objects.equals(this.taxLiabilityCountryCode, getCustomerBasicDataResponse.taxLiabilityCountryCode) &&
        Objects.equals(this.title, getCustomerBasicDataResponse.title) &&
        Objects.equals(this.unwantedCustomer, getCustomerBasicDataResponse.unwantedCustomer) &&
        Objects.equals(this.addressMain, getCustomerBasicDataResponse.addressMain) &&
        Objects.equals(this.address2, getCustomerBasicDataResponse.address2) &&
        Objects.equals(this.advisorName1, getCustomerBasicDataResponse.advisorName1) &&
        Objects.equals(this.advisorName2, getCustomerBasicDataResponse.advisorName2) &&
        Objects.equals(this.amlDataAvailability, getCustomerBasicDataResponse.amlDataAvailability) &&
        Objects.equals(this.authorizationFlag, getCustomerBasicDataResponse.authorizationFlag) &&
        Objects.equals(this.branchInformation, getCustomerBasicDataResponse.branchInformation) &&
        Objects.equals(this.compressedCity2, getCustomerBasicDataResponse.compressedCity2) &&
        Objects.equals(this.deceased, getCustomerBasicDataResponse.deceased) &&
        Objects.equals(this.firstEditDate, getCustomerBasicDataResponse.firstEditDate) &&
        Objects.equals(this.identFlag, getCustomerBasicDataResponse.identFlag) &&
        Objects.equals(this.lastModificationInformation, getCustomerBasicDataResponse.lastModificationInformation) &&
        Objects.equals(this.mifid, getCustomerBasicDataResponse.mifid) &&
        Objects.equals(this.stateText, getCustomerBasicDataResponse.stateText) &&
        Objects.equals(this.stateDate, getCustomerBasicDataResponse.stateDate) &&
        Objects.equals(this.transactionCode, getCustomerBasicDataResponse.transactionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, additionalName, additionalText, addressForBlinds, addressOutdated, addressOutdated2, advisorKey1, advisorKey2, attentionOf, birthCountry, birthDate, birthPlace, blockCustomer, cardName1, cardName2, cardName2Extended, citizenSince, city, city2, country, country2, esvg, firstName, flagEmployerProspect, gender, identificationDocument1, identificationDocument2, language, legalFormCode, leiCode, mainAddressChangeDate, maritalStatus, name, nationality, nationality2, naturalPerson, noAdvertismentType, noOENBId, noOENBIdTemporary, oenace, oenbId, pep, pepCode, pepComment, pepRelative, postalCode, postalCode2, salutation, segment, seperateCustomer, shortWording, socialSecurityNumber, street, street2, taxLiabilityCountryCode, title, unwantedCustomer, addressMain, address2, advisorName1, advisorName2, amlDataAvailability, authorizationFlag, branchInformation, compressedCity2, deceased, firstEditDate, identFlag, lastModificationInformation, mifid, stateText, stateDate, transactionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerBasicDataResponse {\n");
    
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    additionalName: ").append(toIndentedString(additionalName)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
    sb.append("    addressForBlinds: ").append(toIndentedString(addressForBlinds)).append("\n");
    sb.append("    addressOutdated: ").append(toIndentedString(addressOutdated)).append("\n");
    sb.append("    addressOutdated2: ").append(toIndentedString(addressOutdated2)).append("\n");
    sb.append("    advisorKey1: ").append(toIndentedString(advisorKey1)).append("\n");
    sb.append("    advisorKey2: ").append(toIndentedString(advisorKey2)).append("\n");
    sb.append("    attentionOf: ").append(toIndentedString(attentionOf)).append("\n");
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    blockCustomer: ").append(toIndentedString(blockCustomer)).append("\n");
    sb.append("    cardName1: ").append(toIndentedString(cardName1)).append("\n");
    sb.append("    cardName2: ").append(toIndentedString(cardName2)).append("\n");
    sb.append("    cardName2Extended: ").append(toIndentedString(cardName2Extended)).append("\n");
    sb.append("    citizenSince: ").append(toIndentedString(citizenSince)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    city2: ").append(toIndentedString(city2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    country2: ").append(toIndentedString(country2)).append("\n");
    sb.append("    esvg: ").append(toIndentedString(esvg)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    flagEmployerProspect: ").append(toIndentedString(flagEmployerProspect)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    identificationDocument1: ").append(toIndentedString(identificationDocument1)).append("\n");
    sb.append("    identificationDocument2: ").append(toIndentedString(identificationDocument2)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    legalFormCode: ").append(toIndentedString(legalFormCode)).append("\n");
    sb.append("    leiCode: ").append(toIndentedString(leiCode)).append("\n");
    sb.append("    mainAddressChangeDate: ").append(toIndentedString(mainAddressChangeDate)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    nationality2: ").append(toIndentedString(nationality2)).append("\n");
    sb.append("    naturalPerson: ").append(toIndentedString(naturalPerson)).append("\n");
    sb.append("    noAdvertismentType: ").append(toIndentedString(noAdvertismentType)).append("\n");
    sb.append("    noOENBId: ").append(toIndentedString(noOENBId)).append("\n");
    sb.append("    noOENBIdTemporary: ").append(toIndentedString(noOENBIdTemporary)).append("\n");
    sb.append("    oenace: ").append(toIndentedString(oenace)).append("\n");
    sb.append("    oenbId: ").append(toIndentedString(oenbId)).append("\n");
    sb.append("    pep: ").append(toIndentedString(pep)).append("\n");
    sb.append("    pepCode: ").append(toIndentedString(pepCode)).append("\n");
    sb.append("    pepComment: ").append(toIndentedString(pepComment)).append("\n");
    sb.append("    pepRelative: ").append(toIndentedString(pepRelative)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postalCode2: ").append(toIndentedString(postalCode2)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    seperateCustomer: ").append(toIndentedString(seperateCustomer)).append("\n");
    sb.append("    shortWording: ").append(toIndentedString(shortWording)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    taxLiabilityCountryCode: ").append(toIndentedString(taxLiabilityCountryCode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unwantedCustomer: ").append(toIndentedString(unwantedCustomer)).append("\n");
    sb.append("    addressMain: ").append(toIndentedString(addressMain)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    advisorName1: ").append(toIndentedString(advisorName1)).append("\n");
    sb.append("    advisorName2: ").append(toIndentedString(advisorName2)).append("\n");
    sb.append("    amlDataAvailability: ").append(toIndentedString(amlDataAvailability)).append("\n");
    sb.append("    authorizationFlag: ").append(toIndentedString(authorizationFlag)).append("\n");
    sb.append("    branchInformation: ").append(toIndentedString(branchInformation)).append("\n");
    sb.append("    compressedCity2: ").append(toIndentedString(compressedCity2)).append("\n");
    sb.append("    deceased: ").append(toIndentedString(deceased)).append("\n");
    sb.append("    firstEditDate: ").append(toIndentedString(firstEditDate)).append("\n");
    sb.append("    identFlag: ").append(toIndentedString(identFlag)).append("\n");
    sb.append("    lastModificationInformation: ").append(toIndentedString(lastModificationInformation)).append("\n");
    sb.append("    mifid: ").append(toIndentedString(mifid)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    stateDate: ").append(toIndentedString(stateDate)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
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

