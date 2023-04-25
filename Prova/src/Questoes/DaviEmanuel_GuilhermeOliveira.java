package Questoes;

/**
4 *
5 * @author Davi Emanuel e Guilherme Oliveira
6 */


public class DaviEmanuel_GuilhermeOliveira {
    private double[] alturas;
    private char[] generos;

    public DaviEmanuel_GuilhermeOliveira(double[] alturas, char[] generos) {
        this.alturas = alturas;
        this.generos = generos;
    }

    public double maiorAltura() { // método maior altura
        double maiorAlt = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maiorAlt) {
                maiorAlt = alturas[i];
            }
        }
        return maiorAlt;
    }

    public double menorAltura() { //método menor altura
        double menorAlt = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menorAlt) {
                menorAlt = alturas[i];
            }
        }
        return menorAlt;
    }

    public double mediaAltura(char[] generos, double[] alturas) { //método média altura homens
        double somaAltHomens = 0;
        int numHomens = 0;

        for (int i = 0; i < generos.length; i++) {
            if (generos[i] == 'M') {
                somaAltHomens += alturas[i];
                numHomens++;
            }
        }

        if (numHomens == 0) {
            return 0; 
        }

        return somaAltHomens / numHomens;
    }


    public int numeroMulheres() { //método número de mulheres
        int numMulheres = 0;
        for (char genero : generos) {
            if (genero == 'F') {
                numMulheres++;
            }
        }
        return numMulheres;
    }

   
    }

