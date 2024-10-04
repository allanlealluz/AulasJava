package Aula3.exemplos;

public class Exemplo2 {
    public static void main(String [] args){
        int total, num1=2, num2=4;
        float totaf;

        total = num1+num2;
        System.out.println("O total da soma é "+total);
        total = num1-num2;
        System.out.println("O total da subtração é "+total);
        total = num1*num2;
        System.out.println("O total da multiplicação é "+total);
        totaf = (float)num1/num2;
        System.out.println("O total da divisão é "+totaf);
    }
}
