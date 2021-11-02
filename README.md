# Camel K
## Setup
The CRD's are deployed at https://github.com/baloise-incubator/okd4-cluster-infra-apps.  
In this repository you can find the Camel K operator and the example apps build during the code camp 2021.

## Local setup
Please install the Kamel CLI from https://camel.apache.org/camel-k/next/installation/installation.html#procedure.

# Topics
## OpenAPI
You can use OpenAPI v3. Over the `operation-id` you can connect operations form the OpenAPI YAML to the Camel DSL.  
To run the integration you have to do `kamel run ./src/main/java/ch/w3tec/CamelRoute.java`.
The `tls-termination=edge` is for OpenShift to enable HTTPS.

In general a lot of the OpenAPI spec is not respected like payload validations or return types/codes.  
It makes more sense to use https://camel.apache.org/manual/rest-dsl.html to define the API by DSL and generate the OpenAPI.

## Testing


## Monitoring
https://camel.apache.org/camel-k/next/observability/monitoring.html

## Notes
- If you change you source code the image depolyed to OpenShift doesn't change. The source coded is mounted via volume into the container and not part of the container build.