package CommandPattern.Approach1.Alexa;

import CommandPattern.Approach1.Command;

public class AlexaOffCommand implements Command {
    Alexa alexa;

    public AlexaOffCommand(Alexa alexa) {
        this.alexa = alexa;
    }

    @Override
    public void execute() {
        this.alexa.off();
    }
}
