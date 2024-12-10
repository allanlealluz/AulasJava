package Desafio;

import java.util.Scanner;

public class Desafio2 {
    static String[] cabecalho = {"ID", "NOME", "TELEFONE", "EMAIL"};
    static String[][] matrizCadastro = {{"",""}};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String menu = """
                |   ESCOLHA UMA OPÇÃO:     
                |   1 - Exibir cadastro Completo    
                |   2 - Cadastrar Usuário
                |   3 - Atualizar Usuário
                |   4 - Deletar Usuário 
                |   5 - Sair           
                """;

        matrizCadastro[0] = cabecalho;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> exibirUsuario();
                case 2 -> cadastrarUsuario();
                case 3 -> atualizarUsuario();
                case 4 -> deletarUsuario();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    public static void exibirUsuario() {
        StringBuilder tabela = new StringBuilder();
        if (matrizCadastro.length == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        for (String[] linha : matrizCadastro){
            for (int coluna = 0; coluna < linha.length; coluna++) {
                int tamanhoColuna = coluna == 0 ? 5 : (coluna == 2? 10 : 25);
                tabela.append(String.format("%-"+tamanhoColuna+"s |", linha[coluna]));
            }
            tabela.append("\n");
        }
        System.out.println(tabela);
        /*
        for (String[] linha : matrizCadastro) {
            for (String coluna : linha) {
                System.out.print(coluna + "\t");
            }
            System.out.println();
        }*/
    }

    public static void cadastrarUsuario() {
        System.out.println("Quantas pessoas você deseja cadastrar?");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][cabecalho.length];
        for (int i = 0; i < matrizCadastro.length; i++) {
            novaMatriz[i] = matrizCadastro[i];
        }

        for (int i = matrizCadastro.length; i < novaMatriz.length; i++) {
            novaMatriz[i] = new String[cabecalho.length];
            novaMatriz[i][0] = String.valueOf(i); // ID.

            System.out.println("Digite o nome:");
            novaMatriz[i][1] = scanner.nextLine();

            System.out.println("Digite o telefone:");
            novaMatriz[i][2] = scanner.nextLine();

            System.out.println("Digite o email:");
            novaMatriz[i][3] = scanner.nextLine();
        }

        matrizCadastro = novaMatriz;
    }

    public static void atualizarUsuario() {
        System.out.println("Digite o ID do usuário que deseja atualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id < 0 || id >= matrizCadastro.length) {
            System.out.println("ID inválido.");
            return;
        }
        System.out.println(cabecalho[0]+id);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna]+": ");
            matrizCadastro[id][coluna] = scanner.nextLine();
        }
    }

    public static void deletarUsuario() {
        System.out.println("Digite o ID do usuário que deseja deletar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id < 0 || id >= matrizCadastro.length) {
            System.out.println("ID inválido.");
            return;
        }
        String[][] novaMatriz = new String[matrizCadastro.length - 1][cabecalho.length];
        for (int i = 0, idNovaMatriz = 0; i < matrizCadastro.length; i++) {
            if (i != id) {
                novaMatriz[idNovaMatriz] = matrizCadastro[i];
                novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
                idNovaMatriz ++;
            }

        }

        matrizCadastro = novaMatriz;
        System.out.println("Usuário deletado com sucesso.");
    }
}
