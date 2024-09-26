/* Ao usuário deve ser permitido
informar quantos produtos deseja cadastrar e, então, indicar, para cada
produto, seu nome, quantidade e preço. Ao final, o programa deve exibir todos
os produtos em estoque com suas informações correspondentes. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializando o Scanner
        Scanner entrada = new Scanner(System.in);

        // Recebendo a quantidade de produtos pra dizer o tamanho do estoque
        System.out.println("Quantos produtos deseja guardar? ");
        int quantidadeRecebida = entrada.nextInt();

        // Criando o estoque do tamanho do número recebido
        Produto[] estoque = new Produto[quantidadeRecebida];

        // Laço de repetição pra colocar os produtos no vetor
        for (int i = 0; i < quantidadeRecebida; i++) {
            // Inicializando uma variável do tipo da classe Produto
            Produto p = new Produto();

            System.out.println("\nNome do " + (i + 1) + "º produto: ");
            p.setNome(entrada.next());

            System.out.println("Quantidade desse produto: ");
            p.setQuantidade(entrada.nextInt());

            System.out.println("Valor unitário: ");
            p.setValorUnitario(entrada.nextDouble());

            estoque[i] = p;
        }

        for (int i = 0; i < quantidadeRecebida; i++) {
            System.out.println("----------------------");
            System.out.println("Relacionado ao " + (i + 1) + "º produto: ");

            System.out.println("Nome: " + estoque[i].getNome());
            System.out.println("Quantidade: " + estoque[i].getQuantidade());
            System.out.println("Valor: R$" + estoque[i].getValorUnitario());
        }
    }
}