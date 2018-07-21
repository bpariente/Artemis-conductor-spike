package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonContact;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateCustomerContactDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class CreateCustomerContactDataResponse   {
  @JsonProperty("personContact")
  private PersonContact personContact = null;

  public CreateCustomerContactDataResponse personContact(PersonContact personContact) {
    this.personContact = personContact;
    return this;
  }

  /**
   * Get personContact
   * @return personContact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonContact getPersonContact() {
    return personContact;
  }

  public void setPersonContact(PersonContact personContact) {
    this.personContact = personContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomerContactDataResponse createCustomerContactDataResponse = (CreateCustomerContactDataResponse) o;
    return Objects.equals(this.personContact, createCustomerContactDataResponse.personContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerContactDataResponse {\n");
    
    sb.append("    personContact: ").append(toIndentedString(personContact)).append("\n");
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

