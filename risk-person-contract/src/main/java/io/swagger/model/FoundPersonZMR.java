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
 * person found by ZMR
 */
@ApiModel(description = "person found by ZMR")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class FoundPersonZMR   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("birthDate")
  private Date birthDate = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("topNumber")
  private String topNumber = null;

  @JsonProperty("isLocationCurrent")
  private Boolean isLocationCurrent = null;

  public FoundPersonZMR firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name of person to be checked
   * @return firstName
  **/
  @ApiModelProperty(example = "first name", value = "first name of person to be checked")

@Size(max=255) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FoundPersonZMR name(String name) {
    this.name = name;
    return this;
  }

  /**
   * last name of person to be checked
   * @return name
  **/
  @ApiModelProperty(example = "last name", value = "last name of person to be checked")

@Size(max=255) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FoundPersonZMR birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * The date for the birthdate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-09-07", value = "The date for the birthdate")

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public FoundPersonZMR zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * postal code of person to be checked
   * @return zip
  **/
  @ApiModelProperty(example = "zip code", value = "postal code of person to be checked")

@Size(max=255) 
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public FoundPersonZMR city(String city) {
    this.city = city;
    return this;
  }

  /**
   * city of person to be checked
   * @return city
  **/
  @ApiModelProperty(example = "city", value = "city of person to be checked")

@Size(max=255) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public FoundPersonZMR street(String street) {
    this.street = street;
    return this;
  }

  /**
   * street of person to be checked
   * @return street
  **/
  @ApiModelProperty(example = "street", value = "street of person to be checked")

@Size(max=255) 
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public FoundPersonZMR houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * house number of person to be checked
   * @return houseNumber
  **/
  @ApiModelProperty(example = "house number", value = "house number of person to be checked")

@Size(max=255) 
  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public FoundPersonZMR topNumber(String topNumber) {
    this.topNumber = topNumber;
    return this;
  }

  /**
   * house number of person to be checked
   * @return topNumber
  **/
  @ApiModelProperty(example = "house number", value = "house number of person to be checked")

@Size(max=255) 
  public String getTopNumber() {
    return topNumber;
  }

  public void setTopNumber(String topNumber) {
    this.topNumber = topNumber;
  }

  public FoundPersonZMR isLocationCurrent(Boolean isLocationCurrent) {
    this.isLocationCurrent = isLocationCurrent;
    return this;
  }

  /**
   * defines if this is the current location of the found person
   * @return isLocationCurrent
  **/
  @ApiModelProperty(example = "true", value = "defines if this is the current location of the found person")


  public Boolean isIsLocationCurrent() {
    return isLocationCurrent;
  }

  public void setIsLocationCurrent(Boolean isLocationCurrent) {
    this.isLocationCurrent = isLocationCurrent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundPersonZMR foundPersonZMR = (FoundPersonZMR) o;
    return Objects.equals(this.firstName, foundPersonZMR.firstName) &&
        Objects.equals(this.name, foundPersonZMR.name) &&
        Objects.equals(this.birthDate, foundPersonZMR.birthDate) &&
        Objects.equals(this.zip, foundPersonZMR.zip) &&
        Objects.equals(this.city, foundPersonZMR.city) &&
        Objects.equals(this.street, foundPersonZMR.street) &&
        Objects.equals(this.houseNumber, foundPersonZMR.houseNumber) &&
        Objects.equals(this.topNumber, foundPersonZMR.topNumber) &&
        Objects.equals(this.isLocationCurrent, foundPersonZMR.isLocationCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, name, birthDate, zip, city, street, houseNumber, topNumber, isLocationCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundPersonZMR {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    topNumber: ").append(toIndentedString(topNumber)).append("\n");
    sb.append("    isLocationCurrent: ").append(toIndentedString(isLocationCurrent)).append("\n");
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

