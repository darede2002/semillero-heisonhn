package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
//import org.testng.log4testng.Logger;

/** 
 * Descripcion Clase que determina las pruebas unitarias para el caso de usi 1050 operaciones aritmeticas
 * caso de uso CU1050
 * @author Diego
 *@version 1.0
 */
public class OperacionesAritmeticasTest {
	
	/**
	 * constante que contrndra el log de la clase AritmeticaTest
	 */
	private final static Logger Log = Logger.getLogger(OperacionesAritmeticasTest.class);
	
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); //inicializa logger con una configuracion básica
		Log.info("::::::::::::::::::::::::::::::::::::::INICIAN PRUEBAS UNITARIAS::::::::::::::::::::::::::::::::::::::");
	}
	
	@Test
	public void validarREsultadoSumaExitoso() {
		Log.info("Inicia ejecucion del metodo validarResultadoSumaExitoso");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 450;
		
		Assert.assertEquals(resultado, numero1 + numero2);
		
		
		Log.info("finaliza la ejecucion del metodo validarResultadoExitoso");
		
	}
	
	@Test
	public void validarResultadoSumaFallido() {
		Log.info("inicia ejecucion validarSumaFallido");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 455;
		
		try {
			Assert.assertFalse(resultado != numero1 + numero2);
			if(resultado != (numero1 + numero2)) {
				Log.info("se ha generado un error funcional probando el test validarREsultadoSumaFallido");
				throw new Exception("La suma ha fallado en el calculo");
				
			}
		}catch (Exception e) {
				Assert.assertEquals(e.getMessage(), "La suma ha fallado en el calculo");
		}
		
		
		
		Log.info("termina ejecucion validarSumaFallido");
		
	}
	
	public void finalizaPruebasUnitarias() {
		Log.info("::::::::finalizan pruebas unitarias:::::::::::::");
	}

}
