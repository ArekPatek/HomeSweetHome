package pl.poznan.ue.labs;

public class Lights implements Device{
	 
	private boolean isOn = false;

	

	public void on() {
		isOn = true;
		
	}

	public void off() {
		isOn = false;
		
	}

}
