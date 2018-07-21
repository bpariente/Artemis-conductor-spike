# Generating mock server from contract yaml files
To generate mock server from yml provided  use the swagger-codegen project:

https://github.com/swagger-api/swagger-codegen

with this commands:

````
java -jar ${HOME}/infra/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  -i customers-applications-contract.yaml \
  -l spring \
  -o ./customers-applications

  java -jar ${HOME}/infra/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  -i customers-maint-contract.yaml \
  -l spring \
  -o ./customers-maint

    java -jar ${HOME}/infra/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  -i risk-person-contract.yaml \
  -l spring \
  -o ./risk-person-contract
 ````   
 
 # Running on Local
 
 To get services running on docker compose just run from project run:
 
 ````
 ./docker-compose-run.sh
 
 ````
 
 this command will build all the services on maven, the docker images and run the containers on a compose fashion!!...
 
 the services will attend on:
 
 ````
 
http://localhost:8090/customers-applications/swagger-ui.html

http://localhost:8091/customers-maint/swagger-ui.html
 
http://localhost:8092/risk-person-contract/swagger-ui.html
 ````
 