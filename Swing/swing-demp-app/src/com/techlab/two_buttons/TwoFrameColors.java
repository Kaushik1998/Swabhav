package com.techlab.two_buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoFrameColors {

	public TwoFrameColors() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("BLUE");
		JButton button2 = new JButton("RED");

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.BLUE);
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.RED);
			}
		});

		frame.add(button1);
		frame.add(button2);
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TwoFrameColors();
	}

}
