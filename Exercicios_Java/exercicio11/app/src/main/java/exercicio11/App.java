/*
 * Recebe preco de custo do produto e mostra o valor de venda.
 * O valor de venda recebe um acrescimo de acordo com um percentual.
 */
package exercicio11;
import java.util.Scanner;
public class App {
  

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float precoCusto;
    float valorVenda;
    float percentual;

        System.out.println("Digite o preco de custo: ");
        precoCusto = leitor.nextFloat();
        System.out.println("Digite o percentual de acrescimo (em porcentagem) no valor de venda: ");
        percentual = leitor.nextFloat();
        valorVenda = (precoCusto * (1+ (percentual/100)));
        System.out.println("O valor de venda fica em: " + valorVenda + " R$");


    }
}
