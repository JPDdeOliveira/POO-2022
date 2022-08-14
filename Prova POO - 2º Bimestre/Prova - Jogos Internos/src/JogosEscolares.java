import java.util.Scanner;
public class JogosEscolares {
    private Equipe[] equipes;
    private int qtd;

    public JogosEscolares() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de equipes: ");
        this.qtd = scanner.nextInt();

        equipes = new Equipe[qtd];

        for (int i = 0; i < qtd; i++) {
            equipes[i] = new Equipe();
        }
    }

    public void exibirEquipes() {
        for (int i = 0; i < qtd; i++) {
            equipes[i].exibir();
        }
    }

    public void atualizarPontuacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome das equipes: \n");
        for (int i = 0; i < qtd; i++) {
            System.out.println(qtd + " - " + equipes[i].getNome());
        }

        System.out.println("Informe o nome da equipe para mudar a pontuacao: ");
        String nomeEquipe = scanner.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (nomeEquipe.equalsIgnoreCase(equipes[i].getNome())) {
                System.out.println("Informe a nova pontuacao: ");
                int pont = scanner.nextInt();

                equipes[i].setPontuacao(pont);

                System.out.println("Nova pontuacao: " + equipes[i].getPontuacao());
            }
        }
    }

    public void atualizarInfoTreinador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome dos treinadores: \n");
        for (int i = 0; i < qtd; i++) {
            System.out.println(qtd + " - " + equipes[i].getTreinador().getNome());
        }

        System.out.println("Informe o nome do treinador desejado para atualizar as informacoes: ");
        String nomeTreinador = scanner.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (nomeTreinador.equalsIgnoreCase(equipes[i].getTreinador().getNome())) {
                System.out.println("Informe o novo telefone do treinador: ");
                String novoTelefone = scanner.nextLine();

                System.out.println("Informe o novo curso do treinador: ");
                String novoCurso = scanner.nextLine();

                equipes[i].getTreinador().setTelefone(novoTelefone);
                equipes[i].getTreinador().setCurso(novoCurso);

                equipes[i].getTreinador().exibir();
            }
        }
    }

    public void pontuacaoEquipes() {
        System.out.println("Pontuacao das equipes: ");
        for (int i = 0; i < qtd; i++) {
            System.out.println(i + 1 + " - " + equipes[i].getPontuacao());
        }
    }

    public void exibirDetTreinador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome dos treinadores: ");
        for (int i = 0; i < qtd; i++) {
            System.out.println(equipes[i].getTreinador().getNome());
        }

        System.out.println("Informe o nome do treinador desejado: ");
        String nomeTreinador = scanner.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (nomeTreinador.equalsIgnoreCase(equipes[i].getTreinador().getNome())) {
                equipes[i].getTreinador().exibir();
            }
        }
    }
}