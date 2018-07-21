package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonKey;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonShortInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class PersonShortInfo   {
  @JsonProperty("personKey")
  private PersonKey personKey = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("identFlag")
  private String identFlag = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("hints")
  private String hints = null;

  @JsonProperty("oenbId")
  private String oenbId = null;

  @JsonProperty("registerNumber")
  private String registerNumber = null;

  @JsonProperty("naturalPerson")
  private Boolean naturalPerson = null;

  public PersonShortInfo personKey(PersonKey personKey) {
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

  public PersonShortInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
  **/
  @ApiModelProperty(example = "Smith", value = "Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonShortInfo birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-01-01", value = "")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public PersonShortInfo identFlag(String identFlag) {
    this.identFlag = identFlag;
    return this;
  }

  /**
   * Flag Ident Customer
   * @return identFlag
  **/
  @ApiModelProperty(example = "N", value = "Flag Ident Customer")


  public String getIdentFlag() {
    return identFlag;
  }

  public void setIdentFlag(String identFlag) {
    this.identFlag = identFlag;
  }

  public PersonShortInfo address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "Lipa, Batangas", value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PersonShortInfo hints(String hints) {
    this.hints = hints;
    return this;
  }

  /**
   * Get hints
   * @return hints
  **/
  @ApiModelProperty(example = "Hints", value = "")


  public String getHints() {
    return hints;
  }

  public void setHints(String hints) {
    this.hints = hints;
  }

  public PersonShortInfo oenbId(String oenbId) {
    this.oenbId = oenbId;
    return this;
  }

  /**
   * OeNB Identification number
   * @return oenbId
  **/
  @ApiModelProperty(example = "012034587", value = "OeNB Identification number")

@Size(max=9) 
  public String getOenbId() {
    return oenbId;
  }

  public void setOenbId(String oenbId) {
    this.oenbId = oenbId;
  }

  public PersonShortInfo registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

  /**
   * Get registerNumber
   * @return registerNumber
  **/
  @ApiModelProperty(example = "12345", value = "")


  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public PersonShortInfo naturalPerson(Boolean naturalPerson) {
    this.naturalPerson = naturalPerson;
    return this;
  }

  /**
   * Get naturalPerson
   * @return naturalPerson
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isNaturalPerson() {
    return naturalPerson;
  }

  public void setNaturalPerson(Boolean naturalPerson) {
    this.naturalPerson = naturalPerson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonShortInfo personShortInfo = (PersonShortInfo) o;
    return Objects.equals(this.personKey, personShortInfo.personKey) &&
        Objects.equals(this.name, personShortInfo.name) &&
        Objects.equals(this.birthDate, personShortInfo.birthDate) &&
        Objects.equals(this.identFlag, personShortInfo.identFlag) &&
        Objects.equals(this.address, personShortInfo.address) &&
        Objects.equals(this.hints, personShortInfo.hints) &&
        Objects.equals(this.oenbId, personShortInfo.oenbId) &&
        Objects.equals(this.registerNumber, personShortInfo.registerNumber) &&
        Objects.equals(this.naturalPerson, personShortInfo.naturalPerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personKey, name, birthDate, identFlag, address, hints, oenbId, registerNumber, naturalPerson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonShortInfo {\n");
    
    sb.append("    personKey: ").append(toIndentedString(personKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    identFlag: ").append(toIndentedString(identFlag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    oenbId: ").append(toIndentedString(oenbId)).append("\n");
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    naturalPerson: ").append(toIndentedString(naturalPerson)).append("\n");
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

