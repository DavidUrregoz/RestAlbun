package co.com.sofka.runner.Placeholder.albuns;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features.Placeholder/albunColors.feature"},
        glue = {"co.com.sofka.stepdefinition.Placeholder.albuns"},
        tags = "not @ignore"
)
public class AlbunsRunner {
}
