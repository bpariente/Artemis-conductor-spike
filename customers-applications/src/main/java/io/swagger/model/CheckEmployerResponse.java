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
 * CheckEmployerResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:07.136+02:00")

public class CheckEmployerResponse   {
  @JsonProperty("employeeCheck")
  private String employeeCheck = null;

  public CheckEmployerResponse employeeCheck(String employeeCheck) {
    this.employeeCheck = employeeCheck;
    return this;
  }

  /**
   * Solvency Check Response
   * @return employeeCheck
  **/
  @ApiModelProperty(example = "ok", value = "Solvency Check Response")


  public String getEmployeeCheck() {
    return employeeCheck;
  }

  public void setEmployeeCheck(String employeeCheck) {
    this.employeeCheck = employeeCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckEmployerResponse checkEmployerResponse = (CheckEmployerResponse) o;
    return Objects.equals(this.employeeCheck, checkEmployerResponse.employeeCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckEmployerResponse {\n");
    
    sb.append("    employeeCheck: ").append(toIndentedString(employeeCheck)).append("\n");
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

