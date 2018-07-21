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
 * GetCustomerContactDataRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class GetCustomerContactDataRequest   {
  @JsonProperty("contactNumber")
  private Integer contactNumber = null;

  @JsonProperty("activeOnly")
  private Boolean activeOnly = null;

  @JsonProperty("latestOnly")
  private Boolean latestOnly = null;

  @JsonProperty("includeHidden")
  private Boolean includeHidden = null;

  public GetCustomerContactDataRequest contactNumber(Integer contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

  /**
   * Used to filter the result of contacts to only one.
   * @return contactNumber
  **/
  @ApiModelProperty(example = "1", value = "Used to filter the result of contacts to only one.")


  public Integer getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(Integer contactNumber) {
    this.contactNumber = contactNumber;
  }

  public GetCustomerContactDataRequest activeOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
    return this;
  }

  /**
   * Used to filter the active contacts only.
   * @return activeOnly
  **/
  @ApiModelProperty(example = "true", value = "Used to filter the active contacts only.")


  public Boolean isActiveOnly() {
    return activeOnly;
  }

  public void setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
  }

  public GetCustomerContactDataRequest latestOnly(Boolean latestOnly) {
    this.latestOnly = latestOnly;
    return this;
  }

  /**
   * Used to filter the latest contact only.
   * @return latestOnly
  **/
  @ApiModelProperty(example = "true", value = "Used to filter the latest contact only.")


  public Boolean isLatestOnly() {
    return latestOnly;
  }

  public void setLatestOnly(Boolean latestOnly) {
    this.latestOnly = latestOnly;
  }

  public GetCustomerContactDataRequest includeHidden(Boolean includeHidden) {
    this.includeHidden = includeHidden;
    return this;
  }

  /**
   * Used to add the hidden contacts of the customer.
   * @return includeHidden
  **/
  @ApiModelProperty(example = "true", value = "Used to add the hidden contacts of the customer.")


  public Boolean isIncludeHidden() {
    return includeHidden;
  }

  public void setIncludeHidden(Boolean includeHidden) {
    this.includeHidden = includeHidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerContactDataRequest getCustomerContactDataRequest = (GetCustomerContactDataRequest) o;
    return Objects.equals(this.contactNumber, getCustomerContactDataRequest.contactNumber) &&
        Objects.equals(this.activeOnly, getCustomerContactDataRequest.activeOnly) &&
        Objects.equals(this.latestOnly, getCustomerContactDataRequest.latestOnly) &&
        Objects.equals(this.includeHidden, getCustomerContactDataRequest.includeHidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactNumber, activeOnly, latestOnly, includeHidden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerContactDataRequest {\n");
    
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    activeOnly: ").append(toIndentedString(activeOnly)).append("\n");
    sb.append("    latestOnly: ").append(toIndentedString(latestOnly)).append("\n");
    sb.append("    includeHidden: ").append(toIndentedString(includeHidden)).append("\n");
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

