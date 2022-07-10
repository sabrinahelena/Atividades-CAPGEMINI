/*
 * Recebe valor depositado e exibe valor com rendimento apos um mes, juros de 0,07 ao mes
 */
package exercicio8;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

float valor;



        System.out.println("Qual valor deseja depositar?: ");
        valor = leitor.nextFloat();

        System.out.println("*********Passa-se um mes...*********");

        System.out.println("O valor com rendimento depois de um mes e': " + valor  * 1.07);



        
    }
}
