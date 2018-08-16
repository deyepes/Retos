package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.DatosRegistroOrange;
import co.com.proyectobase.screenplay.questions.ElEmpleado;
import co.com.proyectobase.screenplay.questions.Texto;
import co.com.proyectobase.screenplay.tasks.Entrar;
import co.com.proyectobase.screenplay.tasks.RealizarElIngreso;
import co.com.proyectobase.screenplay.tasks.RealizarLaBusqueda;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class OrangeAutomationStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuraciónInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}

	@Dado("^que Juan necesita crear un empleado en el OrangeHR$")
	public void queJuanNecesitaCrearUnEmpleadoEnElOrangeHR() throws Exception {
	   carlos.wasAbleTo(Entrar.aLaPaginaWebOrangeHRM());
	}

	@Cuando("^el realiza el ingreso del registro en la aplicación$")
	public void elRealizaElIngresoDelRegistroEnLaAplicación(List<DatosRegistroOrange> informacion) throws Exception {
		carlos.attemptsTo(RealizarElIngreso.enLaPaginaOrangeHRMConLa(informacion));
	}

	@Entonces("^el visualiza el nuevo empleado en el aplicativo$")
	public void elVisualizaElNuevoEmpleadoEnElAplicativo(List<DatosRegistroOrange> informacion) throws Exception {
		carlos.attemptsTo(RealizarLaBusqueda.enLaPaginaOrangeHRMConLa(informacion));
		carlos.should(seeThat(ElEmpleado.enPantallaEs(), containsString((informacion.get(0).getFirstName()+" "+informacion.get(0).getMiddleName()+" "+ informacion.get(0).getLastName()).trim())));
	}
}
