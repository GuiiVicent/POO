public class Produto{
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public Produto(){
        this.nome = "";
        this.quantidade = 0;
        this.valorUnitario = 0;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getValorUnitario(){
        return valorUnitario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}