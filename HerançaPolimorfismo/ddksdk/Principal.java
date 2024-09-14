package ddksdk;/* Crie um programa em Java que implemente quatro classes: ddksdk.Imovel, ddksdk.Casa, ddksdk.Predio e ddksdk.Principal.

A classe ddksdk.Imovel possui dois atributos privados: areaConstruida do tipo double e endereço do tipo String.
O construtor dessa classe deve ser completo, ou seja, deve ter todas as informações necessárias para criar um 
Imóvel passadas como parâmetros.

A classe ddksdk.Casa estende a classe ddksdk.Imovel e não possui qualquer atributo adicional.

A classe ddksdk.Predio estende a classe ddksdk.Imovel e possui um atributo privado adicional do tipo inteiro: andares.

As classes ddksdk.Imovel, ddksdk.Casa e ddksdk.Predio devem implementar os métodos hashCode e equals.

A classe ddksdk.Principal possui um método main que mantém um vetor de 10 Imóveis. Esse método ainda instancia três
objetos e os armazena no vetor: 

1) Imóvel com 60m² de área construída na Rua Professor Legal, 10.
2) ddksdk.Casa com 60m² de área construída na Rua Professor Legal, 10.
3) Prédio com 540m² de área construída, 6 andares, na Rua Professor Legal, 18.

Finalmente, você deve testar quais dos objetos são estruturalmente iguais (serão 3 testes envolvendo 2 objetos cada um) 
e mostrar a mensagem "Idênticos" se eles de fato forem iguais. */

public class Principal {
    public static void main(String[] args) {
        //Vetor com 10 espaços de Imoveis
        Imovel vetorDeImoveis[] = new Imovel[10];

        Imovel imovel1 = new Imovel(60, "Rua Professor Legal, 10");
        Casa casa1 = new Casa(60, "Rua professor Legal, 10");
        Predio predio1 = new Predio(540, "Rua Professor Legal, 18", 6);

        vetorDeImoveis[0] = imovel1;
        vetorDeImoveis[1] = casa1;
        vetorDeImoveis[2] = predio1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    if (vetorDeImoveis[i].equals(vetorDeImoveis[j])) {
                        System.out.println("Idênticos");
                    }
                }
            }
        }
        System.out.println("");
    }
}