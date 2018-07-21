/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GetBehaviouralScoringResponse;
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

@Api(value = "customers", description = "the customers API")
public interface CustomersApi {

    @ApiOperation(value = "Risk-person data", nickname = "getBehavioralScoring", notes = "Call PB90 ", response = GetBehaviouralScoringResponse.class, tags={ "Behavioural Scoring", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBehaviouralScoringResponse.class),
        @ApiResponse(code = 400, message = "Application error - Verify the BAWAG specific headers for detailed information"),
        @ApiResponse(code = 404, message = "Account not found"),
        @ApiResponse(code = 200, message = "Unexpected error") })
    @RequestMapping(value = "/customers/{customerEntity}-{customerNumber}/behaviouralscoring",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetBehaviouralScoringResponse> getBehavioralScoring(@Size(max=4) @ApiParam(value = "Customer Entity",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber);

}
