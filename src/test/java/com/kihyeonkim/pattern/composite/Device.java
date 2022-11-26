package com.kihyeonkim.pattern.composite;

public abstract class Device {
	private final int price;
	private final int powerWatt;

	public Device(int price, int powerWatt) {
		this.price = price;
		this.powerWatt = powerWatt;
	}

	public int getPrice() {
		return price;
	}

	public int getPowerWatt() {
		return powerWatt;
	}
}
