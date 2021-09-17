package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/login"},
        tags = "@SuccessfulLogin",
        glue = "definitions",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        monochrome = true,
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
