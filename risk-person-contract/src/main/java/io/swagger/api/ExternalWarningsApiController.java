package io.swagger.api;

import io.swagger.model.GetPersonExternalWarningsResponse;
import org.threeten.bp.LocalDate;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:10:32.270+02:00")

@Controller
public class ExternalWarningsApiController implements ExternalWarningsApi {

    private static final Logger log = LoggerFactory.getLogger(ExternalWarningsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExternalWarningsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GetPersonExternalWarningsResponse> getPersonExternalWarnings(@NotNull @Size(max=30) @ApiParam(value = "Surname of the person", required = true) @Valid @RequestParam(value = "surname", required = true) String surname,@Size(max=30) @ApiParam(value = "First name of the person") @Valid @RequestParam(value = "firstName", required = false) String firstName,@ApiParam(value = "Process key for workflow (to fill with ACOT for workflows Giro,Spar,Termineinlage)") @Valid @RequestParam(value = "process", required = false) String process,@ApiParam(value = "Birth date of the person") @Valid @RequestParam(value = "birthDate", required = false) LocalDate birthDate,@Size(min=1) @ApiParam(value = "Account Number of the person") @Valid @RequestParam(value = "account", required = false) String account) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetPersonExternalWarningsResponse>(objectMapper.readValue("{  \"personExtendedWarning\" : [ {    \"zipCode\" : \"1080\",    \"redemptionAgreed\" : \"Agreed\",    \"surName\" : \"Smith\",    \"contradictionDate\" : \"\",    \"city\" : \"Lipa\",    \"redemptionDescription\" : \"Description\",    \"identNumber\" : \"123456789\",    \"countryCode\" : \"001\",    \"street\" : \"Elm Street\",    \"redemptionProcDate\" : \"\",    \"redemptionCode\" : \"\",    \"redemptionDate\" : \"\",    \"bankCode\" : \"\",    \"customerRelation\" : \"\",    \"sequenceUkvRelation\" : \"001\",    \"reasonCodeExtern\" : \"100\",    \"redemptionAgreementCode\" : \"\",    \"redemptionAgreementDate\" : \"\",    \"accountNumber\" : \"\",    \"birthDate\" : \"1995-01-01\",    \"firstName\" : \"Sam\",    \"entityRelation\" : \"abcd\",    \"comment\" : \"001\",    \"messageDate\" : \"201712\",    \"contradicted\" : \"\",    \"defrayal\" : \"Defray\",    \"reasonCodeIntern\" : \"100\"  }, {    \"zipCode\" : \"1080\",    \"redemptionAgreed\" : \"Agreed\",    \"surName\" : \"Smith\",    \"contradictionDate\" : \"\",    \"city\" : \"Lipa\",    \"redemptionDescription\" : \"Description\",    \"identNumber\" : \"123456789\",    \"countryCode\" : \"001\",    \"street\" : \"Elm Street\",    \"redemptionProcDate\" : \"\",    \"redemptionCode\" : \"\",    \"redemptionDate\" : \"\",    \"bankCode\" : \"\",    \"customerRelation\" : \"\",    \"sequenceUkvRelation\" : \"001\",    \"reasonCodeExtern\" : \"100\",    \"redemptionAgreementCode\" : \"\",    \"redemptionAgreementDate\" : \"\",    \"accountNumber\" : \"\",    \"birthDate\" : \"1995-01-01\",    \"firstName\" : \"Sam\",    \"entityRelation\" : \"abcd\",    \"comment\" : \"001\",    \"messageDate\" : \"201712\",    \"contradicted\" : \"\",    \"defrayal\" : \"Defray\",    \"reasonCodeIntern\" : \"100\"  } ]}", GetPersonExternalWarningsResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetPersonExternalWarningsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetPersonExternalWarningsResponse>(HttpStatus.OK);
    }

}
