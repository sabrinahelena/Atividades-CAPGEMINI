package estruturaRepeticao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       // for (int i = 0; i <= 10; i++) {
           // System.out.println(i);
       // }

//WHILE
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");

        int totalAlunos = 10;
        while (totalAlunos > 0) {
            String nomeAluno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();
            System.out.println("O nome do aluno é: " + nomeAluno + "E a idade é: " + idadeAluno);

            totalAlunos--;
        }
    }
}
