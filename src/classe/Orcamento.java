package classe;

import java.util.Date;
import java.util.List;

public class Orcamento {

    private Integer idOrcamento;
    private Cliente cliente;
    private String obra;
    private Date data;
    private String peso;
    private String sobra;
    private Double valorPesoAluminio;
    private Double somaAcessório;
    private Double somaPerfil;
    private Double somaVidro;
    private Double valorTotal;
    private List<Acessorio> acessorioList;
    private List<Perfil> perfilList;

    public Orcamento() {
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getSobra() {
        return sobra;
    }

    public void setSobra(String sobra) {
        this.sobra = sobra;
    }

    public Double getValorPesoAluminio() {
        return valorPesoAluminio;
    }

    public void setValorPesoAluminio(Double valorPesoAluminio) {
        this.valorPesoAluminio = valorPesoAluminio;
    }

    public Double getSomaAcessório() {
        return somaAcessório;
    }

    public void setSomaAcessório(Double somaAcessório) {
        this.somaAcessório = somaAcessório;
    }

    public Double getSomaPerfil() {
        return somaPerfil;
    }

    public void setSomaPerfil(Double somaPerfil) {
        this.somaPerfil = somaPerfil;
    }

    public Double getSomaVidro() {
        return somaVidro;
    }

    public void setSomaVidro(Double somaVidro) {
        this.somaVidro = somaVidro;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Acessorio> getAcessorioList() {
        return acessorioList;
    }

    public void setAcessorioList(List<Acessorio> acessorioList) {
        this.acessorioList = acessorioList;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }
}
