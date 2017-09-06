package cuentasBancarias;

/* EL USO DE MAIN ES INECESARIO PARA ESTE PROYCTO*/
public class Main {
	

	public static void main(String[] args) {

		CuentaBanc cliente1 = new CuentaBanc(123,25);
		
		System.out.println("Cuenta: "+cliente1.mostrarCta()+"\nSaldo: "+cliente1.mostrarSdo());

	}

}
