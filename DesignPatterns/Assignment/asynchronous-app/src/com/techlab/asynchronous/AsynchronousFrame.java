package com.techlab.asynchronous;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsynchronousFrame extends JFrame implements ActionListener, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton displayTime, helloButton;
	Thread t1, t2;

	public AsynchronousFrame() {
		t1 = new Thread(this);
	}

	public void createFrame() {
		displayTime = new JButton("Display Time");
		helloButton = new JButton("Hello");

		add(displayTime);
		add(helloButton);

		displayTime.addActionListener(this);
		helloButton.addActionListener(this);

		setLayout(new GridLayout());
		setVisible(true);
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == displayTime) {
			t1.start();

		} else if (e.getSource() == helloButton) {
			JOptionPane.showMessageDialog(this, "Hello Button");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(LocalDateTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}

}
