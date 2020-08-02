package com.techlab.custom_frames;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTwo extends JFrame {
	private JLabel status;

	private FrameOne f;

	public void setF(FrameOne f) {
		this.f = f;
	}

	public void FrameTwoRun() {
		status = new JLabel();
		add(status);
		setVisible(true);
		setSize(500, 500);

		addWindowListener(new WindowAdapter() {

			@Override

			public void windowClosing(WindowEvent e) {
				f.setLabel("Exitting");
			}

		});
	}

	public void setLabel(String s) {
		status.setText(s);
	}
}
