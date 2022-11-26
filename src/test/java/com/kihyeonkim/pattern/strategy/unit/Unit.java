package com.kihyeonkim.pattern.strategy.unit;

import com.kihyeonkim.pattern.strategy.move.BasicMoving;
import com.kihyeonkim.pattern.strategy.move.Transportation;
import com.kihyeonkim.pattern.strategy.weapon.BasicWeapon;
import com.kihyeonkim.pattern.strategy.weapon.Weapon;

public abstract class Unit {
	private final String name;
	private Transportation transportation;
	private Weapon weapon;

	public Unit(String name) {
		this.name = name;
		this.transportation = new BasicMoving();
		this.weapon = new BasicWeapon();
	}

	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void move() {
		transportation.move();
	}

	public void attack() {
		weapon.attack();
	}

	public String getName() {
		return name;
	}
}
