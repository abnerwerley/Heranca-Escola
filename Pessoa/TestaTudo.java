package br.com.Heranca.Pessoa;

import java.util.Scanner;

public class TestaTudo {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		Aluno aluno1 = new Aluno();
		int opcao;

		System.out.println("Olá, você é funcionário ou aluno?");
		System.out.println("Digite 1 caso funcionario.");
		System.out.println("Digite 2 caso aluno.");
		opcao = entrada.nextInt();

		if (opcao == 1) {

			funcionario1.escolha();
		} else if (opcao == 2) {
			aluno1.definindoAluno();
		}

	}

}
