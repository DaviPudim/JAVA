package QUESTAO02;

import java.util.Scanner;

public class q2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] valores = new int[6];

	        for (int i = 0; i < valores.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º valor: ");
	            valores[i] = sc.nextInt();
	        }

	        System.out.println("Os valores lidos são:");
	        for (int i = 0; i < valores.length; i++) {
	            System.out.print(valores[i] + " ");
	        }
	    }
	}

