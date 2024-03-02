import java.util.Scanner;
import java.text.DecimalFormat;

public class ex001 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos reais você possui? ");
        float num1 = entrada.nextFloat();

        System.out.println("quanto vale um dolar em reais?");
        float num2 = entrada.nextFloat();

        float resultado = divisao(num1, num2);

        DecimalFormat df = new DecimalFormat("#.##");
        String numeroFormatado = df.format(resultado);

        System.out.println("convertendo, você tem "+ numeroFormatado + " dolar");
    }

    public static float divisao (float a, float b) {
        return a / b;
    }
}