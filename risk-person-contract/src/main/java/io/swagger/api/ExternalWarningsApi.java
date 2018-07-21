/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GetPersonExternalWarningsResponse;
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

@Api(value = "external-warnings", description = "the external-warnings API")
public interface ExternalWarningsApi {

    @ApiOperation(value = "The UKV list is the list of bank-wide \"Unwanted Loans\". The official name is \"External Warning List\". It includes those customers who are reported by the different banks to the KSV in the course of loan defaults and resulting debt collection / ads. The KSV makes these entries weekly available to all banks (so that the banks can enrich their respective customer data with this information). ", nickname = "getPersonExternalWarnings", notes = "P056 call with option 'N'", response = GetPersonExternalWarningsResponse.class, tags={ "PersonExternalWarnings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get Person Extended Warning List Response", response = GetPersonExternalWarningsResponse.class),
        @ApiResponse(code = 400, message = "Application error - Verify the BAWAG specific headers for detailed information"),
        @ApiResponse(code = 404, message = "Account not found"),
        @ApiResponse(code = 500, message = "Business or technical error - See x-bawagpsk-errors header for detailed information") })
    @RequestMapping(value = "/external-warnings",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetPersonExternalWarningsResponse> getPersonExternalWarnings(@NotNull @Size(max=30) @ApiParam(value = "Surname of the person", required = true) @Valid @RequestParam(value = "surname", required = true) String surname,@Size(max=30) @ApiParam(value = "First name of the person") @Valid @RequestParam(value = "firstName", required = false) String firstName,@ApiParam(value = "Process key for workflow (to fill with ACOT for workflows Giro,Spar,Termineinlage)") @Valid @RequestParam(value = "process", required = false) String process,@ApiParam(value = "Birth date of the person") @Valid @RequestParam(value = "birthDate", required = false) LocalDate birthDate,@Size(min=1) @ApiParam(value = "Account Number of the person") @Valid @RequestParam(value = "account", required = false) String account);

}