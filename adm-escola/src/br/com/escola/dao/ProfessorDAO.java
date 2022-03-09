package br.com.escola.dao;

import br.com.escola.modelo.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    private Connection connection;

    public ProfessorDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(Professor professor) throws SQLException {
        connection.setAutoCommit(false);
//        String sql = "INSERT INTO PROFESSOR(MATRICULA, SENHA, NOME, SALARIO) VALUES (?, ?, ?, ?)";
        StringBuffer sql = new StringBuffer("INSERT INTO PROFESSOR");
        sql.append("(MATRICULA, SENHA, NOME, SALARIO) ");
        sql.append("VALUES (?, ?, ?, ?)");

        try (PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))) {
            pstm.setInt(1, professor.getMatricula());
            pstm.setString(2, professor.getSenha());
            pstm.setString(3, professor.getNome());
            pstm.setBigDecimal(4, professor.getSalario());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(professor);
    }

    public List<Professor> listar() {
        List<Professor> professores = new ArrayList<>();
        StringBuffer sql = new StringBuffer("SELECT ");
        sql.append("MATRICULA MATRICULA, SENHA SENHA, NOME NOME, SALARIO SALARIO ");
        sql.append("FROM PROFESSOR");

        try (PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))) {
            pstm.execute();
            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Professor professor = new Professor(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getBigDecimal(4));
                    professores.add(professor);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professores;
    }

}
