package Atividades;

public class Atividade1 {

	public static void main(String[] args) {
		int soma = 0;
		for (int num = 1; num <= 500; num++) {
			if (num % 2 != 0 && num % 3 == 0) {
				soma += num;
			}
		}

		System.out.println("A soma dos números ímpares múltiplos de três é: " +soma);

	}

}
