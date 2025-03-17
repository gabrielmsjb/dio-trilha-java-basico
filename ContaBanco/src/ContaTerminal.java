import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Insira o número da agência no formato (XXX-X)");
        String numeroAgencia = scanner.next();
        System.out.println("Insira o seu nome:");
        String nome = scanner.next();
        System.out.println("Insira o saldo da conta:");
        Double saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }   
}
