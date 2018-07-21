package io.swagger.api;

import io.swagger.model.HouseholdCalculationCheck;
import io.swagger.model.HouseholdCalculationCheckResponse;
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
public class HouseholdcalculationCheckApiController implements HouseholdcalculationCheckApi {

    private static final Logger log = LoggerFactory.getLogger(HouseholdcalculationCheckApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public HouseholdcalculationCheckApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<HouseholdCalculationCheckResponse> perfomHouseholdCheck(@ApiParam(value = "HouseholdCalculationCheck Request" ,required=true )  @Valid @RequestBody HouseholdCalculationCheck wsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HouseholdCalculationCheckResponse>(objectMapper.readValue("{  \"personHouseholdCalculation\" : {    \"otherExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"overallExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"telecommunicationExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"overallIncome\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"insuranceExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"alimentaryPersons\" : 2.0,    \"isIncomeVerified\" : true,    \"livingExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"carExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"loanInstallmentsForeign\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"residencyExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"loanInstallmentsOwn\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"netIncome\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"isCarOwned\" : true  },  \"secondPersonHouseholdCalculation\" : {    \"otherExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"overallExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"telecommunicationExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"overallIncome\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"insuranceExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"alimentaryPersons\" : 2.0,    \"isIncomeVerified\" : true,    \"livingExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"carExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"loanInstallmentsForeign\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"residencyExpenses\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"loanInstallmentsOwn\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"netIncome\" : {      \"amount\" : 1000.0,      \"currency\" : \"EUR\"    },    \"isCarOwned\" : true  }}", HouseholdCalculationCheckResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HouseholdCalculationCheckResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HouseholdCalculationCheckResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
