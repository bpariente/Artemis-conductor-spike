package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonContact;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCustomerContactDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerContactDataResponse   {
  @JsonProperty("personContacts")
  @Valid
  private List<PersonContact> personContacts = null;

  public GetCustomerContactDataResponse personContacts(List<PersonContact> personContacts) {
    this.personContacts = personContacts;
    return this;
  }

  public GetCustomerContactDataResponse addPersonContactsItem(PersonContact personContactsItem) {
    if (this.personContacts == null) {
      this.personContacts = new ArrayList<PersonContact>();
    }
    this.personContacts.add(personContactsItem);
    return this;
  }

  /**
   * Get personContacts
   * @return personContacts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PersonContact> getPersonContacts() {
    return personContacts;
  }

  public void setPersonContacts(List<PersonContact> personContacts) {
    this.personContacts = personContacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerContactDataResponse getCustomerContactDataResponse = (GetCustomerContactDataResponse) o;
    return Objects.equals(this.personContacts, getCustomerContactDataResponse.personContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerContactDataResponse {\n");
    
    sb.append("    personContacts: ").append(toIndentedString(personContacts)).append("\n");
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

