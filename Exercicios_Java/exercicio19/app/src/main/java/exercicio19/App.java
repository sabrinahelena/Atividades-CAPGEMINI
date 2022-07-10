/*
 * Le nome e sexo de 56 pessoas e informa o nome e se e homem ou mulher, e no final total de homens e mulheres
 */
package exercicio19;
import java.util.Scanner;

public class App {
  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        char genero;
        int contadorMulheres = 0;
        int contadorHomens = 0;
        int i = 1;

            while(i<=10){
                System.out.println("Digite o seu nome: ");
                nome = leitor.nextLine();

                System.out.println("*****************");

                System.out.println("Digite o seu genero, F para mulher e M para homem ");
                genero = leitor.next().charAt(0);


                    if(genero == 'F'){
                    System.out.println("Voce e' uma mulher, e seu nome e': " + nome);
                    contadorMulheres++;
                    }
                    else if(genero == 'M'){
                    System.out.println("Voce e' um homem, e seu nome e': " + nome);
                    contadorHomens++;

                    }
                    else{
                    System.out.println("Digite um genero valido, M ou F");

                    }
                i++;
            }

        System.out.println("O total de homens e': " + contadorHomens + " e o total de mulheres e': " +contadorMulheres);

    }
}
