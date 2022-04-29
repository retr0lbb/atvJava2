import javax.swing.JOptionPane;
public class Exercicio008 {
	public static void main(String [] args) {
		float n1, n2, n3, nf;
		
		try {
			n1 = Float.parseFloat(javax.swing.JOptionPane.showInputDialog("Entre com a primeira nota: "));
			n2 = Float.parseFloat(javax.swing.JOptionPane.showInputDialog("Entre com a segunda nota: "));
			n3 = Float.parseFloat(javax.swing.JOptionPane.showInputDialog("Entre com a terceira nota: "));
			nf = (n1+n2+n3)/3;
			if(nf>=6) {
				System.out.println("Sua nota final foi: "+nf);
				System.out.println("Aprovado");
			}else {
				System.out.println("Sua nota final foi: "+nf);
				System.out.println("Reprovado");
			}
			
			
		}catch (Exception error) {
			System.out.println("Houve um erro na conversao, digite apenas caracteres numericos.");
	    }
			
		
	}
}
