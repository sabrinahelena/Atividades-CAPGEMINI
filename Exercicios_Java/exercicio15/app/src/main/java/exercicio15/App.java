/*
 * Recebe um numero e informa se esta no intervalo entre 100 e 200
 */
package exercicio15;
import java.util.Scanner;


public class App {
  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();
            if(numero>100 && numero<200){
            System.out.println("O numero esta' dentro do intervalo.");

            }

            else{
            System.out.println("O numero nao esta' dentro do intervalo. ");

            }

    }

}
