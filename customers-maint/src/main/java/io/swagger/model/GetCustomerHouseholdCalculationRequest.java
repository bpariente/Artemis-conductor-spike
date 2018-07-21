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
 * GetCustomerHouseholdCalculationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerHouseholdCalculationRequest   {
  @JsonProperty("personKey")
  private PersonKey personKey = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("yyWorkflowProcess")
  private String yyWorkflowProcess = null;

  public GetCustomerHouseholdCalculationRequest personKey(PersonKey personKey) {
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

  public GetCustomerHouseholdCalculationRequest account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Account IBAN
   * @return account
  **/
  @ApiModelProperty(example = "AT231420020012596430", value = "Account IBAN")

@Size(min=1) 
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public GetCustomerHouseholdCalculationRequest yyWorkflowProcess(String yyWorkflowProcess) {
    this.yyWorkflowProcess = yyWorkflowProcess;
    return this;
  }

  /**
   * YY Workflow process
   * @return yyWorkflowProcess
  **/
  @ApiModelProperty(example = "ACOT", value = "YY Workflow process")

@Size(max=4) 
  public String getYyWorkflowProcess() {
    return yyWorkflowProcess;
  }

  public void setYyWorkflowProcess(String yyWorkflowProcess) {
    this.yyWorkflowProcess = yyWorkflowProcess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerHouseholdCalculationRequest getCustomerHouseholdCalculationRequest = (GetCustomerHouseholdCalculationRequest) o;
    return Objects.equals(this.personKey, getCustomerHouseholdCalculationRequest.personKey) &&
        Objects.equals(this.account, getCustomerHouseholdCalculationRequest.account) &&
        Objects.equals(this.yyWorkflowProcess, getCustomerHouseholdCalculationRequest.yyWorkflowProcess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personKey, account, yyWorkflowProcess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerHouseholdCalculationRequest {\n");
    
    sb.append("    personKey: ").append(toIndentedString(personKey)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    yyWorkflowProcess: ").append(toIndentedString(yyWorkflowProcess)).append("\n");
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

