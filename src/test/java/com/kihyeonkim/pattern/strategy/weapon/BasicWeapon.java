package com.kihyeonkim.pattern.strategy.weapon;

public class BasicWeapon implements Weapon {
	@Override
	public void attack() {
		System.out.println("Basic Attack");
	}
}
