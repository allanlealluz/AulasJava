package Aula4.exemplos;

public class Exemplo7 {
    public static void main(String[] args) {

        float valorCompra = 150.00f;
        float desconto = 0.2f;
        float valorFinal;

        valorFinal = valorCompra > 100.00f ? valorCompra - valorCompra * desconto : valorCompra;
        System.out.println(valorFinal);
    }
}
