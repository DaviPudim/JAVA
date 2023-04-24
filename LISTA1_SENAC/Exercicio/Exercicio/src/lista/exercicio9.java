//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
		System.out.print("informe o seu peso em KG: ");
		double kilo = input.nextDouble();
		
		System.out.print("Qual a sua altura: ");
		double alt = input.nextDouble();
		
		double imc = kilo / (alt * alt);
		
		if(imc < 18.5) {
		  System.out.println("Abaixo do peso");
		} else if(imc < 25) {
		  System.out.println("Peso normal");
		} else if(imc < 30) {
		  System.out.println("Acima do peso");
		} else {
		  System.out.println("Obeso");
		}
	}
  }
}

