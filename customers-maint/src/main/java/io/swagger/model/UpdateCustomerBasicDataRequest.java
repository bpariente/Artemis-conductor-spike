package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnumProperty;
import io.swagger.model.ModificationInformation;
import io.swagger.model.PersonIdentificationDocument;
import io.swagger.model.PersonKey;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCustomerBasicDataRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class UpdateCustomerBasicDataRequest   {
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
  private Date birthDate = null;

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
  private Date citizenSince = null;

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
  private Date mainAddressChangeDate = null;

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

  @JsonProperty("authorizationFlag")
  private Boolean authorizationFlag = null;

  @JsonProperty("compressTown2")
  private String compressTown2 = null;

  @JsonProperty("flagNotActual2")
  private Boolean flagNotActual2 = null;

  @JsonProperty("lastModificationInformation")
  private ModificationInformation lastModificationInformation = null;

  @JsonProperty("mifid")
  private EnumProperty mifid = null;

  @JsonProperty("personKey")
  private PersonKey personKey = null;

  public UpdateCustomerBasicDataRequest accessLevel(Integer accessLevel) {
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

  public UpdateCustomerBasicDataRequest additionalName(String additionalName) {
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

  public UpdateCustomerBasicDataRequest additionalText(String additionalText) {
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

  public UpdateCustomerBasicDataRequest addressForBlinds(Boolean addressForBlinds) {
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

  public UpdateCustomerBasicDataRequest addressOutdated(Boolean addressOutdated) {
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

  public UpdateCustomerBasicDataRequest addressOutdated2(Boolean addressOutdated2) {
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

  public UpdateCustomerBasicDataRequest advisorKey1(String advisorKey1) {
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

  public UpdateCustomerBasicDataRequest advisorKey2(String advisorKey2) {
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

  public UpdateCustomerBasicDataRequest attentionOf(String attentionOf) {
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

  public UpdateCustomerBasicDataRequest birthCountry(String birthCountry) {
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

  public UpdateCustomerBasicDataRequest birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Birthdate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-01-01", value = "Birthdate")

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public UpdateCustomerBasicDataRequest birthPlace(String birthPlace) {
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

  public UpdateCustomerBasicDataRequest blockCustomer(Boolean blockCustomer) {
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

  public UpdateCustomerBasicDataRequest cardName1(String cardName1) {
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

  public UpdateCustomerBasicDataRequest cardName2(String cardName2) {
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

  public UpdateCustomerBasicDataRequest cardName2Extended(String cardName2Extended) {
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

  public UpdateCustomerBasicDataRequest citizenSince(Date citizenSince) {
    this.citizenSince = citizenSince;
    return this;
  }

  /**
   * Citizen Since
   * @return citizenSince
  **/
  @ApiModelProperty(example = "2017-10-26", value = "Citizen Since")

  @Valid

  public Date getCitizenSince() {
    return citizenSince;
  }

  public void setCitizenSince(Date citizenSince) {
    this.citizenSince = citizenSince;
  }

  public UpdateCustomerBasicDataRequest city(String city) {
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

  public UpdateCustomerBasicDataRequest city2(String city2) {
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

  public UpdateCustomerBasicDataRequest country(EnumProperty country) {
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

  public UpdateCustomerBasicDataRequest country2(EnumProperty country2) {
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

  public UpdateCustomerBasicDataRequest esvg(EnumProperty esvg) {
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

  public UpdateCustomerBasicDataRequest firstName(String firstName) {
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

  public UpdateCustomerBasicDataRequest flagEmployerProspect(Boolean flagEmployerProspect) {
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

  public UpdateCustomerBasicDataRequest gender(EnumProperty gender) {
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

  public UpdateCustomerBasicDataRequest identificationDocument1(PersonIdentificationDocument identificationDocument1) {
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

  public UpdateCustomerBasicDataRequest identificationDocument2(PersonIdentificationDocument identificationDocument2) {
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

  public UpdateCustomerBasicDataRequest language(String language) {
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

  public UpdateCustomerBasicDataRequest legalFormCode(Integer legalFormCode) {
    this.legalFormCode = legalFormCode;
    return this;
  }

  /**
   * Legal Form code
   * @return legalFormCode
  **/
  @ApiModelProperty(example = "100", value = "Legal Form code")


  public Integer getLegalFormCode() {
    return legalFormCode;
  }

  public void setLegalFormCode(Integer legalFormCode) {
    this.legalFormCode = legalFormCode;
  }

  public UpdateCustomerBasicDataRequest leiCode(String leiCode) {
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

  public UpdateCustomerBasicDataRequest mainAddressChangeDate(Date mainAddressChangeDate) {
    this.mainAddressChangeDate = mainAddressChangeDate;
    return this;
  }

  /**
   * Main Address Change Date
   * @return mainAddressChangeDate
  **/
  @ApiModelProperty(example = "2017-01-20", value = "Main Address Change Date")

  @Valid

  public Date getMainAddressChangeDate() {
    return mainAddressChangeDate;
  }

  public void setMainAddressChangeDate(Date mainAddressChangeDate) {
    this.mainAddressChangeDate = mainAddressChangeDate;
  }

  public UpdateCustomerBasicDataRequest maritalStatus(EnumProperty maritalStatus) {
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

  public UpdateCustomerBasicDataRequest name(String name) {
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

  public UpdateCustomerBasicDataRequest nationality(EnumProperty nationality) {
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

  public UpdateCustomerBasicDataRequest nationality2(EnumProperty nationality2) {
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

  public UpdateCustomerBasicDataRequest naturalPerson(Boolean naturalPerson) {
    this.naturalPerson = naturalPerson;
    return this;
  }

  /**
   * Flag for Natural Person
   * @return naturalPerson
  **/
  @ApiModelProperty(example = "true", value = "Flag for Natural Person")


  public Boolean isNaturalPerson() {
    return naturalPerson;
  }

  public void setNaturalPerson(Boolean naturalPerson) {
    this.naturalPerson = naturalPerson;
  }

  public UpdateCustomerBasicDataRequest noAdvertismentType(String noAdvertismentType) {
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

  public UpdateCustomerBasicDataRequest noOENBId(Boolean noOENBId) {
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

  public UpdateCustomerBasicDataRequest noOENBIdTemporary(Boolean noOENBIdTemporary) {
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

  public UpdateCustomerBasicDataRequest oenace(EnumProperty oenace) {
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

  public UpdateCustomerBasicDataRequest oenbId(String oenbId) {
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

  public UpdateCustomerBasicDataRequest pep(Boolean pep) {
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

  public UpdateCustomerBasicDataRequest pepCode(String pepCode) {
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

  public UpdateCustomerBasicDataRequest pepComment(String pepComment) {
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

  public UpdateCustomerBasicDataRequest pepRelative(Boolean pepRelative) {
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

  public UpdateCustomerBasicDataRequest postalCode(String postalCode) {
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

  public UpdateCustomerBasicDataRequest postalCode2(String postalCode2) {
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

  public UpdateCustomerBasicDataRequest salutation(EnumProperty salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * Get salutation
   * @return salutation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getSalutation() {
    return salutation;
  }

  public void setSalutation(EnumProperty salutation) {
    this.salutation = salutation;
  }

  public UpdateCustomerBasicDataRequest segment(EnumProperty segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Get segment
   * @return segment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getSegment() {
    return segment;
  }

  public void setSegment(EnumProperty segment) {
    this.segment = segment;
  }

  public UpdateCustomerBasicDataRequest seperateCustomer(Boolean seperateCustomer) {
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

  public UpdateCustomerBasicDataRequest shortWording(String shortWording) {
    this.shortWording = shortWording;
    return this;
  }

  /**
   * ShortWording Person name
   * @return shortWording
  **/
  @ApiModelProperty(example = "Gmgb Company", value = "ShortWording Person name")

@Size(max=35) 
  public String getShortWording() {
    return shortWording;
  }

  public void setShortWording(String shortWording) {
    this.shortWording = shortWording;
  }

  public UpdateCustomerBasicDataRequest socialSecurityNumber(String socialSecurityNumber) {
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

  public UpdateCustomerBasicDataRequest street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street
   * @return street
  **/
  @ApiModelProperty(example = "Karlsplatz", value = "Street")

@Size(max=35) 
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public UpdateCustomerBasicDataRequest street2(String street2) {
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

  public UpdateCustomerBasicDataRequest taxLiabilityCountryCode(String taxLiabilityCountryCode) {
    this.taxLiabilityCountryCode = taxLiabilityCountryCode;
    return this;
  }

  /**
   * Tax Liability Country Code
   * @return taxLiabilityCountryCode
  **/
  @ApiModelProperty(example = "AT", value = "Tax Liability Country Code")

@Size(max=2) 
  public String getTaxLiabilityCountryCode() {
    return taxLiabilityCountryCode;
  }

  public void setTaxLiabilityCountryCode(String taxLiabilityCountryCode) {
    this.taxLiabilityCountryCode = taxLiabilityCountryCode;
  }

  public UpdateCustomerBasicDataRequest title(String title) {
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

  public UpdateCustomerBasicDataRequest unwantedCustomer(Boolean unwantedCustomer) {
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

  public UpdateCustomerBasicDataRequest addressMain(String addressMain) {
    this.addressMain = addressMain;
    return this;
  }

  /**
   * Address Main J/N
   * @return addressMain
  **/
  @ApiModelProperty(example = "J", value = "Address Main J/N")

@Size(max=1) 
  public String getAddressMain() {
    return addressMain;
  }

  public void setAddressMain(String addressMain) {
    this.addressMain = addressMain;
  }

  public UpdateCustomerBasicDataRequest address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Second Address
   * @return address2
  **/
  @ApiModelProperty(example = "Wein", value = "Second Address")

@Size(max=120) 
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public UpdateCustomerBasicDataRequest authorizationFlag(Boolean authorizationFlag) {
    this.authorizationFlag = authorizationFlag;
    return this;
  }

  /**
   * Authorization Flag
   * @return authorizationFlag
  **/
  @ApiModelProperty(example = "true", value = "Authorization Flag")


  public Boolean isAuthorizationFlag() {
    return authorizationFlag;
  }

  public void setAuthorizationFlag(Boolean authorizationFlag) {
    this.authorizationFlag = authorizationFlag;
  }

  public UpdateCustomerBasicDataRequest compressTown2(String compressTown2) {
    this.compressTown2 = compressTown2;
    return this;
  }

  /**
   * Compressed Town 2
   * @return compressTown2
  **/
  @ApiModelProperty(example = "Wein", value = "Compressed Town 2")

@Size(max=100) 
  public String getCompressTown2() {
    return compressTown2;
  }

  public void setCompressTown2(String compressTown2) {
    this.compressTown2 = compressTown2;
  }

  public UpdateCustomerBasicDataRequest flagNotActual2(Boolean flagNotActual2) {
    this.flagNotActual2 = flagNotActual2;
    return this;
  }

  /**
   * Flag not actual
   * @return flagNotActual2
  **/
  @ApiModelProperty(example = "false", value = "Flag not actual")


  public Boolean isFlagNotActual2() {
    return flagNotActual2;
  }

  public void setFlagNotActual2(Boolean flagNotActual2) {
    this.flagNotActual2 = flagNotActual2;
  }

  public UpdateCustomerBasicDataRequest lastModificationInformation(ModificationInformation lastModificationInformation) {
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

  public UpdateCustomerBasicDataRequest mifid(EnumProperty mifid) {
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

  public UpdateCustomerBasicDataRequest personKey(PersonKey personKey) {
    this.personKey = personKey;
    return this;
  }

  /**
   * Get personKey
   * @return personKey
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonKey getPersonKey() {
    return personKey;
  }

  public void setPersonKey(PersonKey personKey) {
    this.personKey = personKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerBasicDataRequest updateCustomerBasicDataRequest = (UpdateCustomerBasicDataRequest) o;
    return Objects.equals(this.accessLevel, updateCustomerBasicDataRequest.accessLevel) &&
        Objects.equals(this.additionalName, updateCustomerBasicDataRequest.additionalName) &&
        Objects.equals(this.additionalText, updateCustomerBasicDataRequest.additionalText) &&
        Objects.equals(this.addressForBlinds, updateCustomerBasicDataRequest.addressForBlinds) &&
        Objects.equals(this.addressOutdated, updateCustomerBasicDataRequest.addressOutdated) &&
        Objects.equals(this.addressOutdated2, updateCustomerBasicDataRequest.addressOutdated2) &&
        Objects.equals(this.advisorKey1, updateCustomerBasicDataRequest.advisorKey1) &&
        Objects.equals(this.advisorKey2, updateCustomerBasicDataRequest.advisorKey2) &&
        Objects.equals(this.attentionOf, updateCustomerBasicDataRequest.attentionOf) &&
        Objects.equals(this.birthCountry, updateCustomerBasicDataRequest.birthCountry) &&
        Objects.equals(this.birthDate, updateCustomerBasicDataRequest.birthDate) &&
        Objects.equals(this.birthPlace, updateCustomerBasicDataRequest.birthPlace) &&
        Objects.equals(this.blockCustomer, updateCustomerBasicDataRequest.blockCustomer) &&
        Objects.equals(this.cardName1, updateCustomerBasicDataRequest.cardName1) &&
        Objects.equals(this.cardName2, updateCustomerBasicDataRequest.cardName2) &&
        Objects.equals(this.cardName2Extended, updateCustomerBasicDataRequest.cardName2Extended) &&
        Objects.equals(this.citizenSince, updateCustomerBasicDataRequest.citizenSince) &&
        Objects.equals(this.city, updateCustomerBasicDataRequest.city) &&
        Objects.equals(this.city2, updateCustomerBasicDataRequest.city2) &&
        Objects.equals(this.country, updateCustomerBasicDataRequest.country) &&
        Objects.equals(this.country2, updateCustomerBasicDataRequest.country2) &&
        Objects.equals(this.esvg, updateCustomerBasicDataRequest.esvg) &&
        Objects.equals(this.firstName, updateCustomerBasicDataRequest.firstName) &&
        Objects.equals(this.flagEmployerProspect, updateCustomerBasicDataRequest.flagEmployerProspect) &&
        Objects.equals(this.gender, updateCustomerBasicDataRequest.gender) &&
        Objects.equals(this.identificationDocument1, updateCustomerBasicDataRequest.identificationDocument1) &&
        Objects.equals(this.identificationDocument2, updateCustomerBasicDataRequest.identificationDocument2) &&
        Objects.equals(this.language, updateCustomerBasicDataRequest.language) &&
        Objects.equals(this.legalFormCode, updateCustomerBasicDataRequest.legalFormCode) &&
        Objects.equals(this.leiCode, updateCustomerBasicDataRequest.leiCode) &&
        Objects.equals(this.mainAddressChangeDate, updateCustomerBasicDataRequest.mainAddressChangeDate) &&
        Objects.equals(this.maritalStatus, updateCustomerBasicDataRequest.maritalStatus) &&
        Objects.equals(this.name, updateCustomerBasicDataRequest.name) &&
        Objects.equals(this.nationality, updateCustomerBasicDataRequest.nationality) &&
        Objects.equals(this.nationality2, updateCustomerBasicDataRequest.nationality2) &&
        Objects.equals(this.naturalPerson, updateCustomerBasicDataRequest.naturalPerson) &&
        Objects.equals(this.noAdvertismentType, updateCustomerBasicDataRequest.noAdvertismentType) &&
        Objects.equals(this.noOENBId, updateCustomerBasicDataRequest.noOENBId) &&
        Objects.equals(this.noOENBIdTemporary, updateCustomerBasicDataRequest.noOENBIdTemporary) &&
        Objects.equals(this.oenace, updateCustomerBasicDataRequest.oenace) &&
        Objects.equals(this.oenbId, updateCustomerBasicDataRequest.oenbId) &&
        Objects.equals(this.pep, updateCustomerBasicDataRequest.pep) &&
        Objects.equals(this.pepCode, updateCustomerBasicDataRequest.pepCode) &&
        Objects.equals(this.pepComment, updateCustomerBasicDataRequest.pepComment) &&
        Objects.equals(this.pepRelative, updateCustomerBasicDataRequest.pepRelative) &&
        Objects.equals(this.postalCode, updateCustomerBasicDataRequest.postalCode) &&
        Objects.equals(this.postalCode2, updateCustomerBasicDataRequest.postalCode2) &&
        Objects.equals(this.salutation, updateCustomerBasicDataRequest.salutation) &&
        Objects.equals(this.segment, updateCustomerBasicDataRequest.segment) &&
        Objects.equals(this.seperateCustomer, updateCustomerBasicDataRequest.seperateCustomer) &&
        Objects.equals(this.shortWording, updateCustomerBasicDataRequest.shortWording) &&
        Objects.equals(this.socialSecurityNumber, updateCustomerBasicDataRequest.socialSecurityNumber) &&
        Objects.equals(this.street, updateCustomerBasicDataRequest.street) &&
        Objects.equals(this.street2, updateCustomerBasicDataRequest.street2) &&
        Objects.equals(this.taxLiabilityCountryCode, updateCustomerBasicDataRequest.taxLiabilityCountryCode) &&
        Objects.equals(this.title, updateCustomerBasicDataRequest.title) &&
        Objects.equals(this.unwantedCustomer, updateCustomerBasicDataRequest.unwantedCustomer) &&
        Objects.equals(this.addressMain, updateCustomerBasicDataRequest.addressMain) &&
        Objects.equals(this.address2, updateCustomerBasicDataRequest.address2) &&
        Objects.equals(this.authorizationFlag, updateCustomerBasicDataRequest.authorizationFlag) &&
        Objects.equals(this.compressTown2, updateCustomerBasicDataRequest.compressTown2) &&
        Objects.equals(this.flagNotActual2, updateCustomerBasicDataRequest.flagNotActual2) &&
        Objects.equals(this.lastModificationInformation, updateCustomerBasicDataRequest.lastModificationInformation) &&
        Objects.equals(this.mifid, updateCustomerBasicDataRequest.mifid) &&
        Objects.equals(this.personKey, updateCustomerBasicDataRequest.personKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, additionalName, additionalText, addressForBlinds, addressOutdated, addressOutdated2, advisorKey1, advisorKey2, attentionOf, birthCountry, birthDate, birthPlace, blockCustomer, cardName1, cardName2, cardName2Extended, citizenSince, city, city2, country, country2, esvg, firstName, flagEmployerProspect, gender, identificationDocument1, identificationDocument2, language, legalFormCode, leiCode, mainAddressChangeDate, maritalStatus, name, nationality, nationality2, naturalPerson, noAdvertismentType, noOENBId, noOENBIdTemporary, oenace, oenbId, pep, pepCode, pepComment, pepRelative, postalCode, postalCode2, salutation, segment, seperateCustomer, shortWording, socialSecurityNumber, street, street2, taxLiabilityCountryCode, title, unwantedCustomer, addressMain, address2, authorizationFlag, compressTown2, flagNotActual2, lastModificationInformation, mifid, personKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerBasicDataRequest {\n");
    
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
    sb.append("    authorizationFlag: ").append(toIndentedString(authorizationFlag)).append("\n");
    sb.append("    compressTown2: ").append(toIndentedString(compressTown2)).append("\n");
    sb.append("    flagNotActual2: ").append(toIndentedString(flagNotActual2)).append("\n");
    sb.append("    lastModificationInformation: ").append(toIndentedString(lastModificationInformation)).append("\n");
    sb.append("    mifid: ").append(toIndentedString(mifid)).append("\n");
    sb.append("    personKey: ").append(toIndentedString(personKey)).append("\n");
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

