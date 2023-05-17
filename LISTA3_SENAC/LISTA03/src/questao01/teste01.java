package questao01;

public class teste01 {

	 public static void main(String[] args) {
	        Q01 vetor = new Q01();

	        vetor.atribuirValores();
	        int soma = vetor.calcularSoma();
	        System.out.println("A soma dos valores de A[0], A[1] e A[5] é: " + soma);
	        vetor.modificarVetor();
	    }
}
