//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Matricula do Aluno: ");
			int matricula = input.nextInt();

			System.out.print("Primeira nota: ");
			double n1 = input.nextDouble();

			System.out.print("Segunda nota: ");
			double n2 = input.nextDouble();

			System.out.print("Terceira nota: ");
			double n3 = input.nextDouble();

			System.out.print("Média dos Exercícios: ");
			double media = input.nextDouble();

			double aproveitamento = (n1 + n2 * 2 + n3 * 3 + media)/ 7;

			String conceito;
			if (aproveitamento >= 90) {
			    conceito = "A";
			} else if (aproveitamento >= 75) {
			    conceito = "B";
			} else if (aproveitamento >= 60) {
			    conceito = "C";
			} else if (aproveitamento >= 40) {
			    conceito = "D";
			} else {
			    conceito = "E";
			}

			String resultado;
			if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
			    resultado = "Aprovado";
			} else {
			    resultado = "Reprovado";
			}

			System.out.println("Matricula Aluno: " + matricula);
			System.out.println("Nota da primeira verificação: " + n1);
			System.out.println("Nota da segunda verificação: " + n2);
			System.out.println("Nota da terceira verificação: " + n3);
			System.out.println("Média dos exercícios: " + media);
			System.out.println("Média do aproveitamento: " + aproveitamento);
			System.out.println("Conceito: " + conceito);
			System.out.println(resultado);
		}
    }
}

