package br.com.escola.dao;

import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;
import br.com.escola.modelo.Turma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TurmaDAO {

    private Connection connection;

    public TurmaDAO(Connection connection){
        this.connection = connection;
    }

    public void registrarTurma(Turma turma) throws SQLException {
        StringBuffer sql = new StringBuffer("INSERT INTO TURMA ");
        sql.append("(ID, SERIE, PERIODO) ");
        sql.append("VALUES ");
        sql.append("(?, ?, ?)");

        try(PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))){
            connection.setAutoCommit(false);
            pstm.setInt(1, turma.getId());
            pstm.setString(2, String.valueOf(turma.getSerie()));
            pstm.setString(3, String.valueOf(turma.getPeriodo()));

            pstm.execute();
            connection.commit();
            System.out.println("Turma Cadastrada!");
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
            System.out.println("Erro ao Cadastrar a turma!");
        }
        System.out.println(turma);
    }

    public List<Turma> listar(){
        List<Turma> turmas = new ArrayList<>();

        StringBuffer sql = new StringBuffer("SELECT ");
        sql.append("ID ID, SERIE SERIE, PERIODO PERIODO ");
        sql.append("FROM ");
        sql.append("TURMA");

        try(PreparedStatement pstm = connection.prepareStatement(String.valueOf(sql))){
            pstm.execute();
            try(ResultSet rst = pstm.getResultSet()){
                Turma turma = null;
                while (rst.next()){
                    turma = new Turma(rst.getInt(1), Serie.valueOf(rst.getString(2)), Periodo.valueOf(rst.getString(3)));
                    turmas.add(turma);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao listar!");
        }
        return turmas;
    }

}
