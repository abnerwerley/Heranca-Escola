package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Heran�a | Author: Abner Werley Silva | date: 09/set/2021
public class TestaTudo {

	public static void main(String[] args) { // classe principal

		Funcionario funcionario1 = new Funcionario(); // linkando classe e apelidando
		Aluno aluno1 = new Aluno();// linkando classe e apelidando
		Scanner entrada = new Scanner(System.in);
		
		int opcao;

		System.out.println("Ol�, voc� � funcion�rio ou aluno?");
		System.out.println("Digite 1 caso funcionario.");
		System.out.println("Digite 2 caso aluno.");
		opcao = entrada.nextInt(); // a resposta ser� lida, e o usu�rio ser� direcionado pra classe correspondente.

		if (opcao == 1) {

			funcionario1.escolha(); // apelido.Metodo (esse m�todo � o que ir� prosseguir na classe correspondente)
		} else if (opcao == 2) {

			aluno1.definindoAluno();
		}
		entrada.close(); // fechando Scanner

	}
}
