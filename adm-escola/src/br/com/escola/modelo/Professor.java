package br.com.escola.modelo;

import br.com.escola.modelo.Funcionario;
import br.com.escola.modelo.Materia;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Professor extends Funcionario {

    private Materia materia;
    private ArrayList<Turma> turmas;

    public Professor(String matricula, String senha, String nome, BigDecimal salario) {
        super(matricula, senha, nome, salario);
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public ArrayList<Turma> getTurmas() { return turmas; }

    public void setTurmas(ArrayList<Turma> turmas) { this.turmas = turmas; }
}
