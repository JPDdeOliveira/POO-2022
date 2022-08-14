import java.util.Scanner;

public class Treinador {
    private String nome;
    private String curso;
    private String telefone;

    public Treinador(String nome, String curso, String telefone) {
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public Treinador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do treinador: ");
        this.nome = scanner.nextLine();

        System.out.println("Informe o curso do treinador: ");
        this.curso = scanner.nextLine();

        System.out.println("Informe o telefone do treinador: ");
        this.telefone = scanner.nextLine();

        System.out.println("");
    }

    public void exibir() {
        System.out.println("\n============== Treinador ==============");
        System.out.println("Nome do treinador: " + this.nome);
        System.out.println("Curso do treinador: " + this.curso);
        System.out.println("Telefone do treinador: " + this.telefone);
        System.out.println("=======================================\n");
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}