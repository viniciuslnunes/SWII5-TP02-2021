// Alunos
// 
// VINÍCIUS LOPES NUNES CB1640879
// JOÃO PEDRO TANACA RAMOS CB3002276

public class Produto {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(int unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtdPrevistoMes() {
        return qtdPrevistoMes;
    }

    public void setQtdPrevistoMes(double qtdPrevistoMes) {
        this.qtdPrevistoMes = qtdPrevistoMes;
    }

    public double getPrecoMaxComprado() {
        return precoMaxComprado;
    }

    public void setPrecoMaxComprado(double precoMaxComprado) {
        this.precoMaxComprado = precoMaxComprado;
    }

    private String nome;
    private int unidadeCompra;
    private String descricao;
    private double qtdPrevistoMes;
    private double precoMaxComprado;
}
