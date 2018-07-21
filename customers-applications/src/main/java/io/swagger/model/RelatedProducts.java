package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedProducts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:07.136+02:00")

public class RelatedProducts   {
  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("productTypeText")
  private String productTypeText = null;

  @JsonProperty("subProductText")
  private String subProductText = null;

  @JsonProperty("productRelationText")
  private String productRelationText = null;

  @JsonProperty("accountManagementText")
  private String accountManagementText = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("stateText")
  private String stateText = null;

  @JsonProperty("accountTypeCode")
  private String accountTypeCode = null;

  @JsonProperty("numCon")
  private String numCon = null;

  @JsonProperty("accountManager")
  private String accountManager = null;

  @JsonProperty("flagAut")
  private String flagAut = null;

  @JsonProperty("participationType")
  private String participationType = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("blockedText")
  private String blockedText = null;

  @JsonProperty("accountOfWardText")
  private String accountOfWardText = null;

  @JsonProperty("flagJoint")
  private String flagJoint = null;

  public RelatedProducts productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Product Code
   * @return productCode
  **/
  @ApiModelProperty(example = "M00S", value = "Product Code")


  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public RelatedProducts account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public RelatedProducts productTypeText(String productTypeText) {
    this.productTypeText = productTypeText;
    return this;
  }

  /**
   * Product Type Text
   * @return productTypeText
  **/
  @ApiModelProperty(example = "Kreditkarte Eigen", value = "Product Type Text")


  public String getProductTypeText() {
    return productTypeText;
  }

  public void setProductTypeText(String productTypeText) {
    this.productTypeText = productTypeText;
  }

  public RelatedProducts subProductText(String subProductText) {
    this.subProductText = subProductText;
    return this;
  }

  /**
   * Sub Product Text
   * @return subProductText
  **/
  @ApiModelProperty(example = "BAWAG MasterCard", value = "Sub Product Text")


  public String getSubProductText() {
    return subProductText;
  }

  public void setSubProductText(String subProductText) {
    this.subProductText = subProductText;
  }

  public RelatedProducts productRelationText(String productRelationText) {
    this.productRelationText = productRelationText;
    return this;
  }

  /**
   * Product Relation Text
   * @return productRelationText
  **/
  @ApiModelProperty(example = "Inhaber", value = "Product Relation Text")


  public String getProductRelationText() {
    return productRelationText;
  }

  public void setProductRelationText(String productRelationText) {
    this.productRelationText = productRelationText;
  }

  public RelatedProducts accountManagementText(String accountManagementText) {
    this.accountManagementText = accountManagementText;
    return this;
  }

  /**
   * Account Management Text
   * @return accountManagementText
  **/
  @ApiModelProperty(example = "01", value = "Account Management Text")


  public String getAccountManagementText() {
    return accountManagementText;
  }

  public void setAccountManagementText(String accountManagementText) {
    this.accountManagementText = accountManagementText;
  }

  public RelatedProducts currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", value = "currency")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RelatedProducts balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * balance
   * @return balance
  **/
  @ApiModelProperty(example = "1100.0", value = "balance")

  @Valid

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public RelatedProducts stateText(String stateText) {
    this.stateText = stateText;
    return this;
  }

  /**
   * State Text
   * @return stateText
  **/
  @ApiModelProperty(example = "INAKTIV", value = "State Text")


  public String getStateText() {
    return stateText;
  }

  public void setStateText(String stateText) {
    this.stateText = stateText;
  }

  public RelatedProducts accountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

  /**
   * Account Type Code
   * @return accountTypeCode
  **/
  @ApiModelProperty(example = "50", value = "Account Type Code")


  public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public RelatedProducts numCon(String numCon) {
    this.numCon = numCon;
    return this;
  }

  /**
   * numCon
   * @return numCon
  **/
  @ApiModelProperty(example = "03700402320", value = "numCon")


  public String getNumCon() {
    return numCon;
  }

  public void setNumCon(String numCon) {
    this.numCon = numCon;
  }

  public RelatedProducts accountManager(String accountManager) {
    this.accountManager = accountManager;
    return this;
  }

  /**
   * Account Manager
   * @return accountManager
  **/
  @ApiModelProperty(example = "01000376KKB6", value = "Account Manager")


  public String getAccountManager() {
    return accountManager;
  }

  public void setAccountManager(String accountManager) {
    this.accountManager = accountManager;
  }

  public RelatedProducts flagAut(String flagAut) {
    this.flagAut = flagAut;
    return this;
  }

  /**
   * FlagAut
   * @return flagAut
  **/
  @ApiModelProperty(example = "Y", value = "FlagAut")


  public String getFlagAut() {
    return flagAut;
  }

  public void setFlagAut(String flagAut) {
    this.flagAut = flagAut;
  }

  public RelatedProducts participationType(String participationType) {
    this.participationType = participationType;
    return this;
  }

  /**
   * Participation Type
   * @return participationType
  **/
  @ApiModelProperty(example = "T", value = "Participation Type")


  public String getParticipationType() {
    return participationType;
  }

  public void setParticipationType(String participationType) {
    this.participationType = participationType;
  }

  public RelatedProducts iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN Account of the Customer
   * @return iban
  **/
  @ApiModelProperty(example = "AT441400003700402320", value = "IBAN Account of the Customer")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public RelatedProducts blockedText(String blockedText) {
    this.blockedText = blockedText;
    return this;
  }

  /**
   * Blocked Text
   * @return blockedText
  **/
  @ApiModelProperty(example = "NEIN", value = "Blocked Text")


  public String getBlockedText() {
    return blockedText;
  }

  public void setBlockedText(String blockedText) {
    this.blockedText = blockedText;
  }

  public RelatedProducts accountOfWardText(String accountOfWardText) {
    this.accountOfWardText = accountOfWardText;
    return this;
  }

  /**
   * Account Of Ward Text
   * @return accountOfWardText
  **/
  @ApiModelProperty(example = "NEIN", value = "Account Of Ward Text")


  public String getAccountOfWardText() {
    return accountOfWardText;
  }

  public void setAccountOfWardText(String accountOfWardText) {
    this.accountOfWardText = accountOfWardText;
  }

  public RelatedProducts flagJoint(String flagJoint) {
    this.flagJoint = flagJoint;
    return this;
  }

  /**
   * Flag Joint
   * @return flagJoint
  **/
  @ApiModelProperty(example = "Y", value = "Flag Joint")


  public String getFlagJoint() {
    return flagJoint;
  }

  public void setFlagJoint(String flagJoint) {
    this.flagJoint = flagJoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedProducts relatedProducts = (RelatedProducts) o;
    return Objects.equals(this.productCode, relatedProducts.productCode) &&
        Objects.equals(this.account, relatedProducts.account) &&
        Objects.equals(this.productTypeText, relatedProducts.productTypeText) &&
        Objects.equals(this.subProductText, relatedProducts.subProductText) &&
        Objects.equals(this.productRelationText, relatedProducts.productRelationText) &&
        Objects.equals(this.accountManagementText, relatedProducts.accountManagementText) &&
        Objects.equals(this.currency, relatedProducts.currency) &&
        Objects.equals(this.balance, relatedProducts.balance) &&
        Objects.equals(this.stateText, relatedProducts.stateText) &&
        Objects.equals(this.accountTypeCode, relatedProducts.accountTypeCode) &&
        Objects.equals(this.numCon, relatedProducts.numCon) &&
        Objects.equals(this.accountManager, relatedProducts.accountManager) &&
        Objects.equals(this.flagAut, relatedProducts.flagAut) &&
        Objects.equals(this.participationType, relatedProducts.participationType) &&
        Objects.equals(this.iban, relatedProducts.iban) &&
        Objects.equals(this.blockedText, relatedProducts.blockedText) &&
        Objects.equals(this.accountOfWardText, relatedProducts.accountOfWardText) &&
        Objects.equals(this.flagJoint, relatedProducts.flagJoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, account, productTypeText, subProductText, productRelationText, accountManagementText, currency, balance, stateText, accountTypeCode, numCon, accountManager, flagAut, participationType, iban, blockedText, accountOfWardText, flagJoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedProducts {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    productTypeText: ").append(toIndentedString(productTypeText)).append("\n");
    sb.append("    subProductText: ").append(toIndentedString(subProductText)).append("\n");
    sb.append("    productRelationText: ").append(toIndentedString(productRelationText)).append("\n");
    sb.append("    accountManagementText: ").append(toIndentedString(accountManagementText)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    numCon: ").append(toIndentedString(numCon)).append("\n");
    sb.append("    accountManager: ").append(toIndentedString(accountManager)).append("\n");
    sb.append("    flagAut: ").append(toIndentedString(flagAut)).append("\n");
    sb.append("    participationType: ").append(toIndentedString(participationType)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    blockedText: ").append(toIndentedString(blockedText)).append("\n");
    sb.append("    accountOfWardText: ").append(toIndentedString(accountOfWardText)).append("\n");
    sb.append("    flagJoint: ").append(toIndentedString(flagJoint)).append("\n");
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

