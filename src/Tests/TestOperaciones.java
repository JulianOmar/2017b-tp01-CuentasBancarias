package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cuentasBancarias.CuentaBanc;

public class TestOperaciones {

	CuentaBanc a;
	CuentaBanc b;
	  
	@Before 
	public void setUp() { 
		a=new CuentaBanc(123,525);
		b=new CuentaBanc(124,100);//cuenta de destino 
	}
	 
	@Test
	public void testDePrueba() {
		Assert.assertEquals(1, a.transferirMontoHacia(520,b));
		
		System.out.println("A.Cuenta: "+a.mostrarCta()+"\tSaldo: "+a.mostrarSdo());
		System.out.println("B.Cuenta: "+b.mostrarCta()+"\tSaldo: "+b.mostrarSdo());
				
	}
	
	@Test
	public void testSaldoNegativo() {
		
		Assert.assertEquals(-1, a.transferirMontoHacia(-520,b));
	}
	
	@Test
	public void testAutoTrans() {
		Assert.assertEquals(-1, a.transferirMontoHacia(520,a));
	}
	
	@Test
	public void testSaldoMenor() {
		Assert.assertEquals(-1, a.transferirMontoHacia(526,b));
	}
	
	@Test
	public void testSaldoCero() {
		Assert.assertEquals(-1, a.transferirMontoHacia(0,b));
	}

}
