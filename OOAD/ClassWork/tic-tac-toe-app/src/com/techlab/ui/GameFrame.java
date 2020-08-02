package com.techlab.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.techlab.tictactoe.TicTacToe;

public class GameFrame extends JFrame {
	private JPanel rowInput, columnInput;
	private JButton submit;
	private JLabel askRow, askColumn;
	private JTextField rowField, columnField;
	private TicTacToe game;
	private int row, column;

	private JPanel board;
	private JButton jb[][];

	private JLabel playerTurn;

	private JLabel[] players;

	public void setGame(TicTacToe t) {
		this.game = t;
	}

	public void createPanel() {
		rowInput = new JPanel();
		columnInput = new JPanel();

		JPanel panel1 = new JPanel();
		JLabel playerCount = new JLabel("Enter Player Count");
		// JTextField playerField = new JTextField(5);
		JLabel playerField = new JLabel("2");
		rowInput = new JPanel();
		columnInput = new JPanel();
		askRow = new JLabel("Enter Row");
		rowField = new JTextField(5);
		askColumn = new JLabel("Enter Column");
		columnField = new JTextField(5);
		submit = new JButton("Submit");
		playerTurn = new JLabel();
		submit.addActionListener(ae -> {
			game = new TicTacToe();
			game.setRow(Integer.parseInt(rowField.getText()));
			game.setColumn(Integer.parseInt(columnField.getText()));
			row = game.getRow();
			column = game.getColumn();
			int count = Integer.parseInt(playerField.getText());
			game.setPlayerCount(count);
			createBoard();
			game.startGame();
		});
		add(playerCount);
		add(playerField);
		rowInput.add(askRow);
		rowInput.add(rowField);
		columnInput.add(askColumn);
		columnInput.add(columnField);
		panel1.add(rowInput);
		panel1.add(columnInput);
		panel1.add(submit);
		add(panel1);
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}

	public void createPlayer() {

	}

	public void createBoard() {

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				if (!game.isWinnerDeclared()) {
					String[] index = ((AbstractButton) ae.getSource()).getText().split(",");
					int x = Integer.parseInt(index[0]);
					int y = Integer.parseInt(index[1]);
					game.enterInput(x, y);
					((AbstractButton) ae.getSource()).setText(game.getCellMark(x, y).toString());
					playerTurn.setText(game.getCurrentPlayerName());
				}

				else {
					playerTurn.setText(game.getWinnerPlayer().getPlayerName() + " has won ");
				}
			}
		};
		board = new JPanel();
		jb = new JButton[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				jb[i][j] =  new JButton(i + "," + j);
				jb[i][j].addActionListener(al);
				board.add(jb[i][j]);
			}
		}
		board.setLayout(new GridLayout(row, column));
		add(board);
	}

	public void create() {

		createPlayer();
		createPanel();

		add(playerTurn);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
