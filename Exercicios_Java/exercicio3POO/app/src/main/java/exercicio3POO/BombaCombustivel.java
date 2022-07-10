/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3POO;

public class BombaCombustivel {

    protected String tipoCombustivel;
    protected float valorLitro; //valor em dinheiro por L
    protected float quantidadeCombustivel;
    protected float precoLitro;
    protected float litro;


        void abastecerPorValor(){ //abastece dependendo do valor, e informa a quantidade de litro colocada

        System.out.println("Voce deseja colocar: " + this.valorLitro + "R$ de litro, entao a quantidade de litros no seu carro sera de: " + (this.valorLitro/this.precoLitro));

        }
        void abastecerPorLitro(){ //abastece dependendo da quant. de litros que quer por e mostra o valor a ser pago

        System.out.println("Voce deseja colocar: " + this.litro + "L, entao voce devera pagar: " + (this.litro * this.precoLitro));

        }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public float getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(float precoLitro) {
        this.precoLitro = precoLitro;
    }

    public float getLitro() {
        return litro;
    }

    public void setLitro(float litro) {
        this.litro = litro;
    }


}
