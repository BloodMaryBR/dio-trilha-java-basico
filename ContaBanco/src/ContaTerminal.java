import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //todo: conhecer e importar a classe scanner
      // exibir as mensagens para usuario
      //obter pela classe scanner os valores digitados no terminal
      // exibir a msg da conta criada


System.out.println("Olá Cliente. Digite  seu nome:");
Scanner entrada = new Scanner(System.in);
String cliente = entrada.nextLine();

      System.out.printf("Olá %s.Digite a sua agencia: ", cliente);
      
      String agencia = entrada.nextLine();
          System.out.printf("Agencia digitada foi: %s digite o numero da conta: " , agencia);
      String conta = entrada.nextLine();
      System.out.printf( "Bem vindo senhor(a) %s ag: %S conta: %s \n digite o deposito inicial: " ,cliente,agencia,conta);
      float deposito = entrada.nextFloat();
      
      System.out.printf( "Bem vindo senhor(a) %s seu saldo é  de %.2f e já está disponível para uso. " ,cliente, deposito);
      

        

      entrada.close();
    }
}
