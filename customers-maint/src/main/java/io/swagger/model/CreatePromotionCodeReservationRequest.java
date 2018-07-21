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
 * CreatePromotionCodeReservationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class CreatePromotionCodeReservationRequest   {
  @JsonProperty("promoId")
  private String promoId = null;

  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("subproductCode")
  private String subproductCode = null;

  public CreatePromotionCodeReservationRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  /**
   * Promocode ID
   * @return promoId
  **/
  @ApiModelProperty(example = "FA17AABN", required = true, value = "Promocode ID")
  @NotNull

@Size(max=8) 
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public CreatePromotionCodeReservationRequest entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity
   * @return entity
  **/
  @ApiModelProperty(example = "0100", required = true, value = "Entity")
  @NotNull

@Size(max=4) 
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public CreatePromotionCodeReservationRequest productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Promocode ID
   * @return productCode
  **/
  @ApiModelProperty(example = "96", required = true, value = "Promocode ID")
  @NotNull

@Size(max=8) 
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public CreatePromotionCodeReservationRequest subproductCode(String subproductCode) {
    this.subproductCode = subproductCode;
    return this;
  }

  /**
   * Sub Product Code
   * @return subproductCode
  **/
  @ApiModelProperty(example = "", value = "Sub Product Code")

@Size(max=4) 
  public String getSubproductCode() {
    return subproductCode;
  }

  public void setSubproductCode(String subproductCode) {
    this.subproductCode = subproductCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePromotionCodeReservationRequest createPromotionCodeReservationRequest = (CreatePromotionCodeReservationRequest) o;
    return Objects.equals(this.promoId, createPromotionCodeReservationRequest.promoId) &&
        Objects.equals(this.entity, createPromotionCodeReservationRequest.entity) &&
        Objects.equals(this.productCode, createPromotionCodeReservationRequest.productCode) &&
        Objects.equals(this.subproductCode, createPromotionCodeReservationRequest.subproductCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, entity, productCode, subproductCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePromotionCodeReservationRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    subproductCode: ").append(toIndentedString(subproductCode)).append("\n");
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

