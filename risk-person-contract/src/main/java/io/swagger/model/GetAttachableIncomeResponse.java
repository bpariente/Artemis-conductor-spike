package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetAttachableIncomeResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetAttachableIncomeResponse   {
  @JsonProperty("attachableIncome")
  private Amount attachableIncome = null;

  public GetAttachableIncomeResponse attachableIncome(Amount attachableIncome) {
    this.attachableIncome = attachableIncome;
    return this;
  }

  /**
   * Get attachableIncome
   * @return attachableIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAttachableIncome() {
    return attachableIncome;
  }

  public void setAttachableIncome(Amount attachableIncome) {
    this.attachableIncome = attachableIncome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttachableIncomeResponse getAttachableIncomeResponse = (GetAttachableIncomeResponse) o;
    return Objects.equals(this.attachableIncome, getAttachableIncomeResponse.attachableIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachableIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttachableIncomeResponse {\n");
    
    sb.append("    attachableIncome: ").append(toIndentedString(attachableIncome)).append("\n");
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

