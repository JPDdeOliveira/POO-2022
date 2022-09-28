package src;

import java.util.*;

public class Livro extends Produto {
    private String autor;
    private Scanner scanner;

    public Livro(float preco, String titulo, String autor) {
        super(preco, titulo);
        this.autor = autor;
    }

    Livro() {
        super();
        System.out.println("Digite o autor do livros: ");
        autor = scanner.nextLine();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibir() {
        System.out.println("Titulo do produto: " + this.getTitulo());
        System.out.println("Preço do produto: " + this.getPreco());
        System.out.println("Autor dp livro: " + this.autor);
    }
}
