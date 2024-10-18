package Aula4.exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemafaro;
        System.out.println("Digite a cor do semaro");
        corSemafaro = scanner.next();

        switch (corSemafaro){
            case "vermelho","Vermelho":
                System.out.println("Pare");
                break;
            case "amarelo","Amarelo":
                System.out.println("Atenção");
                break;
            case "verde","Verde":
                System.out.println("Ande");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
