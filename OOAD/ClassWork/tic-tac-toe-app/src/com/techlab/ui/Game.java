package com.techlab.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlab.tictactoe.TicTacToe;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe t=new TicTacToe();
		GameFrame gf=new GameFrame();
		//gf.setGame(t);
		gf.create();
		//System.out.println(t.getColumn());
	}

}
