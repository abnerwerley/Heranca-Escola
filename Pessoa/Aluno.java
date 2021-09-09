package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Herança | Author: Abner Werley Silva | date: 09/set/2021

public class Aluno extends Pessoa { // para usar a herança, depois do public class NomeDaClasse vai o exends, e a
									// classe que essa vai herdar para poder usar seus dados.

	// declaraões de argumentos que a pessoa pode ter (nem todos precisarão ser
	// usados, o programador que decide)
	// as variáveis private precisam ser declaradas fora de qualquer método.

	private String semestre;
	private String curso;

	public String getSemestre() {// usado para chamar o nome deifnido e retornará o valor ou string da var
		return semestre;
	}

	public void setSemestre(String semestre) {// definirá a variável quando for chamado
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
		Aluno aluno1 = new Aluno();// linkando classe e apelidando

		String nome;
		String semestre;
		String curso;

		aluno1.introducao("Aluno"); // "Seja bem vindo ao sistema, " + classificacao + "."

		System.out.println("Qual o seu nome?");
		nome = entrada.next();
		aluno1.setNome(nome);// definindo var para ser chamada depois

		System.out.println("Faz qual curso?");
		curso = entrada.next();
		aluno1.setCurso(curso);// definindo var para ser chamada depois

		System.out.println("Está em qual semestre?");
		semestre = entrada.next();
		aluno1.setSemestre(semestre);// definindo var para ser chamada depois

		System.out.println("Pode prosseguir, aluno " + aluno1.getNome() + " do curso " + aluno1.getCurso());
		// com o get eu chamo as variáveis, que já estão definidas

		entrada.close();// fecha o Scanner
	}
}
