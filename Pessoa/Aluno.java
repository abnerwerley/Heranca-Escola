package br.com.Heranca.Pessoa;

import java.util.Scanner;

//Sistema Escolar usando Heran�a | Author: Abner Werley Silva | date: 09/set/2021

public class Aluno extends Pessoa { // para usar a heran�a, depois do public class NomeDaClasse vai o exends, e a
									// classe que essa vai herdar para poder usar seus dados.

	// declara�es de argumentos que a pessoa pode ter (nem todos precisar�o ser
	// usados, o programador que decide)
	// as vari�veis private precisam ser declaradas fora de qualquer m�todo.

	private String semestre;
	private String curso;

	public String getSemestre() {// usado para chamar o nome deifnido e retornar� o valor ou string da var
		return semestre;
	}

	public void setSemestre(String semestre) {// definir� a vari�vel quando for chamado
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

		System.out.println("Est� em qual semestre?");
		semestre = entrada.next();
		aluno1.setSemestre(semestre);// definindo var para ser chamada depois

		System.out.println("Pode prosseguir, aluno " + aluno1.getNome() + " do curso " + aluno1.getCurso());
		// com o get eu chamo as vari�veis, que j� est�o definidas

		entrada.close();// fecha o Scanner
	}
}
