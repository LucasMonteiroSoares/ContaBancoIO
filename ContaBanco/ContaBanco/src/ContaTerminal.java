import java.util.Scanner;

public class ContaTerminal {
    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private final double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Informe seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Informe seu saldo: ");
        double saldo = sc.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %f já está disponível para saque.%n",
                conta.nomeCliente, conta.agencia, conta.numero, conta.saldo);

        sc.close();
    }
}