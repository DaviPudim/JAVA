//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        
        int c;
        
        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        
        System.out.println("O resultado é: " + c);
        
        input.close();
    }
}
