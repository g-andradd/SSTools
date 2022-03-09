package br.com.escola.modelo;

public enum Serie {

    MATERNAL("Maternal"),
    PRIMEIRO_FUNDAMENTAL("1° Ano"),
    SEGUNDO_FUNDAMENTAL("2° Ano"),
    TERCEIRO_FUNDAMENTAL("3° Ano"),
    QUARTO_FUNDAMENTAL("4° Ano"),
    QUINTO_FUNDAMENTAL("5° Ano");

    private String descricao;

    Serie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
