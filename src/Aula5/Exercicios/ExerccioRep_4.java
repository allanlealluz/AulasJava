package Aula5.Exercicios;

import java.util.Scanner;

public class ExerccioRep_4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("IDENTIFICADOR DE NUMEROS PRIMOS 2.000, digite um numero é faça o teste");
        int num = scanner.nextInt();
        int c = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0 ){
                c += 1;
            }
        }
        if(c > 0){
            System.out.println("O numero não é primo");
        }else{
            System.out.println("O numero é primo");
        }

    }
}
