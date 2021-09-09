package br.com.Heranca.Pessoa;

//Sistema Escolar usando Herança | Author: Abner Werley Silva | date: 09/set/2021

public class Pessoa { // Super Classe, as outras classes vão herdar métodos dessa classe.

	// declaraões de argumentos que a pessoa pode ter (nem todos precisarão ser
	// usados, o programador que decide)
	// as variáveis private precisam ser declaradas fora de qualquer método.

	private String nome;
	private int idade;
	private String endereço;

	public String getNome() { // usado para chamar o nome deifnido e retornará o valor ou string da var
		return nome;
	}

	public void setNome(String nome) { // definirá a variável quando for chamado
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void introducao(String classificacao) {// método introdutório que qualquer clase que herdar Pessoa ou
													// Funcionario pode chamar
		System.out.println("Seja bem vindo ao sistema, " + classificacao + "."); // dá as boas vindas ao sistema e fala
																					// a classe da pessoa(professor,
																					// funcAdm ou aluno
		System.out.println("Continue insirindo os seus dados:");
	}
}
