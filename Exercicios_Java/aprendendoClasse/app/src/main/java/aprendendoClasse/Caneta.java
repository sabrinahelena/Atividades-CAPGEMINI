/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendoClasse;

/**
 *
 * @author Sabrina
 */
public class Caneta { //minha classe, sempre tem que iniciar com maiusculo
    public String modelo; //se nao definir, fica publico
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
public Caneta(){ //metodo construtor tem o mesmo nome da classe
//com ele, podemos chamar apenas o status que ja vai o tampado e a cor azul
this.tampar();
this.cor = "Azul";


}


//Metodos

public void status(){

    System.out.println("Essa e' uma caneta: " + this.cor);
    System.out.println("Essa caneta esta tamapada?: " + this.tampada);
    System.out.println("O modelo da caneta e':  " + this.getModelo()); //mesma coisa de usar this.modelo
    System.out.println("A ponta da caneta e': " + this.ponta);
    System.out.println("E por fim, a carga e': " + this.carga);

}
public void rabiscar(){
 if(this.tampada == true){
System.out.println("Nao consigo rabiscar");
}

else{

System.out.println("Posso rabiscar!");

}

}

protected void tampar(){

    this.tampada = true;
}

protected void destampar(){
    this.tampada = false;   

}

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }


}
