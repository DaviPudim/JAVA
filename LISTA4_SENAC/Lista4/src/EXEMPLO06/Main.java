package EXEMPLO06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posi��o [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }

        // Calcula a soma de cada coluna
        int[] somaColunas = new int[5];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        int[] somaLinhas = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }

        System.out.println("Soma dos n�meros �mpares: " + somaImpares);
        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }
        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
}
