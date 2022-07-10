/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5POO;

/**
 *
 * @author Sabrina
 */
public class AlunosNotas {

    protected int matricula;
    protected String nome;
    protected float notaProva1; 
    protected float notaProva2;
    protected float notaTrabalho;
    protected float notaParaPassar;
    protected float totalMedia;

        void status(){

        System.out.println("Ola " + this.nome + " ! Voce e' aluno da escola Brooklin, e sua matricula e':  " + this.matricula);
        System.out.println("Suas notas, da prova 1 e 2, e o trabalho respectivamente sao: " + this.notaProva1 + " " + this.notaProva2 + " " + this.notaTrabalho);
        System.out.println("Voce precisa de: " + this.notaParaPassar + " para passar de ano.");
        System.out.println("********************************************");

        }
        void calcularMedia(){
        this.totalMedia =  (((this.notaProva1 * 2.5f) + (this.notaProva2 * 2.5f) + (this.notaTrabalho * 2))/7);
        System.out.println("A media das notas da prova e do trabalho e': " + totalMedia);

        }    

        void calcularFinal(){
            if(this.totalMedia <6){
            System.out.println("A nota que voce precisa tirar na prova final e': " + (this.notaParaPassar - this.totalMedia));
            }
            else{
            System.out.println("A nota que voce precisa tirar na prova final e' 0");

            }

        }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float getNotaParaPassar() {
        return notaParaPassar;
    }

    public void setNotaParaPassar(float notaParaPassar) {
        this.notaParaPassar = notaParaPassar;
    }

    public float getTotalMedia() {
        return totalMedia;
    }

    public void setTotalMedia(float totalMedia) {
        this.totalMedia = totalMedia;
    }


}
