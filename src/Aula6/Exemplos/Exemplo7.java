package Aula6.Exemplos;

public class Exemplo7 {
    public static void main(String[] args) {
        int [][] matrizNumeros = {
                {1,2,3},
                {3,45},
                {6, 7, 8}
        };
        for (int linha = 0; linha < matrizNumeros.length;linha++) {
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++)
            {
                System.out.println(matrizNumeros[linha][coluna]);
            }
        }

    }
}
