package br.com.Heranca.Pessoa;

public class Pessoa {

	private String nome;
	private int idade;
	private String endere�o;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public void introducao(String classificacao) {
		System.out.println("Seja bem vindo ao sistema, " + classificacao + ".");
		System.out.println("Continue insirindo os seus dados:");
	}
}
