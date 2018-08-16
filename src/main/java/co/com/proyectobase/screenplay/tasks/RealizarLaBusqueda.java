package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.model.DatosRegistroOrange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.proyectobase.screenplay.ui.OrangeHRMPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarLaBusqueda implements Task{
	

	private List<DatosRegistroOrange> dataTable;
	
	public RealizarLaBusqueda(List<DatosRegistroOrange> dataTable) {
		super();
		this.dataTable = dataTable;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(MENSAJE_EXITOSO, isVisible()),
				Click.on(LISTA_EMPLEADOS));
		actor.attemptsTo(Enter.theValue(dataTable.get(0).getFirstName()+" "+(dataTable.get(0).getMiddleName()+" "+ dataTable.get(0).getLastName())).into(NOMBRE_EMPLEADO));
		actor.attemptsTo(Click.on(BUSQUEDA));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static RealizarLaBusqueda enLaPaginaOrangeHRMConLa(List<DatosRegistroOrange> dataTable) {
		return Tasks.instrumented(RealizarLaBusqueda.class, dataTable);
	}

}
