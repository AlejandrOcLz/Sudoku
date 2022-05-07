import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Iniciado extends JFrame{
	
	JTextField[] cuadros = new JTextField[81];
	
	JButton Undo;
	JButton Redo;
	
	String Nombre;
	int x,y;

	public Iniciado() {
		super ("SUDOKU");
        setSize(800, 600);
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
		x = y = 90;
		int contador=0;
		for(int i = 0; i < 9; i++) {
			for(int c = 0; c < 9; c++) {
				cuadros[contador] = new JTextField();
				cuadros[contador].setBounds(x,y,30,30);
				if((i < 3 && (c < 3 || c > 5)) || (i > 5 && (c < 3 || c > 5)) || ((i > 2 && i < 6) && (c > 2 && c < 6))) {
					cuadros[contador].setBackground(new Color(232,232,232));
				}
				cuadros[contador].setHorizontalAlignment(JTextField.CENTER);
				add(cuadros[contador]);
				x += 30;
				contador++;
			}
			x = 90;
			y += 30;
		}
		
		Icon img = new ImageIcon(getClass().getResource("/Image/icons8-undo-48.png"));
		
		Undo = new JButton(img);
		Undo.setBounds(100,370,48,48);
		Undo.setContentAreaFilled(false);                  
		Undo.setBorderPainted(false);
		Undo.isBorderPainted();
		add(Undo);
		
		img = new ImageIcon(getClass().getResource("/Image/icons8-redo-48.png"));
		
		Redo = new JButton(img);
		Redo.setBounds(300,370,48,48);
		Redo.setContentAreaFilled(false);                  
		Redo.setBorderPainted(false);
		Redo.isBorderPainted();
		add(Redo);
		
		JLabel jsugerencias = new JLabel("SUGERENCIAS: ");
		jsugerencias.setBounds(90,450,100,30);
		add(jsugerencias);
		
	}

}
