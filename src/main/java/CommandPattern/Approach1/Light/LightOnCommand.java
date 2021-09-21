package CommandPattern.Approach1.Light;

import CommandPattern.Approach1.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
