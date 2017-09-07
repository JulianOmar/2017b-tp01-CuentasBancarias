package cuentasBancarias;

public class CuentaBanc {
	
	public int nCuenta;
	public int saldo;
	
	public CuentaBanc(int c,int s) {
		nCuenta=c;
		saldo=s;
	}

	/*cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);*/
	public int transferirMontoHacia(int monto,CuentaBanc cc)
	{
		if(monto <0)
			return -1;
		if(this.nCuenta != cc.nCuenta)
		{
		cc.saldo+=monto;
		this.saldo-=monto;
		}
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	/// "String" para salida por consola
	public int mostrarCta()
	{
		return nCuenta;
	}
	
	public int mostrarSdo()
	{
		return saldo;
	}

}
