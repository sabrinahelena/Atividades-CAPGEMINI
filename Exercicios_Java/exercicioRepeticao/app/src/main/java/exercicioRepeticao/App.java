//Exercício 24: Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
package exercicioRepeticao;

import java.util.Scanner; //biblioteca de leiura

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //scanner leitor

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S') { //enquanto a pessoa digitar S
            System.out.println("Digite um número: ");
            int numero = leitor.nextInt();

            if (numero == 0) {
                System.out.println("Numero 0");
            } else if (numero < 0) {
                System.out.println("Numero negativo");
            } else if (numero > 0) {
                System.out.println("Numero positivo");
            }
 System.out.println("Deseja executar novamente? Se sim, digite S. ");
        desejaContinuar = leitor.next().charAt(0); //pegar primeira letra da palavra
        }
      
    }
}
