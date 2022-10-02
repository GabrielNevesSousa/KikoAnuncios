package KikoAnuncios;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventanaUsuario {
	public static void main(String args[]) {
		JFrame frame = new JFrame("usuario");
		JLabel Usuario;
		String NombreUsuario = "Juan";
		Usuario = new JLabel("Bienvenida/o a su perfil, " + NombreUsuario );
		Usuario.setBounds(80,40,200,20);
		frame.add(Usuario);
		JButton button1 = new JButton("Press");
	    frame.getContentPane().add(button1);
		frame.setSize(900,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
}
	
	