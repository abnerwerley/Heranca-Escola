package br.com.Heranca.Pessoa;

//Sistema Escolar usando Heran�a | Author: Abner Werley Silva | date: 09/set/2021

public class Pessoa { // Super Classe, as outras classes v�o herdar m�todos dessa classe.

	// declara�es de argumentos que a pessoa pode ter (nem todos precisar�o ser
	// usados, o programador que decide)
	// as vari�veis private precisam ser declaradas fora de qualquer m�todo.

	private String nome;
	private int idade;
	private String endere�o;

	public String getNome() { // usado para chamar o nome deifnido e retornar� o valor ou string da var
		return nome;
	}

	public void setNome(String nome) { // definir� a vari�vel quando for chamado
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

	public void introducao(String classificacao) {// m�todo introdut�rio que qualquer clase que herdar Pessoa ou
													// Funcionario pode chamar
		System.out.println("Seja bem vindo ao sistema, " + classificacao + "."); // d� as boas vindas ao sistema e fala
																					// a classe da pessoa(professor,
																					// funcAdm ou aluno
		System.out.println("Continue insirindo os seus dados:");
	}
}
