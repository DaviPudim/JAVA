package QUESTAO07;
import java.util.Scanner;

public class Q7 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] notas = new double[15];
	        double soma = 0;

	        for (int i = 0; i < notas.length; i++) {
	            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
	            notas[i] = sc.nextDouble();
	            soma += notas[i];
	        }

	        double media = soma / notas.length;
	        System.out.println("Média geral: " + media);
	    }
	}

