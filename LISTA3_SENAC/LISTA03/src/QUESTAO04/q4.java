package QUESTAO04;

import java.util.Scanner;

	public class q4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] vetor = new int[10];
	        int count = 0;

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            vetor[i] = sc.nextInt();
	            if (vetor[i] % 2 == 0) {
	                count++;
	            }
	        }

	        System.out.println("O vetor possui " + count + " valores pares.");
	    }
	}


