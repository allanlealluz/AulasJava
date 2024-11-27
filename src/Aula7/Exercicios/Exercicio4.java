package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        float cels;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor Celsius - Fahreinheit");
        System.out.println("Digite a temperatura em celsius ");
        cels = scanner.nextFloat();
        System.out.println(converterCelsiusParaFahreinheit(cels)+" Fahreinheits");
    }
    public static float converterCelsiusParaFahreinheit(float cels){
        float result;
        result = (cels * 1.8f + 32);
        return result;
    }
}
