package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		//glue="stepDefination",stepNotifications=true,tags="@SanityTest"
		glue="stepDefination",
		stepNotifications=true,
		tags="@SanityTest or @RegTest or @MobileTest or @WebTest", //to execute scenario which have any one or both  the tags
				//glue="stepDefination",stepNotifications=true,tags="not @SanityTest" //to execute scenario which don't have SanityTest
				//glue="stepDefination",stepNotifications=true,tags="@SanityTest and @RegTest" //to execute scenario which have both the tags
	   // dryRun=true,//It gives info of what gherkin test case is not having code/stepDefination attached to it. Use this when you want to check errors in binding of feature file with step defination
		monochrome=true,// To get neet output
		//strict=true// Now this attribute by default available no need to write it in test runner //It doesn't allow u to skip error in project 
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"}	//we use pretty plugin to genarate ccolored report, We use "html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml" to genrate different extension of file in target folder 		
		)

public class TestRunner {

}