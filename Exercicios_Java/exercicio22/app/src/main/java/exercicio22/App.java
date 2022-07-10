/*Exerc�cio 22: Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos. Mostre como resultado
se houve lucro, preju�zo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, am�dia de pre�o de custo e do pre�o de venda; */
package exercicio22;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float precoCusto;
        float precoVenda;
        float precoCustoTOTAL = 0;
        float precoVendaTOTAL = 0;

        for (int i = 0; i < 40; i++) {
            System.out.println("Digite o pre�o de custo: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o pre�o de venda: ");
            precoVenda = leitor.nextFloat();
            if (precoVenda > precoCusto) {
                System.out.println("Houve lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Houve preju�zo");
            } else {
                System.out.println("N�o houve lucro nem preju�zo");
            }
            precoCustoTOTAL += precoCusto;
            precoVendaTOTAL += precoVenda;
        }
        System.out.println("O valor total da m�dia de custo �: " + (precoCustoTOTAL / 40));
        System.out.println("O valor total da m�dia de venda �: " + (precoVendaTOTAL / 40));

    }
}
