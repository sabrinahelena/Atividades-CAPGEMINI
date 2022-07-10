/*
 * Media notas do aluno
 */
package exercicio5;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
String nome;
float n1;
float n2;
float n3;
float media;

        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite a sua primeira nota: ");
        n1 = leitor.nextFloat();
        System.out.println("Digite a sua segunda nota: ");
        n2 = leitor.nextFloat();
        System.out.println("Digite a sua terceira nota: ");
        n3 = leitor.nextFloat();

        media = (n1+n2+n3)/3;
            if(media<6){

            System.out.println(nome + " voce foi reprovado! Sua media foi menor que 6: " + media);

            }

            else{
            System.out.println(nome + " parabens, voce foi aprovado! Sua media foi maior ou igual a 6: " + media);

            }

        //System.out.println("Ola " + nome + " A sua media final e': " + media);


    }
}
