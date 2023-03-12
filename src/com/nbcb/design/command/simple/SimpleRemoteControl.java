package com.nbcb.design.command.simple;

public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        this.command.execute();
    }
}
