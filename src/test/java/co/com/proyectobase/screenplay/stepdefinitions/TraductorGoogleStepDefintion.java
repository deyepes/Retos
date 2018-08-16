package co.com.proyectobase.screenplay.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleStepDefintion {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor esteban = Actor.named("Esteban");

	@Before
	public void configuracionInicial()
	{
		esteban.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Esteban want to use Google Translate$")
	public void thatEstebanWantToUseGoogleTranslate() throws Exception {
		esteban.wasAbleTo(Abrir.laPaginaDeGoogle());
	}

	@When("^he translate the word (.*) from ingles to espanol$")
	public void heTranslateTheWordTableFromInglesToEspanol(String palabra) throws Exception {
		esteban.attemptsTo(Traducir.deInglesAEspanolLa(palabra));
	}

	@Then("^he should see the word (.*) on the screen$")
	public void heShouldSeeTheWordMesaOnTheScreen(String palabra) throws Exception {
		esteban.should(seeThat(LaRespuesta.es(), equalTo(palabra)));
	}
}
