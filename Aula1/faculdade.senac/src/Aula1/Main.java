package Aula1;

public class Main {
	public static void main(String[] args) {
	
	//Instanciar o objeto cliente
	Cliente cliente_01 = new Cliente("02850435902",1980,"Marcos da Rocha Souza","mr_souza@gmail.com");
	
	//Fim - Classe cliente
	System.out.println("Dados do Cliente");
	System.out.println(cliente_01.MostrarDados());
	System.out.println("\n");
	
	Cliente cliente_02 = new Cliente("85780413991",1974,"Leonardo Correia de Souza","lsouza4791@gmail.com");
	System.out.println("Dados do Cliente");
	System.out.println(cliente_02.MostrarDados());
	System.out.println("\n");
	
	//--------------------------------------
	// Preencher atributos do Objeto
	//Instanciar o objeto conta
	Conta conta_01 = new Conta(1521, 750.63f);
	//Fim - Classe conta
	//--------------------------------------
	System.out.println("Dados da Conta do Cliente");
	System.out.println(conta_01.MostrarSaldo());
	Conta conta_02 = new Conta(2810,1500.63f);
	//Fim - Classe conta
	System.out.println("\n");
	//--------------------------------------
	System.out.println("Dados da Conta do Cliente");
	System.out.println(conta_02.MostrarSaldo());
	
	}
}
