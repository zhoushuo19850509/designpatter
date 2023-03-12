package com.nbcb.design.command.ceilingfan;

import com.nbcb.design.command.remotecontrol.Command;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    private int previous;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // �ڵ������ȷ���֮ǰ���ȱ���Ŀǰ�ķ�����¼
        this.previous = ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    /**
     * ����undo()�������ѷ����ٶȵ�����ԭ�����ٶ�
     */
    @Override
    public void undo() {
        this.ceilingFan.undo(previous);
    }
}
