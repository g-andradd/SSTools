package br.com.escola.modelo;

public enum Periodo {
    MATUTINO ("Matutino"),
    VESPERTINO ("Vespertino");

    private String descricao;

    Periodo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
