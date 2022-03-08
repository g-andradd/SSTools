package br.com.escola.teste;

import br.com.escola.dao.AlunoDAO;
import br.com.escola.factory.ConnectionFactory;
import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(10003, "Vitor Silva", Serie.QUINTO, Periodo.MATUTINO);

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            AlunoDAO alunoDAO = new AlunoDAO(connection);
//            alunoDAO.matricular(aluno);
            List<Aluno> listaDeAlunos = alunoDAO.listar();
            listaDeAlunos.stream().forEach(la -> System.out.println(la));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
