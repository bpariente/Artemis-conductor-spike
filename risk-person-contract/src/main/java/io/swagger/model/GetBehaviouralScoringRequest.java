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
 * GetBehaviouralScoringRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetBehaviouralScoringRequest   {
  @JsonProperty("personKey")
  private PersonKey personKey = null;

  public GetBehaviouralScoringRequest personKey(PersonKey personKey) {
    this.personKey = personKey;
    return this;
  }

  /**
   * Get personKey
   * @return personKey
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    GetBehaviouralScoringRequest getBehaviouralScoringRequest = (GetBehaviouralScoringRequest) o;
    return Objects.equals(this.personKey, getBehaviouralScoringRequest.personKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBehaviouralScoringRequest {\n");
    
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

