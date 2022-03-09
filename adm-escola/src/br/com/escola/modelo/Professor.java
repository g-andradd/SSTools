package br.com.escola.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    private Materia idMateria;
    private List<Turma> idTurmas = new ArrayList<>();

    public Professor(Integer matricula, String senha, String nome, BigDecimal salario) {
        super(matricula, senha, nome, salario);
    }

    public void inserirMateria(Materia materia){
        this.idMateria = materia;
    }

    public void inserirTurma(Turma turma){
        this.idTurmas.add(turma);
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    public List<Turma> getIdTurmas() { return idTurmas; }

    public void setIdTurmas(List<Turma> idTurmas) { this.idTurmas = idTurmas; }

    @Override
    public String toString() {
        return String.format("Matrícula: %d, Nome: %s, Salário: %.2f R$", this.getMatricula(), this.getNome(), this.getSalario());
    }
}
