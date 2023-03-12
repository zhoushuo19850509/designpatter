package com.nbcb.design.command.remotecontrol;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand do nothing  ...");
    }

    @Override
    public void undo() {
        System.out.println("NoCommand undo nothing  ...");
    }
}
