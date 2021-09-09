package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Heran�a | Author: Abner Werley Silva | date: 09/set/2021

public class FuncAdm extends Funcionario {// A classe em que estamo pode simplismente herdar Funcionario, porque
											// Funcionario j� herda de Pessoa
	// declara�es de argumentos que a pessoa pode ter (nem todos precisar�o ser
	// usados, o programador que decide)
	// as vari�veis private precisam ser declaradas fora de qualquer m�todo.

	private String setor;
	private String funcao;

	public String getSetor() {// usado para chamar o nome deifnido e retornar� o valor ou string da var
		return setor;
	}

	public void setSetor(String setor) {// definir� a vari�vel quando for chamado
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void definindoFunc() {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		FuncAdm funcionario1 = new FuncAdm();

		String nome;
		String setor;
		String funcao;

		funcionario1.introducao("Funcion�rio da Administra��o");

		System.out.println("Qual o seu nome?");
		nome = entrada.next();
		funcionario1.setNome(nome);// definindo var para ser chamada depois

		System.out.println("Qual seu setor?");
		setor = entrada.next();
		funcionario1.setSetor(setor);// definindo var para ser chamada depois

		System.out.println("Qual sua fun��o?");
		funcao = entrada.next();
		funcionario1.setFuncao(funcao);// definindo var para ser chamada depois

		System.out.println("Pode prosseguir, funcion�rio " + funcionario1.getNome() + " do setor "
				+ funcionario1.getSetor() + " da fun��o " + funcionario1.getFuncao());

		entrada.close();// fecha o Scanner

	}
}
