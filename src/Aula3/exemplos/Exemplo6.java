package Aula3.exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        int varInt = scanner.nextInt();
        System.out.println("Você digitou o numero:"+varInt);
        System.out.println("digite um numero curto");
        short varShort = scanner.nextShort();
        System.out.println("VarShort = "+varShort);
        byte varByte = (byte) varShort;
        System.out.println("Varbyte = "+varByte);
        System.out.println("Digite um numero decimal");
        double varDouble = scanner.nextDouble();
        System.out.println("Você digitou o numero:"+varDouble);
        float varFloat = (float) varDouble;
        System.out.println("VarFloat ="+varFloat);

    }
}
