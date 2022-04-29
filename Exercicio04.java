import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[]args) {
		Float altura, largura, area;
		Scanner sc;
		
		System.out.println("Digite a altura: ");
		sc = new Scanner(System.in);
		altura = sc.nextFloat();
		
		System.out.println("Digite a largura: ");
		sc = new Scanner(System.in);
		largura = sc.nextFloat();
		
		area = altura * largura;
		
		System.out.println("A área é igual a: " + area);
	}

}
