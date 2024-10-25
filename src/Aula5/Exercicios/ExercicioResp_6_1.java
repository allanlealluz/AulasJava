package Aula5.Exercicios;

public class ExercicioResp_6_1 {
        public static void main(String[] args) {
            int ante = 1;
            int num = 1;
            int prox = 0;
            int c = 0;
            while(c < 10){
                System.out.println((ante)+ " ");
                prox = num + ante;
                ante = num;
                num = prox;
                c ++;
            }
        }
    }


