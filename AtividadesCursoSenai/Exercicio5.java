import java.util.*;
/*
 * Fazer um método que calcule o valor total em reais para completar o tanque, passando por parâmetros o valor do combustível que o 
 * usuário informar
 */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gasolina;
        System.out.printf("Qual o preço da gasolina? R$");
        gasolina = scanner.nextDouble();
        System.out.println("");
        System.out.printf("Qual a capacidade máxima de litros de combustível de seu automóvel?\n");
        double capacidadeMaxima = scanner.nextDouble();
        System.out.println("");
        while(capacidadeMaxima > 300 || capacidadeMaxima < 10){
            System.out.println("Capacidade máxima inválida, digite novamente!");
            capacidadeMaxima = scanner.nextDouble(); 
        }
        System.out.println("");
        System.out.println("Digite a quantidade de litros de gasolina que tem no seu automóvel: ");
        double capacidadeAtual = scanner.nextDouble();
        System.out.println("");
        while(capacidadeAtual > capacidadeMaxima || capacidadeAtual < 0){
            System.out.println("Capacidade atual inválida, digite novamente!");
            capacidadeAtual = scanner.nextDouble(); 
        }
        double totalEncher = capacidadeMaxima -  capacidadeAtual;
        double totalPagar = totalEncher*valorCombustivel(gasolina);
        System.out.printf("Valor a ser pago para completar o tanque: R$%.2f",totalPagar);
        scanner.close();
    }

    private static double valorCombustivel(double combustivel){
        return combustivel;
    }
}