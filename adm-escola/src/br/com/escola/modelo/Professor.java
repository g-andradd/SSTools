package br.com.escola.modelo;

import java.math.BigDecimal;

public class Professor extends Funcionario {

    private Integer idMateria;

    public Professor(Integer matricula, String senha, String nome, BigDecimal salario) {
        super(matricula, senha, nome, salario);
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public String toString() {
        return String.format("Matrícula: %d, Nome: %s, Salário: %.2f R$", this.getMatricula(), this.getNome(), this.getSalario());
    }
}
