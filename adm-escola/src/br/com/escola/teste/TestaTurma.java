package br.com.escola.teste;

import br.com.escola.dao.TurmaDAO;
import br.com.escola.factory.ConnectionFactory;
import br.com.escola.modelo.Periodo;
import br.com.escola.modelo.Serie;
import br.com.escola.modelo.Turma;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaTurma {
    public static void main(String[] args) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            TurmaDAO turmaDAO = new TurmaDAO(connection);
            Turma turma = new Turma(2, Serie.QUINTO_FUNDAMENTAL, Periodo.MATUTINO);

            turmaDAO.registrarTurma(turma);
            List<Turma> listaDeTurmas = turmaDAO.listar();
            listaDeTurmas.stream().forEach(lt -> System.out.println(lt));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
