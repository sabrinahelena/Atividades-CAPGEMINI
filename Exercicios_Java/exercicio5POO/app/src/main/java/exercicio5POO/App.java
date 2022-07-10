/*
 * Alunos, calcula media e quanto o aluno precisa na prova final.
 */
package exercicio5POO;

public class App {

    public static void main(String[] args) {
       AlunosNotas aluno1 = new AlunosNotas();

        aluno1.setNome("Sabrina Helena");
        aluno1.setMatricula(2022123252);
        aluno1.setNotaParaPassar(6);
        aluno1.setNotaProva1(7);
        aluno1.setNotaProva2(9);
        aluno1.setNotaTrabalho(8);
        aluno1.status();
        aluno1.calcularMedia();
        aluno1.calcularFinal();

    }
}
