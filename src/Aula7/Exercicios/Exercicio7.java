package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float n1;
        float n2;
        float n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        n1 = scanner.nextFloat();
        System.out.println("Digite um numero");
        n2 = scanner.nextFloat();
        System.out.println("Digite um numero");
        n3 = scanner.nextFloat();
        System.out.println(verificarMaior(n1,n2,n3));
    }
    public static float verificarMaior(float n1,float n2,float n3){
        float maior;
        if(n1 > n2 && n1 > n3){
            maior = n1;
        }else if(n2 > n3 && n2 > n1){
            maior = n2;
        }else if(n3 > n1 && n3 > n2){
            maior = n3;
        }else{
            System.out.println("Eles tem o mesmo tamanho");
            return 0;
        }
        return maior;

    }
}
