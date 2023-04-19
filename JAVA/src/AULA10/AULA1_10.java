package AULA10;

import java.util.Scanner;

public class AULA1_10 {

	private double balanco;// armazena o saldo
	// construtor

	public AULA1_10(double balancoInicial) {
		if (balancoInicial > 0.0) {
			balanco = balancoInicial;
		}
	}// fim construtor

	public void Deposito(double acrescimo) {
		balanco = balanco + acrescimo;
	}

	// retornar o saldo da conta
	public double getBalanco() {
		return balanco;
	}

	public static void main (String args[]) {
		
		AULA1_10 conta1 = new AULA1_10 (50.00); // criando um objeto do tipo Conta 
		AULA1_10 conta2 = new AULA1_10 (-7.53); // criando um objeto do tipo Conta
		
		//exibindo o saldo incial dos obejtos
		System.out.println ("balanco da conta1: " + conta1.getBalanco());
		System.out.println ("balanco da conta2: " + conta2.getBalanco());
		
		//criar objeto scanner
		
		Scanner input = new Scanner (System.in);
		double deposito; //deposito lido pelo usuario
		System.out.print("Digite o deposito para a conta1: ");
		deposito = input.nextDouble(); // entrada do usuario
		//adicionando valor a conta1
		conta1.Deposito(deposito);
		
		//exiv=bindo os saldos atuais
		System.out.println("balanco da conta1: " + conta1.getBalanco());
		System.out.println("balanco da conta2: " + conta2.getBalanco());
		
		System.out.print("Digite o deposito para a conta2: ");
		deposito = input.nextDouble(); // entrada do usuario 
		//adicionando valor a conta2
		conta2.Deposito(deposito);
		
		//exibindo os saldos atuais
		System.out.println("balanco da conta1: " + conta1.getBalanco());
		System.out.println("balanco da conta2: " + conta2.getBalanco());
		
	}

}// fim classe
