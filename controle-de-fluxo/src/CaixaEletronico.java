import java.util.Scanner;

public class CaixaEletronico {
public static void main(String[] args) {
    double saldo  = 25.50 ;
    System.out.println("o saldo e de " + saldo);
    Scanner entrada = new Scanner(System.in);

    double valorSolicitado = entrada.nextDouble() ;
    if (valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
      System.out.println("O saldo restate é " + saldo);  }
      else {System.out.println("O valor solicitado é invalido.");}

      entrada.close();
}
}
