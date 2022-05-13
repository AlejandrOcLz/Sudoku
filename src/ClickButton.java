import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ClickButton implements ActionListener {

	JTextField tf;
	Iniciado in;

	public ClickButton(Iniciado in) {
		this.in = in;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(in.js1)) {
			tf.setText("1");
			in.js1.setEnabled(false);
		} else if (e.getSource().equals(in.js2)) {
			tf.setText("2");
			in.js2.setEnabled(false);
		} else if (e.getSource().equals(in.js3)) {
			tf.setText("3");
			in.js3.setEnabled(false);
		} else if (e.getSource().equals(in.js4)) {
			tf.setText("4");
			in.js4.setEnabled(false);
		} else if (e.getSource().equals(in.js5)) {
			tf.setText("5");
			in.js5.setEnabled(false);
		} else if (e.getSource().equals(in.js6)) {
			tf.setText("6");
			in.js6.setEnabled(false);
		} else if (e.getSource().equals(in.js7)) {
			tf.setText("7");
			in.js7.setEnabled(false);
		} else if (e.getSource().equals(in.js8)) {
			tf.setText("8");
			in.js8.setEnabled(false);
		} else if (e.getSource().equals(in.js9)) {
			tf.setText("9");
			in.js9.setEnabled(false);
		} else if (e.getSource().equals(in.js0)) {
			tf.setText("-");
			in.js0.setEnabled(false);
		}
	}

	public void setValues(JTextField tf) {
		this.tf = tf;
	}
}
