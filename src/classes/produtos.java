
package classes;

public class produtos {
    
        private String idProduto;
        private String Produto;
        private String Descricao;
        private int preco;

    public produtos(String idProduto, String Produto, String Descricao, int preco) {
        this.idProduto = idProduto;
        this.Produto = Produto;
        this.Descricao = Descricao;
        this.preco = preco;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
