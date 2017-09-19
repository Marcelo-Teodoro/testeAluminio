package classe;

public class Perfil {

    private Integer idPerfil;
    private String tipo;
    private Double peso;
    private Double tamanho;
    private String descricao;
    private Fornecedor fonecedor;

    public Perfil() {
    }

    public Perfil(Integer idPerfil, String tipo, Double peso, Double tamanho, String descricao, Fornecedor fonecedor) {
        this.idPerfil = idPerfil;
        this.tipo = tipo;
        this.peso = peso;
        this.tamanho = tamanho;
        this.descricao = descricao;
        this.fonecedor = fonecedor;
    }

    public Fornecedor getFonecedor() {
        return fonecedor;
    }

    public void setFonecedor(Fornecedor fonecedor) {
        this.fonecedor = fonecedor;
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
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", tamanho=" + tamanho +
                ", descricao='" + descricao + '\'' +
                ", fonecedor=" + fonecedor +
                '}';
    }
}
