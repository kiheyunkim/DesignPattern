package com.kihyeonkim.pattern.state;

public class Off implements State {
	private static final Off instance = new Off();

	public static Off getInstance() {
		return instance;
	}

	private Off() {
	}

	@Override
	public void pushOnButton(Light light) {
		System.out.println("Off 상태에서 On을 눌러서 켜집니다.");
		light.setState(On.getInstance());
	}

	@Override
	public void pushOffButton(Light light) {
		System.out.println("Off 상태에서는 눌러도 반응이 없습니다");
	}

	@Override
	public void getCurrentState() {
		System.out.println("불이 꺼져 있습니다");
	}
}
