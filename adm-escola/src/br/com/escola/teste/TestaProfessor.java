package br.com.escola.teste;

import br.com.escola.dao.ProfessorDAO;
import br.com.escola.factory.ConnectionFactory;
import br.com.escola.modelo.Professor;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaProfessor {

    public static void main(String[] args) throws SQLException {

        Professor professor = new Professor(89321, "8920", "Alberto Leal", new BigDecimal("5000.00"));
        try(Connection connection = new ConnectionFactory().recuperarConexao()){
            ProfessorDAO professorDAO = new ProfessorDAO(connection);
//            professorDAO.cadastrar(professor);
            List<Professor> listaDeProfessores = professorDAO.listar();
            listaDeProfessores.stream().forEach(lp -> System.out.println(lp));
//            professorDAO.deletarPorMatricula(professor.getMatricula());
//            connection.commit();
        }
    }

}
