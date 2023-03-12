package com.nbcb.design.command.remotecontrol;

import java.util.Arrays;

public class RemoteControl {

    /**
     * RemoteControl��onCommands/offCommands���ֱ�Ԥ����7������
     */
    public static final int slotCount = 7;

    private Command[] onCommands;
    private Command[] offCommands;

    // ���˵İ�ť
    private Command undoCommand;

    public RemoteControl() {
        /**
         * onCommands/offCommands���ֱ�Ԥ����7������
         * ��ע�� ��һ��Ҫռ�����еĿ���
         */
        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        // ��ʼ����������
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        // ��ʼ�����˰�ť
        undoCommand = new NoCommand();
    }

    /**
     * ����ĳ�����۵�Command
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
     * ��д��toString()��������ӡ����onCommands��offCommands
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
