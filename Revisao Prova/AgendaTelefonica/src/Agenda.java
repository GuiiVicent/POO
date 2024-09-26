/* Agenda que manipula o conjunto de 20 pessoas permitindo a adição de
uma pessoa na agenda, a consulta dos dados de uma pessoa, a consulta
de todas as pessoas na agenda, a edição dos dados de uma pessoa e a
exclusão de uma pessoa da agenda; */

public class Agenda{
    private Pessoa[] pessoas;

    public Agenda(){
        this.pessoas = new Pessoa[20];
    }

    // Metodo que adiciona uma pessoa em um espaço vazio do vetor
    public void adicionarPessoa(Pessoa p){
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] == null){
                pessoas[i] = p;
                break;
            }
        }
    }

    // Metodo que consulta os dados de uma pessoa específica
    public void consultarPessoa(int i){
        System.out.println(pessoas[i].toString());
    }

    // Metodo para consultar todas as pessoas da agenda
    public void consultarTodasPessoas(){
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] != null) {
                System.out.println(pessoas[i].toString());
            }
        }
    }

    // Metodo para modificar os dados de uma pessoa
    public void editarPessoa(int i, String novoNome, String novoTelefone){
        pessoas[i].setNome(novoNome);
        pessoas[i].setTelefone(novoTelefone);
    }

    // Metodo para excluir uma pessoa da agenda
    public void excluirPessoa(int i){
        System.out.println(pessoas[i].getNome() + " Apagado(a) da agenda!");
        pessoas[i] = null;
    }
}