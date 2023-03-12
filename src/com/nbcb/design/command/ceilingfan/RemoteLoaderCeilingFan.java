package com.nbcb.design.command.ceilingfan;


import com.nbcb.design.command.remotecontrol.Command;
import com.nbcb.design.command.remotecontrol.RemoteControl;

public class RemoteLoaderCeilingFan {
    public static void main(String[] args) {

        CeilingFan ceilingFan = new CeilingFan();
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(2,ceilingFanLowCommand, ceilingFanOffCommand);

        System.out.println("start show the remote control for ceiling fan");
        System.out.println(remoteControl);

        System.out.println("start press buttons on remote control for ceiling fan...");
//        for (int i = 0; i < RemoteControl.slotCount; i++) {
//            remoteControl.onButtonWasPressed(i);
//            remoteControl.offButtonWasPressed(i);
//        }

        remoteControl.onButtonWasPressed(0); // ceiling fan turns to high
        remoteControl.onButtonWasPressed(1); // ceiling fan turns to medium
        remoteControl.undoButtonWasPressed();    // undo : ceiling fan turns back to high again

    }
}
