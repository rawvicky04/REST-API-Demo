# REST-API-Demo
This is a demo of Rest API. One can understand how Rest API works.

REQUIREMENTS:
Spring Tool Suite - One can easily add this plugin on eclipse by going to help -> Eclipse Marketplace -> Search for Spring Tool Suite -> Go
Postman to check the different http methods. I have implemented GET, POST, PUT, DELETE.
You do not require any database access. I have created a hashmap just for demo purpose. In this hashmap, I have stored data and according different methods for that.

How to Run this..

Go to the src/main/java -> com.example.demo -> FirstSpringProjectApplication.java.
Run this as Spring Boot App.
Go to postman. Check for:
http://localhost:8080/getcountries
http://localhost:8080/getcountries/countryname?name=Australia

You can also check for the different endpoints which are present in Controller class in the package ..demo.controller after http://localhost:8080/

For post Request add data in raw and then json format:
Example:
{
    "name": "Japan",
    "capital": "Tokyo"
}

You can verify all this on postman.
Thanks.
