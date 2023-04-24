package Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// criando o objeto
		double meAltura = Double.MAX_VALUE;// declaração de variável
		double maAltura = Double.MIN_VALUE;// declaração de variável
		
		for (int i = 1; i <= 15; i++) //iniciando o loop que irá iterar 15 vezes
		{
			System.out.print("Digite a altura da pessoa " +i+ ": ");
			double altura = sc.nextDouble();
			if (altura < meAltura) {
				meAltura = altura;
			}
			if (altura > maAltura) {
				maAltura = altura;
			}
		}
		
		System.out.println("A menor altura do grupo é: " + meAltura + " metros.");
		System.out.println("A maior altura do grupo é: " + maAltura + " metros.");
		
		sc.close();// fechamento do objeto para liberar os recursos do sistema
	}

}
