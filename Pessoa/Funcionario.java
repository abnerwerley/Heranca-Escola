package br.com.Heranca.Pessoa;

import java.util.Scanner;

public class Funcionario extends Pessoa {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void escolha() {
		Scanner entrada = new Scanner(System.in);
		int opcao;

		Professor professor1 = new Professor();
		FuncAdm funcionarioAdm = new FuncAdm();

		System.out.println("Ol� funcionario, voc� � um professor ou funcion�rio da Administra��o?");
		System.out.println("Digite 1 caso professor, ou 2 caso funcion�rio da adm.");
		opcao = entrada.nextInt();

		if (opcao == 1) {

			professor1.definindo();
		} else if (opcao == 2) {

			funcionarioAdm.definindoFunc();
		}

		entrada.close();
	}

}
