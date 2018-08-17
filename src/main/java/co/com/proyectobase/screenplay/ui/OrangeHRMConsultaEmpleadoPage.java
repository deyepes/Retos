package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHRMConsultaEmpleadoPage extends PageObject {

	public static Target LISTA_EMPLEADOS = Target.the("mostrar empleados").located(By.id("menu_pim_viewEmployeeList"));
	public static Target NOMBRE_EMPLEADO = Target.the("Campo ingreso nombre").located(By.id("employee_name_quick_filter_employee_list_value"));
	public static Target BUSQUEDA = Target.the("boton de busqueda").located(By.id("quick_search_icon"));
	public static Target EMPLEADO_ENCONTRADO = Target.the("empleado encontrado en la busqueda").located(By.xpath("//*[@id='employeeListTable']/tbody/tr[1]/td[3]"));
}
