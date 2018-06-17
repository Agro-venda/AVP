package br.com.teste22.avptec.Model;

public class ProdutoClass {
    private  String uid;
    private  String nome;
    private  String valor;
    private String produto;
    private String tel;

    public ProdutoClass() {

    }



    public String getUid() {
        return uid;
    }

    public String getNome() {
        return nome;
    }

    public String getValor() {
        return valor;
    }

    public String getProduto() {
        return produto;
    }

    public String getTel() {
        return tel;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    @Override
    public String toString() {
        return "Empresa: "+nome+"\n\n"+"Produto: "+produto+"\n\n"+"Valor: "+valor+"\n\n"+"Fone: "+tel;
    }

}
