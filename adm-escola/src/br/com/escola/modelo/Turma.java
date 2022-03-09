package br.com.escola.modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Integer id;
    private Serie serie;
    private Periodo periodo;
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Materia> materias = new ArrayList<>();

    public Turma(Integer id, Serie serie, Periodo periodo) {
        this.id = id;
        this.serie = serie;
        this.periodo = periodo;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return String.format("Turma -- id: %d, Série: %s, Período: %s", this.getId(), this.getSerie(), this.getPeriodo());
    }
}
