package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",  //Search.feature
		glue={"stepdefinations","hooks"},
		plugin= {"pretty","html:target/Cucumberreport/CucumberReport.html",
				           "json:target/CucumberReports/CucumberReport.json",
				           "junit:target/CucumberReports/CucumberReport.xml"},
		dryRun=true,
		//publish=true,
		
                 // tags="@all")
				 // tags="@register")
                 //   tags="@smoke")
                   //tags="@validcredentials")
                   //tags="@nocredentials")
                   //tags="@register and @smoke")
                    // tags="not @nocredentials")
                    //tags="@smoke and not @nocredentials")
                     tags="@all")
		              //tags="@register and not @ignore and not @wip and not @dev ")
public class TestRunner {
	
	

}
