package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco, precoFinal;

        System.out.println("Digite o preço");
        preco = scanner.nextDouble();

        if (preco > 100.00) {
            precoFinal = preco * 0.9; // Aplica o desconto
            System.out.printf("Preço final desse produto descontados os 10%% fica = %.2f %n", precoFinal); // Corrigido para %.2f
        } else {
            System.out.println("O preço final desse produto é " + preco); // Adicionado espaço
        }

        scanner.close(); // Boa prática fechar o scanner
    }
}
