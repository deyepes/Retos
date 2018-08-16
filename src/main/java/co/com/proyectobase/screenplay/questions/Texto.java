package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.proyectobase.screenplay.ui.AutomationDemoPage.*;

public class Texto implements Question<String>{

	public static Texto enPantallaEs() {
		return new Texto();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TEXTO_RESULT).viewedBy(actor).asString();
	}

}
