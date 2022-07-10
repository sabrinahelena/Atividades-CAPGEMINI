/*
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto;
 */
package exercicio3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in); 
float km;
float lCombustivel;
float consumoMedio;
    


    System.out.println("Quantos quilometros o carro percorreu?: ");
    km = leitor.nextFloat();
    System.out.println("Quantos litros de combustivel foram gastos?: ");
    lCombustivel = leitor.nextFloat();
    consumoMedio = lCombustivel/km;

    System.out.println("O consumo medio e': " + consumoMedio + " litros por km");

    }
}
