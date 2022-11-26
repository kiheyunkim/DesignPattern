package com.kihyeonkim.pattern.decorator;

public class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffeeDecorator) {
		super(coffeeDecorator);
	}

	@Override
	public void make() {
		super.make();
		this.addSugar();
	}

	private void addSugar() {
		System.out.println("설탕 첨가");
	}
}
