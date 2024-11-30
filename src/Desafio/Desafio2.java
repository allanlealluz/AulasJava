package Desafio;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                |   ESCOLHA UMA OPÇÃO:     
                |   1 - Exibir cadastro Completo    
                |   2 - Cadastrar Usuário
                |   3 - Atualizar Usuário
                |   4 - Deletar Usuário 
                |   5 - Sair           
                """;
        int opcao = scanner.nextInt();
        do {
        System.out.println(menu);
        opcao = scanner.nextInt();
        scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    CadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        }while(opcao != 5);
    }
    public static void exibirUsuario(){
        System.out.println("Exibir");
    }
    public static void CadastrarUsuario(){
        System.out.println("Cadastar");
    }
    public static void atualizarUsuario(){
        System.out.println("Exibir");
    }
    public static void deletarUsuario(){
        System.out.println("Exibir");
    }
}
