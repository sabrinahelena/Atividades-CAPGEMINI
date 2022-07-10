/*
 * Loja mamao com acucar vendendo produtos em cinco prestacoes sem juros
 */
package exercicio10;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

        float valorTotal;
        float prestacoes;

        System.out.println("Qual o valor total da compra?: ");
        valorTotal = leitor.nextFloat();

        prestacoes = (valorTotal/5);

        System.out.println("O valor das prestacoes e' de: " + prestacoes + "R$");

        
    }
}
