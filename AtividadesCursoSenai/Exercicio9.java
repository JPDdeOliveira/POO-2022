public class Exercicio9 {
	public static void main(String [] args) {
		double nota1 = 8.0, nota2 = 7.0, media;
		
		media = (nota1 + nota2)/2;
		if (media >= 7) {
			System.out.println("Murillo aprovado! Sua média foi: "+media);
		}else {
			if(media < 7 && media >= 4) {
				System.out.println("Murillo ficou de recuperação! Sua média foi: "+media);
			}else {
				System.out.println("Murillo foi reprovado! Sua média foi: "+media);
			}
		}
	}
}