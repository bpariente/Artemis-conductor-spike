package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModificationInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

public class ModificationInformation   {
  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("user")
  private String user = null;

  public ModificationInformation time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Time of last modification
   * @return time
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Time of last modification")

  @Valid

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public ModificationInformation user(String user) {
    this.user = user;
    return this;
  }

  /**
   * User who have modified the data
   * @return user
  **/
  @ApiModelProperty(example = "TESG234", value = "User who have modified the data")

@Size(max=8) 
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationInformation modificationInformation = (ModificationInformation) o;
    return Objects.equals(this.time, modificationInformation.time) &&
        Objects.equals(this.user, modificationInformation.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationInformation {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

