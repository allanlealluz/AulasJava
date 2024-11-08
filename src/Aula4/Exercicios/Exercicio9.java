package Aula4.Exercicios;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int hora;
        /*Long currentTimeMillis = System.currentTimeMillis();
        LocalTime agora = LocalTime.now();
        System.out.println(agora);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que horas são ");
        hora = scanner.nextInt();
        if(hora >= 5 && hora < 12){
            System.out.println("Manhã");
        }else if(hora >= 12 && hora < 18){
            System.out.println("Tarde");
        }else if(hora >=18 && hora < 22){
            System.out.println("Noite");
        }else if(hora >= 22 && hora < 5){
            System.out.println("Madrugada");
        }else{
            System.out.println("Hora inválida");
        }


    }
}
