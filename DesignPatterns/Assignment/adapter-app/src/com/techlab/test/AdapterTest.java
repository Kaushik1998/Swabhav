package com.techlab.test;

import com.techlab.human.Human;
import com.techlab.human.LivingBeing;
import com.techlab.robot.ArtificialBeing;
import com.techlab.robot.HumanAdapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivingBeing human = new Human();
		ArtificialBeing robot = new HumanAdapter(human);
		robot.sound();
		robot.move();
	}

}
