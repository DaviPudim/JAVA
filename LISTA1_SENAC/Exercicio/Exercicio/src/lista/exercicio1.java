//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("(A) Digite o valor: ");
        int a = input.nextInt();
        
        System.out.print("(B) Digite o valor: ");
        int b = input.nextInt();
        
        System.out.print("(C) Digite o valor: ");
        int c = input.nextInt();
        
        if (a + b < c) {
            System.out.println("A soma de A e B é menor que C");
        } else {
            System.out.println("A soma de A e B é maior ou igual a C");
        }
        
        input.close();
    }
}
