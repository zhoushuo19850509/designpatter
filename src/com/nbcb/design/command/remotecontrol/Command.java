package com.nbcb.design.command.remotecontrol;

public interface Command {
    public void execute();
    public void undo();
}
