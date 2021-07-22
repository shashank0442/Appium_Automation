package com.testautomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty"
        },
        tags = "@sk",
        features = "Appium_Automation/src/test/resources/features",
        glue = {"com.testautomation.steps"})
public class CukeWipTest {
}
