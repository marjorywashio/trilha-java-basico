import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = entrada.nextLine();

        System.out.println("Digite o número da conta: ");
        numero = entrada.nextInt();

        entrada.nextLine();


        System.out.println("Digite o saldo: ");
        saldo = entrada.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        entrada.close();
    }
}
