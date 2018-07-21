package io.swagger.api;

import io.swagger.model.GetCustomerProductsResponse;
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
public class CustomersApiController implements CustomersApi {

    private static final Logger log = LoggerFactory.getLogger(CustomersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GetCustomerProductsResponse> getCustomerProducts(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerProductsResponse>(objectMapper.readValue("{  \"relatedProducts\" : [ {    \"numCon\" : \"03700402320\",    \"accountTypeCode\" : \"50\",    \"productRelationText\" : \"Inhaber\",    \"accountOfWardText\" : \"NEIN\",    \"productCode\" : \"M00S\",    \"accountManager\" : \"01000376KKB6\",    \"balance\" : 1100.0,    \"participationType\" : \"T\",    \"stateText\" : \"INAKTIV\",    \"iban\" : \"AT441400003700402320\",    \"flagJoint\" : \"Y\",    \"productTypeText\" : \"Kreditkarte Eigen\",    \"subProductText\" : \"BAWAG MasterCard\",    \"accountManagementText\" : \"01\",    \"flagAut\" : \"Y\",    \"currency\" : \"EUR\",    \"blockedText\" : \"NEIN\",    \"account\" : {      \"bankCode\" : \"14000\",      \"accountNumber\" : \"00000003030\"    }  }, {    \"numCon\" : \"03700402320\",    \"accountTypeCode\" : \"50\",    \"productRelationText\" : \"Inhaber\",    \"accountOfWardText\" : \"NEIN\",    \"productCode\" : \"M00S\",    \"accountManager\" : \"01000376KKB6\",    \"balance\" : 1100.0,    \"participationType\" : \"T\",    \"stateText\" : \"INAKTIV\",    \"iban\" : \"AT441400003700402320\",    \"flagJoint\" : \"Y\",    \"productTypeText\" : \"Kreditkarte Eigen\",    \"subProductText\" : \"BAWAG MasterCard\",    \"accountManagementText\" : \"01\",    \"flagAut\" : \"Y\",    \"currency\" : \"EUR\",    \"blockedText\" : \"NEIN\",    \"account\" : {      \"bankCode\" : \"14000\",      \"accountNumber\" : \"00000003030\"    }  } ]}", GetCustomerProductsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerProductsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerProductsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
