package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonExtendedWarning;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Get Person Extended Warning
 */
@ApiModel(description = "Get Person Extended Warning")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetPersonExternalWarningsResponse   {
  @JsonProperty("personExtendedWarning")
  @Valid
  private List<PersonExtendedWarning> personExtendedWarning = null;

  public GetPersonExternalWarningsResponse personExtendedWarning(List<PersonExtendedWarning> personExtendedWarning) {
    this.personExtendedWarning = personExtendedWarning;
    return this;
  }

  public GetPersonExternalWarningsResponse addPersonExtendedWarningItem(PersonExtendedWarning personExtendedWarningItem) {
    if (this.personExtendedWarning == null) {
      this.personExtendedWarning = new ArrayList<PersonExtendedWarning>();
    }
    this.personExtendedWarning.add(personExtendedWarningItem);
    return this;
  }

  /**
   * Arraylist of PersonExtendedWarning
   * @return personExtendedWarning
  **/
  @ApiModelProperty(value = "Arraylist of PersonExtendedWarning")

  @Valid

  public List<PersonExtendedWarning> getPersonExtendedWarning() {
    return personExtendedWarning;
  }

  public void setPersonExtendedWarning(List<PersonExtendedWarning> personExtendedWarning) {
    this.personExtendedWarning = personExtendedWarning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPersonExternalWarningsResponse getPersonExternalWarningsResponse = (GetPersonExternalWarningsResponse) o;
    return Objects.equals(this.personExtendedWarning, getPersonExternalWarningsResponse.personExtendedWarning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personExtendedWarning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPersonExternalWarningsResponse {\n");
    
    sb.append("    personExtendedWarning: ").append(toIndentedString(personExtendedWarning)).append("\n");
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

