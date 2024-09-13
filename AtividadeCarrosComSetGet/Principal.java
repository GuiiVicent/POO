/* Considerando a solução do exercício sobre classes e objetos da aula passada (incluída no final desse enunciado para 
facilitar seu acesso):

1) Adicione construtores nas classes Carro e Estacionamento de forma que todas as informações para seus atributos são 
passadas como parâmetros nos construtores,

2) Torne os atributos de Carro particulares (modificador private) e inclua métodos get e set para seus atributos, e

3) Adicione também um método na classe Estacionamento conforme a declaração e o JavaDoc abaixo:

/**
* Adiciona um carro no final do vetor de carros se não estiver cheio.
*
* @param   carro: o carro que precisa ser adicionado no estacionamento
* @return   true se o carro foi colocado com sucesso no final do vetor ou
*                  false se não houver mais espaço no vetor (estacionamento cheio)
*/

public class Principal {
    public static void main(String[] args) {

        //Criando o estacionamento dando os parâmetros pedidos pelo construtor
        Estacionamento estacionamento = new Estacionamento("Rua Avestruz", 90001007);

        //Criando os três carros dando os parâmetros pedidos pelo construtor
        Carro carroHyundai = new Carro("Hyundai", "HB20", "preto", "BEE4F00");
        Carro carroChevrolet = new Carro("Chevrolet", "Onix", "cinza", "FUN2M33");
        Carro carroFord = new Carro("Ford", "Ka", "vermelho", "GEZ0W35");
        Carro carroGol = new Carro("Gol", "Bolinha", "Azul", "IBG5E69");

        estacionamento.adicionarCarro(carroHyundai);
        estacionamento.adicionarCarro(carroChevrolet);
        estacionamento.adicionarCarro(carroFord);

        estacionamento.listarCarros();
        estacionamento.adicionarCasoNaoCheio(carroGol);
    }
}