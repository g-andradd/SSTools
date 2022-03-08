package br.com.escola.teste;

import br.com.escola.dao.AlunoDAO;
import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;

public class TestaAluno {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.matricularAluno(10001, "Gabriel Almeida", Serie.QUINTO, Periodo.MATUTINO);

    }

}
