package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Herança | Author: Abner Werley Silva | date: 09/set/2021

public class Funcionario extends Pessoa {// para usar a herança, depois do public class NomeDaClasse vai o exends, e a
											// classe que essa vai herdar para poder usar seus dados.

	// declaraões de argumentos que a pessoa pode ter (nem todos precisarão ser
	// usados, o programador que decide)
	// as variáveis private precisam ser declaradas fora de qualquer método.

	private double salario;

	public double getSalario() {// usado para chamar o nome deifnido e retornará o valor ou string da var
		return salario;
	}

	public void setSalario(double salario) {// definirá a variável quando for chamado
		this.salario = salario;
	}

	public void escolha() { // o método que vai dar a opção de ir para o sistema de Professor ou o de
							// FuncAdm.
		Scanner entrada = new Scanner(System.in);
		
		int opcao;

		Professor professor1 = new Professor();// chamando as classes e dando apelido
		FuncAdm funcionarioAdm = new FuncAdm();// chamando as classes e dando apelido

		System.out.println("Olá funcionario, você é um professor ou funcionário da Administração?");
		System.out.println("Digite 1 caso professor, ou 2 caso funcionário da adm.");
		opcao = entrada.nextInt();

		if (opcao == 1) {

			professor1.definindo();// vai pra classe Professor, apelidada nessa classe de professor1
		} else if (opcao == 2) {

			funcionarioAdm.definindoFunc();// vai pra classe FuncAdm, apelidada nessa classe de funcionarioAdm
		}

		entrada.close();// fecha o Scanner
	}

}
