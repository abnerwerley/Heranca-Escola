package br.com.Heranca.Pessoa;

import java.util.Scanner;

public class FuncAdm extends Funcionario {

	private String setor;
	private String funcao;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
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
		funcionario1.setNome(nome);

		System.out.println("Qual seu setor?");
		setor = entrada.next();
		funcionario1.setSetor(setor);

		System.out.println("Qual sua função?");
		funcao = entrada.next();
		funcionario1.setFuncao(funcao);

		System.out.println("Pode prosseguir, funcionário " + funcionario1.getNome() + " do setor "
				+ funcionario1.getSetor() + " da função " + funcionario1.getFuncao());

		entrada.close();

	}
}
