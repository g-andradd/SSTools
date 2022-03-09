package br.com.escola.teste;

import br.com.escola.dao.AlunoDAO;
import br.com.escola.factory.ConnectionFactory;
import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;
import br.com.escola.modelo.Turma;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(10003, "Vitor Silva");

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
//            AlunoDAO alunoDAO = new AlunoDAO(connection);
//            alunoDAO.matricular(aluno);
//            List<Aluno> listaDeAlunos = alunoDAO.listar();
//            listaDeAlunos.stream().forEach(la -> System.out.println(la));
//            alunoDAO.deletarPorMatricula(aluno.getMatricula());

            Turma turma = new Turma(1, Serie.QUINTO_FUNDAMENTAL, Periodo.MATUTINO);
            System.out.println(String.valueOf(turma.getSerie()));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
