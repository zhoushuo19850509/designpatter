package com.nbcb.design.command.macro;

import com.nbcb.design.command.remotecontrol.Command;

public class MacroOffCommand implements Command {

    private Command[] offCommands;

    public MacroOffCommand(Command[] offCommands) {
        this.offCommands = offCommands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < offCommands.length; i++) {
            Command onCommand = offCommands[i];
            onCommand.execute();
        }

    }

    @Override
    public void undo() {
        for (int i = 0; i < offCommands.length; i++) {
            Command onCommand = offCommands[i];
            onCommand.undo();
        }

    }
}
