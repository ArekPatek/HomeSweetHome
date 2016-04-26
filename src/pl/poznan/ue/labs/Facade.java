package pl.poznan.ue.labs;

public class Facade {
	
	Amplifier amplifier = new Amplifier();
	Tuner tuner = new Tuner();
	CdPlayer cdPlayer = new CdPlayer();
	DvdPlayer dvdPlayer = new DvdPlayer();
	Projector projector = new Projector();
	Lights lights = new Lights();
	
	//example of facade method that turns every device on
	public void turnAllOn(){
		amplifier.on();
		tuner.on();
		cdPlayer.on();
		dvdPlayer.on();
		projector.on();
		lights.on();
	}

}
