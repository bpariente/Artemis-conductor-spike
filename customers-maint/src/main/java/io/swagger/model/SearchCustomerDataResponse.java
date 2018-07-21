package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonShortInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchCustomerDataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class SearchCustomerDataResponse   {
  @JsonProperty("persons")
  @Valid
  private List<PersonShortInfo> persons = null;

  @JsonProperty("currentDate")
  private String currentDate = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("time")
  private String time = null;

  public SearchCustomerDataResponse persons(List<PersonShortInfo> persons) {
    this.persons = persons;
    return this;
  }

  public SearchCustomerDataResponse addPersonsItem(PersonShortInfo personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<PersonShortInfo>();
    }
    this.persons.add(personsItem);
    return this;
  }

  /**
   * Get persons
   * @return persons
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PersonShortInfo> getPersons() {
    return persons;
  }

  public void setPersons(List<PersonShortInfo> persons) {
    this.persons = persons;
  }

  public SearchCustomerDataResponse currentDate(String currentDate) {
    this.currentDate = currentDate;
    return this;
  }

  /**
   * Current Date
   * @return currentDate
  **/
  @ApiModelProperty(value = "Current Date")

@Size(max=10) 
  public String getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(String currentDate) {
    this.currentDate = currentDate;
  }

  public SearchCustomerDataResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User ID
   * @return userId
  **/
  @ApiModelProperty(value = "User ID")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SearchCustomerDataResponse time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Time
   * @return time
  **/
  @ApiModelProperty(value = "Time")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCustomerDataResponse searchCustomerDataResponse = (SearchCustomerDataResponse) o;
    return Objects.equals(this.persons, searchCustomerDataResponse.persons) &&
        Objects.equals(this.currentDate, searchCustomerDataResponse.currentDate) &&
        Objects.equals(this.userId, searchCustomerDataResponse.userId) &&
        Objects.equals(this.time, searchCustomerDataResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persons, currentDate, userId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCustomerDataResponse {\n");
    
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    currentDate: ").append(toIndentedString(currentDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

