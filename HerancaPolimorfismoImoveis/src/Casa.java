public class Casa extends Imovel {
    //construtor da casa com os atributos do ddksdk.Imovel
    public Casa(double areaConstruida, String endereco){
        super(areaConstruida, endereco);
    }

    @Override
    public boolean equals(Object outra){
        //qualquer coisa é diferente de NULL
        if(outra == null){
            return false;
        }
        //propriedade REFLEXIVA
        if(this == outra){
            return true;
        }
        //objetos de classes diferentes nunca são iguais
        if(this.getClass() != outra.getClass()){
            return false;
        }
        //conversão explícita para acessar os atributos de outra casa
        Casa outraCasa = (Casa) outra;
        //verifica se todos os atributos são iguais
        if(this.getAreaConstruida() == outraCasa.getAreaConstruida() &&
           this.getEndereco().equals(outraCasa.getEndereco())){
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
}