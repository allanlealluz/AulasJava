package Aula8.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class Exemplo2 {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula8\\Exemplos\\arquivo.txt");
        try{
            FileWriter fileWriter = new FileWriter(arquivo);
            fileWriter.write("Python é melhor");
            fileWriter.close();
            FileReader fileReader = new FileReader(arquivo);
            int caractere;
            while((caractere = fileReader.read())!= -1){
                System.out.println((char)caractere);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
