package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valor;
        int opt;

        System.out.println("Conversor de real para dolar euro e libra");
        System.out.println("Digite o valor em real \n");
        valor = scanner.nextFloat();
        System.out.println("Digite a conversão desejada (1- dolar, 2-euro, 3-libra)");
        opt = scanner.nextInt();

        switch(opt){
            case 1:
                valor = valor / 5.75f;
                System.out.println("O valor em dolar é "+valor);
                break;
            case 2:
                valor = valor / 6.20f;
                System.out.println("O valor em euro é "+valor);
                break;
            case 3:
                valor = valor / 7.45f;
                System.out.println("O valor em libra esterlina é "+valor);
                break;
            default:
                System.out.println("Valor inválido");
        }

    }
}
