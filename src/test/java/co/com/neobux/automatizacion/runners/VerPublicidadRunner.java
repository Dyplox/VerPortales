package co.com.neobux.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/ver_publicidad.feature",
		glue = "co.com.neobux.automatizacion.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)

public class VerPublicidadRunner {
}