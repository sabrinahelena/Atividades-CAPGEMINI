 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2POO;

/**
 *
 * @author Sabrina
 */
public class ContaCorrente {
    
private int numeroConta;
private String nomeCorrentista;
protected int saldo;
protected int deposito;
protected int total;
protected int saque;

void alterarNome(){

System.out.println("O seu nome e': " + this.nomeCorrentista);


}

void depositar(){

System.out.println("Voce depositou: " + this.deposito + " e o valor final na conta e' de: " + (this.saldo += this.deposito));

}

void sacar(){

System.out.println("Voce sacou o valor de: " + this.saque + " e a sua conta ficou com um valor total de: " + (this.saldo - this.saque));

}

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getSaque() {
        return saque;
    }

    public void setSaque(int saque) {
        this.saque = saque;
    }






}
