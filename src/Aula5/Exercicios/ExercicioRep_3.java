package Aula5.Exercicios;

import java.util.Scanner;

public class ExercicioRep_3 {
    public static void main(String[] args) {
        int fatorial = 1;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero, para ver seu fatorial: ");
        int num = scanner.nextInt();
        count = num;
        do{
            fatorial = fatorial * count;
            count = count - 1;
        }while(count > 1);
        System.out.println("O fatorial de "+num+" é "+fatorial);
    }
}
