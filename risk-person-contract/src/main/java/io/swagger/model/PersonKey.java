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
 * PersonKey
 */
@ApiModel(description = "PersonKey")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class PersonKey   {
  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  public PersonKey entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity for PersonKey
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "Entity for PersonKey")
  @NotNull


  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public PersonKey customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * CustomerNumber for PersonKey
   * @return customerNumber
  **/
  @ApiModelProperty(required = true, value = "CustomerNumber for PersonKey")
  @NotNull


  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonKey personKey = (PersonKey) o;
    return Objects.equals(this.entity, personKey.entity) &&
        Objects.equals(this.customerNumber, personKey.customerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, customerNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonKey {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
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

