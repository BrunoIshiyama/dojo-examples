package com.ibm.SuperMessageReceiver;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import com.ibm.SuperMessageReceiver.Application;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
@ContextConfiguration(classes = {Application.class})
public class CucumberTest {
}
