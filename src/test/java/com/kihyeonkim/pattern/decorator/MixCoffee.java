package com.kihyeonkim.pattern.decorator;

public class MixCoffee extends Coffee {
	@Override
	public void make() {
		this.addMixCoffee();
	}

	private void addMixCoffee() {
		System.out.println("믹스 커피 첨가");
	}
}
