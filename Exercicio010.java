import java.util.Calendar;
import java.util.*;
import java.text.SimpleDateFormat;
public class Exercicio009 {
 public static void main(String args []) {
	int d, m, y;
	 
	   Scanner input;
	   Calendar calendar = Calendar.getInstance();
	   SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
	   

	   
	   try {
		   System.out.print("Entre com o dia de seu nascimento: ");
			input = new Scanner(System.in);
			d = input.nextInt();
			System.out.print("Entre com o mes do seu nascimento: ");
			input = new Scanner(System.in);
			m = input.nextInt()-1;
			System.out.print("Entre com o ano do seu nascimento: ");
			input = new Scanner(System.in);
			y = input.nextInt();
			calendar.set(y, m, d);
			Date dia = calendar.getTime();
			String finas = format1.format(dia);
			
			System.out.println("data = "+ finas);
			


			
	   }catch (Exception error) {
			System.out.println("Houve um erro na conversao, digite apenas caracteres numericos.");
 
}
 }
}
