package Classes; //aqui fazemos nossa fun��o

public class Pessoa {

     private float peso; 
    private float altura; 

    public float calcularIMC() {
        float IMC = peso / (altura * altura);
        return IMC;
}

//métdos acessores
public void setPeso(float peso){
    this.peso = peso;
}

public float getPeso(){
    return peso;
}


public void setAltura(float altura){
    this.altura = altura;
}

public float getAltura(){
    return altura;
}

}



