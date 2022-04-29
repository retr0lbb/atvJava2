import java.util.Scanner;
public class Exercicio009 {
 public static void main(String args []) {
    int t1, l2, qp;
    float fn;
    Scanner input;
    
    try {
    	 System.out.print("Entre com a quantidade de pontos do time 1: ");
			input = new Scanner(System.in);
			t1 = input.nextInt();
			
		   	 System.out.print("Entre com a quantidade de pontos do time 2: ");
				input = new Scanner(System.in);
				l2 = input.nextInt();
				
			  System.out.print("Entre com o valor dos pontos: ");
			  	input = new Scanner(System.in);
				qp = input.nextInt();
				
				fn = (t1-l2)/qp;
				if(fn>= 0) {
				
				System.out.println("Para empatar é necessario pontuar: "+fn+" vezes");
				}
				if(fn <=0) {
					System.out.println("estamos ganhando por: "+fn*-1+" jogadas");
				}
					
    }catch (Exception error) {
		System.out.println("Houve um erro na conversao, digite apenas caracteres numericos.");
    }
 }
}
