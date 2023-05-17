package EXEMPLO01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }

        System.out.println("A matriz possui " + contador + " valores maiores que 10.");
    }
}
