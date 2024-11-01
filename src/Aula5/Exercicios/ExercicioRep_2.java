package Aula5.Exercicios;

public class ExercicioRep_2 {
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;
        while(c <= 100){
            if(c % 2 == 0){
                sum += c;
            }
            c += 1;
        }
        System.out.println(sum);
    }
}
