package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cuentasBancarias.CuentaBancaria;

public class TestOperaciones {

	CuentaBancaria cuentaA;
	CuentaBancaria cuentaB;
	  
	@Before
	public void setUp() { 
		cuentaA=new CuentaBancaria(123, 525);
		cuentaB=new CuentaBancaria(124, 100); //cuenta de destino 
	}
	 
	@Test
	public void testDePrueba() {
		Assert.assertEquals(1, cuentaA.transferirMontoHacia(520, cuentaB));	
	}
	
	@Test
	public void testSaldoNegativo() {
		Assert.assertEquals(-1, cuentaA.transferirMontoHacia(-520, cuentaB));
	}
	
	@Test
	public void testAutoTrans() {
		Assert.assertEquals(-1, cuentaA.transferirMontoHacia(520, cuentaA));
	}
	
	@Test
	public void testSaldoMenor() {
		Assert.assertEquals(-1, cuentaA.transferirMontoHacia(526, cuentaB));
	}
	
	@Test
	public void testSaldoCero() {
		Assert.assertEquals(-1, cuentaA.transferirMontoHacia(0, cuentaB));
	}
	
	@Test
	public void testMontoIgualASaldo() {
		Assert.assertEquals(1, cuentaB.transferirMontoHacia(100, cuentaA));
	}

}
