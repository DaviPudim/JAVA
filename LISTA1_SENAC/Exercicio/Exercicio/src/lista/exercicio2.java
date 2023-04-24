
package lista;

import java.util.Scanner;

//código elaborado por Murilo Almeida e Davi Emanuel
public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual seu nome: ");
        String name = input.nextLine();
        
        System.out.print("seu sexo (M ou F): ");
        char sex = input.next().charAt(0);
        input.nextLine();
        
        System.out.print("Informe o estado civil: ");
        String estadoCivil = input.nextLine();
        
        if (sex == 'F' && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.print("Digite o tempo de casamento em anos: ");
            int tempo = input.nextInt();
            System.out.println("A " + name + " está casada há " + tempo + " anos");
        } else {
            System.out.println("O " + name + " é " + estadoCivil);
        }
        
        input.close();
    }
}



