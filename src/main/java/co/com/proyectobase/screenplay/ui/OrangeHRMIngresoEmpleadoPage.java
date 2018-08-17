package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHRMIngresoEmpleadoPage extends PageObject {

	public static Target MODULO_INFORMACION_PERSONAL = Target.the("botón PIM").located(By.id("menu_pim_viewPimModule"));
	public static Target AGREGAR_EMPLEADO = Target.the("botón PIM").located(By.id("menu_pim_addEmployee"));
	public static Target NOMBRE = Target.the("input first name").located(By.id("firstName"));
	public static Target SEGUNDO_NOMBRE = Target.the("input middle name").located(By.id("middleName"));
	public static Target APELLIDO = Target.the("input last name").located(By.id("lastName"));
	public static Target PRIMER_BOTON_GUARDAR = Target.the("boton guardar").located(By.id("systemUserSaveBtn"));
	public static Target UBICACION = Target.the("ubicacion").located(By.xpath("//*[@id='location_inputfileddiv']/div/input"));
	public static Target LISTA_DE_UBICACION = Target.the("ubicacion lista").located(By.xpath("//*[@id='location_inputfileddiv']/div/ul"));
	public static Target SEGUNDO_BOTON_GUARDAR = Target.the("boton guardar 1").located(By.xpath("//*[@id='pimPersonalDetailsForm']/materializecss-decorator[8]/div/sf-decorator[2]/div/button"));
	public static Target FECHA_NACIMIENTO = Target.the("fecha de nacimiento").located(By.id("date_of_birth"));
	public static Target ESTADO_CIVIL = Target.the("estado civil").located(By.xpath("//*[@id='marital_status_inputfileddiv']/div/input"));
	public static Target LISTA_ESTADO_CIVIL = Target.the("Lista de estado civil").located(By.xpath("//*[@id='marital_status_inputfileddiv']/div/ul"));
	public static Target MASCULINO = Target.the("masculino").located(By.xpath("//*[@id='pimPersonalDetailsForm']/materializecss-decorator[3]/div/sf-decorator[3]/div/ul/li[1]/label"));
	public static Target FEMENINO = Target.the("femenino").located(By.xpath("//*[@id='pimPersonalDetailsForm']/materializecss-decorator[3]/div/sf-decorator[3]/div/ul/li[2]/label"));
	public static Target NACIONALIDAD = Target.the("nacionalidad").located(By.xpath("//*[@id='nationality_inputfileddiv']/div/input"));
	public static Target LISTA_DE_NACIONALIDADES = Target.the("Lista de nacionalidades").located(By.xpath("//*[@id='nationality_inputfileddiv']/div/ul"));
	public static Target NUMERO_LICENCIA = Target.the("numero de licencia de conduccion").located(By.id("driver_license"));
	public static Target FECHA_EXPIRACION_DE_LA_LICENCIA = Target.the("fecha de expiración licencia de conduccion").located(By.id("license_expiry_date"));
	public static Target APODO = Target.the("nick name").located(By.id("nickName"));
	public static Target SERVICIO_MILITAR = Target.the("nick name").located(By.id("militaryService"));
	public static Target GRUPO_SANGUINEO = Target.the("grupo sanguineo").located(By.xpath("//*[@id='1_inputfileddiv']/div/input"));
	public static Target LISTA_GRUPO_SANGUINEO = Target.the("lista grupo sanguineo").located(By.xpath("//*[@id='1_inputfileddiv']/div/ul"));
	public static Target HOBBIES = Target.the("hobbies").located(By.id("5"));
	public static Target MENSAJE_EXITOSO = Target.the("mensaje exitoso").located(By.className("toast-message	"));
	}
