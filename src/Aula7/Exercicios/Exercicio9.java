package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int num;
        int expo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero base ");
        num = scanner.nextInt();
        System.out.println("Digite o expoente ");
        expo = scanner.nextInt();
        System.out.println(calcularPotencia(num, expo));
    }
    public static double calcularPotencia(int num, int expo){
        return (Math.pow(num,expo));
    }
}
