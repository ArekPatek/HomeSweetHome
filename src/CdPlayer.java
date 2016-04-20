
public class CdPlayer implements Device{

	private boolean isOn;

	
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
	
	public void play(String cd){
		System.out.println("Playing "+cd);
	}

}
