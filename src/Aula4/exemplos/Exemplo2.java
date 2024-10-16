package Aula4.exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String corSemaforo;
        System.out.println("Digite a cor do semaforo");
        Scanner scanner = new Scanner(System.in);
        corSemaforo = scanner.nextLine();
        if(corSemaforo.toLowerCase().equals("verde")){
            System.out.println("Siga");
        }else if(corSemaforo.toLowerCase().equals("amarelo")){
            System.out.println("Atenção");
        }else{
            System.out.println("Pare");
        }
    }
}
