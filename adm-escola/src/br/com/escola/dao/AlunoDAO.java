package br.com.escola.dao;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }

    public void matricular(Aluno aluno) throws SQLException {
        connection.setAutoCommit(false);
        String sql = "INSERT INTO ALUNO (MATRICULA, NOME, SERIE, PERIODO) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, aluno.getMatricula());
            pstm.setString(2, aluno.getNome());
            pstm.setString(3, aluno.getSerie().getDescricao());
            pstm.setString(4, aluno.getPeriodo().getDescricao());

            pstm.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Rollback foi executado");
            connection.rollback();
        }
        System.out.println(aluno);
    }

    public List<Aluno> listar() {
        List<Aluno> alunos = new ArrayList<>();

//        StringBuffer sql = new StringBuffer();
//        sql.append("SELECT ID ID, NOME NOME, SERIE SERIE, PERIODO PERIODO");
//        sql.append("FROM ALUNO");

        String sql = "SELECT MATRICULA MATRICULA, NOME NOME, SERIE SERIE, PERIODO PERIODO FROM ALUNO";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();
            Aluno aluno = null;
            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    aluno = new Aluno(rst.getInt(1), rst.getString(2), Enum.valueOf(Serie.class, rst.getString(3)), Enum.valueOf(Periodo.class, rst.getString(3)));
                    alunos.add(aluno);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

}
