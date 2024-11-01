package Aula5.Exercicios;

import java.util.Scanner;

public class ExercicioRep_10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = 0,par = 0, impar = 0;
        while(true){
            System.out.println("Digite um numero");
            num = scanner.nextInt();
            if(num < 0){
                break;
            }
            if(num > 100){
                System.out.println("Numero muito grande, interrupção realizada");
                break;
            }
            if(num % 2 ==0){
                par = num;
            }else{
                impar = num;
            }
        }
        System.out.println("Pares "+par);
        System.out.println("Impares "+impar);
    }
}