package co.com.proyectobase.screenplay.questions;

import static co.com.proyectobase.screenplay.ui.OrangeHRMConsultaEmpleadoPage.EMPLEADO_ENCONTRADO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElEmpleado  implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(EMPLEADO_ENCONTRADO).viewedBy(actor).asString().trim();
	}

	public static ElEmpleado enPantallaEs() {
		return new ElEmpleado();
	}

}
