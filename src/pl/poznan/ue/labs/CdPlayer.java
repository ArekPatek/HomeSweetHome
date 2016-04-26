package pl.poznan.ue.labs;

public class CdPlayer implements Device{

	private boolean isOn = false;
	private boolean isMusicPlaying = false;

	
	@Override
	public void on() {
		isOn=true;
	}

	@Override
	public void off() {
		isOn=false;
	}
	
	public void eject(){
		System.out.println("Cd Player eject CD.");
	}
	
	public String play(String cd){
		return "Playing "+cd;
	}
	
	 public void stop(){
		 isMusicPlaying = false;
	 }
	 public void pause(){
		 isMusicPlaying = false;
	 }

}
