package EXEMPLO05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matrizMaiorValor = new int[4][4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da primeira matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizMaiorValor[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
            }
        }

        System.out.println("Matriz com os maiores valores:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizMaiorValor[i][j] + " ");
            }
            System.out.println();
        }
    }
}
