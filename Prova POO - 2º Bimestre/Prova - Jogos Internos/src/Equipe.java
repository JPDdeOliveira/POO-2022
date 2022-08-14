import java.util.Scanner;
public class Equipe {
    private String esporte;
    private Treinador treinador;
    private Atleta[] atleta;
    private float pontuacao;
    private String nome;
    private int qtdAtletas;


    public Equipe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o nome da equipe: ");
        this.nome = scanner.nextLine();

        System.out.println("Informe a pontuacao da equipe: ");
        this.pontuacao = scanner.nextFloat();

        System.out.println("\n======== Esportes ========");
        System.out.println("[Volei]\n[Futebol]\n[Basquete]");
        System.out.println("==========================\n");

        do {
            System.out.println("Digite o esporte praticado pela equipe: ");
            this.esporte = scanner.next();
        } while (!esporte.equalsIgnoreCase("Volei") && !esporte.equalsIgnoreCase("futebol") && !esporte.equalsIgnoreCase("basquete"));

        System.out.println("");


        System.out.println("Digite a quantidade de atletas da equipe:");
        this.qtdAtletas = scanner.nextInt();

        while(qtdAtletas < 0){
            System.out.println("Valor de atletas inválido! Digite a quantidade de atletas novamente: ");
            qtdAtletas = scanner.nextInt();
        }

        atleta = new Atleta[qtdAtletas];

        for (int i = 0; i < qtdAtletas; i++){
            atleta[i] = new Atleta();
        }

        treinador = new Treinador();

    }

    public void exibir() {
        System.out.println("\n============== Equipe ==============");
        System.out.println("Esporte da equipe: " + this.esporte);
        System.out.println("Pontuacao da equipe:  " + this.pontuacao);
        System.out.println("====================================\n");

        for (int i = 0; i < qtdAtletas; i++) {
            atleta[i].exibir();
        }

        treinador.exibir();

    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public Atleta[] getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta[] atleta) {
        this.atleta = atleta;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtletas() {
        return qtdAtletas;
    }

    public void setQtdAtletas(int qtdAtletas) {
        this.qtdAtletas = qtdAtletas;
    }
}