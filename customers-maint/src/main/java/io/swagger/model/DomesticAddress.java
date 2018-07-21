package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DomesticAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class DomesticAddress   {
  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("street")
  private String street = null;

  public DomesticAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(example = "1621", value = "Postal Code")

@Size(max=34) 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public DomesticAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "Amsterdam", value = "City")

@Size(max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public DomesticAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street
   * @return street
  **/
  @ApiModelProperty(example = "Elm St.", value = "Street")

@Size(max=35) 
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticAddress domesticAddress = (DomesticAddress) o;
    return Objects.equals(this.postalCode, domesticAddress.postalCode) &&
        Objects.equals(this.city, domesticAddress.city) &&
        Objects.equals(this.street, domesticAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, city, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticAddress {\n");
    
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

