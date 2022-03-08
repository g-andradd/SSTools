package br.com.escola.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    private Materia materia;
    private List<Turma> turmas = new ArrayList<>();

    public Professor(String matricula, String senha, String nome, BigDecimal salario) {
        super(matricula, senha, nome, salario);
    }

    public void inserirMateria(Materia materia){
        this.materia = materia;
    }

    public void inserirTurma(Turma turma){
        this.turmas.add(turma);
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public List<Turma> getTurmas() { return turmas; }

    public void setTurmas(List<Turma> turmas) { this.turmas = turmas; }
}
