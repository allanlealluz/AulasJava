package Aula7.Exemplos;

public class Exemplo3 {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2,4);
        System.out.println(retorno);
    }
    static int funcaoComParametroComRetorno(int numero1, int numero2){
        System.out.println("A seguir o resultado");
        return numero1+numero2;
    }
}
