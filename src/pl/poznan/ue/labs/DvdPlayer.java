package pl.poznan.ue.labs;

public class DvdPlayer implements Device {
	
private boolean isOn = false;
private boolean isMusicPlaying = false;
	
 public void eject(){
	 
	 System.out.println("Dvd ejected");
	 
 }
 public String play(String dvd){
	 
	 isMusicPlaying = true;	 
	 return "Dvd "+dvd+" is being played.";
	 
 }
 public void stop(){
	 isMusicPlaying = false;
 }
 public void pause(){
	 isMusicPlaying = false;
 }
 
public void on() {
	isOn = true;
		
}

public void off() {
	isOn = false;
		
}

}
