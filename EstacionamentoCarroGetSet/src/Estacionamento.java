//Criando a classe do estacionamento
public class Estacionamento{

    //criando os atributos
    public String endereco;
    public long cep;
    public Carro lugares[];
    public int quantidadeCarros;

    //construtor para os atributos do estacionamento
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
            System.out.println("Carro na " + (i + 1 ) + "ª Vaga - Marca: " + lugares[i].getMarcaDoCarro() +
                               " | Modelo: " + lugares[i].getModeloDoCarro() +
                               " | Cor: " + lugares[i].getCorDoCarro() +
                               " | Placa: " + lugares[i].getPlacaDoCarro() + "\n");
        }
    }

    //Método para adicionar um carro no final caso ele não esteja cheio
    public boolean adicionarCasoNaoCheio(Carro carro){
        if (quantidadeCarros < 50){
            lugares[lugares.length-1] = carro;
            System.out.println("Carro na " + lugares.length + "ª Vaga - Marca: " + lugares[lugares.length-1].getMarcaDoCarro() +
                               " | Modelo: " + lugares[lugares.length-1].getModeloDoCarro() +
                               " | Cor: " + lugares[lugares.length-1].getCorDoCarro() +
                               " | Placa: " + lugares[lugares.length-1].getPlacaDoCarro() + "\n");
            return true;
        }
        return false;
    }
}