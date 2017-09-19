package classe;

public class Fornecedor {

    private Integer idFornecedor;
    private String empresa;
    private String telefone;
    private String email;
    private String observacao;
    private Double valorPesoAluminio;

    public Fornecedor() {
    }

    public Fornecedor(Integer idFornecedor, String empresa, String telefone, String email, String observacao, Double valorPesoAluminio) {
        this.idFornecedor = idFornecedor;
        this.empresa = empresa;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
        this.valorPesoAluminio = valorPesoAluminio;
    }

    public Double getValorPesoAluminio() {
        return valorPesoAluminio;
    }

    public void setValorPesoAluminio(Double valorPesoAluminio) {
        this.valorPesoAluminio = valorPesoAluminio;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        empresa = empresa;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "idFornecedor=" + idFornecedor +
                ", empresa='" + empresa + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", observacao='" + observacao + '\'' +
                ", valorPesoAluminio=" + valorPesoAluminio +
                '}';
    }
}
