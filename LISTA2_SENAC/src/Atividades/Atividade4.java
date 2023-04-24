package Atividades;

import java.util.Scanner;// interação com o usuário 

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// criando o objeto

		int inter1 = 0; // [0-25]
		int inter2 = 0; // [26-50]
		int inter3 = 0; // [51-75]
		int inter4 = 0; // [76-100]

		System.out.println("Digite os números (negativo para sair): ");
		int num = sc.nextInt();

		while (num >= 0) {
			if (num >= 0 && num <= 25) {
				inter1++;
			} else if (num >= 26 && num <= 50) {
				inter2++;
			} else if (num >= 51 && num <= 75) {
				inter3++;
			} else if (num >= 76 && num <= 100) {
				inter4++;
			}

			num = sc.nextInt();
		}
		System.out.println("Quantidades de números nos intervalos: ");
		System.out.println("[0-25]: " + inter1);
		System.out.println("[26-50]: " + inter2);
		System.out.println("[51-75]: " + inter3);
		System.out.println("[76-100]: " + inter4);
		
		sc.close();
	}

}
