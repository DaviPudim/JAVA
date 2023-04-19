package AULA5;

import java.util.Scanner;

public class AULA1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.print("Primeiro numero: ");
		num1 = input.nextInt();
		System.out.print("Segundo numero: ");
		num2 = input.nextInt();
		if (num1 == num2) {
			System.out.printf("%d == %d\n", num1, num2);
		}
		if (num1 != num2) {
			System.out.printf("%d != %d\n", num1, num2);
		}
		if (num1 < num2) {
			System.out.printf("%d < %d\n", num1, num2);
		}
		if (num1 > num2) {
			System.out.printf("%d > %d\n", num1, num2);
		}
		if (num1 <= num2) {
			System.out.printf("%d <= %d\n", num1, num2);
		}
		if (num1 >= num2) {
			System.out.printf("%d >= %d\n", num1, num2);
			
		}
		}
	}
