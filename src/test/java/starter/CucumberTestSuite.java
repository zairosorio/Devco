package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features="src/test/resources/features/search/search_by_keyword.feature",
        glue = { "" },
        snippets =  CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite {
}
