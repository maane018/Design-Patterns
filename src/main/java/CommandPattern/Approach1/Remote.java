package CommandPattern.Approach1;

import java.util.List;

public class Remote {
    List<Command> commands;

    public Remote(List<Command> commands) {
        this.commands = commands;
    }

    public void push(int buttonNumber) {
        commands.get(buttonNumber).execute();
    }
}
