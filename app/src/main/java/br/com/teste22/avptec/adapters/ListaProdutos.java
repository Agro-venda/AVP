package br.com.teste22.avptec.adapters;

public class ListaProdutos {


    private String nome;
    private int imagem;
    private String detalhes;
    public

    ListaProdutos(String nome, String detalhes, int imagem) {
        this.setNome(nome);
        this.setDetalhes(detalhes);
        this.setImagem(imagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
