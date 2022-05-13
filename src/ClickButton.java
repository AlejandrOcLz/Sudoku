import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClickButton implements ActionListener {

	JTextField tf;
	Iniciado in;
	Datos dp;
	public int i;
	public int c;
	public JTextField[][] cuadros;
	public String[][] sudoku;
	public String Nombre;
	boolean fin ;

	public ClickButton(Iniciado in, Datos dp) {
		this.in = in;
		this.dp = dp;
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("--------Sudoku--------");
		
		if (e.getSource().equals(in.js1)) {
			boolean fin = true;
			for (int i2 = 0; i2 < 9; i2++) {
				for (int c2 = 0; c2 < 9; c2++) {
					if(cuadros[i2][c2].getText().contains("-")) {
						fin = false;
					}
					sudoku[i2][c2] = cuadros[i2][c2].getText();
					System.out.print(sudoku[i2][c2]+" ");
				}
				System.out.println();
			}
			if(fin) {
				System.out.print("Fin del juego");
			}
			dp.agregar( i +","+c+","+"1"+","+tf.getText()+","+"0");
			tf.setText("1");
			// Finalizacion del juego
			fin = true;
			for (int i2 = 0; i2 < 9; i2++) {
				for (int c2 = 0; c2 < 9; c2++) {
					if(cuadros[i2][c2].getText().contains("-")) {
						fin = false;
					}
					sudoku[i2][c2] = cuadros[i2][c2].getText();
					System.out.print(sudoku[i2][c2]+" ");
				}
				System.out.println();
			}
			if(fin) {
				int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
				if(desicion==0) {
					Pantalla p = new Pantalla();
					in.dispose();
				}else {
					
				}
				System.out.print("Fin del juego");
			}
			//
			in.js1.setEnabled(false);
		} else if (e.getSource().equals(in.js2)) {
			dp.agregar( i +","+c+","+"2"+","+tf.getText()+","+"0");
			tf.setText("2");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js2.setEnabled(false);
		} else if (e.getSource().equals(in.js3)) {
			dp.agregar( i +","+c+","+"3"+","+tf.getText()+","+"0");
			tf.setText("3");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js3.setEnabled(false);
		} else if (e.getSource().equals(in.js4)) {
			dp.agregar( i+","+c+","+"4"+","+tf.getText()+","+"0");
			tf.setText("4");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js4.setEnabled(false);
		} else if (e.getSource().equals(in.js5)) {
			dp.agregar( i+","+c+","+"5"+","+tf.getText()+","+"0");
			tf.setText("5");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js5.setEnabled(false);
		} else if (e.getSource().equals(in.js6)) {
			dp.agregar( i+","+c+","+"6"+","+tf.getText()+","+"0");
			tf.setText("6");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js6.setEnabled(false);
		} else if (e.getSource().equals(in.js7)) {
			dp.agregar( i+","+c+","+"7"+","+tf.getText()+","+"0");
			tf.setText("7");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js7.setEnabled(false);
		} else if (e.getSource().equals(in.js8)) {
			dp.agregar( i+","+c+","+"8"+","+tf.getText()+","+"0");
			tf.setText("8");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js8.setEnabled(false);
		} else if (e.getSource().equals(in.js9)) {
			dp.agregar( i+","+c+","+"9"+","+tf.getText()+","+"0");
			tf.setText("9");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js9.setEnabled(false);
		} else if (e.getSource().equals(in.js0)) {
			dp.agregar( i+","+c+","+"-"+","+tf.getText()+","+"0");
			tf.setText("-");
			// Finalizacion del juego
						fin = true;
						for (int i2 = 0; i2 < 9; i2++) {
							for (int c2 = 0; c2 < 9; c2++) {
								if(cuadros[i2][c2].getText().contains("-")) {
									fin = false;
								}
								sudoku[i2][c2] = cuadros[i2][c2].getText();
								System.out.print(sudoku[i2][c2]+" ");
							}
							System.out.println();
						}
						if(fin) {
							int desicion = JOptionPane.showConfirmDialog(null, "Felicitaciones "+Nombre+" ¿desea salir?");
							if(desicion==0) {
								Pantalla p = new Pantalla();
								in.dispose();
							}else {
								
							}
							System.out.print("Fin del juego");
						}
						//
			in.js0.setEnabled(false);
		}
	}

	public void setValues(JTextField tf) {
		this.tf = tf;
	}
}
