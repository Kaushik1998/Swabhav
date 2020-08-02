package com.techlab.strategy;

public class Context {
	public CalculateStrategy cs;

	public Context(CalculateStrategy cs) {
		this.cs = cs;
	}

	public double calculate(double a, double b) {
		return cs.calculate(a, b);
	}
}
