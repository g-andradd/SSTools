import java.util.Date;

public class Materia {

    private String nome;
    private Date CargaHoraria;

    public Materia(String nome, Date cargaHoraria) {
        this.nome = nome;
        CargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(Date cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
}
