package com.kihyeonkim.pattern.strategy.move;

public class BasicMoving implements Transportation{
	@Override
	public void move() {
		System.out.println("Basic Moving");
	}
}
