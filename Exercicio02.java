import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[]args) {
		String msgPositiva;
		Scanner leia;
		
		System.out.println ("Digite uma mensagem positiva: ");
		leia = new Scanner (System.in);
		msgPositiva = leia.nextLine();
		
		System.out.println(msgPositiva);
	}

}
