package QUESTAO03;
import java.util.Scanner;

	public class q3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] vetor = new double[5];
	        double[] vetorQuadrado = new double[5];

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            vetor[i] = sc.nextDouble();
	            vetorQuadrado[i] = Math.pow(vetor[i], 2);
	        }

	        System.out.println("O vetor digitado é:");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i] + " ");
	        }

	        System.out.println("\nO vetor ao quadrado é:");
	        for (int i = 0; i < vetorQuadrado.length; i++) {
	            System.out.print(vetorQuadrado[i] + " ");
	        }
	    }
	}


