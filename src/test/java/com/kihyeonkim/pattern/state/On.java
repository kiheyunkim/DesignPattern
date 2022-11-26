package com.kihyeonkim.pattern.state;

public class On implements State {
	private static final On instance = new On();

	public static On getInstance() {
		return instance;
	}

	private On() {

	}

	@Override
	public void pushOnButton(Light light) {
		System.out.println("On 상태에서는 눌러도 반응이 없습니다");
	}

	@Override
	public void pushOffButton(Light light) {
		System.out.println("On 상태에서는 Off를 눌러서 꺼집니다.");
		light.setState(Off.getInstance());
	}

	@Override
	public void getCurrentState() {
		System.out.println("불이 켜져 있습니다");
	}
}
