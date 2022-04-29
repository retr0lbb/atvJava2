

//Um trabalho por: Henrique Augusto Aguiar de Souza
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[]args) {
		int  celcius, fhrt;
		Scanner sc;
		
		System.out.println("Digite a temperatura em Celcius: ");
		sc = new Scanner(System.in);
		celcius = sc.nextInt();
		
		fhrt = (celcius * 9/5) + 32;
		
		System.out.println("A temperatura em Fahreiheit é: " + fhrt);
		
	}

}