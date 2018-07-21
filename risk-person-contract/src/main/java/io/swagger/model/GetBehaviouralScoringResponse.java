package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetBehaviouralScoringResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetBehaviouralScoringResponse   {
  @JsonProperty("balSheetDataRating")
  private String balSheetDataRating = null;

  @JsonProperty("balSheetDataDate")
  private LocalDate balSheetDataDate = null;

  public GetBehaviouralScoringResponse balSheetDataRating(String balSheetDataRating) {
    this.balSheetDataRating = balSheetDataRating;
    return this;
  }

  /**
   * BalanceSheetDataRating
   * @return balSheetDataRating
  **/
  @ApiModelProperty(example = "1238", value = "BalanceSheetDataRating")


  public String getBalSheetDataRating() {
    return balSheetDataRating;
  }

  public void setBalSheetDataRating(String balSheetDataRating) {
    this.balSheetDataRating = balSheetDataRating;
  }

  public GetBehaviouralScoringResponse balSheetDataDate(LocalDate balSheetDataDate) {
    this.balSheetDataDate = balSheetDataDate;
    return this;
  }

  /**
   * The date for the transaction
   * @return balSheetDataDate
  **/
  @ApiModelProperty(example = "2017-09-07", value = "The date for the transaction")

  @Valid

  public LocalDate getBalSheetDataDate() {
    return balSheetDataDate;
  }

  public void setBalSheetDataDate(LocalDate balSheetDataDate) {
    this.balSheetDataDate = balSheetDataDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBehaviouralScoringResponse getBehaviouralScoringResponse = (GetBehaviouralScoringResponse) o;
    return Objects.equals(this.balSheetDataRating, getBehaviouralScoringResponse.balSheetDataRating) &&
        Objects.equals(this.balSheetDataDate, getBehaviouralScoringResponse.balSheetDataDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balSheetDataRating, balSheetDataDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBehaviouralScoringResponse {\n");
    
    sb.append("    balSheetDataRating: ").append(toIndentedString(balSheetDataRating)).append("\n");
    sb.append("    balSheetDataDate: ").append(toIndentedString(balSheetDataDate)).append("\n");
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

