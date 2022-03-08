package br.com.escola.dao;

import br.com.escola.connection.ConnectionFactory;
import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    public void matricularAluno(int matricula, String nome, Serie serie, Periodo periodo){
        Aluno aluno = new Aluno(matricula, nome, serie, periodo);

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            String sql = "INSERT INTO ALUNO (MATRICULA, NOME, SERIE, PERIODO) VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql)){
                pstm.setInt(1, aluno.getMatricula());
                pstm.setString(2, aluno.getNome());
                pstm.setString(3, aluno.getSerie().getDescricao());
                pstm.setString(4, aluno.getPeriodo().getDescricao());

                pstm.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(aluno);
    }
}
