package pl.poznan.ue.labs;

public class Projector implements Device{
	
 private boolean isOn = false;
 private boolean wideScreenMode = false;
 private boolean tvMode = false;
 private DvdPlayer dvdPlayer;
 
 	public void wideScreenMode(){
 		wideScreenMode = true;
 	}
 	
 	public void tvMode(){
 		tvMode = true;
 	}

	public void on() {
		isOn = true;
		
	}

	public void off() {
		isOn = false;
		
	}
	

}
