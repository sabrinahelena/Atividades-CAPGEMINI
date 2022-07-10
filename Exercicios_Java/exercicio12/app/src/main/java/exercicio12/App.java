/*
 * Calcular custo de um carro novo ao consumidor
custo de fabrica + percentual do distribuidor + impostos aplicados
os impotstos sao aplicados sobre o custo da fabica, e depois o percentual do distribuidor sobre o resultado

 */
package exercicio12;
import java.util.Scanner;

public class App {
 

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float custoFabrica;
        float custoConsumidor;
        float impostos = 1.45f;
        float percentualDistribuidor = 1.28f;

            System.out.println("Qual o custo da fabrica para produzir um carro?: ");
            custoFabrica = leitor.nextFloat();
            custoConsumidor = ((custoFabrica * impostos) * percentualDistribuidor);
            System.out.println("O custo do carro para o cunsumidor e': " + custoConsumidor + " R$");



    }
}
