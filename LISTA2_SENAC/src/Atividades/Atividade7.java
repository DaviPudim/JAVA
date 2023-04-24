package Atividades;

import java.util.Scanner;


public class Atividade7 {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        
		        System.out.print("Digite um número de 1 a 10: ");
		        int n = input.nextInt();
		        
		        System.out.println("Tabuada de " + n + ":");
		        for (int i = 0; i <= 10; i++) {
		            System.out.printf("%d * %d = %d%n", i, n, i * n);
		        }
		        
		        input.close();

	}

}
