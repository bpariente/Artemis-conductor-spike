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
 * GetCustomerExternalRelationTypeResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerExternalRelationTypeResponse   {
  @JsonProperty("externalId")
  private String externalId = null;

  public GetCustomerExternalRelationTypeResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * EXTERNAL ID
   * @return externalId
  **/
  @ApiModelProperty(example = "Testing", value = "EXTERNAL ID")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerExternalRelationTypeResponse getCustomerExternalRelationTypeResponse = (GetCustomerExternalRelationTypeResponse) o;
    return Objects.equals(this.externalId, getCustomerExternalRelationTypeResponse.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerExternalRelationTypeResponse {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

