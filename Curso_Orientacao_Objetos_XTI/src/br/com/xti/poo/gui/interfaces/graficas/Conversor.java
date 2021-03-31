package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFarenheit;
	private JTextField textFieldCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double farenheit = Double.parseDouble(textFieldFarenheit.getText());
					double celsius = ((farenheit - 32)/1.8);
				
					//Mascara
					DecimalFormat df2 = new DecimalFormat("#.##");
					//Arredondamento para cima
					df2.setRoundingMode(RoundingMode.UP);
					//Convertendo String para Double, e armazenando em Double
					double resultado = Double.parseDouble(df2.format(celsius));
					
					textFieldCelsius.setText(resultado+"ºC");
					
				}catch(Exception erro) {
					erro.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFarenheit = new JLabel("Farenheit:");
		lblFarenheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblFarenheit);
		
		textFieldFarenheit = new JTextField();
		textFieldFarenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(textFieldFarenheit);
		textFieldFarenheit.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius:");
		lblCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblCelsius);
		
		textFieldCelsius = new JTextField();
		textFieldCelsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(textFieldCelsius);
		textFieldCelsius.setColumns(10);
	}

}
