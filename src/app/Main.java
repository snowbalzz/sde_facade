package app;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ActionFacade actionFacade = new ActionFacade();

        actionFacade.watchMovie();
        actionFacade.endMovie();
        actionFacade.VibingSessionOn();
        actionFacade.VibingSessionOff();
        actionFacade.TurnRadioOn();
        actionFacade.TurnRadioOff();
    }
}
