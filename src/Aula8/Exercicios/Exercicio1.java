package Aula8.Exercicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula8\\Exercicios\\alunos.txt");
        Scanner scanner = new Scanner(System.in);
        try{
            if(arquivo.exists()){
                System.out.println("O arquivo já existe");
            }else {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso");
                } else {
                    System.out.println("Problema para carregar o arquivo");
                }
            }
            FileWriter fileWriter = new FileWriter(arquivo);
            FileReader fileReader = new FileReader(arquivo);
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o nome de um aluno");
                fileWriter.write( scanner.next()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
