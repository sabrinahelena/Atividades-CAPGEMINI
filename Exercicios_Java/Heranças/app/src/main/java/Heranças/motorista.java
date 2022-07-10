package Heranças;

import java.util.Date;


public class Motorista extends funcionario {
    
    public Motorista(String nome, Date dataNascimento, String cpf, Double salario) {
        /*
            Note que � chamado o construtor da classe Pai (Funcion�rio),
            para isso � feito o uso do recurso "super" que chama o construtor
            da classe pai
        */
        super(nome, dataNascimento, cpf, salario);
    }
    
}
