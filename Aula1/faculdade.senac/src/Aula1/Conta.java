package Aula1;

public class Conta {
	public int numero;
	public float saldo;
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String MostrarSaldo() {
		return "Conta " + this.numero + ", Saldo R$ " + this.saldo;
	}
	
}
