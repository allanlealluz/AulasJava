package Aula5.Exercicios;

public class ExercicioRep_8 {
    public static void main(String[] args) {
        int par = 0;
        for(int i = 1; i < 11; i ++){
            if(i % 2 == 0){
                par += 1;
            }
        }
        System.out.println("Há "+par+" numeros pares e "+(10-par)+" numeros impares");
    }
}
