//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o número: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número informado " + numero + " é par");
        } else {
            System.out.println("O número informado " + numero + " é ímpar");
        }
        
        input.close();
    }
}