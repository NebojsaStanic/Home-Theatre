
public class HomeTheaterTest {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper poper = new PopcornPopper();
		
		HomeTheatreFacade homeTheater = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, lights, screen, poper);
		homeTheater.watchMovie("Raider of the Lost Ark");
		homeTheater.endMovie();

	}

}
