package classe;

public class Esquadria {

    private Integer idEsquadria;
    private String codigo;
    private String linha;
    private String descricao;
    private String desenho;
    private Perfil perfil;
    private Acessorio acessorio;

    public Esquadria() {

    }

    public Esquadria(Integer idEsquadria, String codigo, String linha, String descricao, String desenho, Perfil perfil, Acessorio acessorio) {
        this.idEsquadria = idEsquadria;
        this.codigo = codigo;
        this.linha = linha;
        this.descricao = descricao;
        this.desenho = desenho;
        this.perfil = perfil;
        this.acessorio = acessorio;
    }

    public Integer getIdEsquadria() {
        return idEsquadria;
    }

    public void setIdEsquadria(Integer idEsquadria) {
        this.idEsquadria = idEsquadria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
