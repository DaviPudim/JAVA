//código elaborado por Murilo Almeida e Davi Emanuel
package lista;

import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {
	  try (Scanner input = new Scanner(System.in)) {
			
				System.out.println("Informe qual o primeiro número:");
				int a = input.nextInt();
				
				System.out.println("Informe qual o segundo número:");
				int b = input.nextInt();
				
				System.out.println("Informe qual o terceiro número:");
				int c = input.nextInt();
				
				if(a > b && a > c) {
				  if(b > c) {
				    System.out.print(a + " " + b + " " + c);
				  } else {
				    System.out.print(a + " " + c + " " + b);
				  }
				} else if(b > a && b > c) {
				  if(a > c) {
				    System.out.print(b + " " + a + " " + c);
				  } else {
				    System.out.print(b + " " + c + " " + a);
				  }
				} else {
				  if(a > b) {
				    System.out.print(c + " " + a + " " + b);
				  } else {
				    System.out.print(c + " " + b + " " + a);
				  }
				}
			}
		  }
		}

