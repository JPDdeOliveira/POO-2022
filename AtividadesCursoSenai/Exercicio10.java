public class Exercicio10 {
	public static void main(String [] args) {
		char escolha = 'A';
		switch(escolha) {
		case 'A': 
			System.out.println("Bem vindo ao sistema de gerenciamento escolar");
			System.out.println("Esta é a parte destinada aos alunos");
			break;
		case 'P': 
			System.out.println("Bem vindo ao sistema de gerenciamento escolar");
			System.out.println("Esta é a parte destinada aos professores");
			break;	
		case 'T': 
			System.out.println("Bem vindo ao sistema de gerenciamento escolar");
			System.out.println("Esta é a parte destinada as turmas");
			break;
		case 'S':
			System.out.println("Saindo do sistema...");
			break;
		}
	}
}