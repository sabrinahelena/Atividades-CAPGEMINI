/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package prendendoClasseExemplo;

//Maquiagem

public class App {

    public static void main(String[] args) {
       Maquiagem m = new Maquiagem();

m.produto = "Delineador";
m.cor = "Vermelho";
m.capacidade = 200.5f;
m.marca = "Ruby Rose";
m.preco = 10;

m.tipoMaquiagem();
    }
}