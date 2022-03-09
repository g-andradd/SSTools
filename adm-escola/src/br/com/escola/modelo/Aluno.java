package br.com.escola.modelo;

public class Aluno{

    private int matricula;
    private String nome;
    private float nota;
    private static int total = 0;

    public Aluno(int matricula, String nome){
        Aluno.total++;
        this.matricula = matricula;
        this.nome = nome;
        this.nota = 0;
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

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) { this.nota = nota; }

    public static int getTotal(){
        return Aluno.total;
    }

    @Override
    public String toString() {
            return String.format("Aluno -- Matrícula: %d Nome: %s", this.matricula, this.nome);
    }
}
