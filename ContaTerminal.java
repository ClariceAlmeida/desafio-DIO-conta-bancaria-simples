import java.util.Scanner;

public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;


    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public static void main(String[] args) {
        // TODO:Colocar o Java Doc nos métodos
        // TODO: colocar Exceptions


        Scanner sc = new Scanner(System.in);

        ContaTerminal novaConta = new ContaTerminal();

        System.out.println("Por favor, digite o número de usuário");
        int numero = sc.nextInt();
        sc.nextLine();
        novaConta.setNumero(numero);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();
        novaConta.setAgencia(agencia);

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();
        novaConta.setNomeCliente(nomeCliente);

        System.out.println("Por favor, digite seu saldo");
        double saldo = sc.nextDouble();
        novaConta.setSaldo(saldo);

        System.out.println("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
