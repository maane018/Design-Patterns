package CommandPattern.Approach1.Oven;

import CommandPattern.Approach1.Command;

public class OvenOffCommand implements Command {
    Oven oven;

    public OvenOffCommand(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void execute() {
        this.oven.heatDown();
    }
}
