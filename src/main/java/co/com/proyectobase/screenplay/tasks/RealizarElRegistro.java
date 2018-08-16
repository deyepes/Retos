package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.interactions.SeleccionarLista;
import co.com.proyectobase.screenplay.model.DatosRegistroAutomationDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.proyectobase.screenplay.ui.AutomationDemoPage.*;

public class RealizarElRegistro implements Task {
	
	public RealizarElRegistro(List<DatosRegistroAutomationDemo> datosRegistro) {
		super();
		this.datosRegistro = datosRegistro;
	}

	private List<DatosRegistroAutomationDemo> datosRegistro; 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getFullName()).into(FIRST_NAME));
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getLastName()).into(LAST_NAME));
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getAddress()).into(ADDRESS));
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getEmailAdress()).into(EMAIL_ADDRESS));
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getPhone()).into(PHONE));
		actor.attemptsTo(Click.on(GENDER_MALE));
		actor.attemptsTo(Click.on(LANGUAGES));
		actor.attemptsTo(SeleccionarLista.Desde(LANGUAGES_LIST, datosRegistro.get(0).getLanguages().trim()));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistro.get(0).getCountry()).from(COUNTRY));
		actor.attemptsTo(Click.on(COUNTRY_SELECT));
		actor.attemptsTo(SeleccionarLista.Desde(COUNTRY_SELECT_LIST, datosRegistro.get(0).getSelectCountry().trim()));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistro.get(0).getDateOfBirthYear()).from(DATE_OF_BIRTH_YEAR));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistro.get(0).getDateOfBirthMonth()).from(DATE_OF_BIRTH_MONTH));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistro.get(0).getDateOfBirthDay()).from(DATE_OF_BIRTH_DAY));
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getPassword()).into(PASSWORD));
		actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getPassword()).into(CONFIRM_PASSWORD));
		actor.attemptsTo(Click.on(SUBMIT));
	}

	public static RealizarElRegistro enLaPaginaAutomationDemo(List<DatosRegistroAutomationDemo> datosRegistro) {
		return Tasks.instrumented(RealizarElRegistro.class, datosRegistro );
	}

}
