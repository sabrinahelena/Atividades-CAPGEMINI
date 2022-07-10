/*
 * Recebe um numero e mostra uma mensagem caso seja maior que 10
 */
package exercicio13;
import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

        float numero;

        System.out.println("Digite um numero: ");
        numero = leitor.nextFloat();

            if(numero > 10)
            {

            System.out.println("O numero e maior que 10.");
            }

            else
            {

            System.out.println("O numero e' igual a 10 ou menor que 10. ");
            }

    }
}
