package Aula6.Exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int sum = 0;
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length ; i++) {
            sum += numeros[i];
        }
        System.out.println(sum);


    }
}
