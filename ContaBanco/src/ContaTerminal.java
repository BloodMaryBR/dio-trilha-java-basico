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
      System.out.printf("A agencia digitada foi: %s", agencia);

      System.out.printf("Agencia digitada foi: %s digite o numero da conta: " , agen);

        

      entrada.close();
    }
}
