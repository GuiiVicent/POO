/* Faça um programa em linguagem Java que modele o comportamento de uma
agenda telefônica que contém o nome e o telefone de 20 pessoas. O programa
deve conter, no mínimo, as classes:
    a. Pessoa que modela uma entrada na agenda com atributos nome e
telefone;
    b. Agenda que manipula o conjunto de 20 pessoas permitindo a adição de
uma pessoa na agenda, a consulta dos dados de uma pessoa, a consulta
de todas as pessoas na agenda, a edição dos dados de uma pessoa e a
exclusão de uma pessoa da agenda;
    c. AgendaUI que realiza a interação do usuário com o sistema, permitindo
a execução dos métodos da classe Agenda.. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AgendaUI agenda = new AgendaUI();
        int respostaUsuario;
        do {
            System.out.println("1 - Cadastrar um novo contato");
            System.out.println("2 - Consultar um contato");
            System.out.println("3 - listar todos contatos");
            System.out.println("4 - Atualizar um contato");
            System.out.println("5 - Excluir um contato");
            System.out.println("6 - Sair");
            System.out.println("O que deseja fazer?");
            respostaUsuario = entrada.nextInt();

            agenda.interacaoUsuario(respostaUsuario);

        } while (respostaUsuario > 0 && respostaUsuario < 6);
    }
}