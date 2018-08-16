package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoPage extends PageObject {
	
	public static Target FIRST_NAME = Target.the("primer nombre").located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
	public static Target LAST_NAME = Target.the("apellido").located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
	public static Target ADDRESS = Target.the("apellido").located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
	public static Target EMAIL_ADDRESS = Target.the("apellido").located(By.xpath("//*[@id='eid']/input"));
	public static Target PHONE = Target.the("telefono").located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));	
	public static Target GENDER_MALE	= Target.the("Genero masculino").located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
	public static Target GENDER_FEMALE	= Target.the("Genero femenino").located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
	public static Target LANGUAGES	= Target.the("Languages").located(By.id("msdd"));
	public static Target LANGUAGES_LIST	= Target.the("Languages list").located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
	public static Target SKILLS = Target.the("skills").located(By.id("Skills"));
	public static Target COUNTRY = Target.the("Pais").located(By.id("countries"));
	public static Target COUNTRY_SELECT = Target.the("pais seleccionado").located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));
	public static Target COUNTRY_SELECT_LIST = Target.the("lista paises").located(By.id("select2-country-results"));
	public static Target DATE_OF_BIRTH_YEAR = Target.the("anio").located(By.id("yearbox"));
	public static Target DATE_OF_BIRTH_MONTH = Target.the("mes").located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
	public static Target DATE_OF_BIRTH_DAY = Target.the("dia").located(By.id("daybox"));
	public static Target PASSWORD = Target.the("password").located(By.id("firstpassword"));
	public static Target CONFIRM_PASSWORD = Target.the("Confirm password").located(By.id("secondpassword"));
	public static Target SUBMIT = Target.the("Boton confirmar").located(By.id("submitbtn"));
	public static Target TEXTO_RESULT = Target.the("Respuesta").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
