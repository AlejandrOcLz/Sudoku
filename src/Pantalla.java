import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pantalla extends JFrame{
	
	JTextField jtnombre;
	JButton jiniciar;
	String Nombre;

	public Pantalla() {
		super ("SUDOKU");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //setUndecorated(true);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        GUI();
        
        setVisible(true);
	}

	private void GUI() {
		JLabel jlnombre = new JLabel("Ingresa tu nombre");
		jlnombre.setBounds(200,160,200,40);
		add(jlnombre);
		
		jtnombre = new JTextField();
		jtnombre.setBounds(150,200,200,30);
		add(jtnombre);
		
		jiniciar = new JButton("Comenzar Juego");
		jiniciar.setBounds(150,250,200,30);
		jiniciar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Nombre = jtnombre.getText();
				Iniciado i = new Iniciado(Nombre);
				dispose();
				
			}
		});
		add(jiniciar);
	}

	public static void main(String[] args) {
		Pantalla p = new Pantalla();

	}

}
