package com.nbcb.design.command.ceilingfan;

import com.nbcb.design.command.remotecontrol.Command;

public class CeilingFanLowCommand implements Command {

    private CeilingFan ceilingFan;
    private int previous;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // �ڵ������ȷ���֮ǰ���ȱ���Ŀǰ�ķ�����¼
        this.previous = ceilingFan.getSpeed();
        this.ceilingFan.low();
    }

    /**
     * ����undo()�������ѷ����ٶȵ�����ԭ�����ٶ�
     */
    @Override
    public void undo() {
        this.ceilingFan.undo(previous);
    }
}
