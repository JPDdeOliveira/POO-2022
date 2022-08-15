import java.util.*;
/* 
 * Fazer um método que calcule o valor total para completar o tanque, passando por parâmetros o total em litros do combustível no 
 * tanque atualmente e o valor do combustível.
*/

public class Exercicio6 {
    static double capacidadeMaxima;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Qual o preço da gasolina? R$");
        double gasolina = scanner.nextDouble();
        while(gasolina < 0){
            System.out.println("Valor inválido, digite novamente: ");
            gasolina = scanner.nextDouble();
        }
        System.out.println("");
        System.out.printf("Qual a capacidade máxima de litros de combustível de seu automóvel?\n");
        capacidadeMaxima = scanner.nextDouble();
        System.out.println("");
        
        while (capacidadeMaxima > 300 || capacidadeMaxima < 10) {
            System.out.println("Capacidade máxima inválida, digite novamente!");
            capacidadeMaxima = scanner.nextDouble();
        }

        System.out.println("Digite a quantidade de litros de gasolina que tem no seu automóvel: ");
        double capacidadeAtualAutomovel = scanner.nextDouble();
        System.out.println("");
        while(capacidadeAtualAutomovel > capacidadeMaxima || capacidadeAtualAutomovel < 0){
            System.out.println("Capacidade atual inválida, digite novamente!");
            capacidadeAtualAutomovel = scanner.nextDouble(); 
        }

        System.out.printf("O valor a ser pago para encher o tanque é de: R$%.2f",valorCombustivel(gasolina, capacidadeAtualAutomovel));
        scanner.close();
    }

    private static double valorCombustivel(double combustivel, double capacidadeAtual) {
        double totalEncher = capacidadeMaxima - capacidadeAtual;
        double totalPagar = totalEncher*combustivel; 
        return totalPagar;
    }
}