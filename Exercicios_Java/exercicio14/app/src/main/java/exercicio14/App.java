/*
 * Le dois valores interios e informa qual e' maior
 */
package exercicio14;
import java.util.Scanner;

public class App {
  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Digite o primeiro valor: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = leitor.nextInt();

            if(n1>n2){
            System.out.println("O " + n1 + " e' maior que o " + n2);
            }

            else if (n2>n1){
            System.out.println("O " + n2 + " e' maior que o " + n1);


            }

            else{

            System.out.println("O " + n1 + " e' igual ao " + n2);

            }




    }
}
