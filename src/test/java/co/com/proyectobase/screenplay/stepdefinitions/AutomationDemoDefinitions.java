package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.DatosRegistroAutomationDemo;
import co.com.proyectobase.screenplay.questions.Texto;
import co.com.proyectobase.screenplay.tasks.Ingresar;
import co.com.proyectobase.screenplay.tasks.RealizarElRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AutomationDemoDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
		carlos.wasAbleTo(Ingresar.alaPaginaAutomationDemo());
	}

	@Cuando("^el realiza el registro en la pagina$")
	public void elRealizaElRegistroEnLaPagina(List<DatosRegistroAutomationDemo> datosRegistro) throws Exception {
		carlos.attemptsTo(RealizarElRegistro.enLaPaginaAutomationDemo(datosRegistro));
	}

	@Entonces("^el verifica que se carga la pantalla con texto (.*)$")
	public void elVerificaQueSeCargaLaPantallaConTexto(String texto) throws Exception {
		carlos.should(seeThat(Texto.enPantallaEs(), containsString(texto)));
	}

}
