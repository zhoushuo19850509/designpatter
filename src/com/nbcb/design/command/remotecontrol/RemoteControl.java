package com.nbcb.design.command.remotecontrol;

import java.util.Arrays;

public class RemoteControl {

    /**
     * RemoteControl给onCommands/offCommands都分别预留了7个卡槽
     */
    public static final int slotCount = 7;

    private Command[] onCommands;
    private Command[] offCommands;

    // 回退的按钮
    private Command undoCommand;

    public RemoteControl() {
        /**
         * onCommands/offCommands都分别预留了7个卡槽
         * 备注： 不一定要占满所有的卡槽
         */
        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        // 初始化各个卡槽
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        // 初始化回退按钮
        undoCommand = new NoCommand();
    }

    /**
     * 设置某个卡槽的Command
     * @param slot
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot,
                           Command onCommand,
                           Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }


    public void onButtonWasPressed(int slot){
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPressed(){
        this.undoCommand.undo();
    }

    /**
     * 重写的toString()方法，打印各个onCommands、offCommands
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("================RemoteControl==================\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("slot[" + i + "] of onCommand: " +
                    onCommands[i].getClass().getSimpleName() + "\n");
            sb.append("slot[" + i + "] of offCommand: " +
                    offCommands[i].getClass().getSimpleName()  + "\n");
        }

        return sb.toString();
    }
}
