/*
 * Combustivel
 */
package exercicio3POO;

public class App {
   
    public static void main(String[] args) {
        BombaCombustivel b1 = new BombaCombustivel();

        b1.setValorLitro(50);
        b1.setPrecoLitro(6.4f);

        b1.abastecerPorValor();

    }
}
