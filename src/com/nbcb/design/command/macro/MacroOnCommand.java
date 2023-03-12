package com.nbcb.design.command.macro;

import com.nbcb.design.command.remotecontrol.Command;

public class MacroOnCommand implements Command {

    private Command[] onCommands;

    public MacroOnCommand(Command[] onCommands) {
        this.onCommands = onCommands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < onCommands.length; i++) {
            Command onCommand = onCommands[i];
            onCommand.execute();
        }

    }

    @Override
    public void undo() {
        for (int i = 0; i < onCommands.length; i++) {
            Command onCommand = onCommands[i];
            onCommand.undo();
        }

    }
}
