package io.swagger.api;

import io.swagger.model.GetAddressCheckNoHitResponse;
import io.swagger.model.GetAddressCheckResponse;
import io.swagger.model.GetAddressCheckZMRResponse;
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
public class AddresscheckApiController implements AddresscheckApi {

    private static final Logger log = LoggerFactory.getLogger(AddresscheckApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AddresscheckApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GetAddressCheckResponse> getAddressCheck(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateName", required = true) String privateName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateFirstName", required = true) String privateFirstName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateBirthDate", required = true) LocalDate privateBirthDate,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateStreet", required = true) String privateStreet,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateHouseNumber", required = true) String privateHouseNumber,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateZIP", required = true) String privateZIP,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCity", required = true) String privateCity,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCountryCode", required = true) String privateCountryCode,@ApiParam(value = "") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "") @Valid @RequestParam(value = "userName", required = false) String userName,@ApiParam(value = "") @Valid @RequestParam(value = "userFirstName", required = false) String userFirstName,@ApiParam(value = "") @Valid @RequestParam(value = "userOrgUnit", required = false) String userOrgUnit,@ApiParam(value = "") @Valid @RequestParam(value = "userCostCenter", required = false) String userCostCenter,@ApiParam(value = "") @Valid @RequestParam(value = "userEMail", required = false) String userEMail,@ApiParam(value = "") @Valid @RequestParam(value = "privateMaidenName", required = false) String privateMaidenName,@ApiParam(value = "") @Valid @RequestParam(value = "privateSex", required = false) String privateSex,@ApiParam(value = "") @Valid @RequestParam(value = "privateNationality", required = false) String privateNationality) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetAddressCheckResponse>(objectMapper.readValue("{  \"decision\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"bestHit\" : {    \"zip\" : \"1150\",    \"firstName\" : \"first name\",    \"country\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"nationality\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"city\" : \"vienna\",    \"street\" : \"somestreet\",    \"sex\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"name\" : \"lastname\",    \"houseNumber\" : \"3\",    \"maidenName\" : \"maidenname\",    \"birthDate\" : \"2017-09-07\"  },  \"correlationId\" : \"123456\",  \"status\" : {    \"code\" : \"code\",    \"description\" : \"description\"  }}", GetAddressCheckResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetAddressCheckResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetAddressCheckResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GetAddressCheckZMRResponse> getAddressCheckWithZMR(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateName", required = true) String privateName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateFirstName", required = true) String privateFirstName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateBirthDate", required = true) LocalDate privateBirthDate,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateStreet", required = true) String privateStreet,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateHouseNumber", required = true) String privateHouseNumber,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateZIP", required = true) String privateZIP,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCity", required = true) String privateCity,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "privateCountryCode", required = true) String privateCountryCode,@ApiParam(value = "reason for ZMR - request. ",required=true) @PathVariable("reason") Integer reason,@ApiParam(value = "") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "") @Valid @RequestParam(value = "userName", required = false) String userName,@ApiParam(value = "") @Valid @RequestParam(value = "userFirstName", required = false) String userFirstName,@ApiParam(value = "") @Valid @RequestParam(value = "userOrgUnit", required = false) String userOrgUnit,@ApiParam(value = "") @Valid @RequestParam(value = "userCostCenter", required = false) String userCostCenter,@ApiParam(value = "") @Valid @RequestParam(value = "userEMail", required = false) String userEMail,@ApiParam(value = "") @Valid @RequestParam(value = "privateMaidenName", required = false) String privateMaidenName,@ApiParam(value = "") @Valid @RequestParam(value = "privateSex", required = false) String privateSex,@ApiParam(value = "") @Valid @RequestParam(value = "privateNationality", required = false) String privateNationality) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetAddressCheckZMRResponse>(objectMapper.readValue("{  \"foundPerson\" : {    \"zip\" : \"zip code\",    \"firstName\" : \"first name\",    \"topNumber\" : \"house number\",    \"isLocationCurrent\" : true,    \"city\" : \"city\",    \"street\" : \"street\",    \"name\" : \"last name\",    \"houseNumber\" : \"house number\",    \"birthDate\" : \"2017-09-07\"  },  \"decision\" : true,  \"correlationId\" : \"123456\"}", GetAddressCheckZMRResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetAddressCheckZMRResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetAddressCheckZMRResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
