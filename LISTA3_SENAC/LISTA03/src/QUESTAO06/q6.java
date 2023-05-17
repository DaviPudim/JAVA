package QUESTAO06;

import java.util.Scanner;

public class q6 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] valores = new int[6];

	        
	        for (int i = 0; i < valores.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º valor: ");
	            valores[i] = sc.nextInt();
	        }


	        System.out.print("Valores na ordem inversa: ");
	        for (int i = valores.length - 1; i >= 0; i--) {
	            System.out.print(valores[i] + " ");
	        }
	    }
	}

