package Aula6.Exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        int[][] matrizes = new int[2][3];
        matrizes[0][0] = 10;
        matrizes[0][1]= 20;
        matrizes[0][2] = 30;
        matrizes[0][3] = 40;
        System.out.println(matrizes[0][0]);

        String[][] matrizNomes = {{"Rafael", "Gislene"},{"Laura","Juliana"}};
        System.out.println("Valor da posição [1][1] = "+matrizNomes[1][1]);
    }
}
