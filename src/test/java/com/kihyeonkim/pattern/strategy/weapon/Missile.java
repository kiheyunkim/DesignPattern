package com.kihyeonkim.pattern.strategy.weapon;

public class Missile implements Weapon {
	@Override
	public void attack() {
		System.out.println("launch Missile");
	}
}
