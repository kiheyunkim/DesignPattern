package com.kihyeonkim.pattern.strategy.move;

public class Walking implements Transportation {
	@Override
	public void move() {
		System.out.println("Walking");
	}
}
