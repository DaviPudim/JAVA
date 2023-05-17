package QUESTAO10;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        boolean temValoresIguais = false;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    temValoresIguais = true;
                    System.out.printf("Valores iguais nas posições %d e %d: %d\n", i, j, vetor[i]);
                }
            }
        }

        if (!temValoresIguais) {
            System.out.println("Não existem valores iguais no vetor.");
        }

        sc.close();
    }
}
