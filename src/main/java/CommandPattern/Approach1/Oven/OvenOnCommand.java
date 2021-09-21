package CommandPattern.Approach1.Oven;

import CommandPattern.Approach1.Command;

public class OvenOnCommand implements Command {
    Oven oven;

    public OvenOnCommand(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void execute() {
        this.oven.heatUp();
    }
}
