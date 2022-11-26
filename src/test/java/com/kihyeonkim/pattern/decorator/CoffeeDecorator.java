package com.kihyeonkim.pattern.decorator;

public abstract class CoffeeDecorator extends Coffee {
	private final Coffee coffeeDecorator;

	public CoffeeDecorator(Coffee coffeeDecorator) {
		this.coffeeDecorator = coffeeDecorator;
	}

	public void make() {
		coffeeDecorator.make();
	}
}
