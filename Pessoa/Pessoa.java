package br.com.Heranca.Pessoa;

public class Pessoa {

	private String nome;
	private int idade;
	private String enderešo;

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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public void introducao(String classificacao) {
		System.out.println("Seja bem vindo ao sistema, " + classificacao + ".");
		System.out.println("Continue insirindo os seus dados:");
	}
}
