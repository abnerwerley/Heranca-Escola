package br.com.Heranca.Pessoa;

import java.util.Scanner;

public class Professor extends Funcionario {

	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
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
		professorQualquer.setNome(nome);

		System.out.println("Qual a sua disciplina?");
		disciplina = entrada.next();
		professorQualquer.setDisciplina(disciplina);

		System.out.println("Pode prosseguir, professor " + professorQualquer.getNome() + " de "
				+ professorQualquer.getDisciplina());

		entrada.close();

	}
}
