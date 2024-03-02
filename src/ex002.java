import java.text.DecimalFormat;
import java.util.Scanner;

public class ex002 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantos dolares você possui? ");
    float num1 = entrada.nextFloat();

    System.out.println("Qual a cotação do dolar (Dólar para real)? ");
    float num2 = entrada.nextFloat();

    float resultado = conta(num1, num2);
    
    DecimalFormat df = new DecimalFormat("#.##");
    String numeroFormatado = df.format(resultado);
    

    System.out.println(numeroFormatado);
  }

  public static float conta (float a, float b) {

    return a * b;

  }

}
