package src;

import java.util.*;

public class Dvd extends Produto {
    private int duracao;
    private Scanner scanner;

    public Dvd(float preco, String titulo, int duracao) {
        super(preco, titulo);
        this.duracao = duracao;
    }

    Dvd() {
        super();
        System.out.println("Digite a duração do Dvd: ");
        duracao = scanner.nextInt();
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void exibir() {
        System.out.println("Titulo do produto: " + this.getTitulo());
        System.out.println("Preço do produto: " + this.getPreco());
        System.out.println("Duração em minutos: " + this.duracao);
    }

}
