package nl.dijkrosoft.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Created by dickdijk on 01/11/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Adding.feature"},
        format = {"html:target/cucumber", "json:target/cucumber.json"}
)
public class Runner {
}