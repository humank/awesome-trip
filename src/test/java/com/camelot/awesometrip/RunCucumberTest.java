package com.camelot.awesometrip;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.camelot.awesometrip",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/Cucumber.json",
                "junit:target/Cucumber.xml" })
public class RunCucumberTest {
}
