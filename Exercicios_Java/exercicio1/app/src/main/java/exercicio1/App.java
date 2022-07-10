// Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
package exercicio1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int n1;
    int n2;
    int total;

    System.out.println("Digite o primeiro numero: ");
    n1 = leitor.nextInt();
    System.out.println("Digite o segundo numero: ");
    n2 = leitor.nextInt();
    total = n1 + n2;
    System.out.println("O total e': " + total);
    



    }
}
