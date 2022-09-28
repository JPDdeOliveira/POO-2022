package src;

import java.util.*;
public class Produto {
    private float preco;
    private String titulo;
    private Scanner scanner;

    public Produto(float preco, String titulo) {
        this.preco = preco;
        this.titulo = titulo;
    }
    public Produto(){
        scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        preco = scanner.nextFloat();
        System.out.println("Digite o titulo do produto: ");
        titulo = scanner.nextLine();
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 

    public void exibir(){
        System.out.println("Titulo do produto: "+this.titulo);
        System.out.println("Preço do produto: "+this.preco);
    }
}