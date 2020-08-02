package com.techlab.ui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.techlab.tictactoe.TicTacToe;

public class AskInput extends JPanel {

	private JPanel rowInput, columnInput;
	private JButton submit;
	private JLabel askRow, askColumn;
	private JTextField rowField, columnField;
	private TicTacToe game;
	private int row, column;

	public void create() {
		rowInput = new JPanel();
		columnInput = new JPanel();
		askRow = new JLabel("Enter Row");
		rowField = new JTextField(5);
		askColumn = new JLabel("Enter Column");
		columnField = new JTextField(5);
		submit = new JButton("Submit");

		rowInput.add(askRow);
		rowInput.add(rowField);
		columnInput.add(askColumn);
		columnInput.add(columnField);
		add(rowInput);
		add(columnInput);
		add(submit);
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}
}
