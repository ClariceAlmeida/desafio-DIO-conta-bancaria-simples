import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ContaTerminal novaConta = new ContaTerminal();
            System.out.println("Por favor, digite o número de usuário:");
            int numero = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha
            novaConta.setNumero(numero);

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = sc.nextLine();
            novaConta.setAgencia(agencia);

            System.out.println("Por favor, digite seu nome:");
            String nomeCliente = sc.nextLine();
            novaConta.setNomeCliente(nomeCliente);

            System.out.println("Por favor, digite seu saldo:");
            double saldo = sc.nextDouble();
            novaConta.setSaldo(saldo);

            System.out.println(novaConta.confirmacao(numero, agencia, nomeCliente, saldo));

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na entrada de dados: " + e.getMessage());
        }
    }
}
