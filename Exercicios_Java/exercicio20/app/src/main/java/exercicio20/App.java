/*
 * Concessionaria vendendo caarros com desconto
 * Algoritmo deve calcular e exibir o valor do desconto e o valor a ser pago
 * Se o carro e' do ano ate 2000, 12% de desconto
 * acima de 2000, desconto de 7%
 * informar total de carros com ano ate 2000 e total geral
 */
package exercicio20;
import java.util.Scanner;


public class App {
  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int anoCarro;
        float valorPagar;
        float valorDesconto;
        float valorTotal;
        float desconto2000 = 0.12f;
        float descontoAcima2000 = 0.07f;
        char afirmacao = 'S';

        while(afirmacao == 'S'){

        System.out.println("Digite o ano do carro que voce quer comprar: ");
        anoCarro = leitor.nextInt();
        System.out.println("Digite o valor do carro que voce quer comprar: ");
        valorPagar = leitor.nextInt();

            if(anoCarro < 2000){

            valorDesconto = desconto2000 * valorPagar;
            valorTotal = valorPagar - valorDesconto;

            System.out.println("O valor a ser pago e' de: " + valorTotal + " pois o desconto foi de: " + valorDesconto);

            }
            else{
            valorDesconto = descontoAcima2000 * valorPagar;
            valorTotal = valorPagar - valorDesconto;
            System.out.println("O valor a ser pago e' de: " + valorTotal + " pois o desconto foi de: " + valorDesconto);


            }
        System.out.println("Voce deseja consultar outro carro? Digite 'S' para SIM e 'N' para NAO: ");
        afirmacao = leitor.next().charAt(0);

    }
}
}
