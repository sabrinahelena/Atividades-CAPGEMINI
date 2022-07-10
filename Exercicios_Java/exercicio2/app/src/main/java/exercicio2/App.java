/* Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos; */

package exercicio2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n1;
    int n2;
    int soma;
    int subtracao;
    int multiplicacao;
    int divisao;

    System.out.println("Digite o primeiro numero: ");
    n1 = leitor.nextInt();

    System.out.println("Digite o segundo numero: ");
    n2 = leitor.nextInt();

soma = n1 + n2;
subtracao = n1 - n2;
multiplicacao = n1 * n2;
divisao = n1/n2;

System.out.println("A soma dos dois numeros e: " + soma + " a subtracao e: " + subtracao + " a multiplicacao e: " + multiplicacao + " e a divisao e: " + divisao);
    }
}
