package QUESTAO08;
import java.util.Scanner;

public class q8 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] numeros = new double[10];
	        int negativos = 0;
	        double positivos = 0;

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite o número real " + (i + 1) + ": ");
	            numeros[i] = sc.nextDouble();
	            if (numeros[i] < 0) {
	                negativos++;
	            } else {
	                positivos += numeros[i];
	            }
	        }

	        System.out.println("Quantidade de números negativos: " + negativos);
	        System.out.println("Soma dos números positivos: " + positivos);
	    }
	}

