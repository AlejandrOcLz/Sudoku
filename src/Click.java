import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class Click implements MouseListener {

	JTextField cuadro;
	JTextField[][] cuadros;

	JPopupMenu jpsugerencias;

	int i, c;

	JFrame in;
	JLabel jsugerencias1;
	JMenuItem uno = new JMenuItem("1");
	JMenuItem dos = new JMenuItem("2");
	JMenuItem tres = new JMenuItem("3");
	JMenuItem cuatro = new JMenuItem("4");
	JMenuItem cinco = new JMenuItem("5");
	JMenuItem seis = new JMenuItem("6");
	JMenuItem siete = new JMenuItem("7");
	JMenuItem ocho = new JMenuItem("8");
	JMenuItem nueve = new JMenuItem("9");

	public Click(JTextField cuadro, JTextField[][] cuadros, int i, int c, JPopupMenu jpsugerencias, JFrame in, JLabel jsugerencias1) {
		this.cuadro = cuadro;
		this.cuadros = cuadros;
		this.in = in;
		this.i = i;
		this.c = c;
		this.jpsugerencias = jpsugerencias;
		this.jsugerencias1 = jsugerencias1;
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			
			
			String ver = "";
			//jpsugerencias.
			jpsugerencias.show(in, arg0.getX(), arg0.getY());
			System.out.println("i = " + i + " c = " + c);
			String sug = "";
			for (int i1 = 0; i1 < 9; i1++) {
				sug += cuadros[i][i1].getText();
				sug += cuadros[i1][c].getText();
			}
			//
			if(i < 3 && c < 3) {
				for(int i1 = 0; i1 < 3; i1++){
					for(int c1 = 0; c1 < 3; c1++){
						sug += cuadros[i1][c1].getText();
					}
				}
			}else {
				if((i > 2 && c > 2) && (i < 6 && c < 6)) {
					for(int i1 = 3; i1 < 6; i1++){
						for(int c1 = 3; c1 < 6; c1++){
							sug += cuadros[i1][c1].getText();
						}
					}
				}else {
					if(i > 5 && c > 5) {
						for(int i1 = 6; i1 < 9; i1++){
							for(int c1 = 6; c1 < 9; c1++){
								sug += cuadros[i1][c1].getText();
							}
						}
					}else {
						if(i < 3 && (c > 2 && c < 6 )) {
							for(int i1 = 0; i1 < 3; i1++){
								for(int c1 = 3; c1 < 6; c1++){
									sug += cuadros[i1][c1].getText();
								}
							}
						}else {
							if(i < 3 && c > 5) {
								for(int i1 = 0; i1 < 3; i1++){
									for(int c1 = 6; c1 < 9; c1++){
										sug += cuadros[i1][c1].getText();
									}
								}
							}else {
								if((i > 2 && i < 6)&& c < 3) {
									for(int i1 = 3; i1 < 6; i1++){
										for(int c1 = 0; c1 < 3; c1++){
											sug += cuadros[i1][c1].getText();
										}
									}
								}else {
									if((i > 2 && i < 6) && c > 5) {
										for(int i1 = 3; i1 < 6; i1++){
											for(int c1 = 6; c1 < 9; c1++){
												sug += cuadros[i1][c1].getText();
											}
										}
									}else {
										if(i > 5 && c < 3) {
											for(int i1 = 6; i1 < 9; i1++){
												for(int c1 = 0; c1 < 3; c1++){
													sug += cuadros[i1][c1].getText();
												}
											}
										}else {
											if(i > 5 && (c > 2 && c < 6 )) {
												for(int i1 = 6; i1 < 9; i1++){
													for(int c1 = 3; c1 < 6; c1++){
														sug += cuadros[i1][c1].getText();
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			
			//
			
			if (!sug.contains("1")) {
				uno.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("1");
						
					}
				});
				jpsugerencias.add(uno);
				
				ver += "1 ";
				
			}

			if (!sug.contains("2")) {
				dos.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("2");
						
					}
				});
				jpsugerencias.add(dos);
				ver += "2 ";
			}
			if (!sug.contains("3")) {
				tres.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("3");
						
					}
				});
				jpsugerencias.add(tres);
				ver += "3 ";
			}
			if (!sug.contains("4")) {
				cuatro.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("4");
						
					}
				});
				jpsugerencias.add(cuatro);
				ver += "4 ";
			}
			if (!sug.contains("5")) {
				cinco.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("5");
						
					}
				});
				jpsugerencias.add(cinco);
				ver += "5 ";
			}
			if (!sug.contains("6")) {
				seis.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("6");
						
					}
				});
				jpsugerencias.add(seis);
				ver += "6 ";
			}
			if (!sug.contains("7")) {
				siete.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("7");
						
					}
				});
				jpsugerencias.add(siete);
				ver += "7 ";
			}
			if (!sug.contains("8")) {
				ocho.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("8");
						
					}
				});
				jpsugerencias.add(ocho);
				ver += "8 ";
			}
			if (!sug.contains("9")) {
				nueve.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						cuadro.setText("9");
						
					}
				});
				jpsugerencias.add(nueve);
				ver += "9 ";
			}
			
			System.out.println(sug);
			
			jsugerencias1.setText(ver);
		}
		
	}

}
