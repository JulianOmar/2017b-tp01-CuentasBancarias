package cuentasBancarias;

public class CuentaBancaria {
	
	public double nCuenta;
	public double saldo;
	
	public CuentaBancaria(double c, double s) {
		nCuenta=c;
		saldo=s;
	}

	/*cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);*/
	public int transferirMontoHacia(double monto, CuentaBancaria cc)
	{
		if(monto > 0 && this.saldo >= monto && this.nCuenta != cc.nCuenta)
		{
			cc.saldo+=monto;
			this.saldo-=monto;
			return 1;			
		}
		
		return -1;
	}
	
	public double obtenerSaldo ()
	{
		return saldo;
	}

}
