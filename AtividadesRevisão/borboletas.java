/* As borboletas (ou panapanás) são insetos da ordem Lepidoptera. Elas têm dois pares de asas membranosas 
cobertas de escamas, que apresentam formas e cores variadas, além de peças bucais para sucção. Distinguem-se 
das mariposas pelas antenas retilíneas que terminam numa bola, pelos hábitos de vida diurnos, pela metamorfose 
que decorre dentro de uma crisálida rígida e pelo abdómen fino e alongado.

Sabendo de todas essas maravilhosas informações sobre borboletas que são absolutamente irrelevantes para a 
realização desse exercício, você deve fazer um programa em Java que receba do usuário um número inteiro ímpar 
referente à altura das asas de uma borboleta e que desenha um padrão de borboleta na tela conforme os exemplos a seguir.

Para N = 3

X X
XXX
X X

Para N = 5

X   X
XX XX
XXXXX
XX XX
X   X

Observação: seu programa não deve aceitar números pares e nem números acima de 20. */

import java.util.*;

public class borboletas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroRecebido;

        do {
            System.out.print("Digite um número ímpar para fazer a borboletinha: ");
            numeroRecebido = entrada.nextInt();
        } while ((numeroRecebido % 2) == 0 && numeroRecebido < 20);

        int metadeDoNumeroRecebido = numeroRecebido / 2;

        //Parte de cima
        for (int i = 0; i < metadeDoNumeroRecebido; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            for (int j = 0; j < numeroRecebido - 2 * (i + 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println("");
        }

        //Parte do meio
        for (int i = 0; i < numeroRecebido; i++){
            System.out.print("X");
        }

        System.out.println("");

        //Parte de baixo
        for (int i = metadeDoNumeroRecebido - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            for (int j = 0; j < numeroRecebido - 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println("");
        }

        entrada.close();
    }
}