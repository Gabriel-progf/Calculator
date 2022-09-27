// NOME: Gabriel Oliveira de Macedo
// RA: F203808

package application;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Program {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		
		frame.setSize(600,200);
		frame.setLocation(100,100);
		frame.setTitle("Janela Principal");
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		
		
		p.add(new JLabel("Digite 1 p/ adição. 2 p/ subtração. 3 p/ multiplicação. 4 p/ divisão. 5 p/ pontênciação: "));
		
		JTextField resp = new JTextField(1);
		p.add(resp);

		JLabel l1 = new JLabel("Primeiro número decimal: ");
		p.add(l1);
		JTextField t1 = new JTextField(10);
		p.add(t1);
		
		JLabel l2 = new JLabel("Segundo número decimal: ");
		p.add(l2);
		JTextField t2 = new JTextField(10);
		p.add(t2);
		
		
		
		
		JButton b = new JButton("OK");
		
		ButtonAction action = new ButtonAction(resp,t1, t2);
		b.addActionListener(action);
		p.add(b);
		
		
		
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
