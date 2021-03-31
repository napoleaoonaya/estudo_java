package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControlesTeste extends JFrame implements ActionListener {
	
	JTextField login;
	JPasswordField senha;

	JButton ok;
	JButton cancel;

	public ControlesTeste() {
		
		super("Controle Textos e Senhas");
		
		login = new JTextField();
		senha = new JPasswordField();
		
		ok = new JButton("OK");
		//ok.addActionListener(this);
		ok.addActionListener(new BotaoOKListener());
		
		cancel = new JButton("Cancel");
        //cancel.addActionListener(this);
		cancel.addActionListener(new BotaoCancelListner());
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		c.add(new JLabel("Login: "));
		c.add(login);
		c.add(new JLabel("Senha: "));
		c.add(senha);
		
		c.add(ok);
		c.add(cancel);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new ControlesTeste();
	}
	
	class BotaoOKListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == ok) {
				System.out.println("Clicou em ok!");
				
				String s = "Login: " + login.getText()
				  + "\nSenha: "+new String(senha.getPassword());
				
				JOptionPane.showMessageDialog(null, s);
				
			}
		}
		
	}
	
	class BotaoCancelListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == cancel) {
				System.out.println("Clicou em cancel!");
				
				login.setText("");
				senha.setText("");
			}
			
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ok) {
			System.out.println("Clicou em ok!");
			
			String s = "Login: " + login.getText()
			  + "\nSenha: "+new String(senha.getPassword());
			
			JOptionPane.showMessageDialog(null, s);
			
		}else if(e.getSource() == cancel) {
			System.out.println("Clicou em cancel!");
			
			login.setText("");
			senha.setText("");
		}
		
	}

}
