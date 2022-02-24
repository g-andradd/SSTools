public enum Serie {

    MATERNAL("Maternal"),
    PRIMEIRO("1° Ano"),
    SEGUNDO("2° Ano"),
    TERCEIRO("3° Ano"),
    QUARTO("4° Ano"),
    QUINTO("5° Ano");

    private String descricao;

    Serie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
