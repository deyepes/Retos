package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.By;

import co.com.proyectobase.screenplay.interactions.SeleccionarLista;
import co.com.proyectobase.screenplay.model.DatosRegistroOrange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.proyectobase.screenplay.ui.OrangeHRMPrincipalPage.*;
import static co.com.proyectobase.screenplay.ui.OrangeHRMIngresoEmpleadoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarElIngreso implements Task {

	private List<DatosRegistroOrange> dataTable;
	
	public RealizarElIngreso(List<DatosRegistroOrange> dataTable) {
		super();
		this.dataTable = dataTable;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LOGUEARSE));
		actor.attemptsTo(Click.on(MODULO_INFORMACION_PERSONAL));
		actor.attemptsTo(Click.on(AGREGAR_EMPLEADO));
		actor.attemptsTo(WaitUntil.the(PRIMER_BOTON_GUARDAR, isVisible()),
				Enter.theValue(dataTable.get(0).getFirstName()).into(NOMBRE));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getMiddleName()).into(SEGUNDO_NOMBRE));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getLastName()).into(APELLIDO));
		actor.attemptsTo(Click.on(UBICACION));
		actor.attemptsTo(SeleccionarLista.Desde(LISTA_DE_UBICACION, dataTable.get(0).getLocation().trim()));
		actor.attemptsTo(Click.on(PRIMER_BOTON_GUARDAR));
		actor.attemptsTo(WaitUntil.the(SEGUNDO_BOTON_GUARDAR, isVisible()),
				Enter.theValue(dataTable.get(0).getDateBirth()).into(FECHA_NACIMIENTO));
		actor.attemptsTo(Click.on(ESTADO_CIVIL));
		actor.attemptsTo(SeleccionarLista.Desde(LISTA_ESTADO_CIVIL, dataTable.get(0).getMaritalStatus().trim()));
		actor.attemptsTo(Click.on(MASCULINO));
		actor.attemptsTo(Click.on(NACIONALIDAD));
		actor.attemptsTo(SeleccionarLista.Desde(LISTA_DE_NACIONALIDADES, dataTable.get(0).getNationality().trim()));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getLicenseNumber()).into(NUMERO_LICENCIA));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getLicenseExpiry()).into(FECHA_EXPIRACION_DE_LA_LICENCIA));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getNickName()).into(APODO));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getMilitaryService()).into(SERVICIO_MILITAR));
		actor.attemptsTo(Click.on(GRUPO_SANGUINEO));
		actor.attemptsTo(SeleccionarLista.Desde(LISTA_GRUPO_SANGUINEO, dataTable.get(0).getBloodGroup().trim()));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getHobbies().trim()).into(HOBBIES));
		actor.attemptsTo(Click.on(SEGUNDO_BOTON_GUARDAR));
	}

	public static RealizarElIngreso enLaPaginaOrangeHRMConLa(List<DatosRegistroOrange> dataTable) {
		return Tasks.instrumented(RealizarElIngreso.class, dataTable);
	}

}
