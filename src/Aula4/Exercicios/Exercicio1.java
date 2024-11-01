package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int idade;
        System.out.println("Digite sua idade");
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("Pode acessar");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
