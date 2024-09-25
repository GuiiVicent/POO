public class Carro {
    //criando os atributos do carro
    private String marcaDoCarro;
    private String modeloDoCarro;
    private String corDoCarro;
    private String placaDoCarro;

    //Criando um construtor para inicializar o carro
    public Carro(String marca, String modelo, String cor, String placa){
        this.setMarcaDoCarro(marca);
        this.setModeloDoCarro(modelo);
        this.setCorDoCarro(cor);
        this.setPlacaDoCarro(placa);
    }

    //get para obter o valor dos atributos privados
    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    //set para permitir que sejam alterados os valores dos atributos privados
    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }
}