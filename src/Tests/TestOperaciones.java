package Tests;

import org.junit.Assert;
import org.junit.Test;

import cuentasBancarias.CuentaBanc;

public class TestOperaciones {

	/*
	 * CuentaBanc c;
	 * 
	 * @Before 
	 * public void setUp() { 
	 * c = new CuentaBanc(); 
	 * }
	 */

	@Test
	public void testDePrueba() {
		CuentaBanc a=new CuentaBanc(123,525);
		CuentaBanc b=new CuentaBanc(124,100);//cuenta de destino
		
		Assert.assertEquals(1, a.transferirMontoHacia(520,a));
		
				
	}

}
