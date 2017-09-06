package cuentasBancarias;

public class Main {

	public static void main(String[] args) {

		CuentaBanc cliente1 = new CuentaBanc(123,25);
		
		System.out.println("Cuenta: "+cliente1.mostrarCta()+"\nSaldo: "+cliente1.mostrarSdo());

	}

}
