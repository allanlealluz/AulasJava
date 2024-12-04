package Aula8.Exemplos;

import java.io.File;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\Allan\\AulasJava2\\src\\Aula8\\Exemplos\\arquivo.txt");

        if(arquivo.exists()){
            System.out.println("O arquivo já existe");
        }else{
            try{
                if(arquivo.createNewFile()){
                    System.out.println("Arquivo criado com sucesso");
                }else{
                    System.out.println("Problema para carregar o arquivo");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
