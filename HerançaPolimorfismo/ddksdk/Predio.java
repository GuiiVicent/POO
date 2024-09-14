package ddksdk;

public class Predio extends Imovel {
    //atributos do predio
    private int andares;

    //construtor do predio mais os atributos próprios dele
    public Predio(double areaConstruida, String endereco, int andares) {
        super(areaConstruida, endereco);
        this.andares = andares;
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
        //conversão explícita para acessar os atributos de outro predio
        Predio outroPredio = (Predio) outro;
        //verifica se todos os atributos são iguais
        if(this.getAreaConstruida() == outroPredio.getAreaConstruida() &&
           this.getEndereco().equals(outroPredio.getEndereco()) &&
           this.andares == outroPredio.andares){
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
        hash = hash * 31 + (int) Math.round(getAreaConstruida());
        hash = hash * 31 + getEndereco().hashCode();
        return hash;
    }

    public int getAndares() {
        return andares;
    }
}