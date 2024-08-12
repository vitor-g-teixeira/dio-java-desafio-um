import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        double saldo;
        String agencia;
        String nomeCliente;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número de sua conta: ");
        numero = Integer.parseInt(input.nextLine());
        
        System.out.print("Por favor, digite o número de sua Agência: ");
        agencia = input.nextLine();
        
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = input.nextLine();
        
        System.out.print("Por favor digite seu saldo: ");
        saldo = Double.parseDouble(input.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " +  saldo + " já está disponível para saque");
        input.close();
    }   
}
