/*
 * Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas
 * por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas
 * efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s;
 */
package exercicio4;
import java.util.Scanner; 

public class App {

    public static void main(String[] args) {
        int salario;
        int totalVendas;
        int valorVendas = 50;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        salario = leitor.nextInt();
        System.out.println("Qual foi o total de vendas efetuadas no mes, em dinheiro?: ");
        totalVendas = leitor.nextInt();
        System.out.println("Ola, o seu salario final e': " + ((valorVendas * totalVendas) * 1.15 + salario));
    }
}
