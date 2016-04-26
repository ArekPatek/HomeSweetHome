package pl.poznan.ue.labs;

public class DvdPlayer implements Device {
	
private boolean isOn = false;
	
 public void eject(){
	 
	 System.out.println("Dvd ejected");
	 
 }
 public String play(String dvd){
	 
	 return "Dvd "+dvd+" is being played.";
	 
 }
 public void stop(){
	 
 }
 public void pause(){
	 
 }
 
public void on() {
	isOn = true;
		
}

public void off() {
	isOn = false;
		
}

}
