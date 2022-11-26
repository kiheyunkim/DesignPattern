package com.kihyeonkim.pattern.strategy.move;

public class Flying implements Transportation {
	@Override
	public void move() {
		System.out.println("Flying");
	}
}
