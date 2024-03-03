import java.text.DecimalFormat;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira uma temperatura em Fahrenheit: ");
        float valor = entrada.nextFloat();

        float resultado = converter(valor);

        DecimalFormat df = new DecimalFormat("#.##");
        String numeroFormatado = df.format(resultado);
        
        System.out.println("Em Celsius é: " + numeroFormatado + " 123C");
    }

    public static float converter(float a) {
        return (a - 32) * (5.0f / 9.0f);
    }
}
