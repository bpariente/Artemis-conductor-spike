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
 * GetAuthenticationInfoResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

public class GetAuthenticationInfoResponse   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userPin")
  private String userPin = null;

  @JsonProperty("customerId")
  private String customerId = null;

  public GetAuthenticationInfoResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public GetAuthenticationInfoResponse userPin(String userPin) {
    this.userPin = userPin;
    return this;
  }

  /**
   * Get userPin
   * @return userPin
  **/
  @ApiModelProperty(value = "")


  public String getUserPin() {
    return userPin;
  }

  public void setUserPin(String userPin) {
    this.userPin = userPin;
  }

  public GetAuthenticationInfoResponse customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuthenticationInfoResponse getAuthenticationInfoResponse = (GetAuthenticationInfoResponse) o;
    return Objects.equals(this.userId, getAuthenticationInfoResponse.userId) &&
        Objects.equals(this.userPin, getAuthenticationInfoResponse.userPin) &&
        Objects.equals(this.customerId, getAuthenticationInfoResponse.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userPin, customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuthenticationInfoResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPin: ").append(toIndentedString(userPin)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

