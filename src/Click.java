import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class Click implements MouseListener {

	JTextField cuadro;
	JTextField[][] cuadros;

	int i, c;
	
	JButton js1;
	JButton js2;
	JButton js3;
	JButton js4;
	JButton js5;
	JButton js6;
	JButton js7;
	JButton js8;
	JButton js9;

	JLabel jsugerencias1;


	public Click(JTextField cuadro, JTextField[][] cuadros, int i, int c, JLabel jsugerencias1, JButton js1, JButton js2, JButton js3,JButton js4,JButton js5,JButton js6,JButton js7,JButton js8,JButton js9) {
		this.cuadro = cuadro;
		this.cuadros = cuadros;
		this.i = i;
		this.c = c;
		this.jsugerencias1 = jsugerencias1;
		this.js1 = js1;
		this.js2 = js2;
		this.js3 = js3;
		this.js4 = js4;
		this.js5 = js5;
		this.js6 = js6;
		this.js7 = js7;
		this.js8 = js8;
		this.js9 = js9;
		
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
				js1.setEnabled(true);
				js1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js1.setEnabled(false);
						cuadro.setText("1");
					}
				});
				
				
				ver += "1 ";
				
			}else {
				js1.setEnabled(false);
			}

			if (!sug.contains("2")) {
				js2.setEnabled(true);
				js2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js2.setEnabled(false);
						cuadro.setText("2");
					}
				});
				

				ver += "2 ";
			}else {
				js2.setEnabled(false);
			}
			
			if (!sug.contains("3")) {
				js3.setEnabled(true);
				js3.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js3.setEnabled(false);
						cuadro.setText("3");
					}
				});
				
				
				ver += "3 ";
			}else {
				js3.setEnabled(false);
			}
			
			if (!sug.contains("4")) {
				js4.setEnabled(true);
				js4.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js4.setEnabled(false);
						cuadro.setText("4");
					}
				});
				
				
				ver += "4 ";
			}else {
				js4.setEnabled(false);
			}
			
			if (!sug.contains("5")) {
				js5.setEnabled(true);
				js5.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js5.setEnabled(false);
						cuadro.setText("5");
					}
				});
				 
				ver += "5 ";
			}else {
				js5.setEnabled(false);
			}
			
			if (!sug.contains("6")) {
				js6.setEnabled(true);
				js6.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js6.setEnabled(false);
						cuadro.setText("6");
					}
				});
				
				ver += "6 ";
			}else {
				js6.setEnabled(false);
			}
			
			if (!sug.contains("7")) {
				js7.setEnabled(true);
				js7.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js7.setEnabled(false);
						cuadro.setText("7");
					}
				});
				
				ver += "7 ";
			}else {
				js7.setEnabled(false);
			}
			
			if (!sug.contains("8")) {
				js8.setEnabled(true);
				js8.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js8.setEnabled(false);
						cuadro.setText("8");
					}
				});
				
				ver += "8 ";
			}else {
				js8.setEnabled(false);
			}
			
			if (!sug.contains("9")) {
				js9.setEnabled(true);
				js9.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						js9.setEnabled(false);
						cuadro.setText("9");
					}
				});
				
				ver += "9 ";
			}else {
				js9.setEnabled(false);
			}
			
			
			System.out.println(sug);

			
			jsugerencias1.setText(ver);
		}
		
		
		
	}

}
