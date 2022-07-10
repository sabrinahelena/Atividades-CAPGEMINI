/*
 * Conversao do real para dolar
 */
package exercicio9;
import java.util.Scanner;

public class App {
 

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
float dolar;
float conversao;
float cotacaoReal;

System.out.println("Digite o valor em dolar: ");
dolar = leitor.nextFloat();

System.out.println("Digite o valor de 1 dolar em real atualmente: ");
cotacaoReal = leitor.nextFloat();

conversao = dolar * cotacaoReal;

System.out.println("O seu valor em dolar: " + dolar + "US$ em real fica: " + conversao + "R$");

        
    }
}
