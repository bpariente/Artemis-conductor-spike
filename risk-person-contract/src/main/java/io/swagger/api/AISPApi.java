/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GetAuthenticationInfoResponse;
import io.swagger.model.GetExternalHouseholdDataRequest;
import io.swagger.model.GetExternalHouseholdDataResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

@Api(value = "AISP", description = "the AISP API")
public interface AISPApi {

    @ApiOperation(value = "Risk-person AISP Authentication Info", nickname = "getExternalAuthenticationData", notes = "", response = GetAuthenticationInfoResponse.class, tags={ "External Authentication Info", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetAuthenticationInfoResponse.class),
        @ApiResponse(code = 404, message = "External Authentication Information not found for a requested iban"),
        @ApiResponse(code = 200, message = "Unexpected error") })
    @RequestMapping(value = "/AISP/authenticationInfo/{IBAN}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetAuthenticationInfoResponse> getExternalAuthenticationData(@ApiParam(value = "Get Authentication Info via AISP",required=true) @PathVariable("IBAN") String IBAN);


    @ApiOperation(value = "Risk-person External Household Data", nickname = "getExternalHouseholdData", notes = "Get External Household Data via AISP", response = GetExternalHouseholdDataResponse.class, tags={ "ExternalHouseholdData", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetExternalHouseholdDataResponse.class),
        @ApiResponse(code = 400, message = "Application error - Verify the BAWAG specific headers for detailed information"),
        @ApiResponse(code = 404, message = "External HouseholdData not found for requested iban"),
        @ApiResponse(code = 422, message = "AISP Bank Server error"),
        @ApiResponse(code = 510, message = "Challenge Response for Two-Factor Auth Required"),
        @ApiResponse(code = 200, message = "Unexpected error") })
    @RequestMapping(value = "/AISP/externalhouseholddata",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<GetExternalHouseholdDataResponse> getExternalHouseholdData(@ApiParam(value = "Create External Household Data Request" ,required=true )  @Valid @RequestBody GetExternalHouseholdDataRequest wsRequest);

}
