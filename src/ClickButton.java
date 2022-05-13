import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ClickButton implements ActionListener {

	JTextField tf;
	Iniciado in;
	Datos dp;
	public int i;
	public int c;

	public ClickButton(Iniciado in, Datos dp) {
		this.in = in;
		this.dp = dp;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(in.js1)) {
			dp.agregar( i +","+c+","+"1"+","+tf.getText()+","+"0");
			tf.setText("1");
			in.js1.setEnabled(false);
		} else if (e.getSource().equals(in.js2)) {
			dp.agregar( i +","+c+","+"2"+","+tf.getText()+","+"0");
			tf.setText("2");
			in.js2.setEnabled(false);
		} else if (e.getSource().equals(in.js3)) {
			dp.agregar( i +","+c+","+"3"+","+tf.getText()+","+"0");
			tf.setText("3");
			in.js3.setEnabled(false);
		} else if (e.getSource().equals(in.js4)) {
			dp.agregar( i+","+c+","+"4"+","+tf.getText()+","+"0");
			tf.setText("4");
			in.js4.setEnabled(false);
		} else if (e.getSource().equals(in.js5)) {
			dp.agregar( i+","+c+","+"5"+","+tf.getText()+","+"0");
			tf.setText("5");
			in.js5.setEnabled(false);
		} else if (e.getSource().equals(in.js6)) {
			dp.agregar( i+","+c+","+"6"+","+tf.getText()+","+"0");
			tf.setText("6");
			in.js6.setEnabled(false);
		} else if (e.getSource().equals(in.js7)) {
			dp.agregar( i+","+c+","+"7"+","+tf.getText()+","+"0");
			tf.setText("7");
			in.js7.setEnabled(false);
		} else if (e.getSource().equals(in.js8)) {
			dp.agregar( i+","+c+","+"8"+","+tf.getText()+","+"0");
			tf.setText("8");
			in.js8.setEnabled(false);
		} else if (e.getSource().equals(in.js9)) {
			dp.agregar( i+","+c+","+"9"+","+tf.getText()+","+"0");
			tf.setText("9");
			in.js9.setEnabled(false);
		} else if (e.getSource().equals(in.js0)) {
			dp.agregar( i+","+c+","+"-"+","+tf.getText()+","+"0");
			tf.setText("-");
			in.js0.setEnabled(false);
		}
	}

	public void setValues(JTextField tf) {
		this.tf = tf;
	}
}
