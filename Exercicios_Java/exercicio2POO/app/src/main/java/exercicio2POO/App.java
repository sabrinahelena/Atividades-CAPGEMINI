/*
 * ContaCorrente, para alterar nome, fazer deposito e saque.
 */
package exercicio2POO;

public class App {
   
    public static void main(String[] args) {
    ContaCorrente c1 = new ContaCorrente();
c1.setSaldo(10000);
c1.setDeposito(500);
c1.setSaque(500);
c1.depositar();
c1.sacar();

    }
}
