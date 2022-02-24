import java.util.ArrayList;

public class Professor extends Funcionario{

    private Materia materia;
    private ArrayList<Turma> turmas;

    public Professor(String nome, String cpf, String salario) {
        super(nome, cpf, salario);
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
