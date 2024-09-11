//Criando a classe do estacionamento
public class Estacionamento{
    
    public String endereco;
    public long cep;
    private Carro lugares[];
    private int quantidadeCarros;

    //Criando um construtor para inicilizar o estacionamento
    public Estacionamento(String endereco, long cep){
        this.endereco = endereco;
        this.cep = cep;
        this.lugares = new Carro[50];
        this.quantidadeCarros = 0;
    }

    //Método para colocar um carro dentro do estacionamento
    public void adicionarCarro(Carro carro){
        if(quantidadeCarros < lugares.length) {
            lugares[quantidadeCarros] = carro;
            quantidadeCarros++;
        } else {
            System.out.println("O estacionamento está lotado!");
        }
    }

    //Método para listar os carros dentro do estacionamento
    public void listarCarros(){
        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.println("Carro na " + (i + 1 ) + "ª Vaga - Marca: " + lugares[i].marcaDoCarro +
                               " | Modelo: " + lugares[i].modeloDoCarro +
                               " | Cor: " + lugares[i].corDoCarro +
                               " | Placa: " + lugares[i].placaDoCarro + "\n");
        }
    }
}