package classe;

public class Fornecedor {

    private Integer idFornecedor;
    private String empresa;
    private String telefone;
    private String email;
    private String observacao;

    public Fornecedor() {
    }

    public Fornecedor(Integer idFornecedor, String empresa, String telefone, String email, String observacao) {
        this.empresa = empresa;
        this.idFornecedor = idFornecedor;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
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
        return empresa;
    }
}
