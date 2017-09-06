package cuentasBancarias;

public class CuentaBanc {
	
	public int nCuenta;
	public int saldo;
	
	
	
	
	public CuentaBanc(int c,int s) {
		nCuenta=c;
		saldo=s;
	}

	public int mostrarCta()
	{
		return nCuenta;
	}
	
	public int mostrarSdo()
	{
		return saldo;
	}

}
