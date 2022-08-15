import java.util.*;
public class Exercicio4 {
	public static void main(String[] args){
		int escolha = 0;
		boolean x = true;
		double n1, n2;
		Scanner scanner = new Scanner(System.in);
		
		while(x) {
			System.out.println("Digite o 1º valor: ");
			n1 = scanner.nextDouble();
			System.out.println("Digite o 2º valor: ");
			n2 = scanner.nextDouble();
			
			System.out.println("-=-=-=-=-=-=-= CALCULADORA -=-=-=-=-=-=-=");
			System.out.println("[1] -=-=-=-=-=-=-= Soma");
			System.out.println("[2] -=-=-=-=-=-=-= Subtração");
			System.out.println("[3] -=-=-=-=-=-=-= Multiplicação");
			System.out.println("[4] -=-=-=-=-=-=-= Divisão");
			System.out.println("[0] -=-=-=-=-=-=-= Sair do sistema");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("Digite sua opção: ");
			escolha = scanner.nextInt();
			System.out.println("");
			System.out.println("");
			if(escolha > 4 || escolha < 0){
				System.out.println("Digite novamente, opção inválida!");
				escolha = scanner.nextInt();
			}
			if(escolha == 1) {
				System.out.println(n1+" + "+n2+" = "+ soma(n1,n2));
				System.out.println("");
			}else {
				if(escolha == 2) {
					System.out.println(n1+" - "+n2+" = "+ subtracao(n1,n2));
					System.out.println("");
				}else {
					if(escolha == 3) {
						System.out.println(n1+" * "+n2+" = "+ multiplicacao(n1,n2));
						System.out.println("");
					}else {
						if(escolha == 4) {
							System.out.println(n1+" / "+n2+" = "+ divisao(n1,n2));
							System.out.println("");
						}else {
							if(escolha == 0) {
								System.out.println("Saindo do sistema...");
								x = false;
							}
						}
					}
				}
			}
		}
		scanner.close();
	}
	
	private static double soma(double n1, double n2) {
		double soma = n1 + n2;
		return soma;
	}
	private static double subtracao(double n1, double n2) {
		double subtracao = n1 - n2;
		return subtracao;
	}
	private static double multiplicacao(double n1, double n2) {
		double multiplicacao = n1 * n2;
		return multiplicacao;
	}
	private static double divisao(double n1, double n2) {
		double divisao = n1 / n2;
		return divisao;
	}
}