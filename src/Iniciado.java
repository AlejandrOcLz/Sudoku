import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	boolean[][] verificarI = new boolean[9][9];
	JPopupMenu jpsugerencias = new JPopupMenu();
	
	MatrizSudoku ms = new MatrizSudoku();

	JLabel jsugerencias1;

	JButton Undo;
	JButton Redo;
	public JButton js1;
	public JButton js2;
	public JButton js3;
	public JButton js4;
	public JButton js5;
	public JButton js6;
	public JButton js7;
	public JButton js8;
	public JButton js9;
	public JButton js0;
	

	String Nombre;
	int x, y;

	int t;

	int contador;
	int algo;

	int c = 0;
	int i = 0;

	String verificar = "";
	int i2 = 0;
	int c2 = 0;
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

		jsugerencias1 = new JLabel();
		x = y = 90;
		contador = 0;

		js1 = new JButton("1");
		js1.setBounds(180, 450, 50, 30);
		js1.setEnabled(false);
		js2 = new JButton("2");
		js2.setBounds(230, 450, 50, 30);
		js2.setEnabled(false);
		js3 = new JButton("3");
		js3.setBounds(280, 450, 50, 30);
		js3.setEnabled(false);
		js4 = new JButton("4");
		js4.setBounds(330, 450, 50, 30);
		js4.setEnabled(false);
		js5 = new JButton("5");
		js5.setBounds(380, 450, 50, 30);
		js5.setEnabled(false);
		js6 = new JButton("6");
		js6.setBounds(430, 450, 50, 30);
		js6.setEnabled(false);
		js7 = new JButton("7");
		js7.setBounds(480, 450, 50, 30);
		js7.setEnabled(false);
		js8 = new JButton("8");
		js8.setBounds(530, 450, 50, 30);
		js8.setEnabled(false);
		js9 = new JButton("9");
		js9.setBounds(580, 450, 50, 30);
		js9.setEnabled(false);
		js0 = new JButton("-");
		js0.setBounds(630, 450, 50, 30);
		js0.setEnabled(false);

		add(js1);
		add(js2);
		add(js3);
		add(js4);
		add(js5);
		add(js6);
		add(js7);
		add(js8);
		add(js9);
		add(js0);

		ClickButton click = new ClickButton(this);

		for (i = 0; i < 9; i++) {
			for (c = 0; c < 9; c++) {
				cuadros[i][c] = new JTextField();
				cuadros[i][c].setBounds(x, y, 30, 30);

				if ((i < 3 && (c < 3 || c > 5)) || (i > 5 && (c < 3 || c > 5))
						|| ((i > 2 && i < 6) && (c > 2 && c < 6))) {
					cuadros[i][c].setBackground(new Color(245, 245, 245));
				}
				
				cuadros[i][c].setEnabled(false);
				cuadros[i][c].setFont(new Font("ARIAL", 1, 20));
				cuadros[i][c].setForeground(Color.MAGENTA);
				
				
				cuadros[i][c].setText(ms.sudoku[i][c]);
				
				if(ms.sudoku[i][c].contains("-")) {
					verificarI[i][c] = true;
				}else {
					verificarI[i][c] = false;
				}

				t = contador;
				cuadros[i][c].setHorizontalAlignment(JTextField.CENTER);
				cuadros[i][c].addMouseListener(new Click(cuadros[i][c], cuadros, i, c, jsugerencias1, js1, js2, js3,
						js4, js5, js6, js7, js8, js9, js0, click, verificarI[i][c]));

				verificar = "";

				add(jpsugerencias);
				add(cuadros[i][c]);

				x += 30;

				contador++;
			}
			x = 90;
			y += 30;
		}
		boolean fin = true;
		for (i = 0; i < 9; i++) {
			for (c = 0; c < 9; c++) {
				ms.sudoku[i][c] = cuadros[i][c].getText();
				System.out.print(ms.sudoku[i][c] + " ");
				if(ms.sudoku[i][c].contains("-")) {
					fin = false;
				}
			}
			System.out.println();
		}
		
		if(fin) {
			System.out.println("Fin del juego");
		}
		
		js1.addActionListener(click);
		js2.addActionListener(click);
		js3.addActionListener(click);
		js4.addActionListener(click);
		js5.addActionListener(click);
		js6.addActionListener(click);
		js7.addActionListener(click);
		js8.addActionListener(click);
		js9.addActionListener(click);
		js0.addActionListener(click);
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
