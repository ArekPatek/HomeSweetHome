package pl.poznan.ue.labs;

public class Amplifier implements Device {
	
 private boolean isOn = false;
 private boolean isStereo = false;
 private Integer volume=0;
 private Tuner tuner;
 private DvdPlayer dvdPlayer;
 private CdPlayer cdPlayer;
	
 public void setStereoSound(){
	 isStereo=true;
 }
 public void setVolume(Integer level){
	volume = level;
	 
 }
 public void setTuner(Tuner t){
	 tuner = t;
	 
 }
 public void setDvd(DvdPlayer dvd){
	 dvdPlayer = dvd;
 }
 public void setCd(CdPlayer cd){
	 cdPlayer = cd;
	 
 }

public void on() {
	isOn = true;
	
}

public void off() {
	isOn = false;
	
}
}
