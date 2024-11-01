package Aula5.Exercicios;

import java.util.Scanner;

public class ExercicioRep_7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nota = 0;
        do {
            System.out.println("Digite sua nota");
            nota = scanner.nextInt();
        }while(nota < 1 || nota > 10);
    }
}
