package Aula5.Exercicios;

import java.util.Scanner;

public class ExerciciosRep_5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum = 0,c= 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite a nota");
            int nota = scanner.nextInt();
            sum += nota;
            c += 1;
        }
       float media = (float) (sum / c);
        System.out.println(media);
    }
}
