package pl.poznan.ue.labs;

public class Tuner implements Device {
	
	private boolean am;
	private boolean fm;
	private double frequency;
	private boolean isOn = false;

	public void setAm(){
		fm = false;
		am = true;
	}
	
	public void setFm(){
		am = false;
		fm = true;
	}
	
	public void setFrequency(double frequency){
		this.frequency=frequency;
	}

	@Override
	public void on() {
		isOn = true;
	}

	@Override
	public void off() {
		isOn = false;
	}
	
}
