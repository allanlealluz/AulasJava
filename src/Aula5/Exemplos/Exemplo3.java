package Aula5.Exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para calcular a tabuada");

        int x = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(x + " x "+ i + " = "+x*i);
        }
        scanner.close();


    }
}
