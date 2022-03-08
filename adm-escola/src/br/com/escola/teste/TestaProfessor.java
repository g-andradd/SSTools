package br.com.escola.teste;

import br.com.escola.modelo.Funcionario;
import br.com.escola.modelo.Professor;

import java.math.BigDecimal;

public class TestaProfessor {

    public static void main(String[] args) {

        Funcionario professor = new Professor("2002", "1234", "joao", new BigDecimal("1202.00"));

        System.out.println(professor.getSalario());



    }

}
