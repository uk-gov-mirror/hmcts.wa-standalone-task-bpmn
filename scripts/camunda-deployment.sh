#!/bin/bash
## Usage: ./camunda-deployment 
##
## Options:
##    - microservice_name: Name of the microservice. Default to `ccd_gw`.
##
## deployes bpmn/dmn to camunda.

AUTHORIZATION= sh ./idam-service-token.sh 


for file in ${WA_BPMNS}/*.bpmn ${WA_BPMNS}/*.dmn
do
	if [ -f "$file" ]
	then
curl --header "Content-Type: multipart/form-data" "ServiceAuthorization: ${AUTHORIZATION}"\
  --request POST \
  --form data=@$file \
  http://camunda-bpm/engine-rest/deployment/create
  fi
done
