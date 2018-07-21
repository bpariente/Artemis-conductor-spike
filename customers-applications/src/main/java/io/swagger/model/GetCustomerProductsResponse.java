package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelatedProducts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCustomerProductsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:07.136+02:00")

public class GetCustomerProductsResponse   {
  @JsonProperty("relatedProducts")
  @Valid
  private List<RelatedProducts> relatedProducts = null;

  public GetCustomerProductsResponse relatedProducts(List<RelatedProducts> relatedProducts) {
    this.relatedProducts = relatedProducts;
    return this;
  }

  public GetCustomerProductsResponse addRelatedProductsItem(RelatedProducts relatedProductsItem) {
    if (this.relatedProducts == null) {
      this.relatedProducts = new ArrayList<RelatedProducts>();
    }
    this.relatedProducts.add(relatedProductsItem);
    return this;
  }

  /**
   * Get relatedProducts
   * @return relatedProducts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedProducts> getRelatedProducts() {
    return relatedProducts;
  }

  public void setRelatedProducts(List<RelatedProducts> relatedProducts) {
    this.relatedProducts = relatedProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerProductsResponse getCustomerProductsResponse = (GetCustomerProductsResponse) o;
    return Objects.equals(this.relatedProducts, getCustomerProductsResponse.relatedProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerProductsResponse {\n");
    
    sb.append("    relatedProducts: ").append(toIndentedString(relatedProducts)).append("\n");
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

