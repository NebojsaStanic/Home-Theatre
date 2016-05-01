
public class Amplifier {
	
	int volume;

	public void on() {
		System.out.println("Amplifier is on");
		
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Setting dvd: " + dvd);
		
	}

	public void setVolume(int i) {
		volume = i;
		System.out.println("Amplifier volume is " + volume);
		
	}

	public void off() {
		System.out.println("Amplifier is off");
		
	}

}
