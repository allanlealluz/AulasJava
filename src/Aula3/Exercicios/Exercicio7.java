package Aula3.Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean cond1 = true,cond2= false,cond3=false;
        System.out.println(cond1 && cond2);
        System.out.println(cond2 && cond3);
        System.out.println(cond1 && cond3);
        System.out.println(cond2|| cond1);
        System.out.println(cond2|| cond3);
        System.out.println(cond1|| cond3);
    }
}
