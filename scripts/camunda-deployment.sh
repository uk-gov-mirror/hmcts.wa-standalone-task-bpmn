#!/bin/bash
## Usage: ./camunda-deployment
##
## Options:
##    - authorization: Service Auth token.
##
## deployes bpmn/dmn to camunda.

authorization=""


for file in ${WA_BPMNS}/*.bpmn ${WA_BPMNS}/*.dmn
do
	if [ -f "$file" ]
	then
curl --header "Content-Type: multipart/form-data" "ServiceAuthorization: ${authorization}"\
  --request POST \
  --form data=@$file \
  "http://camunda-bpm/engine-rest/deployment/create"
  fi
done

for file in ${IA_TASK_DMNS}/*.bpmn ${IA_TASK_DMNS}/*.dmn
do
	if [ -f "$file" ]
	then
curl --header "Content-Type: multipart/form-data" "ServiceAuthorization: ${authorization}"\
  --request POST \
  --form data=@$file \
  "http://camunda-bpm/engine-rest/deployment/create"
  fi
done
