package com.techlab.custom_frames;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameOne extends JFrame {

	private JLabel status;

	public FrameOne() {
		status = new JLabel();
		add(status);
		setVisible(true);
		setSize(500, 500);
	}

	public void setLabel(String s) {
		status.setText(s);
	}
}
