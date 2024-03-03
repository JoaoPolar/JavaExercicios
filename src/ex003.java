import java.util.Scanner;

public class ex003 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um numero");
    int num = entrada.nextInt();

    int resultado = resto(num);
    if (resultado == 1) {
      System.out.println("Seu número impar");
      
    }
    else {
      System.out.println("Seu número é par");
    } 
  }
  public static int resto (int a) {
    return a % 2;
  }

}
