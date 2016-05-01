
public class HomeTheatreFacade {
	
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper poper;
	
	public HomeTheatreFacade(Amplifier amp, 
			Tuner tuner, DvdPlayer dvd,
			CdPlayer cd, Projector projector,
			TheaterLights lights, Screen screen, PopcornPopper poper) {

		this.amp = amp;
		this.tuner = tuner;
		this.cd = cd;
		this.dvd = dvd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.poper = poper;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch a movie....");
		poper.on();
		poper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		System.out.println("\nShutting movie theater down...");
		poper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
