package src;

import java.util.*;
public class Cd extends Produto{
    private int faixas;
    private Scanner scanner;

    public Cd(float preco, String titulo, int faixas) {
        super(preco, titulo);
        this.faixas = faixas;
    }

    Cd() {
        super();
        System.out.println("Digite o número de faixas do cd:");
        faixas = scanner.nextInt();
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
    
    @Override
    public void exibir(){
        System.out.println("Titulo do produto: "+this.getTitulo());
        System.out.println("Preço do produto: "+this.getPreco());
        System.out.println("Número de faixas: "+this.faixas);
    }
}
