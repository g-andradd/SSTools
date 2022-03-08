package br.com.escola.modelo;

import java.math.BigDecimal;

public abstract class Funcionario {

    private String matricula;
    private String senha;
    private String nome;
    private BigDecimal salario;

    public Funcionario(String matricula, String senha, String nome, BigDecimal salario) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.salario = salario;
    }

    public boolean login(String matricula, String senha){
        if(this.matricula == matricula && this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
