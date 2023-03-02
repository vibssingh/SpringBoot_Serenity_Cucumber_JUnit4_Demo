package com.example.Springboot_Serenity_Demo.definitions;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public abstract class AbstractRestAssuredHelper {
     private final static String BASE_URI = "http://localhost";
 
     @LocalServerPort
     private int port;

  //   @Value("${server.servlet.context-path}")
  //   private String basePath;
 
     protected void configureRestAssured() {
           RestAssured.baseURI = BASE_URI;
           RestAssured.port = port;
         //  RestAssured.basePath = basePath;
           
 
     }

     protected RequestSpecification getAnonymousRequest() {
           configureRestAssured();
           return SerenityRest.given();
     }
}
