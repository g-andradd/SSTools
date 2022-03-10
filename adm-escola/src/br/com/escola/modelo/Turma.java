package br.com.escola.modelo;

public class Turma {

    private Integer id;
    private Serie serie;
    private Periodo periodo;

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

    @Override
    public String toString() {
        return String.format("Turma -- id: %d, Série: %s, Período: %s", this.getId(), this.getSerie(), this.getPeriodo());
    }
}
