package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.AutomationDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresar implements Task {
	
	private AutomationDemoPage automationDemoPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(automationDemoPage));
	}

	public static Ingresar alaPaginaAutomationDemo() {
		return Tasks.instrumented(Ingresar.class);
	}

}
