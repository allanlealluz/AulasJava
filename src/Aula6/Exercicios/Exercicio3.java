package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        boolean [] escolhas = new boolean[8];
        int ContTrue = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < escolhas.length; i++) {
            System.out.println("Verdadeiro ou falso (true,false)");
            escolhas[i] = scanner.nextBoolean();
            if(escolhas[i]){
                ContTrue ++;
            }
        }
        System.out.println(ContTrue);
    }
}
