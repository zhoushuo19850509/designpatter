package com.nbcb.design.command.remotecontrol;

public class RemoteLoader {
    public static void main(String[] args) {


        Light livingRoomLight = new Light("LivingRoom");
        Command lightOnCommandLivingRoom =
                new LightOnCommand(livingRoomLight);
        Command lightOffCommandLivingRoom =
                new LightOffCommand(livingRoomLight);

        Light kichenLight = new Light("Kichen");
        Command lightOnCommandKichenLight =
                new LightOnCommand(kichenLight);
        Command lightOffCommandKichenLight =
                new LightOffCommand(kichenLight);

        Stereo stereo = new Stereo();
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan();
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommandLivingRoom,lightOffCommandLivingRoom);
        remoteControl.setCommand(1,lightOnCommandKichenLight,lightOffCommandKichenLight);
        remoteControl.setCommand(2,stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(3, ceilingFanOnCommand, ceilingFanOffCommand);

        System.out.println("start show the remote control");
        System.out.println(remoteControl);

        System.out.println("start press buttons on remote control...");
        for (int i = 0; i < RemoteControl.slotCount; i++) {
            remoteControl.onButtonWasPressed(i);
            remoteControl.offButtonWasPressed(i);
        }

    }
}
