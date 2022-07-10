
package prendendoClasseExemplo;

/**
 *
 * @author Sabrina
 */
public class Maquiagem {

    String produto;
    int preco;
    String cor;
    String marca;
    float capacidade;
boolean tampado;
 

void tipoMaquiagem(){
if (this.produto == "Batom"){

System.out.println("Que lindo o seu batom! De cor: " + this.cor + " e marca: " + this.marca + ". O valor ficou em: " + this.preco + " R$");
}

else if(this.produto == "Base"){
System.out.println("Que linda a sua base! De cor: " + this.cor + " e marca: " + this.marca + ". O valor ficou em: " + this.preco + " R$");

}

else if(this.produto == "Rimel"){
System.out.println("Que lindo o seu rimel! De cor: " + this.cor + " e marca: " + this.marca + ". O valor ficou em: " + this.preco + " R$");

}

else{
System.out.println("Que lindo o seu: " + this.produto + " de cor: " + this.cor + " e marca: " + this.marca + ". O valor ficou em: " + this.preco);


}

}   
}
