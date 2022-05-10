import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Iniciado extends JFrame {

	JTextField[][] cuadros = new JTextField[9][9];
	JPopupMenu jpsugerencias = new JPopupMenu();

	JLabel jsugerencias1 = new JLabel();

	JButton Undo;
	JButton Redo;

	String Nombre;
	int x, y;

	int t;

	int contador;
	int algo;

	int c = 0;
	int i = 0;

	JTextArea c78;

	String verificar = "";
	int i_selected = 0;
	int c_selected = 0;
	String number = "";

	public Iniciado() {
		super("SUDOKU");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		// setUndecorated(true);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		GUI();

		setVisible(true);
	}

	private void GUI() {

		x = y = 90;
		contador = 0;

		JMenuItem uno = new JMenuItem("1");
		JMenuItem dos = new JMenuItem("2");
		JMenuItem tres = new JMenuItem("3");
		JMenuItem cuatro = new JMenuItem("4");
		JMenuItem cinco = new JMenuItem("5");
		JMenuItem seis = new JMenuItem("6");
		JMenuItem siete = new JMenuItem("7");
		JMenuItem ocho = new JMenuItem("8");
		JMenuItem nueve = new JMenuItem("9");

		for (i = 0; i < 9; i++) {
			for (c = 0; c < 9; c++) {
				cuadros[i][c] = new JTextField();
				cuadros[i][c].setBounds(x, y, 30, 30);

				if ((i < 3 && (c < 3 || c > 5)) || (i > 5 && (c < 3 || c > 5))
						|| ((i > 2 && i < 6) && (c > 2 && c < 6))) {
					cuadros[i][c].setBackground(new Color(232, 232, 232));
				}

				t = contador;
				cuadros[i][c].setHorizontalAlignment(JTextField.CENTER);
				cuadros[i][c].addMouseListener(new Click(cuadros[i][c], ":v"));

				verificar = "";

				add(jpsugerencias);
				jpsugerencias.removeAll();
				add(cuadros[i][c]);
				x += 30;

				contador++;
			}
			x = 90;
			y += 30;
		}

		Icon img = new ImageIcon(getClass().getResource("/Image/icons8-undo-48.png"));

		Undo = new JButton(img);
		Undo.setBounds(100, 370, 48, 48);
		Undo.setContentAreaFilled(false);
		Undo.setBorderPainted(false);
		Undo.isBorderPainted();
		add(Undo);

		img = new ImageIcon(getClass().getResource("/Image/icons8-redo-48.png"));

		Redo = new JButton(img);
		Redo.setBounds(300, 370, 48, 48);
		Redo.setContentAreaFilled(false);
		Redo.setBorderPainted(false);
		Redo.isBorderPainted();
		add(Redo);

		JLabel jsugerencias = new JLabel("SUGERENCIAS: ");
		jsugerencias.setBounds(90, 450, 100, 30);
		add(jsugerencias);

		jsugerencias1.setBounds(200, 450, 200, 30);
		add(jsugerencias1);

	}

}
