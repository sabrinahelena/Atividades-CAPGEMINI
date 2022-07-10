/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6POO;

public class Invoice {


    protected int numeroItemFaturado;
    protected String descricaoitem;
    protected int quantidadeComprada;
    protected float precoUnitarioItem;

    public Invoice() {
        this.numeroItemFaturado = 2;
        this.descricaoitem = "Mouse";
        this.quantidadeComprada = 3;
        this.precoUnitarioItem = 4.70f;
    }

        void getInvoiceAmount(){

        System.out.println("O total da compra e': " +(this.quantidadeComprada * this.precoUnitarioItem));

        }
}


