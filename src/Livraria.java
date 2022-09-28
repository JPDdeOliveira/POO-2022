package src;

import java.util.*;
public class Livraria{
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Dvd> dvds = new ArrayList<>();
    private ArrayList<Cd> cds = new ArrayList<>();
    private Scanner scanner;

    Livraria(){}

    public void iniciar(){
        System.out.println("1 ---------- Exibir produtos");
        System.out.println("2 ---------- Calcular desconto produtos");
        
    }

    public void cadastrandoProdutos(){
        scanner = new Scanner(System.in);
        System.out.println("Deseja cadastrar qual tipo de produto? (Livro, Cd ou dvd?)");
        String consulta = scanner.nextLine();
        while(!consulta.toLowerCase().equalsIgnoreCase("livro") && !consulta.toLowerCase().equalsIgnoreCase("cd") && !consulta.toLowerCase().equalsIgnoreCase("dvd")){
            System.out.println("Tipo inválido, digite o tipo correto!");
            consulta = scanner.nextLine();
        }
        if(consulta.toLowerCase().equalsIgnoreCase("livro")){
           livros.add(new Livro()); 
        }else{
            if(consulta.toLowerCase().equalsIgnoreCase("dvd")){
                dvds.add(new Dvd());
            }else{
                if(consulta.toLowerCase().equalsIgnoreCase("cd")){
                    cds.add(new Cd());
                }
            }
        }
    }

    public void exibirProdutos(){
        System.out.println("---------- LIVROS ----------");
        for(int i = 0; i <= livros.size(); i++){
            livros.get(i).exibir();
        }
        System.out.println("---------- CDS ----------");
        for (int i = 0; i < cds.size(); i++) {
            cds.get(i).exibir();
        }
        System.out.println("---------- DVDS ----------");
        for (int i = 0; i < dvds.size(); i++) {
            dvds.get(i).exibir();
        }
    }
    
    public void calcularDescontos(){
        System.out.println("Deseja cadastrar qual tipo de produto? (Livro, Cd ou dvd?)");
        String consulta = scanner.nextLine();
        while(!consulta.toLowerCase().equalsIgnoreCase("livro") && !consulta.toLowerCase().equalsIgnoreCase("cd") && !consulta.toLowerCase().equalsIgnoreCase("dvd")){
            System.out.println("Tipo inválido, digite o tipo correto!");
            consulta = scanner.nextLine();
        }
        if(consulta.toLowerCase().equalsIgnoreCase("livros")){
            
        }
    }

    public void calcularDescontosProdutoDeterminado(){
        scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana: " 
        + "\nDom - Domingo"
        + "\nSeg - Segunda-feira"
        + "\nTer - Terça-feira"
        + "\nQua - Quarta-feira"
        + "\nQui - Quinta-feira"
        + "\nSex - Sexta-Feira"
        + "\nSab - Sábado");
        System.out.println("Digite o dia da semana: ");
        String diaSemana; 
        

    }
}