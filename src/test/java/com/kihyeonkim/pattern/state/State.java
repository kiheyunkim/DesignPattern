package com.kihyeonkim.pattern.state;

public interface State {
	void pushOnButton(Light light);

	void pushOffButton(Light light);

	void getCurrentState();
}
