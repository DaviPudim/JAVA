//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio10 {
  public static void main(String[] args) {
  try (Scanner input = new Scanner(System.in)) {
	System.out.print("Digite o preço normal de etiqueta do produto | R$ ");
    double precon = input.nextDouble();
    
    System.out.println("Formas de forma");
    System.out.println("1 - À vista em dinheiro ou cheque ( 10% de desconto )");
    System.out.println("2 - À vista no cartão de crédito ( 15% de desconto )");
    System.out.println("3 - Em duas vezes ( Sem Acréscimo )");
    System.out.println("4 - Em duas vezes, ( Com Acréscimo de 10% )");
    System.out.print("Escolha a condição e digite o código: ");
    int forma = input.nextInt();
    
    double precofinal = 0;
    
    if(forma == 1) {
      precofinal = precon * 0.9;
    } else if(forma == 2) {
      precofinal = precon * 0.85;
    } else if(forma == 3) {
      precofinal = precon;
    } else if(forma == 4) {
      precofinal = precon * 1.1;
    } else {
      System.out.println("Código Incorreto");
      return;
    }
    
    System.out.println("Preço Total: R$ " + precofinal);
}
  }
}
