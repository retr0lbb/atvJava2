import java.util.Scanner;
public class Exercicio006 {
 public static void main(String args[]) {
	 int idade;
	 Scanner input;
	 try {
		 System.out.print("Entre com sua idade: ");
			input = new Scanner(System.in);
			idade = input.nextInt();
			
			System.out.println("voce ja viveu: "+ idade*365+" dias.");
		 
	 }catch (Exception error) {
			System.out.println("Houve um erro na conversao, digite apenas caracteres numericos.");
	 
 }
}
 }
