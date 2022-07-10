/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4POO;

/**
 *
 * @author Sabrina
 */
public class Elevador {

private int terreo = 0;
private int totalAndares = 10;//desconsiderando terreo
protected int capacidadeElevador;
protected int quantidadePessoas = 0;
protected int andares;


    void inicializar(){

    System.out.println("Bem vindo ao predio Paradise! Nosso predio tem: " + this.totalAndares + " andares e o elevador tem a capacidade para " + this.capacidadeElevador + " pessoas.");

    }

    void entrar(){ //adiciona uma pessoa no elevador se nao tiver atingido a capacidade total

    if(this.quantidadePessoas<this.capacidadeElevador){

    this.quantidadePessoas++;

    }

    else{

    System.out.println("Nao temos mais espaco no elevador.");
    }

    }

    void sair(){

    if(this.quantidadePessoas!=0){

    this.quantidadePessoas--;

    }
    else{

    System.out.println("Nao da retirar mais ningue,, ja estamos com 0 pessoas!");
    }

    }

    void subir(){

    if(this.andares != 10){

    this.andares++;

    }
    else{

    System.out.println("Nao da para subir, ja estamos no ultimo andar!");
    }
    }

    void descer(){


    if(this.andares != 0){

    this.andares--;

    }

    else{
    System.out.println("Nao da para abaixar de andar, ja estamos no terreo!");
    }



    }

    void status(){

    System.out.println("Voce esta no andar: " + this.andares + " e temos: " + this.quantidadePessoas + " pessoas no elevador.");

    }

//Getters e Setters
    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }




    }






