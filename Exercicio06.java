import java.util.Scanner;
public class Exercicio06 {
 @SuppressWarnings("resource")
public static void main(String [] args) {
	 int idade;
	 Scanner input;
	 try {
		 System.out.print("Entre com sua idade: ");
			input = new Scanner(System.in);
			idade = input.nextInt();
			
			
			System.out.println("voce ja viveu: "+ idade*365 +" dias");
			System.out.println("voce ja viveu: "+ (idade*365)*24 +" horas");
			System.out.println("voce ja viveu: "+ ((idade*365)*24)*60 +" minutos");
			System.out.println("voce ja viveu: "+ (((idade*365)*24)*60)*60 +" segundos");
	 }finally {
		 
	 }
 }
}
