package com.techlab.automobile;

public class AutoMobileFactory {

	public static AutoMobileFactory factory;

	public static AutoMobileFactory getInstance() {
		if (factory == null) {
			factory = new AutoMobileFactory();
		}
		return factory;
	}

	private AutoMobileFactory() {

	}

	public IAutoMobile make(AutoType a) {
		switch (a) {
		case AUDI:
			return new Audi();
		case BMW:
			return new Bmw();
		case TESLA:
			return new Tesla();
		default:
			return null;
		}
	}
}
