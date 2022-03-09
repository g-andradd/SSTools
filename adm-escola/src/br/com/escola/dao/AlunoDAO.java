package br.com.escola.dao;

import br.com.escola.modelo.Aluno;

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
        StringBuffer sql = new StringBuffer("INSERT INTO ALUNO ");
        sql.append("(MATRICULA, NOME) ");
        sql.append("VALUES (?, ?)");

        try (PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))) {
            connection.setAutoCommit(false);
            pstm.setInt(1, aluno.getMatricula());
            pstm.setString(2, aluno.getNome());

            pstm.execute();
            connection.commit();
            System.out.println("Aluno Matriculado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Rollback foi executado");
            connection.rollback();
        }
        System.out.println(aluno);
    }

    public List<Aluno> listar() {
        List<Aluno> alunos = new ArrayList<>();

        StringBuffer sql = new StringBuffer("SELECT MATRICULA MATRICULA, NOME NOME ");
        sql.append("FROM ALUNO");

        try (PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                Aluno aluno = null;
                while (rst.next()) {
                    aluno = new Aluno(rst.getInt(1), rst.getString(2));
                    alunos.add(aluno);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao listar o aluno!");
        }
        return alunos;
    }

    public void deletarPorMatricula(int alunoMatricula) throws SQLException {
        StringBuffer sql = new StringBuffer("DELETE FROM ");
        sql.append("ALUNO ");
        sql.append("WHERE ");
        sql.append("MATRICULA = ?");

        try(PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))){
            connection.setAutoCommit(false);
            pstm.setInt(1, alunoMatricula);

            pstm.execute();
            connection.commit();
            System.out.println("Aluno excluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
            System.out.println("Erro ao deletar o aluno!!");

        }
    }
}
