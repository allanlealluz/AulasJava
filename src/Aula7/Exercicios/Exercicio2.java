package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        n1 = scanner.nextInt();
        System.out.println("Digite outro numero ");
        n2 = scanner.nextInt();
        System.out.println("O resultado é "+soma(n1,n2));
    }
    public static float soma(float n1,float n2){
        float sum;
        sum = n1 + n2;
        return sum;
    }
}
