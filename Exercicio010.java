import java.time.LocalDate;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Main {
  public static void main(String[] args) {
    int d,m,y;
    LocalDate nowDate = LocalDate.now();
    Scanner input;
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");  
  
    try{
      
		 System.out.print("Entre com o dia de seu nascimento: ");
			input = new Scanner(System.in);
			d = input.nextInt();
      	 System.out.print("Entre com o mes de seu nascimento: ");
			input = new Scanner(System.in);
			m = input.nextInt();
      	 System.out.print("Entre com o ano de seu nascimento: ");
			input = new Scanner(System.in);
			y = input.nextInt();
      LocalDate d1 = LocalDate.of(y,m,d);
      System.out.println("voce ja viveu aproximadamente: "+ChronoUnit.DAYS.between(d1, nowDate)+"dias");
      }finally{
      
     }
    }
}
  
