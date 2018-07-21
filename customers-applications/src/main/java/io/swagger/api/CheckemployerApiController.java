package io.swagger.api;

import io.swagger.model.CheckEmployerResponse;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:07.136+02:00")

@Controller
public class CheckemployerApiController implements CheckemployerApi {

    private static final Logger log = LoggerFactory.getLogger(CheckemployerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CheckemployerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CheckEmployerResponse> checkEmployer(@ApiParam(value = "Register Number") @Valid @RequestParam(value = "registerNumber", required = false) String registerNumber,@ApiParam(value = "First Name") @Valid @RequestParam(value = "firstName", required = false) String firstName,@ApiParam(value = "companyName.surname") @Valid @RequestParam(value = "surname_companyName", required = false) String surnameCompanyName,@ApiParam(value = "birthdate FoundingDate") @Valid @RequestParam(value = "birthdate_foundingDate", required = false) String birthdateFoundingDate,@ApiParam(value = "Street ") @Valid @RequestParam(value = "street", required = false) String street,@ApiParam(value = "Postal code ") @Valid @RequestParam(value = "postalCode", required = false) String postalCode,@ApiParam(value = "OENBId ") @Valid @RequestParam(value = "oenbid", required = false) String oenbid,@ApiParam(value = "Phonetic search ") @Valid @RequestParam(value = "phoneticSearch", required = false) String phoneticSearch) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CheckEmployerResponse>(objectMapper.readValue("{  \"employeeCheck\" : \"ok\"}", CheckEmployerResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CheckEmployerResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CheckEmployerResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
