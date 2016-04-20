
public class Tuner implements Device {
	
	private boolean am;
	private boolean fm;
	private double frequency;

	public void setAm(){
		am = true;
	}
	
	public void setFm(){
		fm = true;
	}
	
	public void setFrequency(double frequency){
		this.frequency=frequency;
	}
	
}
