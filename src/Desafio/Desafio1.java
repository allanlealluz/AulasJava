package Desafio;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"ID", "NOME", "TELEFONE", "EMAIL"};
        String[][] matrizCadastro = new String[qtdPessoas+1][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        for (int linha = 1; linha <= qtdPessoas; linha++) {
            System.out.println("Preencha os dados a seguir: ");
            System.out.println("ID -"+ linha);
            matrizCadastro[linha][0] = String.valueOf(linha);
            System.out.println("Nome:");
            matrizCadastro[linha][1]= scanner.nextLine();
            System.out.println("Telefone:");
            matrizCadastro[linha][2]= scanner.nextLine();
            System.out.println("Email:");
            matrizCadastro[linha][3]= scanner.nextLine();
        }
        for(String[] linha : matrizCadastro){
            for(String Dado : linha){
                System.out.println(Dado);
            }
        }
    }
}
