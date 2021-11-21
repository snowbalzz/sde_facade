package app;

public class ActionFacade {

    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;


    public ActionFacade (){
        amp = new Amplifier("Top-O-Line Amplifier");
        tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        cd = new CdPlayer("Top-O-Line CD Player", amp);
        projector = new Projector("Top-O-Line Projector", dvd);
        lights = new TheaterLights("Theater Ceiling Lights");
        screen = new Screen("Theater Screen");
        popper = new PopcornPopper("Popcorn Popper");
    }

    public void watchMovie(){
        //Popcorn
        popper.on();
        popper.pop();

        //Lights
        lights.dim(90);

        //Screen & Projector
        screen.down();
        projector.on();
        projector.wideScreenMode();

        //Amp
        amp.on();
        amp.setSurroundSound();
        amp.setDvd(dvd);
        amp.setVolume(5);

        //DVD
        dvd.on();
        dvd.play("Neon Genesis Evangelion: The End of Evangelion");

        System.out.println("Enjoy your movie!");
    }

    public void endMovie(){
        //Popcorn
        popper.off();

        //Light
        lights.on();

        //Screen & Projector
        screen.down();
        projector.off();

        //Amp
        amp.off();

        //DVD
        dvd.stop();
        dvd.eject();
        dvd.off();

        System.out.println("No more Netflix and Chill!!");
    }

    public void VibingSessionOn(){
        //Light
        lights.on();

        //Amp
        amp.on();
        amp.setCd(cd);
        amp.setVolume(5);
        amp.setStereoSound();

        //CD
        cd.on();
        cd.play("Oliver Tree - Bury Me Alive");

        System.out.println("Listen to my mix-tape!");
    }

    public void VibingSessionOff(){
        //Amp
        amp.off();
        amp.setCd(cd);

        //CD
        cd.eject();
        cd.off();

        System.out.println("It seems you do not like my mix-tape!");
    }

    public void TurnRadioOn(){
        //Tuner
        tuner.on();
        tuner.setFrequency(104.3);

        //Amp
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);

        System.out.println("Most popular station in Latvia Playing!");
    }

    public void TurnRadioOff(){
        //Tuner
        tuner.off();

        //Amp
        amp.off();

        System.out.println("No Radio!");
    }

}
