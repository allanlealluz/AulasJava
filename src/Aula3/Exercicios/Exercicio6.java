package Aula3.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 4;
        boolean resposta;

        resposta = num1 < num2;
        System.out.println(num1 + " < " + num2 +" = "+ resposta);
        resposta = num1 > num2;
        System.out.println(num1 + " > " + num2 +" = "+ resposta);
        resposta = num1 <= num2;
        System.out.println(num1 + " <= " + num2 +" = "+ resposta);
        resposta = num1 >= num2;
        System.out.println(num1 + " >= " + num2 +" = "+ resposta);
        resposta = num1 != num2;
        System.out.println(num1 + " != " + num2 +" = " + resposta);
        resposta = num1 == num2;
        System.out.println(num1 + " == " + num2 +" = "+ resposta);
    }
}
