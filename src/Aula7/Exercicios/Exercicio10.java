package Aula7.Exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        float altura = 1.8f;
        float peso = 50.6f;
        calcularIMC(altura,peso);
    }
    public static double calcularIMC(float altura, float peso){
        return (Math.pow(altura,2) * peso);
    }
}
