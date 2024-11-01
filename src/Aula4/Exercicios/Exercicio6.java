package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota;
        System.out.println("Digite a nota do aluno ");
        nota = scanner.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota > 5) {
            System.out.println("Está de recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
