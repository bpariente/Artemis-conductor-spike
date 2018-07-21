package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonHouseholdCalculation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetExternalHouseholdDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetExternalHouseholdDataResponse   {
  @JsonProperty("personHouseholdCalculation")
  private PersonHouseholdCalculation personHouseholdCalculation = null;

  @JsonProperty("challengeResponseMessage")
  private String challengeResponseMessage = null;

  @JsonProperty("hasDistraints")
  private Boolean hasDistraints = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  public GetExternalHouseholdDataResponse personHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
    this.personHouseholdCalculation = personHouseholdCalculation;
    return this;
  }

  /**
   * Get personHouseholdCalculation
   * @return personHouseholdCalculation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonHouseholdCalculation getPersonHouseholdCalculation() {
    return personHouseholdCalculation;
  }

  public void setPersonHouseholdCalculation(PersonHouseholdCalculation personHouseholdCalculation) {
    this.personHouseholdCalculation = personHouseholdCalculation;
  }

  public GetExternalHouseholdDataResponse challengeResponseMessage(String challengeResponseMessage) {
    this.challengeResponseMessage = challengeResponseMessage;
    return this;
  }

  /**
   * Get challengeResponseMessage
   * @return challengeResponseMessage
  **/
  @ApiModelProperty(value = "")


  public String getChallengeResponseMessage() {
    return challengeResponseMessage;
  }

  public void setChallengeResponseMessage(String challengeResponseMessage) {
    this.challengeResponseMessage = challengeResponseMessage;
  }

  public GetExternalHouseholdDataResponse hasDistraints(Boolean hasDistraints) {
    this.hasDistraints = hasDistraints;
    return this;
  }

  /**
   * Get hasDistraints
   * @return hasDistraints
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasDistraints() {
    return hasDistraints;
  }

  public void setHasDistraints(Boolean hasDistraints) {
    this.hasDistraints = hasDistraints;
  }

  public GetExternalHouseholdDataResponse bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(value = "")


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
    GetExternalHouseholdDataResponse getExternalHouseholdDataResponse = (GetExternalHouseholdDataResponse) o;
    return Objects.equals(this.personHouseholdCalculation, getExternalHouseholdDataResponse.personHouseholdCalculation) &&
        Objects.equals(this.challengeResponseMessage, getExternalHouseholdDataResponse.challengeResponseMessage) &&
        Objects.equals(this.hasDistraints, getExternalHouseholdDataResponse.hasDistraints) &&
        Objects.equals(this.bankCode, getExternalHouseholdDataResponse.bankCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personHouseholdCalculation, challengeResponseMessage, hasDistraints, bankCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExternalHouseholdDataResponse {\n");
    
    sb.append("    personHouseholdCalculation: ").append(toIndentedString(personHouseholdCalculation)).append("\n");
    sb.append("    challengeResponseMessage: ").append(toIndentedString(challengeResponseMessage)).append("\n");
    sb.append("    hasDistraints: ").append(toIndentedString(hasDistraints)).append("\n");
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

