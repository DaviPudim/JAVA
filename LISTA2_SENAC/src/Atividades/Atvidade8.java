package Atividades;

import java.util.Scanner;

public class Atvidade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite um valor para A: ");
		        int a = sc.nextInt();
		        
		        int resultado = 1;
		        System.out.print(a + "! = ");
		        for (int i = a; i >= 1; i--) {
		            System.out.print(i);
		            resultado *= i;
		            if (i != 1) {
		                System.out.print(" * ");
		            }
		        }
		        System.out.println(" = " + resultado);
		        
		        sc.close();

	}

}
