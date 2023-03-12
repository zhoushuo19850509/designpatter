package com.nbcb.design.command.simple;

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
    }
}
