package EXEMPLO04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite o valor a ser buscado:");
        int valorBuscado = scanner.nextInt();

        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valorBuscado) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado na linha " + (linhaEncontrada + 1) + ", coluna " + (colunaEncontrada + 1));
        } else {
            System.out.println("Valor nao encontrado na matriz.");
        }
    }
}
