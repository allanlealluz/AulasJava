package Aula8.Exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio3 {
    public static void main(String[] args) {
        String caminhoArquivoOrigem = "src\\Aula8\\Exercicios\\alunos.txt";
        String caminhoArquivoDestino = "src\\Aula8\\Exercicios\\backup_alunos.txt";

        try (FileReader fr = new FileReader(caminhoArquivoOrigem);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(caminhoArquivoDestino);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                bw.write(linha);
                bw.newLine(); // Adiciona uma quebra de linha no arquivo de destino
            }
            System.out.println("Cópia concluída com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
