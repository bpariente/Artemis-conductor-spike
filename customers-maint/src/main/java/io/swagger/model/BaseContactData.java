package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonContact;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaseContactData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "subType", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = CreateCustomerContactDataRequest.class, name = "CreateCustomerContactDataRequest"),
  @JsonSubTypes.Type(value = UpdateCustomerContactDataRequest.class, name = "UpdateCustomerContactDataRequest"),
})

public class BaseContactData   {
  @JsonProperty("personContact")
  private PersonContact personContact = null;

  public BaseContactData personContact(PersonContact personContact) {
    this.personContact = personContact;
    return this;
  }

  /**
   * Get personContact
   * @return personContact
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    BaseContactData baseContactData = (BaseContactData) o;
    return Objects.equals(this.personContact, baseContactData.personContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseContactData {\n");
    
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

