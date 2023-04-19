package AULA7;

import java.util.Scanner;

public class AULA1_7 {

	public static void MostraMensagem(String NomeCurso) {
		System.out.println("Bem vindo ao Curso: " + NomeCurso);
	}// end metodo

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// criando um objeto
		AULA1_7 obj = new AULA1_7();

		String nomecurso;

		System.out.print("Entre com o curso: ");
		nomecurso = input.nextLine();// le uma linha de texto
		System.out.println();

		// chama o metodo criando MostraMensagem
		obj.MostraMensagem(nomecurso);// lembrar de passar o parametro
	}

}
