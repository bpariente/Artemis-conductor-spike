package io.swagger.api;

import io.swagger.mocks.SearchCustomerDataResponseMocks;
import io.swagger.model.CreateCustomerBasicDataRequest;
import io.swagger.model.CreateCustomerBasicDataResponse;
import io.swagger.model.CreateCustomerContactDataRequest;
import io.swagger.model.CreateCustomerContactDataResponse;
import io.swagger.model.CreateLegalEntityRequest;
import io.swagger.model.CreateLegalEntityResponse;
import io.swagger.model.CreatePromotionCodeReservationRequest;
import io.swagger.model.GetCustomerAdditionalDataResponse;
import io.swagger.model.GetCustomerBasicDataResponse;
import io.swagger.model.GetCustomerContactDataResponse;
import io.swagger.model.GetCustomerEconomicEnvironmentResponse;
import io.swagger.model.GetCustomerExternalRelationTypeResponse;
import io.swagger.model.GetCustomerHouseholdCalculationResponse;
import io.swagger.model.GetCustomerPromotionCodesResponse;
import java.util.Date;
import io.swagger.model.SearchCustomerDataResponse;
import io.swagger.model.UpdateCustomerBasicDataRequest;
import io.swagger.model.UpdateCustomerContactDataRequest;
import io.swagger.model.UpdateCustomerEconomicEnvironmentRequest;
import io.swagger.model.UpdateCustomerHouseholdCalculationRequest;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

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

    public ResponseEntity<Void> checkAccountCustomerRelation(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "IBAN of the account to check",required=true) @PathVariable("iban") String iban) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CreateCustomerBasicDataResponse> createCustomerBasicData(@ApiParam(value = "Create Customer Basic Data Request" ,required=true )  @Valid @RequestBody CreateCustomerBasicDataRequest wsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateCustomerBasicDataResponse>(objectMapper.readValue("{  \"personKey\" : {    \"personNumber\" : \"00000001\",    \"entity\" : \"0100\"  }}", CreateCustomerBasicDataResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateCustomerBasicDataResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateCustomerBasicDataResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateCustomerContactDataResponse> createCustomerContactData(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Create Person Contact Data Request" ,required=true )  @Valid @RequestBody CreateCustomerContactDataRequest wsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateCustomerContactDataResponse>(objectMapper.readValue("{  \"personContact\" : {    \"country\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"city\" : \"Lipa\",    \"contactActual\" : false,    \"postalCode\" : \"1080\",    \"lastModificationBranch\" : \"0580\",    \"addressForBlind\" : false,    \"commentText\" : \"TEXT\",    \"personCode\" : \"12345\",    \"depositBox\" : 0,    \"careOfText\" : \"Text\",    \"internalContactCode\" : \"internalContactCode\",    \"emailAddress\" : \"emailAddress\",    \"lastModificationDate\" : \"2017-12-05T10:52:06\",    \"contactWelcome\" : false,    \"streetNameNumber\" : \"Elm Street\",    \"contact\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"addressNumber\" : 5,    \"telefonNumber\" : \"telefonNumber\",    \"organizationalUnit\" : \"organizationalUnit\"  }}", CreateCustomerContactDataResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateCustomerContactDataResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateCustomerContactDataResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> createCustomerEconomicEnvironment(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Create Person Economic Environment Request" ,required=true )  @Valid @RequestBody UpdateCustomerEconomicEnvironmentRequest wsRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CreateLegalEntityResponse> createLegalEntity(@ApiParam(value = "Create Customer Basic Data Request" ,required=true )  @Valid @RequestBody CreateLegalEntityRequest wsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateLegalEntityResponse>(objectMapper.readValue("{  \"personKey\" : {    \"personNumber\" : \"00000001\",    \"entity\" : \"0100\"  }}", CreateLegalEntityResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateLegalEntityResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateLegalEntityResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> createPromotionCodeReservation(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Create Promotion Code Reservation Request" ,required=true )  @Valid @RequestBody CreatePromotionCodeReservationRequest wsRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<SearchCustomerDataResponse> findCustomers(
        @NotNull @ApiParam(value = "Customer Surname", required = true) @Valid @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "Customer First Name") @Valid @RequestParam(value = "firstName", required = false) String firstName,
        @ApiParam(value = "Customer Birthdate") @Valid @RequestParam(value = "birthDate", required = false) Date birthDate,
        @ApiParam(value = "Customer Register Number") @Valid @RequestParam(value = "registerNumber", required = false) String registerNumber,
        @ApiParam(value = "Phonetic search flag") @Valid @RequestParam(value = "phoneticSearch", required = false) Boolean phoneticSearch,
        @ApiParam(value = "Postal Code") @Valid @RequestParam(value = "postalCode", required = false) String postalCode,
        @ApiParam(value = "Street") @Valid @RequestParam(value = "street", required = false) String street,
        @ApiParam(value = "OeNB Identification number") @Valid @RequestParam(value = "oenbId", required = false) String oenbId,
        @ApiParam(value = "1 Hostcall resembles 50 returned results") @Valid @RequestParam(value = "maxHostCalls", required = false) Integer maxHostCalls) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
                if(firstName.equals("Only Sparda")){
                    return new ResponseEntity<SearchCustomerDataResponse>(
                        SearchCustomerDataResponseMocks.getSearchCustomerDataOnlySparda(), HttpStatus.OK);
                }else if (firstName.equals("Only Bawag")){
                    return new ResponseEntity<SearchCustomerDataResponse>(
                        SearchCustomerDataResponseMocks.getSearchCustomerDataOnlyBawag(), HttpStatus.OK);
                }else if (firstName.equals("Only External")) {
                    return new ResponseEntity<SearchCustomerDataResponse>(
                        SearchCustomerDataResponseMocks.getSearchCustomerDataOnlyExternal(), HttpStatus.OK);
                }else if (firstName.equals("Mix")) {
                    return new ResponseEntity<SearchCustomerDataResponse>(
                        SearchCustomerDataResponseMocks.getSearchCustomerDataMix(), HttpStatus.OK);
                }
        }

        return new ResponseEntity<SearchCustomerDataResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerAdditionalDataResponse> getCustomerAdditionalData(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerAdditionalDataResponse>(objectMapper.readValue("{  \"bankCode\" : \"bankCode\",  \"economicTask\" : true,  \"economicDocumentsObtainingDate\" : \"2013-02-03\",  \"kokuNumber\" : \"kokuNumber\",  \"taxNumber\" : \"taxNumber\",  \"riskManager\" : \"riskManager\",  \"employee\" : true,  \"legalSelfEmployed\" : true,  \"distributionPartner\" : true,  \"emitterKey\" : \"emitterKey\",  \"balanceSettlementMonth\" : \"balanceSettlementMonth\",  \"customerType\" : \"customerType\",  \"projectFinancingCode\" : \"projectFinancingCode\",  \"uidNumber\" : \"uidNumber\",  \"lastReviewDate\" : \"2013-02-03\",  \"customerFlagCode\" : \"customerFlagCode\",  \"bookkeepingTypeCode\" : 0,  \"capitalGainTax\" : true,  \"financeAuthority\" : \"financeAuthority\"}", GetCustomerAdditionalDataResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerAdditionalDataResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerAdditionalDataResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerBasicDataResponse> getCustomerBasicData(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerBasicDataResponse>(objectMapper.readValue("{  \"country\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"flagEmployerProspect\" : false,  \"city2\" : \"Paris\",  \"deceased\" : true,  \"taxLiabilityCountryCode\" : \"AT\",  \"additionalText\" : \"Text\",  \"noAdvertismentType\" : \"N\",  \"oenace\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"postalCode\" : \"1010\",  \"legalFormCode\" : 100,  \"lastModificationInformation\" : {    \"time\" : \"2017-07-21T17:32:28Z\",    \"user\" : \"TESG234\"  },  \"language\" : \"0\",  \"country2\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"firstEditDate\" : \"2000-12-12\",  \"noOENBId\" : true,  \"segment\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"birthCountry\" : \"PH/Philippines\",  \"pep\" : true,  \"addressOutdated\" : true,  \"cardName2Extended\" : \"cardName2Extended\",  \"identificationDocument2\" : {    \"issuingAuthorityCountryCode\" : \"AT\",    \"issuingAuthority\" : \"Issuer\",    \"number\" : \"C\",    \"codeType\" : \"A / BEHINDERTENPASS\",    \"issuingDate\" : \"2017-12-12\",    \"comment\" : \"C\",    \"expirationDate\" : \"2017-12-12\"  },  \"identificationDocument1\" : {    \"issuingAuthorityCountryCode\" : \"AT\",    \"issuingAuthority\" : \"Issuer\",    \"number\" : \"C\",    \"codeType\" : \"A / BEHINDERTENPASS\",    \"issuingDate\" : \"2017-12-12\",    \"comment\" : \"C\",    \"expirationDate\" : \"2017-12-12\"  },  \"branchInformation\" : {    \"branchBankCode\" : 14000,    \"userTelephoneNumber\" : \"+43 12345678\",    \"dvrNumber\" : 1234567,    \"companyTelephoneNumber\" : \"+43 12345\",    \"commercialRegisterNumber\" : \"98765542\",    \"branchName\" : \"Wein Branch\",    \"shortCompanyName\" : \"BWG\",    \"companyName1\" : \"Bawag P.S.K. 1\",    \"formattedCurrentDate\" : \"10.10.2017\",    \"branchStreet\" : \"Street\",    \"companyName2\" : \"Bawag P.S.K. 2\",    \"companyName3\" : \"Bawag P.S.K. 3\",    \"companyBrandName\" : \"BAWAG P.S.K.\",    \"branchFaxNumber\" : \"+43 12345\",    \"companyInternetAddress\" : \"IP Add\",    \"branchTown\" : \"Wein\",    \"sender\" : \"Sender\",    \"companyAddress\" : \"Wein, Austria\",    \"companyMailAddress\" : \"123 Wein\",    \"mediumCompanyName\" : \"Bawag P.S.K.\",    \"companyPostalCode\" : \"12345\",    \"username\" : \"Admin\"  },  \"addressMain\" : \"J\",  \"advisorName2\" : \"Thomas Young\",  \"advisorName1\" : \"Franz Hue\",  \"transactionCode\" : \"P011\",  \"firstName\" : \"Sam\",  \"nationality\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"attentionOf\" : \"Smith\",  \"noOENBIdTemporary\" : true,  \"name\" : \"Smith\",  \"cardName1\" : \"cardName1\",  \"addressForBlinds\" : false,  \"cardName2\" : \"cardName2\",  \"salutation\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"additionalName\" : \"Sam Smith\",  \"amlDataAvailability\" : \"K\",  \"maritalStatus\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"compressedCity2\" : \"Town Hall\",  \"pepRelative\" : true,  \"authorizationFlag\" : \"J\",  \"postalCode2\" : \"1010\",  \"gender\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"city\" : \"Wein\",  \"socialSecurityNumber\" : \"0123456789\",  \"citizenSince\" : \"2017-10-26\",  \"pepComment\" : \"Sample PEP Comment\",  \"blockCustomer\" : false,  \"title\" : \"Mr.\",  \"birthPlace\" : \"Canada\",  \"shortWording\" : \"Gmgb Company\",  \"unwantedCustomer\" : true,  \"mifid\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"mainAddressChangeDate\" : \"2017-01-20\",  \"street\" : \"Karlsplatz\",  \"street2\" : \"Herrengasse\",  \"naturalPerson\" : true,  \"accessLevel\" : 1,  \"addressOutdated2\" : true,  \"address2\" : \"Wall Street\",  \"oenbId\" : \"123456789\",  \"identFlag\" : true,  \"advisorKey2\" : \"Adviser 2\",  \"advisorKey1\" : \"Adviser 1\",  \"birthDate\" : \"2017-01-01\",  \"esvg\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"seperateCustomer\" : true,  \"pepCode\" : \"PC\",  \"stateText\" : \"Sample State Text\",  \"nationality2\" : {    \"code\" : \"code\",    \"description\" : \"description\"  },  \"stateDate\" : \"2017-01-01\",  \"leiCode\" : \"51293836123123\"}", GetCustomerBasicDataResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerBasicDataResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerBasicDataResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerContactDataResponse> getCustomerContactData(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "") @Valid @RequestParam(value = "contactNumber", required = false) Integer contactNumber,@ApiParam(value = "") @Valid @RequestParam(value = "isActiveOnly", required = false) Boolean isActiveOnly,@ApiParam(value = "") @Valid @RequestParam(value = "isLatestOnly", required = false) Boolean isLatestOnly,@ApiParam(value = "") @Valid @RequestParam(value = "includeHidden", required = false) Boolean includeHidden) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerContactDataResponse>(objectMapper.readValue("{  \"personContacts\" : [ {    \"country\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"city\" : \"Lipa\",    \"contactActual\" : false,    \"postalCode\" : \"1080\",    \"lastModificationBranch\" : \"0580\",    \"addressForBlind\" : false,    \"commentText\" : \"TEXT\",    \"personCode\" : \"12345\",    \"depositBox\" : 0,    \"careOfText\" : \"Text\",    \"internalContactCode\" : \"internalContactCode\",    \"emailAddress\" : \"emailAddress\",    \"lastModificationDate\" : \"2017-12-05T10:52:06\",    \"contactWelcome\" : false,    \"streetNameNumber\" : \"Elm Street\",    \"contact\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"addressNumber\" : 5,    \"telefonNumber\" : \"telefonNumber\",    \"organizationalUnit\" : \"organizationalUnit\"  }, {    \"country\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"city\" : \"Lipa\",    \"contactActual\" : false,    \"postalCode\" : \"1080\",    \"lastModificationBranch\" : \"0580\",    \"addressForBlind\" : false,    \"commentText\" : \"TEXT\",    \"personCode\" : \"12345\",    \"depositBox\" : 0,    \"careOfText\" : \"Text\",    \"internalContactCode\" : \"internalContactCode\",    \"emailAddress\" : \"emailAddress\",    \"lastModificationDate\" : \"2017-12-05T10:52:06\",    \"contactWelcome\" : false,    \"streetNameNumber\" : \"Elm Street\",    \"contact\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"addressNumber\" : 5,    \"telefonNumber\" : \"telefonNumber\",    \"organizationalUnit\" : \"organizationalUnit\"  } ]}", GetCustomerContactDataResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerContactDataResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerContactDataResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerEconomicEnvironmentResponse> getCustomerEconomicEnvironment(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "IBAN") @Valid @RequestParam(value = "iban", required = false) String iban,@ApiParam(value = "Workflow Process") @Valid @RequestParam(value = "YYWorkflowProcess", required = false) String yyWorkflowProcess) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerEconomicEnvironmentResponse>(objectMapper.readValue("\"\"", GetCustomerEconomicEnvironmentResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerEconomicEnvironmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerEconomicEnvironmentResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerExternalRelationTypeResponse> getCustomerExternalRelationshipType(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@Size(max=10) @ApiParam(value = "Customer External Relationship Type",required=true) @PathVariable("relationType") String relationType) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerExternalRelationTypeResponse>(objectMapper.readValue("{  \"externalId\" : \"Testing\"}", GetCustomerExternalRelationTypeResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerExternalRelationTypeResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerExternalRelationTypeResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerHouseholdCalculationResponse> getCustomerHouseholdCalculation(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "IBAN") @Valid @RequestParam(value = "iban", required = false) String iban,@ApiParam(value = "Workflow Process") @Valid @RequestParam(value = "YYWorkflowProcess", required = false) String yyWorkflowProcess) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerHouseholdCalculationResponse>(objectMapper.readValue("{  \"personHouseholdCalculation\" : {    \"amountOtherLiabilities\" : 100.0,    \"amountTVPhone\" : 1000.5,    \"amountInsurance\" : 2000.0,    \"amountOwnRedemptions\" : 5000.0,    \"amountOtherRedemptions\" : 1040.0,    \"amountOverallExpenses\" : 1000.5,    \"amountNettoIncome\" : 1000.05,    \"amountLiving\" : 100.0,    \"amountCar\" : 1050.0,    \"otherIncomeType\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"amountSavingsProduct\" : 1000.5,    \"amountResidentExpenses\" : 1000.5,    \"amountOtherIncome\" : 1000.0,    \"amountPaybackLeases\" : 1000.5,    \"amountOtherSavings\" : 1005.0,    \"amountDistrainable\" : 100.0,    \"amountFamilyAllowance\" : 1005.0,    \"amountHouseSavings\" : 1000.05,    \"amountOverallIncome\" : 2000.0  },  \"personHouseholdCalculationAddOn\" : {    \"automobile\" : false,    \"ownHome\" : false,    \"incomePartner\" : true,    \"amountNettoIncomePartner\" : 105.0,    \"amountIncomeDistrainable\" : 100.0,    \"residentExpensesProof\" : false  }}", GetCustomerHouseholdCalculationResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerHouseholdCalculationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerHouseholdCalculationResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCustomerPromotionCodesResponse> getCustomerPromotionCodes(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@ApiParam(value = "Promotion Code",required=true) @PathVariable("promotionCode") String promotionCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCustomerPromotionCodesResponse>(objectMapper.readValue("{  \"promotionCodes\" : [ {    \"productFamily\" : \"96\",    \"validThru\" : \"2017-07-21T17:32:28Z\",    \"feeShortDescription\" : \"feeShortDescription\",    \"specialConditionPercentage\" : 1.46581298050294517310021547018550336360931396484375,    \"specialFeePlanCode\" : \"specialFeePlanCode\",    \"promotionCode\" : \"promotionCode\",    \"channel\" : \"channel\",    \"specialConditionType\" : \"3\",    \"specialConditionLumpSum\" : 6.02745618307040320615897144307382404804229736328125,    \"specialConditionUntil\" : \"2015-05-26T00:00:00.000+0000\",    \"validFrom\" : \"2017-07-21T17:32:28Z\",    \"specialFeePlanDescription\" : \"specialFeePlanDescription\",    \"productCode\" : \"S118\",    \"feeDescription\" : \"feeDescription\",    \"productShortDescription\" : \"SuperschnellKredit\",    \"feeCode\" : \"feeCode\",    \"nonRecurringBonusCreditnote\" : 50.0,    \"specialConditionChunk\" : 0.80082819046101150206595775671303272247314453125,    \"specialConditionRuntime\" : 5,    \"entity\" : \"0100\",    \"productDescription\" : \"SchnellKredit\",    \"customer\" : {      \"personNumber\" : \"00000001\",      \"entity\" : \"0100\"    }  }, {    \"productFamily\" : \"96\",    \"validThru\" : \"2017-07-21T17:32:28Z\",    \"feeShortDescription\" : \"feeShortDescription\",    \"specialConditionPercentage\" : 1.46581298050294517310021547018550336360931396484375,    \"specialFeePlanCode\" : \"specialFeePlanCode\",    \"promotionCode\" : \"promotionCode\",    \"channel\" : \"channel\",    \"specialConditionType\" : \"3\",    \"specialConditionLumpSum\" : 6.02745618307040320615897144307382404804229736328125,    \"specialConditionUntil\" : \"2015-05-26T00:00:00.000+0000\",    \"validFrom\" : \"2017-07-21T17:32:28Z\",    \"specialFeePlanDescription\" : \"specialFeePlanDescription\",    \"productCode\" : \"S118\",    \"feeDescription\" : \"feeDescription\",    \"productShortDescription\" : \"SuperschnellKredit\",    \"feeCode\" : \"feeCode\",    \"nonRecurringBonusCreditnote\" : 50.0,    \"specialConditionChunk\" : 0.80082819046101150206595775671303272247314453125,    \"specialConditionRuntime\" : 5,    \"entity\" : \"0100\",    \"productDescription\" : \"SchnellKredit\",    \"customer\" : {      \"personNumber\" : \"00000001\",      \"entity\" : \"0100\"    }  } ]}", GetCustomerPromotionCodesResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCustomerPromotionCodesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCustomerPromotionCodesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCustomerBasicData(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Customer Basic Data"  )  @Valid @RequestBody UpdateCustomerBasicDataRequest wsRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCustomerContactData(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Update Person Contact Data Request" ,required=true )  @Valid @RequestBody UpdateCustomerContactDataRequest wsRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCustomerEconomicEnvironment(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Update Person Economic Environment Request" ,required=true )  @Valid @RequestBody UpdateCustomerEconomicEnvironmentRequest wsRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCustomerHouseholdCalculation(@Size(max=4) @ApiParam(value = "Entity of the Customer",required=true) @PathVariable("customerEntity") String customerEntity,@Size(max=8) @ApiParam(value = "Customer Number",required=true) @PathVariable("customerNumber") String customerNumber,@ApiParam(value = "Update Household Calculation Request" ,required=true )  @Valid @RequestBody UpdateCustomerHouseholdCalculationRequest wsRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
