import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;
public class GuiLogin extends JFrame{
	
	private JTextField tflogin;
	private JLabel lbSenha;
	private JLabel lbLogin;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private static GuiLogin frame;
	
	public GuiLogin() {
		inicializarComponentes();
		definirEvento();
	}
	
	private void inicializarComponentes() {
		setTitle("login no sistema");
		setBounds(0,0, 250, 200);
		setLayout(null);
		tflogin = new JTextField(5);
		pfSenha = new JPasswordField(5);
		lbSenha = new JLabel("Senha: ");
		lbLogin = new JLabel("Login: ");	
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar: ");
		tflogin.setBounds(100, 30, 120, 25);
		lbLogin.setBounds(30, 75, 80, 25);
		pfSenha.setBounds(100, 75, 125, 25);
		btLogar.setBounds(20 ,125 ,100,25);
		btCancelar.setBounds(125, 120, 100, 25);
		add(tflogin);
		add(lbSenha);
		add(lbLogin);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);
		
	}	
		private void definirEvento() {
			btLogar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String senha = String.valueOf(pfSenha.getPassword());
					if(tflogin.getText().equals("java")&& senha.equals("java")) {
						frame.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "login ou senhas incorretas!!!");
					}
					
				}
			});
			btCancelar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
					
				}
			});
		}
		public static void main(String []args) {
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					frame = new GuiLogin();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation((tela.width - frame.getSize().width/2), (tela.height - frame.getSize().height)/2);
					frame.setVisible(true);
				}
			});
		}
	}

