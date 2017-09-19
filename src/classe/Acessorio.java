package classe;

import classe.Fornecedor;

public class Acessorio {

    private Integer idAcessorio;
    private Fornecedor fornecedor;
    private String codigo;
    private String descricao;
    private String unidade;
    private Double preco;
    private Integer quantidade;

    public Acessorio() {

    }

    public Acessorio(Integer idAcessorio, Fornecedor fornecedor, String codigo, String descricao, String unidade, Double preco, Integer quantidade) {
        this.idAcessorio = idAcessorio;
        this.fornecedor = fornecedor;
        this.codigo = codigo;
        this.descricao = descricao;
        this.unidade = unidade;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getIdAcessorio() {
        return idAcessorio;
    }

    public void setIdAcessorio(Integer idAcessorio) {
        this.idAcessorio = idAcessorio;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
