/*
 * Ler 80 numeros e informar no final quantos numeros estao no intervalo entre 10 e 150
 */
package exercicio16;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1;
        int numero;
        int contador = 0;

        while(i<=80){

        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();

        i++;

            if(numero>=10 && numero<=150){
            contador++;

            }
}


System.out.println("A quantidade de numeros no intervalo e': " + contador);


    }
}
