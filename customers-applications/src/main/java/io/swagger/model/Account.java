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
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:07.136+02:00")

public class Account   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  public Account accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account Number
   * @return accountNumber
  **/
  @ApiModelProperty(example = "00000003030", required = true, value = "Account Number")
  @NotNull

@Size(max=11) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Account bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Bank Code
   * @return bankCode
  **/
  @ApiModelProperty(example = "14000", required = true, value = "Bank Code")
  @NotNull

@Size(max=5) 
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.bankCode, account.bankCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
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

