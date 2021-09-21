package CommandPattern.Approach1.Alexa;

import CommandPattern.Approach1.Command;

public class AlexaOnCommand implements Command {
    Alexa alexa;

    public AlexaOnCommand(Alexa alexa) {
        this.alexa = alexa;
    }

    @Override
    public void execute() {
        this.alexa.on();
    }
}