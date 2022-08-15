import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double n1 = scanner .nextDouble();
		System.out.println("Digite o segundo valor: ");
		double n2 = scanner .nextDouble();
		
		System.out.println(n1+" + "+n2+" = "+soma(n1,n2));
		System.out.println(n1+" - "+n2+" = "+subtracao(n1,n2));
		System.out.println(n1+" * "+n2+" = "+multiplicacao(n1,n2));
		System.out.println(n1+" / "+n2+" = "+ divisao(n1,n2));
	scanner.close();
	}

	private static double soma(double n1, double n2) {
		Double valorFinal = n1 + n2; 
		return valorFinal;
	}
	private static double subtracao(double n1, double n2) {
		Double valorFinal = n1 - n2; 
		return valorFinal;
	}
	private static double multiplicacao(double n1, double n2) {
		Double valorFinal = n1 * n2; 
		return valorFinal;
	}
	private static double divisao(double n1, double n2) {
		Double valorFinal = n1 / n2; 
		return valorFinal;
	}
}