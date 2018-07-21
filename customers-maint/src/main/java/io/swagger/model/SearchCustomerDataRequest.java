package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchCustomerDataRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class SearchCustomerDataRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("registerNumber")
  private String registerNumber = null;

  @JsonProperty("phoneticSearch")
  private Boolean phoneticSearch = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("oenbId")
  private String oenbId = null;

  @JsonProperty("maxHostCalls")
  private Integer maxHostCalls = null;

  public SearchCustomerDataRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer Surname
   * @return name
  **/
  @ApiModelProperty(example = "Young", value = "Customer Surname")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SearchCustomerDataRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Customer First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "Young", value = "Customer First Name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SearchCustomerDataRequest birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Customer Birth Date
   * @return birthDate
  **/
  @ApiModelProperty(example = "1990-01-01", value = "Customer Birth Date")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public SearchCustomerDataRequest registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

  /**
   * Customer Register Number
   * @return registerNumber
  **/
  @ApiModelProperty(example = "123456", value = "Customer Register Number")


  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public SearchCustomerDataRequest phoneticSearch(Boolean phoneticSearch) {
    this.phoneticSearch = phoneticSearch;
    return this;
  }

  /**
   * Phonetic Search Option
   * @return phoneticSearch
  **/
  @ApiModelProperty(example = "true", value = "Phonetic Search Option")


  public Boolean isPhoneticSearch() {
    return phoneticSearch;
  }

  public void setPhoneticSearch(Boolean phoneticSearch) {
    this.phoneticSearch = phoneticSearch;
  }

  public SearchCustomerDataRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Customer Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(example = "1010", value = "Customer Postal Code")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public SearchCustomerDataRequest street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street name
   * @return street
  **/
  @ApiModelProperty(example = "Karlsplatz", value = "Street name")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public SearchCustomerDataRequest oenbId(String oenbId) {
    this.oenbId = oenbId;
    return this;
  }

  /**
   * Applicable for Legal Customers
   * @return oenbId
  **/
  @ApiModelProperty(example = "12345", value = "Applicable for Legal Customers")


  public String getOenbId() {
    return oenbId;
  }

  public void setOenbId(String oenbId) {
    this.oenbId = oenbId;
  }

  public SearchCustomerDataRequest maxHostCalls(Integer maxHostCalls) {
    this.maxHostCalls = maxHostCalls;
    return this;
  }

  /**
   * Backend filter for searching
   * @return maxHostCalls
  **/
  @ApiModelProperty(example = "1", value = "Backend filter for searching")


  public Integer getMaxHostCalls() {
    return maxHostCalls;
  }

  public void setMaxHostCalls(Integer maxHostCalls) {
    this.maxHostCalls = maxHostCalls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCustomerDataRequest searchCustomerDataRequest = (SearchCustomerDataRequest) o;
    return Objects.equals(this.name, searchCustomerDataRequest.name) &&
        Objects.equals(this.firstName, searchCustomerDataRequest.firstName) &&
        Objects.equals(this.birthDate, searchCustomerDataRequest.birthDate) &&
        Objects.equals(this.registerNumber, searchCustomerDataRequest.registerNumber) &&
        Objects.equals(this.phoneticSearch, searchCustomerDataRequest.phoneticSearch) &&
        Objects.equals(this.postalCode, searchCustomerDataRequest.postalCode) &&
        Objects.equals(this.street, searchCustomerDataRequest.street) &&
        Objects.equals(this.oenbId, searchCustomerDataRequest.oenbId) &&
        Objects.equals(this.maxHostCalls, searchCustomerDataRequest.maxHostCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstName, birthDate, registerNumber, phoneticSearch, postalCode, street, oenbId, maxHostCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCustomerDataRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    phoneticSearch: ").append(toIndentedString(phoneticSearch)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    oenbId: ").append(toIndentedString(oenbId)).append("\n");
    sb.append("    maxHostCalls: ").append(toIndentedString(maxHostCalls)).append("\n");
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

