package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnumProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonContact
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class PersonContact   {
  @JsonProperty("personCode")
  private String personCode = null;

  @JsonProperty("addressNumber")
  private Integer addressNumber = null;

  @JsonProperty("contact")
  private EnumProperty contact = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private EnumProperty country = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("streetNameNumber")
  private String streetNameNumber = null;

  @JsonProperty("careOfText")
  private String careOfText = null;

  @JsonProperty("addressForBlind")
  private Boolean addressForBlind = null;

  @JsonProperty("contactActual")
  private Boolean contactActual = null;

  @JsonProperty("internalContactCode")
  private String internalContactCode = null;

  @JsonProperty("organizationalUnit")
  private String organizationalUnit = null;

  @JsonProperty("depositBox")
  private Integer depositBox = null;

  @JsonProperty("telefonNumber")
  private String telefonNumber = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("contactWelcome")
  private Boolean contactWelcome = null;

  @JsonProperty("commentText")
  private String commentText = null;

  @JsonProperty("lastModificationDate")
  private OffsetDateTime lastModificationDate = null;

  @JsonProperty("lastModificationBranch")
  private String lastModificationBranch = null;

  public PersonContact personCode(String personCode) {
    this.personCode = personCode;
    return this;
  }

  /**
   * CUSTOMER CODE
   * @return personCode
  **/
  @ApiModelProperty(example = "12345", value = "CUSTOMER CODE")

@Size(max=39) 
  public String getPersonCode() {
    return personCode;
  }

  public void setPersonCode(String personCode) {
    this.personCode = personCode;
  }

  public PersonContact addressNumber(Integer addressNumber) {
    this.addressNumber = addressNumber;
    return this;
  }

  /**
   * PERSON CONTACT TYPE IDENTIFICATION NUMBER
   * @return addressNumber
  **/
  @ApiModelProperty(example = "5", value = "PERSON CONTACT TYPE IDENTIFICATION NUMBER")


  public Integer getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(Integer addressNumber) {
    this.addressNumber = addressNumber;
  }

  public PersonContact contact(EnumProperty contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnumProperty getContact() {
    return contact;
  }

  public void setContact(EnumProperty contact) {
    this.contact = contact;
  }

  public PersonContact city(String city) {
    this.city = city;
    return this;
  }

  /**
   * CITY DESCRIPTION
   * @return city
  **/
  @ApiModelProperty(example = "Lipa", value = "CITY DESCRIPTION")

@Size(max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PersonContact country(EnumProperty country) {
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

  public PersonContact postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * ZIP CODE
   * @return postalCode
  **/
  @ApiModelProperty(example = "1080", value = "ZIP CODE")

@Size(max=6) 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PersonContact streetNameNumber(String streetNameNumber) {
    this.streetNameNumber = streetNameNumber;
    return this;
  }

  /**
   * TEXT FOR STREET
   * @return streetNameNumber
  **/
  @ApiModelProperty(example = "Elm Street", value = "TEXT FOR STREET")

@Size(max=35) 
  public String getStreetNameNumber() {
    return streetNameNumber;
  }

  public void setStreetNameNumber(String streetNameNumber) {
    this.streetNameNumber = streetNameNumber;
  }

  public PersonContact careOfText(String careOfText) {
    this.careOfText = careOfText;
    return this;
  }

  /**
   * ATTENTION PART ADDR
   * @return careOfText
  **/
  @ApiModelProperty(example = "Text", value = "ATTENTION PART ADDR")

@Size(max=35) 
  public String getCareOfText() {
    return careOfText;
  }

  public void setCareOfText(String careOfText) {
    this.careOfText = careOfText;
  }

  public PersonContact addressForBlind(Boolean addressForBlind) {
    this.addressForBlind = addressForBlind;
    return this;
  }

  /**
   * BRAILLE PRINTING FLG
   * @return addressForBlind
  **/
  @ApiModelProperty(example = "false", value = "BRAILLE PRINTING FLG")


  public Boolean isAddressForBlind() {
    return addressForBlind;
  }

  public void setAddressForBlind(Boolean addressForBlind) {
    this.addressForBlind = addressForBlind;
  }

  public PersonContact contactActual(Boolean contactActual) {
    this.contactActual = contactActual;
    return this;
  }

  /**
   * ADDRESS ACTUAL FLAG
   * @return contactActual
  **/
  @ApiModelProperty(example = "false", value = "ADDRESS ACTUAL FLAG")


  public Boolean isContactActual() {
    return contactActual;
  }

  public void setContactActual(Boolean contactActual) {
    this.contactActual = contactActual;
  }

  public PersonContact internalContactCode(String internalContactCode) {
    this.internalContactCode = internalContactCode;
    return this;
  }

  /**
   * TYPE INTERN. ADDRESS
   * @return internalContactCode
  **/
  @ApiModelProperty(value = "TYPE INTERN. ADDRESS")

@Size(max=1) 
  public String getInternalContactCode() {
    return internalContactCode;
  }

  public void setInternalContactCode(String internalContactCode) {
    this.internalContactCode = internalContactCode;
  }

  public PersonContact organizationalUnit(String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
    return this;
  }

  /**
   * ORG. UNIT INT. ADR.
   * @return organizationalUnit
  **/
  @ApiModelProperty(value = "ORG. UNIT INT. ADR.")

@Size(max=12) 
  public String getOrganizationalUnit() {
    return organizationalUnit;
  }

  public void setOrganizationalUnit(String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
  }

  public PersonContact depositBox(Integer depositBox) {
    this.depositBox = depositBox;
    return this;
  }

  /**
   * DEPOSIT BOX NR.I.ADR
   * @return depositBox
  **/
  @ApiModelProperty(value = "DEPOSIT BOX NR.I.ADR")


  public Integer getDepositBox() {
    return depositBox;
  }

  public void setDepositBox(Integer depositBox) {
    this.depositBox = depositBox;
  }

  public PersonContact telefonNumber(String telefonNumber) {
    this.telefonNumber = telefonNumber;
    return this;
  }

  /**
   * Telefon Number
   * @return telefonNumber
  **/
  @ApiModelProperty(value = "Telefon Number")

@Size(max=60) 
  public String getTelefonNumber() {
    return telefonNumber;
  }

  public void setTelefonNumber(String telefonNumber) {
    this.telefonNumber = telefonNumber;
  }

  public PersonContact emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email Address
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email Address")

@Size(max=60) 
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public PersonContact contactWelcome(Boolean contactWelcome) {
    this.contactWelcome = contactWelcome;
    return this;
  }

  /**
   * HORA MODIF.
   * @return contactWelcome
  **/
  @ApiModelProperty(example = "false", value = "HORA MODIF.")


  public Boolean isContactWelcome() {
    return contactWelcome;
  }

  public void setContactWelcome(Boolean contactWelcome) {
    this.contactWelcome = contactWelcome;
  }

  public PersonContact commentText(String commentText) {
    this.commentText = commentText;
    return this;
  }

  /**
   * NUM. TELEFONO
   * @return commentText
  **/
  @ApiModelProperty(example = "TEXT", value = "NUM. TELEFONO")

@Size(max=60) 
  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }

  public PersonContact lastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

  /**
   * REGI.MOD
   * @return lastModificationDate
  **/
  @ApiModelProperty(example = "2017-12-05T10:52:06", value = "REGI.MOD")

  @Valid

  public OffsetDateTime getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public PersonContact lastModificationBranch(String lastModificationBranch) {
    this.lastModificationBranch = lastModificationBranch;
    return this;
  }

  /**
   * BRANCH
   * @return lastModificationBranch
  **/
  @ApiModelProperty(example = "0580", value = "BRANCH")

@Size(max=4) 
  public String getLastModificationBranch() {
    return lastModificationBranch;
  }

  public void setLastModificationBranch(String lastModificationBranch) {
    this.lastModificationBranch = lastModificationBranch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonContact personContact = (PersonContact) o;
    return Objects.equals(this.personCode, personContact.personCode) &&
        Objects.equals(this.addressNumber, personContact.addressNumber) &&
        Objects.equals(this.contact, personContact.contact) &&
        Objects.equals(this.city, personContact.city) &&
        Objects.equals(this.country, personContact.country) &&
        Objects.equals(this.postalCode, personContact.postalCode) &&
        Objects.equals(this.streetNameNumber, personContact.streetNameNumber) &&
        Objects.equals(this.careOfText, personContact.careOfText) &&
        Objects.equals(this.addressForBlind, personContact.addressForBlind) &&
        Objects.equals(this.contactActual, personContact.contactActual) &&
        Objects.equals(this.internalContactCode, personContact.internalContactCode) &&
        Objects.equals(this.organizationalUnit, personContact.organizationalUnit) &&
        Objects.equals(this.depositBox, personContact.depositBox) &&
        Objects.equals(this.telefonNumber, personContact.telefonNumber) &&
        Objects.equals(this.emailAddress, personContact.emailAddress) &&
        Objects.equals(this.contactWelcome, personContact.contactWelcome) &&
        Objects.equals(this.commentText, personContact.commentText) &&
        Objects.equals(this.lastModificationDate, personContact.lastModificationDate) &&
        Objects.equals(this.lastModificationBranch, personContact.lastModificationBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personCode, addressNumber, contact, city, country, postalCode, streetNameNumber, careOfText, addressForBlind, contactActual, internalContactCode, organizationalUnit, depositBox, telefonNumber, emailAddress, contactWelcome, commentText, lastModificationDate, lastModificationBranch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonContact {\n");
    
    sb.append("    personCode: ").append(toIndentedString(personCode)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    streetNameNumber: ").append(toIndentedString(streetNameNumber)).append("\n");
    sb.append("    careOfText: ").append(toIndentedString(careOfText)).append("\n");
    sb.append("    addressForBlind: ").append(toIndentedString(addressForBlind)).append("\n");
    sb.append("    contactActual: ").append(toIndentedString(contactActual)).append("\n");
    sb.append("    internalContactCode: ").append(toIndentedString(internalContactCode)).append("\n");
    sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
    sb.append("    depositBox: ").append(toIndentedString(depositBox)).append("\n");
    sb.append("    telefonNumber: ").append(toIndentedString(telefonNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    contactWelcome: ").append(toIndentedString(contactWelcome)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    lastModificationBranch: ").append(toIndentedString(lastModificationBranch)).append("\n");
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

