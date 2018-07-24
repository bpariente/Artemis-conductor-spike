package io.swagger.api;

import io.swagger.model.GetBehaviouralScoringResponse;
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
public class CustomersApiController implements CustomersApi {

    private static final Logger log = LoggerFactory.getLogger(CustomersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GetBehaviouralScoringResponse> getBehavioralScoring(@Size(max=4) @ApiParam(value = "Customer Entity",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetBehaviouralScoringResponse>(objectMapper.readValue("{  \"balSheetDataDate\" : \"2017-09-07\",  \"balSheetDataRating\" : \"1238\"}", GetBehaviouralScoringResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetBehaviouralScoringResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetBehaviouralScoringResponse>(HttpStatus.OK);
    }

}
