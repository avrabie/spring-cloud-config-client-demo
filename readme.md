### Trivial tasks: 
I. Given an online repository: fetch the config data from it and push them in the env variables
Solution:
1. Requires a Config Server in the cloud/k8s env that is already running.
2. Add the following dependencies
```xml
<dependencies>
    <!--...-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter</artifactId>
    </dependency>
    <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
    </dependency>
</dependencies>

```


II. Openapi (Api first approach)
1. Given an open-api v3 specification [openapi.yaml](src/main/resources/openapi.yaml)
2. Generate classes that can be used 
following https://openapi-generator.tech/docs/plugins/
https://mydeveloperplanet.com/2022/02/08/generate-server-code-using-openapi-generator/

Solution:
Either add:
```xml

<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>2.0.1.Final</version>
</dependency>
```
or substitute it with

```xml
<!--https://mvnrepository.com/artifact/io.swagger.parser.v3/swagger-parser-->
<dependency>
    <groupId>io.swagger.parser.v3</groupId>
    <artifactId>swagger-parser</artifactId>
    <version>2.1.9</version>
</dependency>
```

### Testing a Spring Boot App that is a Client for Discovery Services and is using Configuration Services

Adjust the testing environment. Create application properties in test. 
Disable cloud.config and the registration of the client 
with discovery services
```properties
spring.cloud.config.enabled=false

eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false

```
