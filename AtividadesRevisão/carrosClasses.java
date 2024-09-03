/* Crie um programa em Java que implemente duas classes: Carro e Estacionamento.

A classe Carro contém a marca do carro, o modelo, a cor e a placa (todos os campos são Strings).

A classe Estacionamento contém o endereço (uma String), um CEP (um número inteiro bem grande) e pode conter até 50 carros.

Depois de criadas essas classes, crie uma classe Principal que instancie os seguintes carros e os guarde no 
estacionamento localizado na Rua Avestruz, CEP 90001007:

1) Hyundai HB20 preto, placa BEE4F00
2) Chevrolet Onix cinza, placa FUN2M33
3) Ford Ka vermelho, placa GEZ0W35  */

public class carrosClasses {

    //Criando a classe do carro
    public static class Carro{
        public String marcaDoCarro;
        public String modeloDoCarro;
        public String corDoCarro;
        public String placaDoCarro;

        //Criando um construtor para inicializar o carro
        public Carro(String marca, String modelo, String cor, String placa){
            this.marcaDoCarro = marca;
            this.modeloDoCarro = modelo;
            this.corDoCarro = cor;
            this.placaDoCarro = placa;
        }
    }

    //Criando a classe do estacionamento
    public static class Estacionamento{
        public String endereco;
        public long cep;
        public Carro[] lugares;
        public int quantidadeCarros;

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
            
        }
    }
    public static void main(String[] args) {

        //Criando o estacionamento dando os parâmetros pedidos pelo construtor
        Estacionamento estacionamento = new Estacionamento("Rua Avestruz", 90001007);

        //Criando os três carros dando os parâmetros pedidos pelo construtor
        Carro carroHyundai = new Carro("Hyundai", "HB20", "preto", "BEE4F00");
        Carro carroChevrolet = new Carro("Chevrolet", "Onix", "cinza", "FUN2M33");
        Carro carroFord = new Carro("Ford", "Ka", "vermelho", "GEZ0W35");

        estacionamento.adicionarCarro(carroHyundai);
        estacionamento.adicionarCarro(carroChevrolet);
        estacionamento.adicionarCarro(carroFord);

    }
}