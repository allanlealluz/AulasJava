package Aula7.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(VerificarPar(i) == 1){
                System.out.println("Numero par encontrada");
            }else{
                System.out.println("Numero impar encontrado");
            }
        }
    }
    public static int VerificarPar(int num){
        if(num % 2 == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
