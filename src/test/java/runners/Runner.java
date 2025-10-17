package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "@kiwi",
        dryRun = true
)
public class Runner {
    //dryrun false ise testi calistiririz, true ise steplerimizi olustururuz.

}
