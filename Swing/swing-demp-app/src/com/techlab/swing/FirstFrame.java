package com.techlab.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstFrame implements ActionListener {
	public FirstFrame() {
		JFrame frame = new JFrame("First Frame");
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.setText("First Frame");
		panel.add(button);
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.addActionListener(this);
	}

	public static void main(String[] args) {
		new FirstFrame();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		new SecondFrame();
	}
}
