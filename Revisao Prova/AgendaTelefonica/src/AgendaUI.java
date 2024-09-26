import java.util.Scanner;

public class AgendaUI {
    Scanner entrada = new Scanner(System.in);
    // Variável da agenda pra referenciar ela
    Agenda a = new Agenda();

    public void interacaoUsuario(int escolhaUsuario){
        switch (escolhaUsuario) {
            case 1:
                Pessoa p = new Pessoa();

                entrada.nextLine();
                System.out.println("Nome que deseja cadastrar: ");
                p.setNome(entrada.nextLine());

                System.out.println("Telefone dessa pessoa: ");
                p.setTelefone(entrada.nextLine());

                a.adicionarPessoa(p);
                break;

            case 2:
                System.out.println("Qual a posição da pessoa que deseja consultar? ");
                int numeroRecebidoCaso2 = entrada.nextInt();

                a.consultarPessoa(numeroRecebidoCaso2);
                break;

            case 3:
                a.consultarTodasPessoas();
                break;

            case 4:
                System.out.println("Qual a posição da pessoa que deseja editar os dados? ");
                int numeroRecebidoCaso4 = entrada.nextInt();

                entrada.nextLine();
                System.out.println("Novo nome dessa pessoa: ");
                String novoNomeCaso4 = entrada.nextLine();

                System.out.println("Novo telefone: ");
                String novoTelefoneCaso4 = entrada.nextLine();

                a.editarPessoa(numeroRecebidoCaso4, novoNomeCaso4, novoTelefoneCaso4);
                break;

            case 5:
                System.out.println("Qual a posição da pessoa que deseja exlcluir os dados? ");
                int numeroRecebidoCaso5 = entrada.nextInt();

                a.excluirPessoa(numeroRecebidoCaso5);
                break;
            case 6:
                System.out.println("Até mais");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}