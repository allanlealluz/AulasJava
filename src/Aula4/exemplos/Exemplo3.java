package Aula4.exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        if(idade >0 && idade <= 12){
            System.out.println("Você é criança ");
        }else if(idade > 12 && idade <=17){
            System.out.println("Você é adolescente");
        }else if(idade > 17 && idade < 65){
            System.out.println("Você é adulto");
        }else{
            System.out.println("Idoso");
        }
        
    }
}
