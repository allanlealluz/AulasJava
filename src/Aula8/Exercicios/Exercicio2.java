package Aula8.Exercicios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Exercicio2 {
    public static void main(String[] args) {
        String caminhoArquivo = "src\\Aula8\\Exercicios\\alunos.txt";
        try (FileReader fr = new FileReader(caminhoArquivo);
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
