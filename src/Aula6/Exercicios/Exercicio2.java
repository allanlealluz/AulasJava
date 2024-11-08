package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String [] letras = {"a","b","r","p","s","q"};
        String letraEscolhida;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra ");

        letraEscolhida = scanner.next();
        for (int i = 0; i < letras.length; i++) {
            if(letras[i].equals(letraEscolhida)){
                System.out.println("Letra encontrada na posição "+i);
                break;
            }
        }

    }

}
