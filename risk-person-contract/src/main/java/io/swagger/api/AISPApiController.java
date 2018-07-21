package io.swagger.api;

import io.swagger.model.GetAuthenticationInfoResponse;
import io.swagger.model.GetExternalHouseholdDataRequest;
import io.swagger.model.GetExternalHouseholdDataResponse;
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
public class AISPApiController implements AISPApi {

    private static final Logger log = LoggerFactory.getLogger(AISPApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AISPApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GetAuthenticationInfoResponse> getExternalAuthenticationData(@ApiParam(value = "Get Authentication Info via AISP",required=true) @PathVariable("IBAN") String IBAN) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetAuthenticationInfoResponse>(objectMapper.readValue("{  \"userPin\" : \"userPin\",  \"customerId\" : \"customerId\",  \"userId\" : \"userId\"}", GetAuthenticationInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetAuthenticationInfoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetAuthenticationInfoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GetExternalHouseholdDataResponse> getExternalHouseholdData(@ApiParam(value = "Create External Household Data Request" ,required=true )  @Valid @RequestBody GetExternalHouseholdDataRequest wsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetExternalHouseholdDataResponse>(objectMapper.readValue("{  \"challengeResponseMessage\" : \"challengeResponseMessage\",  \"bankCode\" : \"bankCode\",  \"personHouseholdCalculation\" : {    \"otherExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"overallExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"telecommunicationExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"overallIncome\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"insuranceExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"alimentaryPersons\" : 2.0,    \"isIncomeVerified\" : true,    \"livingExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"carExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"loanInstallmentsForeign\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"residencyExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"loanInstallmentsOwn\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"netIncome\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"isCarOwned\" : true  },  \"hasDistraints\" : true}", GetExternalHouseholdDataResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetExternalHouseholdDataResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetExternalHouseholdDataResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
