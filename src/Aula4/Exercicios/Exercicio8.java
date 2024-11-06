package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avali;

        avali = scanner.nextInt();
        switch(avali){
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da media");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Valor inválido");
        }


    }
}
