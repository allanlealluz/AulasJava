package Aula6.Exemplos;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] matriz = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero: \n");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
