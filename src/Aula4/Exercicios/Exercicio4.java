package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int vendasFunc;double Comission;
        Scanner scanner = new Scanner(System.in);
        vendasFunc = scanner.nextInt();

        if(vendasFunc < 1000){
            Comission = vendasFunc * 0.05;

        }else if(vendasFunc > 1000 || vendasFunc < 5000){
            Comission = vendasFunc * 0.10;
        }else{
            Comission = vendasFunc * 0.15;
        }
        System.out.println(vendasFunc + Comission);
    }
}
