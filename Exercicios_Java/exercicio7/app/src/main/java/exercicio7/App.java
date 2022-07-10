/*
 * Conversao Celsius para Fahrenheit
 */
package exercicio7;

import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float grausCelsius;
    float fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius: ");
        grausCelsius = leitor.nextFloat();

        fahrenheit = (((9*grausCelsius) + 160) / 5);

        System.out.println(grausCelsius + " C em Fahrenheit e': " + fahrenheit + " F"); 


    }
}
