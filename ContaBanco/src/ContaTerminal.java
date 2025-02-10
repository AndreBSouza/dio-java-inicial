import java.util.Locale;
import java.util.Scanner;

/**
 * <h1> ContaBanco </h1>
 * A ContaTerminal tem a finalidade de, a partir de dados fornecidos pelo usuário, exibir uma mensagem
 * agradecendo e informando seus dados e seu saldo disponível para resgate.
 * <p>
 * <b> Note:</b> Para se interar melhor sobre esta classe, leia a documentação.
 * 
 * @author Andre Barbosa
 * @version 1.0
 * @since 10/02/2025
 */

public class ContaTerminal {
  public static void main(String[] args) throws Exception {

    double saldo = 1050.36;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite agora o seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Agora, preciso que digite o numero da sua agência, com dígito");
    String numeroAgencia = scanner.next();

    System.out.println("Para finalizar, vou precisar que digite agora o numero da sua conta");
    int numeroConta = scanner.nextInt();

    System.out.println("Olá " + nome + "" + sobrenome
        + "!, obrigado por criar uma conta em nosso banco, sua agência é : " + numeroAgencia + ", conta : " +
        numeroConta + " e seu saldo no valor de " + saldo + " já esta disponível para saque !");

  }
}
