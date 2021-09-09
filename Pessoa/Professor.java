package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Herança | Author: Abner Werley Silva | date: 09/set/2021

public class Professor extends Funcionario { // A classe em que estamo pode simplismente herdar Funcionario, porque
												// Funcionario já herda de Pessoa
	// declaraões de argumentos que a pessoa pode ter (nem todos precisarão ser
	// usados, o programador que decide)
	// as variáveis private precisam ser declaradas fora de qualquer método.

	private String disciplina;

	public String getDisciplina() {// usado para chamar o nome deifnido e retornará o valor ou string da var
		return disciplina;
	}

	public void setDisciplina(String disciplina) {// definirá a variável quando for chamado
		this.disciplina = disciplina;
	}

	public void definindo() {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Professor professorQualquer = new Professor();
		
		String nome;
		String disciplina;

		professorQualquer.introducao("Professor");

		System.out.println("Qual o seu nome?");
		nome = entrada.next();
		professorQualquer.setNome(nome);// definindo var para ser chamada depois

		System.out.println("Qual a sua disciplina?");
		disciplina = entrada.next();
		professorQualquer.setDisciplina(disciplina);// definindo var para ser chamada depois

		System.out.println("Pode prosseguir, professor " + professorQualquer.getNome() + " de "
				+ professorQualquer.getDisciplina());

		entrada.close();// fecha o Scanner

	}
}
