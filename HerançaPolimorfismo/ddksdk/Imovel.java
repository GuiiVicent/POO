package ddksdk;

public class Imovel {
    //atributos de ddksdk.Imovel
    private double areaConstruida; 
    private String endereco;

    //construtor do ddksdk.Imovel
    public Imovel(double areaConstruida, String endereco) {
        this.areaConstruida = areaConstruida;
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object outro){
        //qualquer coisa é diferente de NULL
        if(outro == null){
            return false;
        }
        //propriedade REFLEXIVA
        if(this == outro){
            return true;
        }
        //objetos de classes diferentes nunca são iguais
        if(this.getClass() != outro.getClass()){
            return false;
        }
        //conversão explícita para acessar os atributos de outro imovel
        Imovel outroImovel = (Imovel) outro;
        //verifica se todos os atributos são iguais
        if(this.areaConstruida == outroImovel.areaConstruida &&
           this.endereco.equals(outroImovel.endereco)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        //número inicial do hash, normalmente um primo
        int hash = 7;
        //usar número grande e primo pra diminuir a chance de ter um número igual
        hash = hash * 31 + (int) Math.round(areaConstruida);
        hash = hash * 31 + endereco.hashCode();
        return hash;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public String getEndereco() {
        return endereco;
    }
}