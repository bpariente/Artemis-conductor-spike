/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GetAddressCheckNoHitResponse;
import io.swagger.model.GetAddressCheckResponse;
import io.swagger.model.GetAddressCheckZMRResponse;
import org.threeten.bp.LocalDate;
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

@Api(value = "addresscheck", description = "the addresscheck API")
public interface AddresscheckApi {

    @ApiOperation(value = "CRIF address check without hitlist", nickname = "getAddressCheck", notes = "Validates the address of the passed person, with at least: fist name, lastname, birthdate and address data. Optional correlation ID can be sent to assign a response to a request. Fields with the prefix user will be used to identify which client calls the endpoint, therefore the GPR process for example can be passed to track from which channel costs (for queries) are created. Input parameters with the prefix private refer to the person to be checked.", response = GetAddressCheckResponse.class, tags={ "Address Checks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response body with unique identification", response = GetAddressCheckResponse.class),
        @ApiResponse(code = 400, message = "Application error - Verify the BAWAG specific headers for detailed information"),
        @ApiResponse(code = 404, message = "Search criterias do not match any candidate in the CRIF database and no hitlist was requested", response = GetAddressCheckNoHitResponse.class),
        @ApiResponse(code = 500, message = "Business or technical error - See x-bawagpsk-errors header for detailed information") })
    @RequestMapping(value = "/addresscheck",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetAddressCheckResponse> getAddressCheck(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateName", required = true) String privateName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateFirstName", required = true) String privateFirstName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateBirthDate", required = true) LocalDate privateBirthDate,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateStreet", required = true) String privateStreet,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateHouseNumber", required = true) String privateHouseNumber,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateZIP", required = true) String privateZIP,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCity", required = true) String privateCity,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCountryCode", required = true) String privateCountryCode,@ApiParam(value = "") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "") @Valid @RequestParam(value = "userName", required = false) String userName,@ApiParam(value = "") @Valid @RequestParam(value = "userFirstName", required = false) String userFirstName,@ApiParam(value = "") @Valid @RequestParam(value = "userOrgUnit", required = false) String userOrgUnit,@ApiParam(value = "") @Valid @RequestParam(value = "userCostCenter", required = false) String userCostCenter,@ApiParam(value = "") @Valid @RequestParam(value = "userEMail", required = false) String userEMail,@ApiParam(value = "") @Valid @RequestParam(value = "privateMaidenName", required = false) String privateMaidenName,@ApiParam(value = "") @Valid @RequestParam(value = "privateSex", required = false) String privateSex,@ApiParam(value = "") @Valid @RequestParam(value = "privateNationality", required = false) String privateNationality);


    @ApiOperation(value = "ZMR Address check", nickname = "getAddressCheckWithZMR", notes = "An adress check by ZMR. This request consists of a CRIF request with an additional reason field.", response = GetAddressCheckZMRResponse.class, tags={ "Address Checks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response body with unique identification", response = GetAddressCheckZMRResponse.class),
        @ApiResponse(code = 400, message = "Application error - Verify the BAWAG specific headers for detailed information"),
        @ApiResponse(code = 404, message = "Search criterias do not match any candidate in the CRIF ZMR database and no hitlist was requested", response = GetAddressCheckNoHitResponse.class),
        @ApiResponse(code = 500, message = "Business or technical error - See x-bawagpsk-errors header for detailed information") })
    @RequestMapping(value = "/addresscheck/zmr/{reason}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetAddressCheckZMRResponse> getAddressCheckWithZMR(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateName", required = true) String privateName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateFirstName", required = true) String privateFirstName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateBirthDate", required = true) LocalDate privateBirthDate,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateStreet", required = true) String privateStreet,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateHouseNumber", required = true) String privateHouseNumber,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateZIP", required = true) String privateZIP,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCity", required = true) String privateCity,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCountryCode", required = true) String privateCountryCode,@ApiParam(value = "reason for ZMR - request. ",required=true) @PathVariable("reason") Integer reason,@ApiParam(value = "") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "") @Valid @RequestParam(value = "userName", required = false) String userName,@ApiParam(value = "") @Valid @RequestParam(value = "userFirstName", required = false) String userFirstName,@ApiParam(value = "") @Valid @RequestParam(value = "userOrgUnit", required = false) String userOrgUnit,@ApiParam(value = "") @Valid @RequestParam(value = "userCostCenter", required = false) String userCostCenter,@ApiParam(value = "") @Valid @RequestParam(value = "userEMail", required = false) String userEMail,@ApiParam(value = "") @Valid @RequestParam(value = "privateMaidenName", required = false) String privateMaidenName,@ApiParam(value = "") @Valid @RequestParam(value = "privateSex", required = false) String privateSex,@ApiParam(value = "") @Valid @RequestParam(value = "privateNationality", required = false) String privateNationality);

}
