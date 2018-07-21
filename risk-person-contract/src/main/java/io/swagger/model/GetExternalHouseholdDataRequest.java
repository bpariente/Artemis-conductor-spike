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
 * GetExternalHouseholdDataRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetExternalHouseholdDataRequest   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userPin")
  private String userPin = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("challengeResponse")
  private String challengeResponse = null;

  public GetExternalHouseholdDataRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Disposer number
   * @return userId
  **/
  @ApiModelProperty(example = "1234567", required = true, value = "Disposer number")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public GetExternalHouseholdDataRequest userPin(String userPin) {
    this.userPin = userPin;
    return this;
  }

  /**
   * PIN (Password)
   * @return userPin
  **/
  @ApiModelProperty(required = true, value = "PIN (Password)")
  @NotNull


  public String getUserPin() {
    return userPin;
  }

  public void setUserPin(String userPin) {
    this.userPin = userPin;
  }

  public GetExternalHouseholdDataRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * secondary login field
   * @return customerId
  **/
  @ApiModelProperty(example = "birth date", value = "secondary login field")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public GetExternalHouseholdDataRequest iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Account IBAN
   * @return iban
  **/
  @ApiModelProperty(example = "AT231420020012596430", required = true, value = "Account IBAN")
  @NotNull


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public GetExternalHouseholdDataRequest challengeResponse(String challengeResponse) {
    this.challengeResponse = challengeResponse;
    return this;
  }

  /**
   * 2 factor Auth field
   * @return challengeResponse
  **/
  @ApiModelProperty(example = "SMS Tan", value = "2 factor Auth field")


  public String getChallengeResponse() {
    return challengeResponse;
  }

  public void setChallengeResponse(String challengeResponse) {
    this.challengeResponse = challengeResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExternalHouseholdDataRequest getExternalHouseholdDataRequest = (GetExternalHouseholdDataRequest) o;
    return Objects.equals(this.userId, getExternalHouseholdDataRequest.userId) &&
        Objects.equals(this.userPin, getExternalHouseholdDataRequest.userPin) &&
        Objects.equals(this.customerId, getExternalHouseholdDataRequest.customerId) &&
        Objects.equals(this.iban, getExternalHouseholdDataRequest.iban) &&
        Objects.equals(this.challengeResponse, getExternalHouseholdDataRequest.challengeResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userPin, customerId, iban, challengeResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExternalHouseholdDataRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPin: ").append(toIndentedString(userPin)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    challengeResponse: ").append(toIndentedString(challengeResponse)).append("\n");
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

