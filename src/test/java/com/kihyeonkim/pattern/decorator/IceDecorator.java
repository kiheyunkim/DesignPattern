package com.kihyeonkim.pattern.decorator;

public class IceDecorator extends CoffeeDecorator {
	public IceDecorator(Coffee coffeeDecorator) {
		super(coffeeDecorator);
	}

	@Override
	public void make() {
		super.make();
		this.addIce();
	}

	private void addIce() {
		System.out.println("얼음 추가");
	}
}
