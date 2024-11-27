package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        float num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero e veja seu dobro ");
        num = scanner.nextFloat();
        System.out.println("O dobro de "+num+" é "+Dobrar(num));

    }
    public static float Dobrar(float num){
        float result;
        result = num * 2;
        return result;
    }
}
