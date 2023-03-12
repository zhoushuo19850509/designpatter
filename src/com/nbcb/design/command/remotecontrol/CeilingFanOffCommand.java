package com.nbcb.design.command.remotecontrol;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.off();
    }

    @Override
    public void undo() {
        this.ceilingFan.on();
    }
}
