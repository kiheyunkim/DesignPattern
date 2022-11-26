package com.kihyeonkim.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	private final List<Device> deviceList = new ArrayList<>();

	public void addDevice(Device device) {
		deviceList.add(device);
	}

	public int getTotalPower() {
		return deviceList.stream().mapToInt(Device::getPowerWatt).sum();
	}

	public int getTotalPrice() {
		return deviceList.stream().mapToInt(Device::getPrice).sum();
	}
}
