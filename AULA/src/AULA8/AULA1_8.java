package AULA8;

import java.util.Scanner;

public class AULA1_8 {

	private String nomeCurso;

	public void setNomeCurso(String nome) {
		nomeCurso = nome;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void MostraMensagem() {
		System.out.println("Bem vindo ao Curso: " +getNomeCurso());
	}// end metodo

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// criando um objeto
		AULA1_8 obj = new AULA1_8();

		String nomecurso;

		System.out.print("Entre com o curso: ");
		nomecurso = input.nextLine();// le uma linha e texto
		System.out.println();// gera uma linha em branco
		// definido o nome do curso utilizando o metodo setNomeCurso
		obj.setNomeCurso(nomecurso);
		// chama o metodo MostraMensagem
		obj.MostraMensagem();// lembrar de passar o parametro

	}
}
