package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnumProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person to be checked. To identify a person the selectedAddressID, the crifId, name birthdate and address need to be passed
 */
@ApiModel(description = "Person to be checked. To identify a person the selectedAddressID, the crifId, name birthdate and address need to be passed")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class PersonPrivate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("maidenName")
  private String maidenName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("birthDate")
  private Date birthDate = null;

  @JsonProperty("sex")
  private EnumProperty sex = null;

  @JsonProperty("nationality")
  private EnumProperty nationality = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private EnumProperty country = null;

  public PersonPrivate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * last name of person to be checked
   * @return name
  **/
  @ApiModelProperty(example = "lastname", required = true, value = "last name of person to be checked")
  @NotNull

@Size(max=255) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonPrivate maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

  /**
   * maiden name of the person to be checked
   * @return maidenName
  **/
  @ApiModelProperty(example = "maidenname", required = true, value = "maiden name of the person to be checked")
  @NotNull

@Size(max=255) 
  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public PersonPrivate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name of the person to be checked
   * @return firstName
  **/
  @ApiModelProperty(example = "first name", required = true, value = "first name of the person to be checked")
  @NotNull

@Size(max=255) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonPrivate birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * The date for the birthdate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-09-07", required = true, value = "The date for the birthdate")
  @NotNull

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public PersonPrivate sex(EnumProperty sex) {
    this.sex = sex;
    return this;
  }

  /**
   * sex of the user (M/F)
   * @return sex
  **/
  @ApiModelProperty(value = "sex of the user (M/F)")

  @Valid

  public EnumProperty getSex() {
    return sex;
  }

  public void setSex(EnumProperty sex) {
    this.sex = sex;
  }

  public PersonPrivate nationality(EnumProperty nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * nationality (country code - 2-Char ISO-3166 Alpha-2 Code)
   * @return nationality
  **/
  @ApiModelProperty(value = "nationality (country code - 2-Char ISO-3166 Alpha-2 Code)")

  @Valid

  public EnumProperty getNationality() {
    return nationality;
  }

  public void setNationality(EnumProperty nationality) {
    this.nationality = nationality;
  }

  public PersonPrivate street(String street) {
    this.street = street;
    return this;
  }

  /**
   * street name. If not applicable a place name or number can be passed. Housenumber can be passed after a blank space
   * @return street
  **/
  @ApiModelProperty(example = "somestreet", required = true, value = "street name. If not applicable a place name or number can be passed. Housenumber can be passed after a blank space")
  @NotNull

@Size(max=200) 
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PersonPrivate houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * house number. Further details suchas doornumber will be ignored
   * @return houseNumber
  **/
  @ApiModelProperty(example = "3", required = true, value = "house number. Further details suchas doornumber will be ignored")
  @NotNull

@Size(max=50) 
  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public PersonPrivate zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * postal code
   * @return zip
  **/
  @ApiModelProperty(example = "1150", required = true, value = "postal code")
  @NotNull

@Size(max=12) 
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public PersonPrivate city(String city) {
    this.city = city;
    return this;
  }

  /**
   * city / place
   * @return city
  **/
  @ApiModelProperty(example = "vienna", required = true, value = "city / place")
  @NotNull

@Size(max=60) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PersonPrivate country(EnumProperty country) {
    this.country = country;
    return this;
  }

  /**
   * country (country code - 2-Char ISO-3166 Alpha-2 Code)
   * @return country
  **/
  @ApiModelProperty(value = "country (country code - 2-Char ISO-3166 Alpha-2 Code)")

  @Valid

  public EnumProperty getCountry() {
    return country;
  }

  public void setCountry(EnumProperty country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonPrivate personPrivate = (PersonPrivate) o;
    return Objects.equals(this.name, personPrivate.name) &&
        Objects.equals(this.maidenName, personPrivate.maidenName) &&
        Objects.equals(this.firstName, personPrivate.firstName) &&
        Objects.equals(this.birthDate, personPrivate.birthDate) &&
        Objects.equals(this.sex, personPrivate.sex) &&
        Objects.equals(this.nationality, personPrivate.nationality) &&
        Objects.equals(this.street, personPrivate.street) &&
        Objects.equals(this.houseNumber, personPrivate.houseNumber) &&
        Objects.equals(this.zip, personPrivate.zip) &&
        Objects.equals(this.city, personPrivate.city) &&
        Objects.equals(this.country, personPrivate.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maidenName, firstName, birthDate, sex, nationality, street, houseNumber, zip, city, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPrivate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

