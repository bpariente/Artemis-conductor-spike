package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonKey;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateCustomerBasicDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class CreateCustomerBasicDataResponse   {
  @JsonProperty("personKey")
  private PersonKey personKey = null;

  public CreateCustomerBasicDataResponse personKey(PersonKey personKey) {
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
    CreateCustomerBasicDataResponse createCustomerBasicDataResponse = (CreateCustomerBasicDataResponse) o;
    return Objects.equals(this.personKey, createCustomerBasicDataResponse.personKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerBasicDataResponse {\n");
    
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

