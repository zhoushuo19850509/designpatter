package com.nbcb.design.command.macro;

import com.nbcb.design.command.remotecontrol.*;

public class RemoteLoaderMacro {
    public static void main(String[] args) {


        Light livingRoomLight = new Light("LivingRoom");
        Command lightOnCommandLivingRoom =
                new LightOnCommand(livingRoomLight);
        Command lightOffCommandLivingRoom =
                new LightOffCommand(livingRoomLight);

        Stereo stereo = new Stereo();
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan();
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] onCommands = {lightOnCommandLivingRoom,stereoOnCommand,ceilingFanOnCommand};
        Command[] offCommands = {lightOffCommandLivingRoom,stereoOffCommand,ceilingFanOffCommand};

        Command macroOnCommand = new MacroOnCommand(onCommands);
        Command macroOffCommand = new MacroOffCommand(offCommands);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,macroOnCommand,macroOffCommand);

        System.out.println("start show the remote control");
        System.out.println(remoteControl);

        System.out.println("start press buttons on remote control...");
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println("start undo ...");
        remoteControl.undoButtonWasPressed();

    }
}
