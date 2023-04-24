//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int num;

			System.out.print("Digite um número: ");
			num = input.nextInt();

			if (num % 2 == 0) {
			    num += 5;
			} else {
			    num += 8;
			}

			System.out.println("O resultado é: " + num);
		}
    }
}
