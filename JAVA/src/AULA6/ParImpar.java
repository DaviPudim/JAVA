package AULA6;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Digite um numero inteiro: ");
int num = input.nextInt();

if (num %2 == 0) {
	System.out.println("O numero é par.");
}else {
	System.out.println("O numero é impar");
}
	}

}
