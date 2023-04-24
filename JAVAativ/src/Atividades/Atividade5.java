package Atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        while (true) {
            System.out.print("Digite um número (ou 0 para sair): ");
            int num = sc.nextInt();
            if (num == 0) {
                break;// interrupção do loop
            }
            numeros.add(num);
        }
        
        int qtde_pares = 0;
        int qtde_impares = 0;
        int soma_pares = 0;
        
        for (int num : numeros) {
            if (num % 2 == 0) {
                qtde_pares++;
                soma_pares += num;
            } else {
                qtde_impares++;
            }
        }
        
        double media_pares = qtde_pares > 0 ? (double) soma_pares / qtde_pares : 0;
        double media_geral = numeros.size() > 0 ? (double) numeros.stream().mapToInt(Integer::intValue).sum() / numeros.size() : 0;
        
        System.out.println("Quantidade de pares: " + qtde_pares);
        System.out.println("Quantidade de ímpares: " + qtde_impares);
        System.out.println("Média dos valores pares: " + media_pares);
        System.out.println("Média geral dos números: " + media_geral);
    }
}