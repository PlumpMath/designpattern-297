package com.gtang.data.radio;

public class Radio {
	
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 10;
	public static final int DEFAULT_VOLUME = 5;
	
	public Radio () {
		on = false;
		volume = DEFAULT_VOLUME;
	}
	
	public boolean isOn () {
		return on;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void on () {
		on = true;
		System.out.println("Radio now on, volume level " + getVolume());
	}
	
	public void off () {
		on = false;
		System.out.println("Radio now off");
	}
	
	public void volumeUp () {
		if(isOn()){
			if (getVolume() < MAX_VOLUME) {
				volume ++;
				System.out.println("Volume turned up to level " + getVolume());
			}
		}
	}
	
	public void volumeDown () {
		if(isOn()){
			if (getVolume() > MIN_VOLUME) {
				volume --;
				System.out.println("Volume turned down to level " + getVolume());
			}
		}
	}
	
	private boolean on;
	private int volume;
	
}
