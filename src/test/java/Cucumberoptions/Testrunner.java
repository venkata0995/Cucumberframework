package Cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",glue = "Stepdefinations",tags="@Regtest or @smoketest",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"} )

public class Testrunner
{

    //practice hooks
}
