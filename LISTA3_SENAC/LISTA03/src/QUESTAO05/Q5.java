package QUESTAO05;

import java.util.Scanner;

public class Q5 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] vetor = new int[10];
	        int maior = vetor[0];
	        int posicao = 0;

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            vetor[i] = sc.nextInt();
	        }


	        System.out.print("Vetor: ");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i] + " ");
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	                posicao = i;
	            }
	        }

	        System.out.println("\nO maior elemento é " + maior + " e está na posição " + posicao);
	    }
	}


