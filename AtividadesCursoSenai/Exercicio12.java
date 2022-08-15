public class Exercicio12 {
	public static void main(String [] args) {
		double deducao = 142.8,salario = 2000.0, percentAliquota = 0.075, novoSalario = 0;
		if(salario <= 1903.98) {
			System.out.println("Salário isento de dedução");
		}else {
			if(salario > 1903.99 && salario < 2826.65) {
				novoSalario = (salario*percentAliquota) - deducao; 
				System.out.printf("Valor alíquota R$%.2f",novoSalario);
			}else {
				if(salario > 2826.66 && salario < 3751.05) {
					novoSalario = (salario*percentAliquota) - deducao; 
					System.out.printf("Valor alíquota R$%.2f",novoSalario);
				}else {
					if(salario > 3751.06 && salario < 4664.68) {
						novoSalario = (salario*percentAliquota) - deducao; 
						System.out.printf("Valor alíquota R$%.2f",novoSalario);
					}else {
						if(salario > 4664.68) {
							novoSalario = (salario*percentAliquota) - deducao; 
							System.out.printf("Valor alíquota R$%.2f",novoSalario);
						}
					}
				}
			}
		}
	}
}
