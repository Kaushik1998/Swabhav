package com.techlab.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondFrame {
	public SecondFrame(){
		JFrame frame = new JFrame("Second Frame");
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JLabel label=new JLabel("Kaushik");
		button.setText("Second Frame");
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
