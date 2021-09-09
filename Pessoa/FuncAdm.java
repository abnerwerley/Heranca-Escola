package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Herança | Author: Abner Werley Silva | date: 09/set/2021

public class FuncAdm extends Funcionario {// A classe em que estamo pode simplismente herdar Funcionario, porque
											// Funcionario já herda de Pessoa
	// declaraões de argumentos que a pessoa pode ter (nem todos precisarão ser
	// usados, o programador que decide)
	// as variáveis private precisam ser declaradas fora de qualquer método.

	private String setor;
	private String funcao;

	public String getSetor() {// usado para chamar o nome deifnido e retornará o valor ou string da var
		return setor;
	}

	public void setSetor(String setor) {// definirá a variável quando for chamado
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

		funcionario1.introducao("Funcionário da Administração");

		System.out.println("Qual o seu nome?");
		nome = entrada.next();
		funcionario1.setNome(nome);// definindo var para ser chamada depois

		System.out.println("Qual seu setor?");
		setor = entrada.next();
		funcionario1.setSetor(setor);// definindo var para ser chamada depois

		System.out.println("Qual sua função?");
		funcao = entrada.next();
		funcionario1.setFuncao(funcao);// definindo var para ser chamada depois

		System.out.println("Pode prosseguir, funcionário " + funcionario1.getNome() + " do setor "
				+ funcionario1.getSetor() + " da função " + funcionario1.getFuncao());

		entrada.close();// fecha o Scanner

	}
}
