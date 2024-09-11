public class Carro {
    //Criando a classe do carro
    private String marcaDoCarro;
    private String modeloDoCarro;
    private String corDoCarro;
    private String placaDoCarro;

    //Criando um construtor para inicializar o carro
    public Carro(String marca, String modelo, String cor, String placa){
        this.marcaDoCarro = marca;
        this.modeloDoCarro = modelo;
        this.corDoCarro = cor;
        this.placaDoCarro = placa;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }
}