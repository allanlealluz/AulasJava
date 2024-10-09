package Aula3.exemplos;
import java.util.Scanner;
public class Exemplos5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        long varlong = numero;
        System.out.println("O numero que você digitou é: "+numero);
        System.out.println("O numero que você digitou é: "+varlong);
        System.out.println("Digite um numero decimal");
        float varFloat = scanner.nextFloat();
        System.out.println("O numero que você digitou é: "+varFloat);
    }
}
