package questao01;

public class Q01 {
	
	    private int[] A;

	    public Q01() {
	        A = new int[6];
	    }

	    public void atribuirValores() {
	        A[0] = 1;
	        A[1] = 0;
	        A[2] = 5;
	        A[3] = -2;
	        A[4] = -5;
	        A[5] = 7;
	    }

	    public int calcularSoma() {
	        int soma = A[0] + A[1] + A[5];
	        return soma;
	    }

	    public void modificarVetor() {
	        A[4] = 100;
	        System.out.println("O vetor A modificado é: ");
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }
	        System.out.println();
	    }
	}


