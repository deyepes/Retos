package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHRMPrincipalPage extends PageObject {

	public static Target LOGUEARSE = Target.the("botón login").located(By.id("btnLogin"));
	}
