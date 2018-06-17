package br.com.teste22.avptec;

public class Lista {

    private String nome;
    private int imagem;
    private String detalhes;
    public

    Lista(String nome, String detalhes, int imagem) {
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
