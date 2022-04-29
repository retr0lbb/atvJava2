import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[]args) {
		String Nome, Hobbie;
		int idade;
		Scanner leia;
		
		System.out.println("Digite seu nome: ");
		leia = new Scanner(System.in);
		Nome = leia.nextLine();
		
		System.out.println("Digite seu hobbie: ");
		leia = new Scanner(System.in);
		Hobbie = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		System.out.println("Seu nome: " + Nome);
		System.out.println("Seu hobbie: " + Hobbie);
		System.out.println("Sua idade: " + idade);
		
		
	}

}
