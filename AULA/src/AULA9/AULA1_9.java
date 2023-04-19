package AULA9;

import java.util.Scanner;

public class AULA1_9 {

	String nomeCurso;

	// construtor de classes
	public AULA1_9(String nome) {
		nomeCurso = nome;
	}

	public void setNomeCurso(String nome) {
		nomeCurso = nome;
	}
	
	public String getNomeCurso() {
	return nomeCurso;
		
	}
	
	public void MostraMensagem() {
		System.out.println("Bem vindo ao Cruso: " + getNomeCurso());
	}//end metodo

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		//criando um objeto
		AULA1_9 obj = new AULA1_9("Desenvolvimento de Sistemas");
		
		//chama o metodo MostraMensagem
		obj.MostraMensagem(); //lembrar de passar o parametro
		
	}
}
