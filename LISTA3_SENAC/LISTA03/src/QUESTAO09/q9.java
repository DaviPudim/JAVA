package QUESTAO09;
import java.util.Scanner;

public class q9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int[] numeros = new int[5];
	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;
	        int posicaoMaior = -1;
	        int posicaoMenor = -1;

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();

	            if (numeros[i] > maior) {
	                maior = numeros[i];
	                posicaoMaior = i;
	            }
	            if (numeros[i] < menor) {
	                menor = numeros[i];
	                posicaoMenor = i;
	            }
	        }

	        System.out.println("Maior valor: " + maior + " (posição " + posicaoMaior + ")");
	        System.out.println("Menor valor: " + menor + " (posição " + posicaoMenor + ")");
	    }
	}
