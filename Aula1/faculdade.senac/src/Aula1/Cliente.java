package Aula1;

public class Cliente {
	public String cpf;
	public int anoNascimento;
	public String nome;
	public String email;
	
	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
	}
	
	public String MostrarDados() {
		return "Nome " + this.nome + ",Cpf " + this.cpf + ",Ano Nascimento " + this.anoNascimento + ",Email "  + this.email;
	}
	
}
