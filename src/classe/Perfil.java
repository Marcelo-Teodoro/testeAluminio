package classe;

public class Perfil {

    private Integer idPerfil;
    private String codigo;
    private String tipo;
    private Double peso;
    private Double tamanho;
    private String descricao;
    private Fornecedor fornecedor;

    public Perfil() {
    }

    public Perfil(Integer idPerfil, String codigo, String tipo, Double peso, Double tamanho, String descricao, Fornecedor fonecedor) {
        this.idPerfil = idPerfil;
        this.codigo = codigo;
        this.tipo = tipo;
        this.peso = peso;
        this.tamanho = tamanho;
        this.descricao = descricao;
        this.fornecedor = fonecedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fonecedor) {
        this.fornecedor = fonecedor;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "idPerfil=" + idPerfil +
                ", Codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", tamanho=" + tamanho +
                ", descricao='" + descricao + '\'' +
                ", fonecedor=" + fornecedor +
                '}';
    }
}
