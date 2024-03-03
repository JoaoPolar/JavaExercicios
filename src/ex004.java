import java.util.Scanner;

public class ex004 {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("um valor: ");
    double valor = entrada.nextDouble();

    check(valor);
  }
  public static void check(double a) {
    
    if (a < 0) {
      System.out.println("Seu número é negativo");

    } 
    else if (a > 0) {
      System.out.println("Seu número é postivo");

    } 
    else{
      System.out.println("Seu número é zero"); 
    }

  }
}
