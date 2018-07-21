package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Promotions;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCustomerPromotionCodesResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerPromotionCodesResponse   {
  @JsonProperty("promotionCodes")
  @Valid
  private List<Promotions> promotionCodes = null;

  public GetCustomerPromotionCodesResponse promotionCodes(List<Promotions> promotionCodes) {
    this.promotionCodes = promotionCodes;
    return this;
  }

  public GetCustomerPromotionCodesResponse addPromotionCodesItem(Promotions promotionCodesItem) {
    if (this.promotionCodes == null) {
      this.promotionCodes = new ArrayList<Promotions>();
    }
    this.promotionCodes.add(promotionCodesItem);
    return this;
  }

  /**
   * Get promotionCodes
   * @return promotionCodes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Promotions> getPromotionCodes() {
    return promotionCodes;
  }

  public void setPromotionCodes(List<Promotions> promotionCodes) {
    this.promotionCodes = promotionCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerPromotionCodesResponse getCustomerPromotionCodesResponse = (GetCustomerPromotionCodesResponse) o;
    return Objects.equals(this.promotionCodes, getCustomerPromotionCodesResponse.promotionCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerPromotionCodesResponse {\n");
    
    sb.append("    promotionCodes: ").append(toIndentedString(promotionCodes)).append("\n");
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

