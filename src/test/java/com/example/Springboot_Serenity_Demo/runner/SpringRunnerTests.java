package com.example.Springboot_Serenity_Demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources", tags = "",
        glue = "com.example.Springboot_Serenity_Demo.definitions", publish = true)

public class SpringRunnerTests {

}
