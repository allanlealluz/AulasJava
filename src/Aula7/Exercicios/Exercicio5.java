package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
       int n1;
       int n2;
       int n3;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite uma nota ");
       n1 = scanner.nextInt();
       System.out.println("Digite outra nota ");
       n2 = scanner.nextInt();
       System.out.println("Digite a ultima nota");
       n3 = scanner.nextInt();
       System.out.println("Média: "+calcMedia(n1,n2,n3));
    }
    public static float calcMedia(int n1,int n2,int n3){
        float med;
        med = (n1 + n2 +n3)/3;
        return med;
    }
}
