public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa() {
        this.nome = "nome";
        this.telefone = "";
    }

    @Override
    public String toString() {
        return nome + " " + telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}