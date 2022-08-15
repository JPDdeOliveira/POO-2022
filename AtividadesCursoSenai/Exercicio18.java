public class Exercicio18 {
	public static void main(String [] args) {
		double desconto = 0, valorCompra = 3000;
		if (valorCompra >= 3000) {
			desconto = valorCompra*0.15;
		}else {
			desconto = valorCompra*0.1;
		}
		System.out.println("O valor do desconto foi: R$"+desconto);
	}
}