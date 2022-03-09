package br.com.escola.teste;

import br.com.escola.dao.ProfessorDAO;
import br.com.escola.factory.ConnectionFactory;
import br.com.escola.modelo.Funcionario;
import br.com.escola.modelo.Professor;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaProfessor {

    public static void main(String[] args) throws SQLException {

        Professor professor = new Professor(82190, "1321", "José dos Santos", new BigDecimal("3700.00"));
        try(Connection connection = new ConnectionFactory().recuperarConexao()){
            ProfessorDAO professorDAO = new ProfessorDAO(connection);
            professorDAO.listar();
        }
    }

}
