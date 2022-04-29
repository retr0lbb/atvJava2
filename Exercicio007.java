import java.util.Scanner;
public class Exercicio007 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		float precoProduto, valorDesc, valorP, valorF;
		Scanner input;
		
		System.out.println("Digite o valor do produto: ");
		input = new Scanner(System.in);
		precoProduto = input.nextFloat();
		
		System.out.println("Digite o valor da porcentagem do desconto: ");
		input = new Scanner(System.in);
		valorP = input.nextFloat();
		 
		valorDesc = (precoProduto * valorP /100);
		valorF = (precoProduto - valorDesc);
		System.out.println("O valor do produto com desconto é: " + valorF);
	}
}
