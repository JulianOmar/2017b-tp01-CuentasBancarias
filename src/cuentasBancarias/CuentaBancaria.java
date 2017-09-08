package cuentasBancarias;

public class CuentaBancaria {
	
	public int nCuenta;
	public int saldo;
	
	public CuentaBancaria(int c, int s) {
		nCuenta=c;
		saldo=s;
	}

	/*cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);*/
	public int transferirMontoHacia(int monto, CuentaBancaria cc)
	{
		if(monto > 0 && this.saldo >= monto && this.nCuenta != cc.nCuenta)
		{
			cc.saldo+=monto;
			this.saldo-=monto;
			return 1;			
		}
		
		return -1;
	}

}
