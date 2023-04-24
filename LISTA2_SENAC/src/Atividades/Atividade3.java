package Atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0;
        int quantidadeValores = 0;
        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;

        System.out.print("Digite um número: ");
        double valor = input.nextDouble();

        while (valor != 0) {
            soma += valor;
            quantidadeValores++;

            if (valor > 0) {
                quantidadePositivos++;
            } else {
                quantidadeNegativos++;
            }

            System.out.print("Digite um número: ");
            valor = input.nextDouble();
        }

        if (quantidadeValores > 0) {
            double media = soma / quantidadeValores;
            double percentualPositivos = (double) quantidadePositivos / quantidadeValores * 100;
            double percentualNegativos = (double) quantidadeNegativos / quantidadeValores * 100;

            System.out.println("Média aritmética: " + media);
            System.out.println("Quantidade de valores positivos: " + quantidadePositivos);
            System.out.println("Quantidade de valores negativos: " + quantidadeNegativos);
            System.out.printf("Percentual de valores positivos: %.2f%%\n", percentualPositivos);
            System.out.printf("Percentual de valores negativos: %.2f%%\n", percentualNegativos);
        } else {
            System.out.println("Nenhum valor foi digitado.");
        }

        input.close();
    }
}
