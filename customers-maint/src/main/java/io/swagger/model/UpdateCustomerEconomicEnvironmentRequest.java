package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BaseCustomerEconomicEnvironment;
import io.swagger.model.DomesticAddress;
import io.swagger.model.EnumProperty;
import io.swagger.model.PersonKey;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCustomerEconomicEnvironmentRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class UpdateCustomerEconomicEnvironmentRequest extends BaseCustomerEconomicEnvironment  {
  @JsonProperty("personKey")
  private PersonKey personKey = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("yyWorkflowProcess")
  private String yyWorkflowProcess = null;

  public UpdateCustomerEconomicEnvironmentRequest personKey(PersonKey personKey) {
    this.personKey = personKey;
    return this;
  }

  /**
   * Get personKey
   * @return personKey
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonKey getPersonKey() {
    return personKey;
  }

  public void setPersonKey(PersonKey personKey) {
    this.personKey = personKey;
  }

  public UpdateCustomerEconomicEnvironmentRequest account(String account) {
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

  public UpdateCustomerEconomicEnvironmentRequest yyWorkflowProcess(String yyWorkflowProcess) {
    this.yyWorkflowProcess = yyWorkflowProcess;
    return this;
  }

  /**
   * Processname - only for YY-Workflow-Applikation to fill with ACOT for workflows Giro, Spar, Termineinlage
   * @return yyWorkflowProcess
  **/
  @ApiModelProperty(example = "ACOT", value = "Processname - only for YY-Workflow-Applikation to fill with ACOT for workflows Giro, Spar, Termineinlage")

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
    UpdateCustomerEconomicEnvironmentRequest updateCustomerEconomicEnvironmentRequest = (UpdateCustomerEconomicEnvironmentRequest) o;
    return Objects.equals(this.personKey, updateCustomerEconomicEnvironmentRequest.personKey) &&
        Objects.equals(this.account, updateCustomerEconomicEnvironmentRequest.account) &&
        Objects.equals(this.yyWorkflowProcess, updateCustomerEconomicEnvironmentRequest.yyWorkflowProcess) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personKey, account, yyWorkflowProcess, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerEconomicEnvironmentRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

