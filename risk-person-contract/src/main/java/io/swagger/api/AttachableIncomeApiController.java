package io.swagger.api;

import io.swagger.model.GetAttachableIncomeRequest;
import io.swagger.model.GetAttachableIncomeResponse;
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
public class AttachableIncomeApiController implements AttachableIncomeApi {

    private static final Logger log = LoggerFactory.getLogger(AttachableIncomeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AttachableIncomeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GetAttachableIncomeResponse> getAttachableIncome(@ApiParam(value = "Get Attachable Income Request" ,required=true )  @Valid @RequestBody GetAttachableIncomeRequest wsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetAttachableIncomeResponse>(objectMapper.readValue("{  \"attachableIncome\" : {    \"amount\" : 1000.0,    \"currency\" : \"EUR\"  }}", GetAttachableIncomeResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetAttachableIncomeResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetAttachableIncomeResponse>(HttpStatus.OK);
    }

}
