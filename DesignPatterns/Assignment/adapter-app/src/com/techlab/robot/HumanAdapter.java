package com.techlab.robot;

import com.techlab.human.LivingBeing;

public class HumanAdapter implements ArtificialBeing {
	private LivingBeing human;

	public HumanAdapter(LivingBeing human) {
		this.human = human;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		human.talk();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		human.walk();
	}

}
