package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonKey;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Promotions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class Promotions   {
  @JsonProperty("customer")
  private PersonKey customer = null;

  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("promotionCode")
  private String promotionCode = null;

  @JsonProperty("productFamily")
  private String productFamily = null;

  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("productShortDescription")
  private String productShortDescription = null;

  @JsonProperty("productDescription")
  private String productDescription = null;

  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("feeCode")
  private String feeCode = null;

  @JsonProperty("feeShortDescription")
  private String feeShortDescription = null;

  @JsonProperty("feeDescription")
  private String feeDescription = null;

  @JsonProperty("specialConditionType")
  private String specialConditionType = null;

  @JsonProperty("specialConditionChunk")
  private BigDecimal specialConditionChunk = null;

  @JsonProperty("specialConditionLumpSum")
  private BigDecimal specialConditionLumpSum = null;

  @JsonProperty("specialConditionPercentage")
  private BigDecimal specialConditionPercentage = null;

  @JsonProperty("specialConditionRuntime")
  private Integer specialConditionRuntime = null;

  @JsonProperty("specialConditionUntil")
  private LocalDate specialConditionUntil = null;

  @JsonProperty("specialFeePlanCode")
  private String specialFeePlanCode = null;

  @JsonProperty("specialFeePlanDescription")
  private String specialFeePlanDescription = null;

  @JsonProperty("nonRecurringBonusCreditnote")
  private BigDecimal nonRecurringBonusCreditnote = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validThru")
  private OffsetDateTime validThru = null;

  public Promotions customer(PersonKey customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonKey getCustomer() {
    return customer;
  }

  public void setCustomer(PersonKey customer) {
    this.customer = customer;
  }

  public Promotions entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity
   * @return entity
  **/
  @ApiModelProperty(example = "0100", value = "Entity")


  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public Promotions promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  /**
   * Promotion Code
   * @return promotionCode
  **/
  @ApiModelProperty(value = "Promotion Code")


  public String getPromotionCode() {
    return promotionCode;
  }

  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  public Promotions productFamily(String productFamily) {
    this.productFamily = productFamily;
    return this;
  }

  /**
   * Product Family
   * @return productFamily
  **/
  @ApiModelProperty(example = "96", value = "Product Family")


  public String getProductFamily() {
    return productFamily;
  }

  public void setProductFamily(String productFamily) {
    this.productFamily = productFamily;
  }

  public Promotions productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Product Code
   * @return productCode
  **/
  @ApiModelProperty(example = "S118", value = "Product Code")


  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public Promotions productShortDescription(String productShortDescription) {
    this.productShortDescription = productShortDescription;
    return this;
  }

  /**
   * Product Short Description
   * @return productShortDescription
  **/
  @ApiModelProperty(example = "SuperschnellKredit", value = "Product Short Description")


  public String getProductShortDescription() {
    return productShortDescription;
  }

  public void setProductShortDescription(String productShortDescription) {
    this.productShortDescription = productShortDescription;
  }

  public Promotions productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Product Description
   * @return productDescription
  **/
  @ApiModelProperty(example = "SchnellKredit", value = "Product Description")


  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Promotions channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * channel
   * @return channel
  **/
  @ApiModelProperty(value = "channel")


  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Promotions feeCode(String feeCode) {
    this.feeCode = feeCode;
    return this;
  }

  /**
   * feeCode
   * @return feeCode
  **/
  @ApiModelProperty(value = "feeCode")


  public String getFeeCode() {
    return feeCode;
  }

  public void setFeeCode(String feeCode) {
    this.feeCode = feeCode;
  }

  public Promotions feeShortDescription(String feeShortDescription) {
    this.feeShortDescription = feeShortDescription;
    return this;
  }

  /**
   * Fee Short Description
   * @return feeShortDescription
  **/
  @ApiModelProperty(value = "Fee Short Description")


  public String getFeeShortDescription() {
    return feeShortDescription;
  }

  public void setFeeShortDescription(String feeShortDescription) {
    this.feeShortDescription = feeShortDescription;
  }

  public Promotions feeDescription(String feeDescription) {
    this.feeDescription = feeDescription;
    return this;
  }

  /**
   * Fee Description
   * @return feeDescription
  **/
  @ApiModelProperty(value = "Fee Description")


  public String getFeeDescription() {
    return feeDescription;
  }

  public void setFeeDescription(String feeDescription) {
    this.feeDescription = feeDescription;
  }

  public Promotions specialConditionType(String specialConditionType) {
    this.specialConditionType = specialConditionType;
    return this;
  }

  /**
   * Special Condition Type
   * @return specialConditionType
  **/
  @ApiModelProperty(example = "3", value = "Special Condition Type")


  public String getSpecialConditionType() {
    return specialConditionType;
  }

  public void setSpecialConditionType(String specialConditionType) {
    this.specialConditionType = specialConditionType;
  }

  public Promotions specialConditionChunk(BigDecimal specialConditionChunk) {
    this.specialConditionChunk = specialConditionChunk;
    return this;
  }

  /**
   * Special Condition Chunk
   * @return specialConditionChunk
  **/
  @ApiModelProperty(value = "Special Condition Chunk")

  @Valid

  public BigDecimal getSpecialConditionChunk() {
    return specialConditionChunk;
  }

  public void setSpecialConditionChunk(BigDecimal specialConditionChunk) {
    this.specialConditionChunk = specialConditionChunk;
  }

  public Promotions specialConditionLumpSum(BigDecimal specialConditionLumpSum) {
    this.specialConditionLumpSum = specialConditionLumpSum;
    return this;
  }

  /**
   * Special Condition LumpSum
   * @return specialConditionLumpSum
  **/
  @ApiModelProperty(value = "Special Condition LumpSum")

  @Valid

  public BigDecimal getSpecialConditionLumpSum() {
    return specialConditionLumpSum;
  }

  public void setSpecialConditionLumpSum(BigDecimal specialConditionLumpSum) {
    this.specialConditionLumpSum = specialConditionLumpSum;
  }

  public Promotions specialConditionPercentage(BigDecimal specialConditionPercentage) {
    this.specialConditionPercentage = specialConditionPercentage;
    return this;
  }

  /**
   * Special Condition Percentage
   * @return specialConditionPercentage
  **/
  @ApiModelProperty(value = "Special Condition Percentage")

  @Valid

  public BigDecimal getSpecialConditionPercentage() {
    return specialConditionPercentage;
  }

  public void setSpecialConditionPercentage(BigDecimal specialConditionPercentage) {
    this.specialConditionPercentage = specialConditionPercentage;
  }

  public Promotions specialConditionRuntime(Integer specialConditionRuntime) {
    this.specialConditionRuntime = specialConditionRuntime;
    return this;
  }

  /**
   * Special Condition Runtime
   * @return specialConditionRuntime
  **/
  @ApiModelProperty(value = "Special Condition Runtime")


  public Integer getSpecialConditionRuntime() {
    return specialConditionRuntime;
  }

  public void setSpecialConditionRuntime(Integer specialConditionRuntime) {
    this.specialConditionRuntime = specialConditionRuntime;
  }

  public Promotions specialConditionUntil(LocalDate specialConditionUntil) {
    this.specialConditionUntil = specialConditionUntil;
    return this;
  }

  /**
   * Special Condition Until
   * @return specialConditionUntil
  **/
  @ApiModelProperty(example = "2015-05-26T00:00:00.000+0000", value = "Special Condition Until")

  @Valid

  public LocalDate getSpecialConditionUntil() {
    return specialConditionUntil;
  }

  public void setSpecialConditionUntil(LocalDate specialConditionUntil) {
    this.specialConditionUntil = specialConditionUntil;
  }

  public Promotions specialFeePlanCode(String specialFeePlanCode) {
    this.specialFeePlanCode = specialFeePlanCode;
    return this;
  }

  /**
   * Special Fee Plan Code
   * @return specialFeePlanCode
  **/
  @ApiModelProperty(value = "Special Fee Plan Code")


  public String getSpecialFeePlanCode() {
    return specialFeePlanCode;
  }

  public void setSpecialFeePlanCode(String specialFeePlanCode) {
    this.specialFeePlanCode = specialFeePlanCode;
  }

  public Promotions specialFeePlanDescription(String specialFeePlanDescription) {
    this.specialFeePlanDescription = specialFeePlanDescription;
    return this;
  }

  /**
   * Special Fee Plan Description
   * @return specialFeePlanDescription
  **/
  @ApiModelProperty(value = "Special Fee Plan Description")


  public String getSpecialFeePlanDescription() {
    return specialFeePlanDescription;
  }

  public void setSpecialFeePlanDescription(String specialFeePlanDescription) {
    this.specialFeePlanDescription = specialFeePlanDescription;
  }

  public Promotions nonRecurringBonusCreditnote(BigDecimal nonRecurringBonusCreditnote) {
    this.nonRecurringBonusCreditnote = nonRecurringBonusCreditnote;
    return this;
  }

  /**
   * Special Condition Percentage
   * @return nonRecurringBonusCreditnote
  **/
  @ApiModelProperty(example = "50.0", value = "Special Condition Percentage")

  @Valid

  public BigDecimal getNonRecurringBonusCreditnote() {
    return nonRecurringBonusCreditnote;
  }

  public void setNonRecurringBonusCreditnote(BigDecimal nonRecurringBonusCreditnote) {
    this.nonRecurringBonusCreditnote = nonRecurringBonusCreditnote;
  }

  public Promotions validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Valid From
   * @return validFrom
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Valid From")

  @Valid

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public Promotions validThru(OffsetDateTime validThru) {
    this.validThru = validThru;
    return this;
  }

  /**
   * Valid Thru
   * @return validThru
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Valid Thru")

  @Valid

  public OffsetDateTime getValidThru() {
    return validThru;
  }

  public void setValidThru(OffsetDateTime validThru) {
    this.validThru = validThru;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotions promotions = (Promotions) o;
    return Objects.equals(this.customer, promotions.customer) &&
        Objects.equals(this.entity, promotions.entity) &&
        Objects.equals(this.promotionCode, promotions.promotionCode) &&
        Objects.equals(this.productFamily, promotions.productFamily) &&
        Objects.equals(this.productCode, promotions.productCode) &&
        Objects.equals(this.productShortDescription, promotions.productShortDescription) &&
        Objects.equals(this.productDescription, promotions.productDescription) &&
        Objects.equals(this.channel, promotions.channel) &&
        Objects.equals(this.feeCode, promotions.feeCode) &&
        Objects.equals(this.feeShortDescription, promotions.feeShortDescription) &&
        Objects.equals(this.feeDescription, promotions.feeDescription) &&
        Objects.equals(this.specialConditionType, promotions.specialConditionType) &&
        Objects.equals(this.specialConditionChunk, promotions.specialConditionChunk) &&
        Objects.equals(this.specialConditionLumpSum, promotions.specialConditionLumpSum) &&
        Objects.equals(this.specialConditionPercentage, promotions.specialConditionPercentage) &&
        Objects.equals(this.specialConditionRuntime, promotions.specialConditionRuntime) &&
        Objects.equals(this.specialConditionUntil, promotions.specialConditionUntil) &&
        Objects.equals(this.specialFeePlanCode, promotions.specialFeePlanCode) &&
        Objects.equals(this.specialFeePlanDescription, promotions.specialFeePlanDescription) &&
        Objects.equals(this.nonRecurringBonusCreditnote, promotions.nonRecurringBonusCreditnote) &&
        Objects.equals(this.validFrom, promotions.validFrom) &&
        Objects.equals(this.validThru, promotions.validThru);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, entity, promotionCode, productFamily, productCode, productShortDescription, productDescription, channel, feeCode, feeShortDescription, feeDescription, specialConditionType, specialConditionChunk, specialConditionLumpSum, specialConditionPercentage, specialConditionRuntime, specialConditionUntil, specialFeePlanCode, specialFeePlanDescription, nonRecurringBonusCreditnote, validFrom, validThru);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotions {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    promotionCode: ").append(toIndentedString(promotionCode)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productShortDescription: ").append(toIndentedString(productShortDescription)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    feeCode: ").append(toIndentedString(feeCode)).append("\n");
    sb.append("    feeShortDescription: ").append(toIndentedString(feeShortDescription)).append("\n");
    sb.append("    feeDescription: ").append(toIndentedString(feeDescription)).append("\n");
    sb.append("    specialConditionType: ").append(toIndentedString(specialConditionType)).append("\n");
    sb.append("    specialConditionChunk: ").append(toIndentedString(specialConditionChunk)).append("\n");
    sb.append("    specialConditionLumpSum: ").append(toIndentedString(specialConditionLumpSum)).append("\n");
    sb.append("    specialConditionPercentage: ").append(toIndentedString(specialConditionPercentage)).append("\n");
    sb.append("    specialConditionRuntime: ").append(toIndentedString(specialConditionRuntime)).append("\n");
    sb.append("    specialConditionUntil: ").append(toIndentedString(specialConditionUntil)).append("\n");
    sb.append("    specialFeePlanCode: ").append(toIndentedString(specialFeePlanCode)).append("\n");
    sb.append("    specialFeePlanDescription: ").append(toIndentedString(specialFeePlanDescription)).append("\n");
    sb.append("    nonRecurringBonusCreditnote: ").append(toIndentedString(nonRecurringBonusCreditnote)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validThru: ").append(toIndentedString(validThru)).append("\n");
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

