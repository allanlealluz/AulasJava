package Aula5.Exercicios;
import java.lang.Math;
import java.util.Scanner;

public class Exercicioep_9 {
    public static void main(String[] args) {
        int palp = 0;
        int num = (int) (Math.random()*101);
        do {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Digite um numero");
            palp = scanner.nextInt();
        }while(palp != num);
    }


}
