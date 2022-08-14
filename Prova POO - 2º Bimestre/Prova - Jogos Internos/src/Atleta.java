import java.util.Scanner;
public class Atleta {
    private String nome;
    private String curso;
    private int ano;
    private String dataNasc;

    public Atleta(String nome, String curso, int ano, String dataNasc) {
        this.nome = nome;
        this.curso = curso;
        this.ano = ano;
        this.dataNasc = dataNasc;
    }

    public Atleta() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Informe o nome do atleta: ");
        this.nome = scanner.nextLine();

        System.out.println("Informe o curso do atleta: ");
        this.curso = scanner.nextLine();

        System.out.println("Informe o ano escola do atleta: ");
        this.ano = scanner.nextInt();

        System.out.println("Informe a data de nascimento do atleta: ");
        this.dataNasc = scanner2.nextLine();

        System.out.println("");
    }

    public void exibir() {
        System.out.println("============== Atleta ==============");
        System.out.println("Nome do atleta: " + this.nome);
        System.out.println("Curso do atleta: " + this.curso);
        System.out.println("Ano do atleta: " + this.ano);
        System.out.println("Data de nascimento do atleta: " + this.dataNasc);
        System.out.println("====================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}