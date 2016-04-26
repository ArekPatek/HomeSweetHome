package pl.poznan.ue.labs;

public class Amplifier implements Device {
	
 private boolean isOn = false;
	
 public void setStereoSound(){
	 
 }
 public int setVolume(int level){
	return 0;
	 
 }
 public void setTuner(Tuner t){
	 
 }
 public void setDvd(DvdPlayer dvd){
	 
 }
 public void setCd(CdPlayer cd){
	 
 }

public void on() {
	isOn = true;
	
}

public void off() {
	isOn = false;
	
}
}
