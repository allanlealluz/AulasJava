package Aula7.Exercicios;

public class Exercicio8 {
    public static void main(String[] args) {
        int num;
        num = 6;
        System.out.println(Fatorial(num));

    }
    public static int Fatorial(int num){
        int fatorial = 1;
        for (int i= 1; i <= num; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
