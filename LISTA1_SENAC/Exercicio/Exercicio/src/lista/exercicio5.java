//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int num = input.nextInt();
        
        if (num >= 0) {
            int dobro = num * 2;
            System.out.println("O dobro do número " + num + " é " + dobro);
        } else {
            int triplo = num * 3;
            System.out.println("O triplo do número " + num + " é " + triplo);
        }
        
        input.close();
    }
}

