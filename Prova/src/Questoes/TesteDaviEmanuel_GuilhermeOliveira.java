package Questoes;

import java.util.Scanner;

public class TesteDaviEmanuel_GuilhermeOliveira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de integrantes do grupo: ");  // quantidade de integrantes
        int n = scanner.nextInt();

        double[] alturas = new double[n]; // arrays de alturas e gêneros
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {        // alturas e gêneros dos integrantes
            System.out.print("Informe a altura do integrante " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();

            System.out.print("Informe o gênero do integrante " + (i + 1) + " (M/F): ");
            generos[i] = scanner.next().charAt(0);
        }

        DaviEmanuel_GuilhermeOliveira grupo = new DaviEmanuel_GuilhermeOliveira(alturas, generos);        // cria um objeto da classe

        System.out.printf("Maior altura do grupo: %.1f %n", grupo.maiorAltura());        // mostra as informações sobre o grupo
        System.out.printf("Menor altura do grupo: %.1f %n", grupo.menorAltura());
        System.out.printf("Média de altura dos homens: %.1f %n", grupo.mediaAltura(generos, alturas));
        System.out.printf("Número de mulheres no grupo: " + grupo.numeroMulheres());

        scanner.close();
    }
}
