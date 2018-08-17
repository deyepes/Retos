package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.OrangeHRMPrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Entrar implements Task {

	private OrangeHRMPrincipalPage orangeHRMPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(orangeHRMPage));
	}

	public static Entrar aLaPaginaWebOrangeHRM() {
		return Tasks.instrumented(Entrar.class);
	}

}
