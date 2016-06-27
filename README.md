# multi-tenant
Single App, multiple customers customizations.

You sometimes need to override some default implementations due to customer needs. One way to achieve it using spring boot is a combination of annotations.

Checkout the project and change the property you find in the application.properties.

```
mlt.customer=customer1
```
or 

```
mlt.customer=customer2
```
or
```
mlt.customer=
```
Run it using 
```
mvn spring-boot:run
```
and connect to localhost:8080/.

The proper service implementation will be chosen to serve the controller. 
