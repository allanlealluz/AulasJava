package Aula4.exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
/* dale */
        System.out.println("Digite um numero");
        x = scanner.nextInt();
// dale
        if(x >= 0){
            System.out.println("Numero maior ou igual a 30");
        }else{
            System.out.println("Numero menor que 30");
        }
    }
}
