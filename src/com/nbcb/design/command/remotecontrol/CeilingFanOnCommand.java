package com.nbcb.design.command.remotecontrol;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.on();
    }

    @Override
    public void undo() {
        this.ceilingFan.off();
    }
}
