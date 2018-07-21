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
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:07.136+02:00")

public class PersonKey   {
  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("personNumber")
  private String personNumber = null;

  public PersonKey entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * ENTITY-CODE
   * @return entity
  **/
  @ApiModelProperty(example = "0100", required = true, value = "ENTITY-CODE")
  @NotNull


  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public PersonKey personNumber(String personNumber) {
    this.personNumber = personNumber;
    return this;
  }

  /**
   * CUSTOMER NUMBER
   * @return personNumber
  **/
  @ApiModelProperty(example = "00000001", required = true, value = "CUSTOMER NUMBER")
  @NotNull


  public String getPersonNumber() {
    return personNumber;
  }

  public void setPersonNumber(String personNumber) {
    this.personNumber = personNumber;
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
        Objects.equals(this.personNumber, personKey.personNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, personNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonKey {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    personNumber: ").append(toIndentedString(personNumber)).append("\n");
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

