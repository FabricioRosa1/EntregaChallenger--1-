package br.com.fiap.consultorias.model;

public class ProdutoModel {
    private int idProduto;
    private String imagemProduto;
    private String tituloProduto;
    private String descricaoProduto;
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getImagemProduto() {
        return imagemProduto;
    }
    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }
    public String getTituloProduto() {
        return tituloProduto;
    }
    public void setTituloProduto(String tituloProduto) {
        this.tituloProduto = tituloProduto;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
}