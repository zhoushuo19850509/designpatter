package com.nbcb.design.command.ceilingfan;


import com.nbcb.design.command.remotecontrol.Command;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;
    private int previous;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // �ڵ������ȷ���֮ǰ���ȱ���Ŀǰ�ķ�����¼
        this.previous = ceilingFan.getSpeed();
        this.ceilingFan.off();
    }

    /**
     * ����undo()�������ѷ����ٶȵ�����ԭ�����ٶ�
     */
    @Override
    public void undo() {
        this.ceilingFan.undo(previous);
    }
}
