/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1POO;

/**
 *
 * @author Sabrina
 */
public class Pessoa {

private String nome;
private int anoNascimento;
private float altura;

void status(){

System.out.println("O nome da pessoa e': " + this.nome);
System.out.println("O ano de nascimento da pessoa e': " + this.anoNascimento);
System.out.println("A altura da pessoa e': " + this.altura);

}

void calcularIdade(){

System.out.println("A idade da pessoa hoje, em 2022 e': " + (2022 - this.anoNascimento) + " anos.");

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    
}
