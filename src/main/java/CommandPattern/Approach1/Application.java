package CommandPattern.Approach1;

import CommandPattern.Approach1.Alexa.Alexa;
import CommandPattern.Approach1.Alexa.AlexaOffCommand;
import CommandPattern.Approach1.Alexa.AlexaOnCommand;
import CommandPattern.Approach1.Light.Light;
import CommandPattern.Approach1.Light.LightOffCommand;
import CommandPattern.Approach1.Light.LightOnCommand;
import CommandPattern.Approach1.Oven.Oven;
import CommandPattern.Approach1.Oven.OvenOffCommand;
import CommandPattern.Approach1.Oven.OvenOnCommand;

import java.util.ArrayList;
import java.util.List;

public class Application {
    //    Advantage: Everything is injected and hence the client can change behavior easily.
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        Alexa alexa = new Alexa();
        Oven oven = new Oven();
        Light light = new Light();
        commands.add(new AlexaOnCommand(alexa));
        commands.add(new AlexaOffCommand(alexa));
        commands.add(new LightOnCommand(light));
        commands.add(new LightOffCommand(light));
        commands.add(new OvenOnCommand(oven));
        commands.add(new OvenOffCommand(oven));

        Remote remote = new Remote(commands);
        remote.push(1);
        remote.push(3);
        remote.push(4);
        remote.push(2);

    }
}
