import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        double saldo = 3455.33;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeDoCliente = scanner.next();
        
        System.out.println("Digite o numero da sua conta: ");
        int numeroDaConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Ola " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é a " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
