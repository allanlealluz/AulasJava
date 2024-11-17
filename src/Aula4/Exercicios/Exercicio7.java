package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1; int num2;
        String operacao;

        System.out.println("Digite um numero");
        num1 = scanner.nextInt();
        System.out.println("Digite a operação");
        operacao = scanner.next();
        System.out.println("Digite outro numero");
        num2 = scanner.nextInt();

        if(operacao.equals("soma")){
            System.out.println(num1+num2);
        } else if(operacao.equals("subtração")) {
            System.out.println(num1-num2);
        } else if(operacao.equals("divisão")){
            System.out.println(num1/num2);
        } else if(operacao.equals("multiplicação")){
            System.out.println(num1*num2);
        }else{
            System.out.println("Erro");
        }
    }
}
