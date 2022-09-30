package KikoAnuncios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MisAnuncios extends JFrame implements ActionListener {
	
	JButton agregarAnuncio;
	JButton eliminarAnuncio;
	
	public MisAnuncios(){
		
		this.setBounds(600, 220, 728, 410);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		JLabel misAnuncios = new JLabel("Mis Anuncios");
		Font fuente = new Font("Comic Sans", Font.BOLD, 40);
		misAnuncios.setFont(fuente);
		misAnuncios.setForeground(Color.black);
		misAnuncios.setBounds(230, 10, 330, 50);
		this.getContentPane().add(misAnuncios);
		
		JLabel anunciosVigentes = new JLabel("Anuncios Vigentes");
		Font fuente1 = new Font("Comic Sans", Font.BOLD, 20);
		anunciosVigentes.setFont(fuente1);
		anunciosVigentes.setForeground(Color.black);
		anunciosVigentes.setBounds(30, 100, 330, 50);
		this.getContentPane().add(anunciosVigentes);
		
		agregarAnuncio = new JButton("Agregar Anuncio");
		agregarAnuncio.setBounds(400, 320, 150, 40);
		this.getContentPane().add(agregarAnuncio);
		agregarAnuncio.addActionListener(this);
		
		eliminarAnuncio = new JButton("Eliminar Anuncio");
		eliminarAnuncio.setBounds(550, 320, 150, 40);
		this.getContentPane().add(eliminarAnuncio);
		eliminarAnuncio.addActionListener(this);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
