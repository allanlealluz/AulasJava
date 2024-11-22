package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o nome que deseja verificar: ");
        String nomeParaVerificar = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeParaVerificar)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + nomeParaVerificar + "' está presente no vetor.");
        } else {
            System.out.println("O nome '" + nomeParaVerificar + "' não está presente no vetor.");
        }

        scanner.close();
    }
}

