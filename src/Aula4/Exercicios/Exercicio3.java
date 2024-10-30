package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
          ----------------------------------------
               Classificação de produtos
               1 - Eletronicos
               2 - Alimentos
               3 - Vestuário
                """);
        escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Eletronicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            default:
                System.out.println("Erro digite um valor válido");
        }
    }
}
