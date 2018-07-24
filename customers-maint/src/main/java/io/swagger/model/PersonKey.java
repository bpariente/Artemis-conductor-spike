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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class PersonKey   {
  @JsonProperty("personNumber")
  private String personNumber = null;

  @JsonProperty("entity")
  private String entity = null;

  public PersonKey personNumber(String personNumber) {
    this.personNumber = personNumber;
    return this;
  }

  public PersonKey(String personNumber, String entity) {
    this.personNumber = personNumber;
    this.entity = entity;
  }

  /**
   * Person Number
   * @return personNumber
  **/
  @ApiModelProperty(example = "00000001", required = true, value = "Person Number")
  @NotNull

@Size(max=8) 
  public String getPersonNumber() {
    return personNumber;
  }

  public void setPersonNumber(String personNumber) {
    this.personNumber = personNumber;
  }

  public PersonKey entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity
   * @return entity
  **/
  @ApiModelProperty(example = "0100", required = true, value = "Entity")
  @NotNull

@Size(max=4) 
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
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
    return Objects.equals(this.personNumber, personKey.personNumber) &&
        Objects.equals(this.entity, personKey.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personNumber, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonKey {\n");
    
    sb.append("    personNumber: ").append(toIndentedString(personNumber)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

