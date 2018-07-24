package io.swagger.configuration;

import java.util.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T12:09:30.565+02:00")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("BAWAG MSA Customer Maintenance REST API")
            .description("## `DRAFT VERSION !!!`  This endpoint returns the transactions for a deposit account.  The returned transactions will be sorted descending by booking date.  The first version of the Bawag MSA API is an exciting step forward towards making transaction data accessible.  So we try hard to build something great!  All endpoints are only accessible via https and are located at https://api.bawagpsk.com.  For instance you can grab the records by accessing the following URL (which is not final and won't work because we are currently building it):   ```   GET https://api.bawagpsk.com/customers-maint/v1/customers ```  ## Missing things - Final header definitions  ## Request headers we got so far (this list is subject to change): - PreferredBackend('x-bawagpsk-preferred-backend') - Language('x-bawagpsk-language', 'LANGUAGE') - Location('x-bawagpsk-location') - LocationDetail('x-bawagpsk-location-detail') - BusinessChannel('x-bawagpsk-business-channel') - BusinessSubChannel('x-bawagpsk-business-sub-channel') - BankIdentification('x-bawagpsk-bank-identification') - SessionId('x-bawagpsk-session-id') - RequestId('x-bawagpsk-request-id') - ClientTimestamp('x-bawagpsk-client-timestamp') - ClientOS('x-bawagpsk-client-os', 'CLIENT_OS'), - CorrelationId('x-bawagpsk-correlation-id', 'CORRELATION_ID'), - GeospatialLocation('x-bawagpsk-geospatial-location', 'GEOSPATIAL_LOCATION') - Authorization('Authorization', 'AUTHORIZATION') - AppId('x-bawagpsk-app-id', 'APP_ID'), - AppName('x-bawagpsk-app-name', 'APP_NAME'), - VendorId('x-bawagpsk-vendor-id', 'X_VENDOR_ID'), - TestCaseId('x-bawagpsk-testcase-id'), - ChannelSourceName('bawagpsk-channel-source-name') - ChannelSourceVersion('bawagpsk-channel-source-version') - ForwardFor('x-forward-for', 'X_FORWARD_FOR'), - UserAgent('user-agent', 'USER_AGENT'), - AuthenticationType('authentication-type', 'AUTHENTICATION_TYPE') - AuthenticationValue('authentication-value', 'AUTHENTICATION_VALUE') - AuthenticationId('authentication-id', 'AUTHENTICATION_ID')  - AuthenticationIdType('authentication-id-type', 'AUTHENTICATION_ID_TYPE')  ## Response headers we got so far (this list is subject to change): - HTTP_HEADER_ERRORS = 'x-bawagpsk-errors' - HTTP_HEADER_WARNINGS = 'x-bawagpsk-warnings' - HTTP_HEADER_INFOS = 'x-bawagpsk-infos'  ## Structure  ### The Envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact ")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(java.util.Date.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
