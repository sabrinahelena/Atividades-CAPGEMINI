/*
 * recebe a idade de 75 pessoas e mostra mensagem maior de idade e menor de idade para cada pessoa.
 */
package exercicio17;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 1;
        int idade;

        while(i<=75){

            System.out.println("Digite a sua idade: ");
            idade = leitor.nextInt();
            if(idade>18){

            System.out.println("Voce e maior de idade.");
            }

            else{
            System.out.println("Voce e menor de idade. ");

            }
            i++;



        }


    }
}
