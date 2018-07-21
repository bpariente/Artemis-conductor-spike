package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FoundPersonZMR;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetAddressCheckZMRResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetAddressCheckZMRResponse   {
  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("decision")
  private Boolean decision = null;

  @JsonProperty("foundPerson")
  private FoundPersonZMR foundPerson = null;

  public GetAddressCheckZMRResponse correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The content of this field can be found in a response, to enable explicit assignment a response to a request. This ID will be a UUID (Universally Unique Identifier)
   * @return correlationId
  **/
  @ApiModelProperty(example = "123456", value = "The content of this field can be found in a response, to enable explicit assignment a response to a request. This ID will be a UUID (Universally Unique Identifier)")


  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public GetAddressCheckZMRResponse decision(Boolean decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * @return decision
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isDecision() {
    return decision;
  }

  public void setDecision(Boolean decision) {
    this.decision = decision;
  }

  public GetAddressCheckZMRResponse foundPerson(FoundPersonZMR foundPerson) {
    this.foundPerson = foundPerson;
    return this;
  }

  /**
   * Get foundPerson
   * @return foundPerson
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FoundPersonZMR getFoundPerson() {
    return foundPerson;
  }

  public void setFoundPerson(FoundPersonZMR foundPerson) {
    this.foundPerson = foundPerson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressCheckZMRResponse getAddressCheckZMRResponse = (GetAddressCheckZMRResponse) o;
    return Objects.equals(this.correlationId, getAddressCheckZMRResponse.correlationId) &&
        Objects.equals(this.decision, getAddressCheckZMRResponse.decision) &&
        Objects.equals(this.foundPerson, getAddressCheckZMRResponse.foundPerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, decision, foundPerson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressCheckZMRResponse {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    foundPerson: ").append(toIndentedString(foundPerson)).append("\n");
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

