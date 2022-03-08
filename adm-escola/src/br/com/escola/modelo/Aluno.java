package br.com.escola.modelo;

public class Aluno{

    private int matricula;
    private String nome;
    private Serie serie;
    private Periodo periodo;
    private float nota;
    private static int total = 0;

    public Aluno(int matricula, String nome, Serie serie, Periodo periodo){
        Aluno.total++;
        this.matricula = matricula;
        this.nome = nome;
        this.serie = serie;
        this.periodo = periodo;
        this.nota = 0;

        System.out.println("Você matriculou: " + this.matricula + " " + this.nome + " no " + this.serie.getDescricao() + " no período " + this.periodo);

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

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) { this.nota = nota; }

    public static int getTotal(){
        return Aluno.total;
    }

    @Override
    public String toString() {
        return String.format("O aluno %d %s foi matriculado na série %s, no período %s", this.matricula, this.nome, this.serie, this.periodo);
    }
}
