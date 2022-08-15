public class Exercicio13 {
	public static void main(String args[]) {
		double compra = 500;
		int desconto;
		if(compra > 0.01 && compra < 500.01) {
			desconto = 5;
			System.out.println("O desconto é de "+desconto+"%");
		}else {
			if(compra > 500.01 && compra < 800.01) {
				desconto = 7;
				System.out.println("O desconto é de "+desconto+"%");
			}else {
				if(compra > 800.01 && compra < 1200.01) {
					desconto = 10;
					System.out.println("O desconto é de "+desconto+"%");
				}else {
					if(compra > 1200.01 && compra < 1500.01) {
						desconto = 13;
						System.out.println("O desconto é de "+desconto+"%");
					}else {
						if(compra > 1500.01 && compra < 1700.01) {
							desconto = 15;
							System.out.println("O desconto é de "+desconto+"%");
						}else {
							if(compra > 1700.01) {
								desconto = 17;
								System.out.println("O desconto é de "+desconto+"%");
							}
						}
					}
				}
			}
			
		}
	}
}