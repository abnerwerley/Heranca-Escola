package br.com.Heranca.Pessoa;

import java.util.Scanner;

public class Aluno extends Pessoa {

	private String semestre;
	private String curso;

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void definindoAluno() {
		Scanner entrada = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		String nome;
		String semestre;
		String curso;

		aluno1.introducao("Aluno");

		System.out.println("Qual o seu nome?");
		nome = entrada.next();
		aluno1.setNome(nome);

		System.out.println("Faz qual curso?");
		curso = entrada.next();
		aluno1.setCurso(curso);

		System.out.println("Está em qual semestre?");
		semestre = entrada.next();
		aluno1.setSemestre(semestre);

		System.out.println("Pode prosseguir, aluno " + aluno1.getNome() + " do curso " + aluno1.getCurso());

		entrada.close();
	}
}
