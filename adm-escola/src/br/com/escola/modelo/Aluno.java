package br.com.escola.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aluno{

    private int matricula;
    private String nome;
    private List<BigDecimal> nota = new ArrayList<>();
    private int idTurma;
    private static int total = 0;

    public Aluno(int matricula, String nome) {
        Aluno.total++;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<BigDecimal> getNota() {
        return nota;
    }

    public void setNota(List<BigDecimal> nota) { this.nota = nota; }

    public static int getTotal(){
        return Aluno.total;
    }

    public int getIdTurma(){
        return idTurma;
    }

    public void setIdTurma(int idTurma){
        this.idTurma = idTurma;
    }

    @Override
    public String toString() {
            return String.format("Aluno -- Matrícula: %d Nome: %s", this.matricula, this.nome);
    }
}
