package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraductorPage {
	
	public static final Target BOTON_LENGUAJE_ORIGEN = Target.the("Bot�n de idioma origen").located(By.id("gt-sl-gms"));
	public static final Target BOTON_LENGUAJE_DESTINO = Target.the("Bot�n de idioma destino").located(By.id("gt-tl-gms"));
	public static final Target OPCION_INGLES = Target.the("La opci�n ingl�s").located(By.xpath("//div[@id='gt-sl-gms-menu']/table/tbody//tr/td//div[contains(text(),'ingl')]"));
	public static final Target OPCION_ESPANOL = Target.the("El segundo idioma").located(By.xpath("//div[@id='gt-tl-gms-menu']/table/tbody//tr/td//div[contains(text(),'espa')]"));
	public static final Target AREA_DE_TRADUCCION = Target.the("El lugar donde se escriben las palabras a traducir").located(By.id("source"));
	public static final Target BOTON_TRADUCIR = Target.the("El bot�n traducir").located(By.id("gt-submit"));
	public static final Target AREA_TRADUCIDA = Target.the("El �rea donde ya se presenta la palabra traducida").located(By.id("gt-res-dir-ctr"));
	

}
