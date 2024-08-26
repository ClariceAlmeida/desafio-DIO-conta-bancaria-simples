import java.util.Scanner;

/**
 * Classe que representa uma conta em um terminal bancário.
 */
public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    /**
     * Define o número da conta.
     * @param numero Número da conta.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Define a agência da conta.
     * @param agencia Número da agência.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Define o nome do cliente.
     * @param nomeCliente Nome do cliente.
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Define o saldo da conta.
     * @param saldo Saldo da conta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Gera uma mensagem de confirmação com os detalhes da conta.
     * @param numero Número da conta.
     * @param agencia Número da agência.
     * @param nomeCliente Nome do cliente.
     * @param saldo Saldo da conta.
     * @return Mensagem de confirmação com os detalhes da conta.
     */
    public String confirmacao(int numero, String agencia, String nomeCliente, double saldo) {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!";
    }
}
