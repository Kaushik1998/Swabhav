package com.techlab.two_buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoButtons {
	public TwoButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Click Me");
		JButton button2 = new JButton("Click Me");
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setText("Blue");
				button2.setBackground(Color.BLUE);
				
				button1.setText("Red");
				button1.setBackground(Color.RED);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setText("Red");
				button2.setBackground(Color.RED);
				
				button1.setText("Blue");
				button1.setBackground(Color.BLUE);
			}
		});
		
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new TwoButtons();
	}
}
