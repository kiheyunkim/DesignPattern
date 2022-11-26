package com.kihyeonkim.pattern.state;

public class Light {
	private State state;

	public Light() {
		this.state = Off.getInstance();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void pushOnButton() {
		state.pushOnButton(this);
	}

	public void pushOffButton() {
		state.pushOffButton(this);
	}

	public void getCurrentState() {
		state.getCurrentState();
	}
}
