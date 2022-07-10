/*Exercício 22: Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, amédia de preço de custo e do preço de venda; */
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
            System.out.println("Digite o preço de custo: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda: ");
            precoVenda = leitor.nextFloat();
            if (precoVenda > precoCusto) {
                System.out.println("Houve lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Houve prejuízo");
            } else {
                System.out.println("Não houve lucro nem prejuízo");
            }
            precoCustoTOTAL += precoCusto;
            precoVendaTOTAL += precoVenda;
        }
        System.out.println("O valor total da média de custo é: " + (precoCustoTOTAL / 40));
        System.out.println("O valor total da média de venda é: " + (precoVendaTOTAL / 40));

    }
}
