package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdHoras; float difHoras;
        float salario = 1400f;
        float valorHora = (salario / 8)/5;
        System.out.println("Quantas horas o funcionário trabalhou ");
        qtdHoras = scanner.nextInt();
        if(qtdHoras > 40){
            difHoras = qtdHoras - 40;
            difHoras = (difHoras * (valorHora * 1.5f));
            System.out.println("O valor das horas extras é "+difHoras);
        }else{
            System.out.println("Sem horas extras salario padrão 1.400 reais");
        }

    }
}
