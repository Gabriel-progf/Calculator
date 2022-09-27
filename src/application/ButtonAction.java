// NOME: Gabriel Oliveira de Macedo
// RA: F203808

package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonAction implements ActionListener {
	
	
	private JTextField resp;
	private JTextField t1;
	private JTextField t2;
	
	

	public ButtonAction(JTextField resp, JTextField t1, JTextField t2) {
		this.resp = resp;
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Locale.setDefault(Locale.US);
		
		int response = Integer.parseInt(resp.getText());
		double n1 = Double.parseDouble(t1.getText());
		double n2 = Double.parseDouble(t2.getText());
		double result = 0;
			
		if (response == 1) {
			result = n1 + n2;
		}
		if (response == 2) {
			result = n1 - n2;
		}
		if (response == 3) {
			result = n1 * n2;
		}
		if (response == 4) {
			if (n2 == 0.0) {
				result = 0.0;
			} else {
				result = n1 / n2;				
			}
		}
		if (response == 5) {
			result = Math.pow(n1, n2);
		}
		
		
			
		JOptionPane.showMessageDialog(null,"Resultado da operaçao é: " + result);
		
	}	

}
