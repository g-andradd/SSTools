package br.com.escola.modelo;

import br.com.escola.modelo.*;

import java.util.ArrayList;

public class Turma {

    private int id;
    private Serie serie;
    private Periodo periodo;
    private ArrayList<Professor> nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Materia> materias;

    public Turma(Serie serie, Periodo periodo, ArrayList<Aluno> alunos, ArrayList<Materia> materias) {
        this.serie = serie;
        this.periodo = periodo;
        this.alunos = alunos;
        this.materias = materias;
    }

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

    public ArrayList<Professor> getNome() {
        return nome;
    }

    public void setNome(ArrayList<Professor> nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
}
