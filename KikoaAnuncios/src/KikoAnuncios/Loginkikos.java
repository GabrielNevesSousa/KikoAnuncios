package KikoAnuncios;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Loginkikos extends JFrame implements ActionListener {
	
	JButton Login;
	JButton Registrarse;
	JTextField areadetexto = new JTextField("");
	JTextField areadetexto2;
	JLabel usuario;
	JLabel contraseña;
	
	public Loginkikos() {
		
		this.setBounds(600, 220, 728, 410);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		Login = new JButton("Login");
		Login.setBounds(265, 230, 70, 20);
		this.getContentPane().add(Login);
		Login.addActionListener(this);
		
		Registrarse = new JButton("Registrarse");
		Registrarse.setBounds(400, 230, 105, 20);
		this.getContentPane().add(Registrarse);
		Registrarse.addActionListener(this);
		
		usuario = new JLabel("Usuario");
		Font font = new Font("Arial", Font.BOLD ,16);
		usuario.setFont(font);
		usuario.setBounds(260, 100, 70, 20);
		usuario.setForeground(Color.WHITE);
		this.getContentPane().add(usuario);
		
		areadetexto.setBounds(330, 100, 90, 20);
		this.getContentPane().add(areadetexto);
		
		contraseña = new JLabel("Contraseña");
		contraseña.setFont(font);
		contraseña.setBounds(230, 150, 120, 20);
		this.getContentPane().add(contraseña);
		contraseña.setForeground(Color.WHITE);
		
		JPasswordField areadetexto2 = new JPasswordField();
		areadetexto2.setBounds(330, 150, 90, 20);
		this.getContentPane().add(areadetexto2);
		areadetexto.addActionListener(this);
		

		
		
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	

}
