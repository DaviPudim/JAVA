package EXEMPLO03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int maxValor = Integer.MIN_VALUE;
        int linhaMax = 0;
        int colunaMax = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > maxValor) {
                    maxValor = matriz[i][j];
                    linhaMax = i;
                    colunaMax = j;
                }
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O maior valor � " + maxValor);
        System.out.println("Localizacao: linha " + (linhaMax + 1) + ", coluna " + (colunaMax + 1));
    }
}

