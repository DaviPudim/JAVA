//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o primeiro valor: ");
			boolean v1 = input.nextBoolean();

			System.out.print("Digite o segundo valor: ");
			boolean v2 = input.nextBoolean();

			if (v1 && v2) {
			    System.out.println("Ambos são VERDADEIROS.");
			} else if (!v1 && !v2) {
			    System.out.println("Ambos são FALSOS.");
			} else {
			    System.out.println("Os valores não são iguais.");
			}
		}
    }
}
