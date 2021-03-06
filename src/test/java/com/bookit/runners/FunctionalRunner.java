package com.bookit.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"pretty:target/cucumber-pretty.txt",
				"html:target/html-report",
				"json:target/cucumber.json",
				"junit:target/junit/junit-report.xml",
			},
		tags = {"~@ignore",},   
		features= {
			"src/test/resources/features/Hunt.feature"  		
		},
        glue= {"com/bookit/stepdefinitions","com/bookit/suitesetupandteardown"},
        //dryRun=true,
        monochrome = true
		)
public class FunctionalRunner {
	
}
